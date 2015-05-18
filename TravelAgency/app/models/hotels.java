package models;
import java.math.BigDecimal;
import java.util.*;

import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

@Entity
public class hotels {
	
    @Id
	public int hotel_id;
    
	@Constraints.Required
    public int dest_id;
    
	@Constraints.Required
    public int category;
    
	@Constraints.Required
    public int price_per_week;
	
	/**
	 * Return a page of hotel
	 *
	 * @param page
	 *            Page to display
	 * @param pageSize
	 *            Number of hotel per page
	 * @param sortBy
	 *            plane property used for sorting
	 * @param order
	 *            Sort order (either or asc or desc)
	 * @param filter
	 *            Filter applied on the name column
	 */
	public static Page page(int page, int pageSize, String sortBy,
			String order, int dest_id, int category) {
		
		if (page < 1)
			page = 1;
		Long total = (Long) JPA
				.em()
				.createQuery(
						"select count(c) from hotels c where c.dest_id = ? and c.category = ?")
				.setParameter(1, dest_id)
				.setParameter(2, category)
				.getSingleResult();

		List<hotels> data = JPA
				.em()
				.createQuery(
						"from hotels c where c.dest_id = ? and c.category = ? order by c."
								+ sortBy + " " + order)
				.setParameter(1, dest_id)
				.setParameter(2, category)
				.getResultList();

		return new Page(data, total);
	}

	public static class Page {

		private final long totalRowCount;
		private final List<hotels> list;

		public Page(List<hotels> data, long total) {
			this.list = data;
			this.totalRowCount = total;

		}

		public long getTotalRowCount() {
			return totalRowCount;
		}


		public List<hotels> getList() {
			return list;
		}

	}
}

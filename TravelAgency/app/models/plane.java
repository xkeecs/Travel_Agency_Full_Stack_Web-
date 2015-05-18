package models;

import java.util.*;

import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

/**
 * depart entity managed by JPA
 */
@Entity
public class plane {

	@Id
	public int plane_id;

	@Constraints.Required
	public int dep_id;

	@Constraints.Required
	public int dest_id;

	@Constraints.Required
	public String airline;

	@Constraints.Required
	public String flight_number;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date departure_date;

	@Constraints.Required
	public double flight_price;

	public static plane findById(int dep_id) {
		return JPA.em().find(plane.class, dep_id);
	}

	public static Page pageInit(int page, int pageSize, String sortBy,
			String order, String filter) {
		if (page < 1)
			page = 1;
		Long total = (Long) JPA
				.em()
				.createQuery(
						"select count(c) from plane c where lower(c.airline) like ?")
				.setParameter(1, "%" + filter.toLowerCase() + "%")
				.getSingleResult();

		List<plane> data = JPA
				.em()
				.createQuery(
						"from plane c where lower(c.airline) like ? order by c."
								+ sortBy + " " + order)
				.setParameter(1, "%" + filter.toLowerCase() + "%")
				.setFirstResult((page - 1) * pageSize).setMaxResults(pageSize)
				.getResultList();

		return new Page(data, total, page, pageSize);
	}

	/**
	 * Return a page of plane
	 *
	 * @param page
	 *            Page to display
	 * @param pageSize
	 *            Number of planes per page
	 * @param sortBy
	 *            plane property used for sorting
	 * @param order
	 *            Sort order (either or asc or desc)
	 * @param filter
	 *            Filter applied on the name column
	 */
	public static Page page(int page, int pageSize, String sortBy,
			String order, int dest_id, int dept_id,
			Date departureDate) {
		Long total = 0L;
		List<plane> data;
		List<plane> ret = new ArrayList<plane>();

		if (page < 1)
			page = 1;

		total = (Long) JPA
				.em()
				.createQuery(
						"select count(c) from plane c where c.dest_id = ? and c.dep_id = ?")
				.setParameter(1, dest_id).setParameter(2, dept_id)
				.getSingleResult();

		data = JPA
				.em()
				.createQuery(
						"from plane c where c.dest_id = ? and c.dep_id = ?")
				.setParameter(1, dest_id)
				.setParameter(2, dept_id)
				.getResultList();
		int year = departureDate.getYear();
		int month = departureDate.getMonth();
		int day = departureDate.getDay();
    
//		for(plane p : data){
//		    System.out.println(" Y:" +year + " " +p.departure_date.getYear() +"M:" + month +" " + p.departure_date.getMonth()+"D:"+day +" " + p.departure_date.getDay()+ " YY:"
//	        		);
//		    if(departureDate.getYear() == (p.departure_date.getYear())
//				&& departureDate.getMonth() == (p.departure_date.getMonth())
//				&& departureDate.getDay() == p.departure_date.getDay()
//			){
//				ret.add(p);
//			}
//		}
		
		return new Page(data, total, page, 100000);
	}

	public static class Page {

		private final int pageSize;
		private final long totalRowCount;
		private final int pageIndex;
		private final List<plane> list;

		public Page(List<plane> data, long total, int page, int pageSize) {
			this.list = data;
			this.totalRowCount = total;
			this.pageIndex = page;
			this.pageSize = pageSize;
		}

		public long getTotalRowCount() {
			return totalRowCount;
		}

		public int getPageIndex() {
			return pageIndex;
		}

		public List<plane> getList() {
			return list;
		}

		public boolean hasPrev() {
			return pageIndex > 1;
		}

		public boolean hasNext() {
			return (totalRowCount / pageSize) >= pageIndex;
		}

		public String getDisplayXtoYofZ() {
			int start = ((pageIndex - 1) * pageSize + 1);
			int end = start + Math.min(pageSize, list.size()) - 1;
			return start + " to " + end + " of " + totalRowCount;
		}
	}
}
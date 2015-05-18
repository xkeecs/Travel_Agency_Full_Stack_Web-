package models;

import java.util.ArrayList;
import java.util.List;

import models.hotels.Page;
import play.db.jpa.JPA;

public class Details {
	public double price;
	public double taxes;
	public double totalPrice;
	public static double taxRate = 0.15;
	public int plane_id;
	
	private Details(int plane_id_, double _price, double _taxes){
		plane_id = plane_id_;
		price = _price;
		taxes = _taxes;
		totalPrice = price + taxes;
	}
	public static Page page(int page, List<plane> planes, int pageSize) {
		List<Details> data = new ArrayList<Details> ();
		if (page < 1)
			page = 1;
		
		for(plane iter : planes){
			int plane_id = iter.plane_id;
			double price = iter.flight_price;
			double taxes = price * taxRate;
			data.add(new Details(plane_id, price, taxes));
		}
		
		return new Page(data, page, pageSize);
	}
	
	public static class Page {

		private final int pageSize;
		private final long totalRowCount;
		private final int pageIndex;
		private final List<Details> list;

		public Page(List<Details> data, int page, int pageSize) {
			this.list = data;
			this.totalRowCount = data.size();
			this.pageIndex = page;
			this.pageSize = pageSize;
		}

		public long getTotalRowCount() {
			return totalRowCount;
		}

		public int getPageIndex() {
			return pageIndex;
		}

		public List<Details> getList() {
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

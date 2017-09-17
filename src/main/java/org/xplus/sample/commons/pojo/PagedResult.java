package org.xplus.sample.commons.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagedResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long total;
	private List<T> rows = new ArrayList<T>();

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public PagedResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagedResult(long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

}

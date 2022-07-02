package it.sps.main.wrapper;

import java.util.List;

public class WrapperList<T>{
	
	private List<T> list;

	public WrapperList() {}
	
	public WrapperList(List<T> list) {
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}

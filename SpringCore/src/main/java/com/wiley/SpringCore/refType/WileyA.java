package com.wiley.SpringCore.refType;

public class WileyA {
	private int count;
	private WileyB obj;
	public WileyA(int count, WileyB obj) {
		super();
		this.count = count;
		this.obj = obj;
	}
	public WileyA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WileyA [count=" + count + ", obj=" + obj + "]";
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public WileyB getObj() {
		return obj;
	}
	public void setObj(WileyB obj) {
		this.obj = obj;
	}
	
}

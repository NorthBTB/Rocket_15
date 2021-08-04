package entity;

public class MyMap <K,V>{
	private K msv;
	private V ten;
	
	public MyMap(K msv, V ten) {
		super();
		this.msv = msv;
		this.ten = ten;
	}
	public K getMsv() {
		return msv;
	}
	public V getTen() {
		return ten;
	}
	
	@Override
	public String toString() {
		return "MyMap [msv=" + msv + ", ten=" + ten + "]";
	}
	
	
}

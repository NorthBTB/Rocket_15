package entity;

public class Phone <K,V> extends MyMap<K, V>{

	public Phone(K msv, V ten) {
		super(msv, ten);
		
	}
	
	// lay ra sdt
	public String getPhoneNumber() {
		return super.getTen().toString();
	}
	
	//lay ra key
	public String getKey() {
		return super.getMsv().toString();
	}
}

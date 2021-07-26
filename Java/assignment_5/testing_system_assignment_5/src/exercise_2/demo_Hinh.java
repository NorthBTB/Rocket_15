package exercise_2;

public class demo_Hinh {
	public static void main(String[] args) {
		hinh_chu_nhat cn= new hinh_chu_nhat(5, 7);
		hinh_vuong hv = new hinh_vuong(6);
		
		System.out.println(cn.chu_Vi());
		System.out.println(cn.dien_Tich());
		System.out.println(hv.chu_Vi());
		System.out.println(hv.dien_Tich());
	}
}

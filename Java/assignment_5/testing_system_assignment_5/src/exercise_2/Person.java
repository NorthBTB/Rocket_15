package exercise_2;

import java.util.Scanner;

public class Person {
	private String ten;
	private String gioi_Tinh;
	private String ngay_Sinh;
	private String dia_Chi;

	public Person() {
		super();
	}

	public Person(String ten, String gioi_Tinh, String ngay_Sinh, String dia_Chi) {
		super();
		this.ten = ten;
		this.gioi_Tinh = gioi_Tinh;
		this.ngay_Sinh = ngay_Sinh;
		this.dia_Chi = dia_Chi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioi_Tinh() {
		return gioi_Tinh;
	}

	public void setGioi_Tinh(String gioi_Tinh) {
		this.gioi_Tinh = gioi_Tinh;
	}

	public String getNgay_Sinh() {
		return ngay_Sinh;
	}

	public void setNgay_Sinh(String ngay_Sinh) {
		this.ngay_Sinh = ngay_Sinh;
	}

	public String getDia_Chi() {
		return dia_Chi;
	}

	public void setDia_Chi(String dia_Chi) {
		this.dia_Chi = dia_Chi;
	}

	public void input_Infor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten : ");
		String name = sc.next();
		System.out.println("Nhap gioi tinh : ");
		String gender = sc.next();
		System.out.println("Nhap ngay sinh : ");
		String date = sc.next();
		System.out.println("Nhap dia chi : ");
		String addr = sc.next();
		this.ten = name;
		this.gioi_Tinh = gender;
		this.ngay_Sinh = date;
		this.dia_Chi = addr;
		sc.close();
	}

	public void show_Infor() {
		System.out.println("Ten : " + this.ten + "\nGioi tinh : " + this.gioi_Tinh + "\nNgay sinh : " + this.ngay_Sinh
				+ "\nDia chi : " + this.dia_Chi);
	}
}

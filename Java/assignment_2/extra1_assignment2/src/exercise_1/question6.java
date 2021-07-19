package exercise_1;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap diem Toan : ");
		double t = sc.nextDouble();
		System.out.println("Nhap diem Ly : ");
		double l = sc.nextDouble();
		System.out.println("Nhap diem Hoa : ");
		double h = sc.nextDouble();
		sc.close();
		double tb = (t * 2 + l + h) / 4;
		System.out.println("Diem TB : " + tb);
		String hl = "";
		if(tb>=9) hl ="Xuat sac";
		else if(tb<9 && tb>=8) hl="Gioi";
		else if(tb<8&& tb>=7) hl="Kha";
		else if(tb<7&&tb>=6) hl ="Trung binh kha";
		else if(tb<6 && tb>=5) hl = "Trung binh";
		else if(tb<5) hl="kem";
		System.out.println(hl);
	}
}

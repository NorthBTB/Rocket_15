package exercise_1;

import java.util.Scanner;

public class demo_tuyen_sinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		tuyen_sinh tuyen_Sinh = new tuyen_sinh();
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("Chon chuc nang : ");
			System.out.println("1. Them this sinh.");
			System.out.println("2. Xem danh sach.");
			System.out.println("3. Tim kiem.");
			System.out.println("4. Thoat.");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				tuyen_Sinh.them_thi_sinh();
				break;
			case 2:
				tuyen_Sinh.xem_ds();
				break;
			case 3:
				tuyen_Sinh.tim_kiem_sbd();
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println("Hay chon dung chuc nang muon thuc hien!");
				break;
			}
		}
	}
}

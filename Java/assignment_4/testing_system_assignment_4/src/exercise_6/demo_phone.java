package exercise_6;

import java.util.ArrayList;
import java.util.Scanner;

public class demo_phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		contact c1 =new contact("Bacdz", "0967452219");
		contact c2 =new contact("An", "0967456789");
		contact c3 =new contact("Duong", "0987654321");
		ArrayList<contact> c = new ArrayList<contact>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		VietnamesePhone p = new VietnamesePhone(c);
		
		while(true) {
			System.out.println("Chon chuc nang : ");
			System.out.println("1. Them lien lac.");
			System.out.println("2. Tim kiem lien lac.");
			System.out.println("3. Sua lien lac.");
			System.out.println("4. Xoa lien lac.");
			System.out.println("5. Thoat");
			
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Nhap ten lien lac : ");
				String name1 =sc.next();
				System.out.println("Nhap so dien thoai : ");
				String number1=sc.next();
				p.insertContact(name1, number1);
				break;
			
			case 2:
				System.out.println("Nhap ten lien lac : ");
				String name2 =sc.next();
				p.searchContact(name2);
				break;
			
			case 3:
				System.out.println("Nhap ten lien lac : ");
				String name3 =sc.next();
				System.out.println("Nhap so dien thoai : ");
				String number3=sc.next();
				p.updateContact(name3, number3);
				break;
			
			case 4:
				System.out.println("Nhap ten lien lac : ");
				String name4 =sc.next();
				p.removeContact(name4);
				break;
			case 5:
				return;
				
			default:
				System.out.println("Hay chon dung chuc nang muon thuc hien!");
				break;
			}
		}
	}
}

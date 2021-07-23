package exercise_5;

import java.util.ArrayList;
import java.util.Scanner;

public class ql_can_bo {
	private ArrayList<can_bo> ds;
	private Scanner sc;

	public ql_can_bo() {
		super();
		this.ds = new ArrayList<can_bo>();
		this.sc = new Scanner(System.in);
	}

	public void menu() {
		while (true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Chon chuc nang muon thuc hien : ");
			System.out.println("1. Them moi can bo.");
			System.out.println("2. Tim kiem theo ho ten.");
			System.out.println("3. Hien thi danh sach can bo.");
			System.out.println("4. Xoa can bo");
			System.out.println("5. Thoat chuong trinh.");

			int i = sc.nextInt();
			switch (i) {
			case 1:
				add();
				break;
			case 2:
				search();
				break;
			case 3:
				show_list();
				break;
			case 4:
				delete();
				break;
			case 5:
				return;
			default:
				System.out.println("Hay nhap dung lenh tren menu");
			}
		}

	}

	private void add() {
		System.out.println("----- Chon doi tuong muon them -----");
		System.out.println("1. Them cong nhan.");
		System.out.println("2. Them ky su.");
		System.out.println("3. Them nhan vien.");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("Chuc nang them cong nhan.");
			System.out.println("Nhap Ten : ");
			String name1 = sc.next();
			System.out.println("Nhap Tuoi : ");
			int age1 = sc.nextInt();
			System.out.println("Nhap gioi tinh : ");
			String gender1 = sc.next();
			System.out.println("Nhap dia chi : ");
			String address1 = sc.next();
			System.out.println("Nhap bac : ");
			int lv1 = sc.nextInt();
			cong_nhan cn = new cong_nhan(name1, age1, gender1, address1, lv1);
			this.ds.add(cn);
			break;
		case 2:
			System.out.println("Chuc nang them ky su.");
			System.out.println("Nhap Ten : ");
			String name2 = sc.next();
			System.out.println("Nhap Tuoi : ");
			int age2 = sc.nextInt();
			System.out.println("Nhap gioi tinh : ");
			String gender2 = sc.next();
			System.out.println("Nhap dia chi : ");
			String address2 = sc.next();
			System.out.println("Nhap nganh dao tao : ");
			String n = sc.next();
			ky_su ks = new ky_su(name2, age2, gender2, address2, n);
			this.ds.add(ks);
			break;
		case 3:
			System.out.println("Chuc nang them nhan vien.");
			System.out.println("Nhap Ten : ");
			String name3 = sc.next();
			System.out.println("Nhap Tuoi : ");
			int age3 = sc.nextInt();
			System.out.println("Nhap gioi tinh : ");
			String gender3 = sc.next();
			System.out.println("Nhap dia chi : ");
			String address3 = sc.next();
			System.out.println("Nhap nganh cong viec : ");
			String cv = sc.next();
			ky_su nv = new ky_su(name3, age3, gender3, address3, cv);
			this.ds.add(nv);
			break;
		default:
			break;
		}

	}

	private void search() {
		System.out.println("Chuc nang tim kiem can bo.");
		System.out.println("Moi nhap ten can bo : ");
		String name = sc.next();
		for(can_bo x : ds) {
			if(x.getHo_Ten().equals(name)) {
				System.out.println(x.toString());
			}
		}
	}

	private void delete() {
		System.out.println("Chuc nang xoa can bo.");
		System.out.println("Moi nhap ten can bo : ");
		String name = sc.next();
		for(can_bo x : ds) {
			if(x.getHo_Ten().equals(name)) {
				ds.remove(x);
			}
		}
	}

	private void show_list() {
		System.out.println("Chuc nang xem danh sach can bo.");
		for(can_bo x : ds) {
			System.out.println(x.toString());
		}
	}
}

package exercise_1;

import java.util.ArrayList;
import java.util.Scanner;

public class tuyen_sinh implements Ituyen_Sinh {
	private Scanner sc;
	private ArrayList<thi_sinh> ds;

	public tuyen_sinh() {
		super();
		this.sc = new Scanner(System.in);
		this.ds = new ArrayList<thi_sinh>();
	}

	@Override
	public void them_thi_sinh() {
		System.out.println("----Them moi thi sinh-------------------");
		System.out.println("SBD : ");
		int sbd = sc.nextInt();
		System.out.println("Ten : ");
		String ten = sc.next();
		System.out.println("Dia Chi : ");
		String dia_Chi = sc.next();
		System.out.println("Muc uu tien : ");
		int ut = sc.nextInt();
		System.out.println("Khoi thi : ");
		String khoi = sc.next();

		thi_sinh ts = new thi_sinh(sbd, ten, dia_Chi, ut, khoi);
		ds.add(ts);

	}

	@Override
	public void xem_ds() {
		for (thi_sinh t : ds) {
			System.out.println("----Danh sach thi sinh-------------");
			System.out.println(t.toString());
		}

	}

	@Override
	public void tim_kiem_sbd() {
		System.out.println("----Tim kiem thi sinh theo SDB--------------");
		System.out.println("Nhap SBD : ");
		int sbd = sc.nextInt();
		for (thi_sinh t1 : ds) {
			if (t1.getSbd() == sbd) {
				System.out.println(t1.toString());
				break;
			}
		}
	}

}

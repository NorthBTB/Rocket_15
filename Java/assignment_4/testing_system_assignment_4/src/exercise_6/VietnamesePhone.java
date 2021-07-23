package exercise_6;

import java.util.ArrayList;

public class VietnamesePhone extends phone {
	private ArrayList<contact> danh_ba;

	public VietnamesePhone(ArrayList<contact> danh_ba) {
		super();
		this.danh_ba = danh_ba;
	}

	public void insertContact(String name, String phone) {
		contact c = new contact(name, phone);
		this.danh_ba.add(c);
		System.out.println("Da them lien lac moi : " + c.toString());
	}

	public void removeContact(String name) {
		for (contact c : this.danh_ba) {
			if (c.getName().equals(name)) {
				this.danh_ba.remove(c);
				System.out.println("Xoa thanh cong!");
				break;
			}
		}
	}

	public void updateContact(String name, String phone) {
		for (contact c : this.danh_ba) {
			if (c.getName().equals(name)) {
				c.setNumber(phone);
				System.out.println("Cap nhaat thanh cong!");
				break;
			}
		}
	}

	public void searchContact(String name) {
		for (contact c : this.danh_ba) {
			if (c.getName().equals(name)) {
				System.out.println(c.toString());
				break;
			}
		}
	}
}

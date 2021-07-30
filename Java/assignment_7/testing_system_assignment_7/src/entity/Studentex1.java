package entity;

public class Studentex1 {
	private static int COUNT = 0;
	private int id;
	private String name;
	private static String college = "Dai hoc bach khoa";
	private static int money_Group = 0;

	public Studentex1(int id, String name) {		
		super();
		COUNT++;
		if (COUNT>7) {
			System.out.println("Khong duoc tao qua 7 hoc sinh!");
			return;
		}
		this.id = id;
		this.name = name;
		money_Group += 100;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static int getMoney_Group() {
		return money_Group;
	}

	public static void setMoney_Group(int money_Group) {
		Studentex1.money_Group = money_Group;
	}

	public static void setCollege(String college) {
		Studentex1.college = college;
	}

	public static void changeCollege(String newCollege) {
		college = newCollege;
	}

	@Override
	public String toString() {
		return "\nid : " + id + "\nname : " + name;
	}

}

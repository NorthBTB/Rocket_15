package entity;

public class CPU {
	private double price;
	public Processer processer;
	public Ram ram;

	public CPU(double price) {
		super();
		this.price = price;
	}

	public class Processer {
		private double coreAmount;
		private String menufacturer;

		public Processer(double coreAmount, String menufacturer) {
			super();
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}

		public double getCache() {
			return 4.3d;
		}
	}

	public class Ram {
		private int memory;
		private String menufacturer;

		public Ram(int memory, String menufacturer) {
			super();
			this.memory = memory;
			this.menufacturer = menufacturer;
		}

		public double getclockSpeed() {
			return 5.5d;
		}
	}
}

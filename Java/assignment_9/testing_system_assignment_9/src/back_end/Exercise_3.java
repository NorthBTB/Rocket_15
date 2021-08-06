package back_end;

import entity.CPU;
import entity.Car;

public class Exercise_3 {
	public static void question2() {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println("Engine Type  :" + engine.getEngineType());
	}

	public static void question1() {
		CPU cpu = new CPU(34.5d);
		CPU.Processer processer = cpu.new Processer(21d, "abc");
		CPU.Ram ram = cpu.new Ram(16, "abc");
		System.out.println("cache : " + processer.getCache());
		System.out.println("clock speed : " + ram.getclockSpeed());
	}
}

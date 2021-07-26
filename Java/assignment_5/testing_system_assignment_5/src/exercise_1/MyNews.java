package exercise_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<News> news = new ArrayList<News>();
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("Choose an option : ");
			System.out.println("1. Insert news.");
			System.out.println("2. View list news.");
			System.out.println("3. Average rate.");
			System.out.println("4. Exit.");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("----Insert news-------------------");
				System.out.println("Title : ");
				String title = sc.next();
				System.out.println("Publish Date : ");
				String date = sc.next();
				System.out.println("Author : ");
				String author = sc.next();
				System.out.println("Insert 3 rates : ");
				int[] rates = { 0, 0, 0 };
				for (int i = 0; i < 3; i++) {
					rates[i] = sc.nextInt();
				}
				System.out.println("Content : ");
				String content = sc.nextLine();
				News n = new News(title, date, author, content, rates);
				news.add(n);
				break;

			case 2:
				System.out.println("----View list news---------------------");
				for (News x : news) {
					x.Display();
				}
				break;

			case 3:
				System.out.println("----Average Rate----------------------");
				for (News x1 : news) {
					x1.Calculate();
					x1.Display();
				}
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

package exercise_2;

public class question1 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 3, 6, 9, 1 };
		int[] c = new int[10]; 
		for(int i=0;i<10;i++) {
			c[i]=0;
		}
		for(int x :a) {
			c[x]++;
		}
		for(int x : a) {
			if(c[x]==1) System.out.print(x + " ");
		}
	}
}

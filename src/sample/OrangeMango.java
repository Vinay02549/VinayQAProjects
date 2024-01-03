package sample;

public class OrangeMango {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.println("Orange");
			} else if (i % 5 == 0) {
				System.out.println("Mango");
			} else if (i%15 != 0 && i%15==0) {
				System.out.println("OrangeMango");
			} else {
				System.out.println(i);
			}

		}

	}
}

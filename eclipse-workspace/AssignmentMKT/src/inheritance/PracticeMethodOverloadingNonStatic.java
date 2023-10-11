
package inheritance;

public class PracticeMethodOverloadingNonStatic {

	public void vehicles(int a) {
		System.out.println("a" + a);

	}

	public void vehicles(int w1, String w3, char w2) {
		System.out.println("w1====" + w1);
		System.out.println("w2===" + w2);
		System.out.println("w3===" + w3);

	}

	public void vehicles(int w1, int w2, char w3) {
		System.out.println("w1  " + w1);
		System.out.println("w2 " + w2);
		System.out.println("w3  " + w3);
	}

	public void vehicles(int w1, String w2) {
		System.out.println("w1" + w1);
		System.out.println("w2===" + w2);

	}

	public static void main(String[] args) {

		PracticeMethodOverloadingNonStatic m1 = new PracticeMethodOverloadingNonStatic();
		m1.vehicles(30, null, ' ');
		m1.vehicles(9, 10, 'e');
		m1.vehicles(10, null);
		m1.vehicles(20);

	}

}
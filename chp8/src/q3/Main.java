package q3;

public class Main {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[5] = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("goingggggg");
	}
}

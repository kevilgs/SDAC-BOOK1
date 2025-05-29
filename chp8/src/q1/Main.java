package q1;

public class Main {
	public static void main(String[] args) {

		System.out.println("Hellooooo");
		System.out.println("Hellooooo");
		System.out.println("Hellooooo");
		System.out.println("Hellooooo");
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finalllyyyyy");
		}
	}
}

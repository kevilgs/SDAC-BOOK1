package q4;

import java.lang.Exception;

@SuppressWarnings("serial")
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

class AgeCheck {
	void verifyAge(int age) {
		try {
			if (age < 18) {
				throw new AgeException("Access Denied! Age must be 18 or above.");
			}
			System.out.println("Access Granted!");
		} catch (AgeException e) {
			System.out.println(e);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		AgeCheck a = new AgeCheck();
		a.verifyAge(15);
	}
}

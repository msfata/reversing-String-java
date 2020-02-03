package Palindrome;

@SuppressWarnings("all")

public class SwitchJava13 {

	// switch
	// text block

	public static void main(String[] args) {
		String employee = "driver";
		int salary = switch (employee) {
		case "manager":
			yield 5000;
		case "cleaner","driver":
			yield 4000;
		default:
			throw new IllegalArgumentException("Unexpected value: " + employee);
		};

		System.out.println(salary);
	}
	

}

package userregistrationusingjunit;

import java.util.Scanner;

public class UserRegistrationMain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String firstName = scanner.next();
		UserValidator validator = new UserValidator();
		System.out.println(validator.validateFirstName(firstName));
		scanner.close();
	}

}

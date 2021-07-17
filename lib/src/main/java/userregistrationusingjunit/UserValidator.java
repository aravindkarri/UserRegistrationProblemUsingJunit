package userregistrationusingjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator 
{
	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})";

	public boolean validateFirstName(String firstName)
	{
		return validateName(firstName);
	}
	public boolean validateLastName(String lastName)
	{
		return validateName(lastName);
	}
	public boolean validateName(String name)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}
}

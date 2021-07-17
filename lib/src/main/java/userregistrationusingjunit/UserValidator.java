package userregistrationusingjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator 
{
	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})";

	public boolean validateFirstName(String firstName)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
}

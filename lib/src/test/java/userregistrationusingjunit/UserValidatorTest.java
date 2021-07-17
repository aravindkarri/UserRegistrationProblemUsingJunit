package userregistrationusingjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest 
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateFirstName("Aravind");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateFirstName("Ar");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateFirstName("aravind");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialCharPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateFirstName("@#!");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialNumPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateFirstName("1234");
		Assert.assertFalse(isValid);
	}
}

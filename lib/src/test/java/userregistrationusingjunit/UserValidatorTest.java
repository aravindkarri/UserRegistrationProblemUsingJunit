package userregistrationusingjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest 
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("Aravind");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("Ar");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("aravind");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialCharPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("@#!");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialNumPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("1234");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("Karri");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("Ka");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("karri");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenSpecialCharPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("@#!");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenSpecialNumPassed_ShouldReturnFalse()
	{
		UserValidator validator = new UserValidator();
		boolean isValid = validator.validateLastName("1234");
		Assert.assertFalse(isValid);
	}
}

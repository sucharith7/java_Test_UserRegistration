package com.validateuser;

import com.uservalidator.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class ValidateUserTest {
    @Test
    public void givenFirstName_WhenMatched_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Sucharith");
        Assert.assertEquals(true,result);

    }
    @Test
    public void givenLastName_WhenMatched_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Cherkumalli");
        Assert.assertEquals(true, result);

    }
    @Test
    public void givenMail_WhenMatched_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMail("abc@gmail.com");
        Assert.assertEquals(true, result);

    }
    @Test
    public void givenPassword_WhenMatched_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("#qwerty9");
        Assert.assertEquals(true, result);

    }
    @Test
    public void givenMobileNumber_WhenMatched_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91 7836028824");
        Assert.assertEquals(true, result);

    }
}

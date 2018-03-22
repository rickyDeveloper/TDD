package com.naiyar.tdd;


import junit.framework.*;
import junit.framework.Assert;
import org.junit.*;

/**
 * Created by vikasnaiyar on 22/03/18.
 */

public class PasswordTest {

    @org.junit.Test
    public void testPasswordLength() {
        PasswordValidator validator = new PasswordValidator();
        Assert.assertEquals(true, validator.hasMinimumLength("abcdef"));
    }

    @org.junit.Test
    public void testPasswordInvalidCharacters() {
        PasswordValidator validator = new PasswordValidator();
        Assert.assertEquals(false, validator.hasValidCharacters("abcdef###"));
    }


    @org.junit.Test
    public void testPasswordValidCharacters() {
        PasswordValidator validator = new PasswordValidator();
        Assert.assertEquals(true, validator.hasValidCharacters("abcdef"));
    }

}

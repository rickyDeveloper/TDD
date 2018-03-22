package com.naiyar.tdd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vikasnaiyar on 22/03/18.
 */
public class PasswordManagerTest {

    @Test
    public void testIsValid() {
        PasswordManager manager = new PasswordManager();
        Assert.assertEquals(true, manager.isValid("abcdef", "gmail"));
    }

}

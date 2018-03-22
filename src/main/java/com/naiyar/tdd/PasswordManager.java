package com.naiyar.tdd;

/**
 * Created by vikasnaiyar on 22/03/18.
 */
public class PasswordManager {

    public boolean isValid(String pwd, String appName) {
        boolean isValid = false;
        if(appName == "gmail") {
            GmailValidator gmailValidator = new GmailValidator();
            isValid = gmailValidator.validate(pwd);
        } else {

        }
        return isValid;
    }

}

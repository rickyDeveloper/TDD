package com.naiyar.tdd;

/**
 * Created by vikasnaiyar on 22/03/18.
 */
public class PasswordValidator {

    public boolean hasMinimumLength(String pwd) {
        boolean isValid = false;

        if(pwd != null && pwd.length() > 5) {
            isValid = true;
        }

        return isValid;
    }


    public boolean hasValidCharacters(String pwd) {
        return (pwd != null && !(pwd.contains("~") || pwd.contains("#")));
    }


    public boolean validate(String pwd) {
        return hasMinimumLength(pwd) && hasValidCharacters(pwd);
    }

}

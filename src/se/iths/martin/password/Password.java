package se.iths.martin.password;

import java.util.Random;

public class Password {

    public boolean verifyPasswordStrength(String passwordString){
        if( passwordString == null)
            return false;
        if( passwordString.equals("password"))
            throw new IllegalArgumentException("Stupid password, do not use!");
        if( passwordString.contains(" "))
            return false;
        if( !passwordString.matches(".*[0-9]+.*"))
            return false;
        if( passwordString.matches("^[0-9]*$"))
            return false;
        if( passwordString.length() > 5)
            return true;

        return false;
    }

    public String generate(int length) {
        Random r = new Random();
        return "Kal" + r.nextInt(900) + 100;
    }
}

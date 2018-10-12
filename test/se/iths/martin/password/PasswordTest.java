package se.iths.martin.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

//    @Test
//    @DisplayName("Verify that integer with value one is bigger than zero")
//    void validateThatIntegerOneIsBiggerThanOtherIntegerWithValueZero(){
//        //Set up
//        int i = 1;
//        //Execute testet
//        boolean result = i > 0;
//        //Verify, assert
//        assertTrue(result);
//    }


    @Test
    void givenNullPasswordStringReturnsFalse()
    {
        Password passwordVerifyer = new Password();
        String passwordString = null;
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertFalse(result);
    }

    @Test
    void givenPasswordWithLessThanSixCharactersReturnsFalse(){
        Password passwordVerifyer = new Password();
        String passwordString = "a4cde";
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertFalse(result);
    }

    @Test
    void givenPasswordWithSixCharactersReturnsTrue(){
        Password passwordVerifyer = new Password();
        String passwordString = "ab3def";
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertTrue(result);
    }

    @Test
    void givenPasswordWithNoNumbersReturnsFalse() {
        Password passwordVerifyer = new Password();
        String passwordString = "abcdef";
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertFalse(result);
    }

    @Test
    void givenPasswordWithSpaceReturnsFalse() {
        Password passwordVerifyer = new Password();
        String passwordString = "ab2c def";
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertFalse(result);
    }

    @Test
    void givenPasswordWithOnlyNumbersReturnsFalse()
    {
        Password passwordVerifyer = new Password();
        String passwordString = "123456";
        boolean result = passwordVerifyer.verifyPasswordStrength(passwordString);
        assertFalse(result);
    }

    @Test
    void givenPasswordWithTextpasswordThrowsException(){
        Password passwordVerifyer = new Password();
        String passwordString = "password";

        assertThrows(IllegalArgumentException.class,
                () -> passwordVerifyer.verifyPasswordStrength(passwordString)  );
    }

//    @Test
//    void generatePasswordReturnsValidPassword()
//    {
//        Password passwordVerifyer = new Password();
//        String generatedPassword = passwordVerifyer.generate(6);
//        //assert
//        assertNotNull(generatedPassword);
//        assertEquals(6, generatedPassword.length());
//        assertTrue(generatedPassword.matches(".*[0-9]+.*"));
//    }
//
//    @Test
//    void generateTwoPasswordCheckForUniqueness()
//    {
//        Password passwordVerifyer = new Password();
//        String firstGeneratedPassword = passwordVerifyer.generate(6);
//        String secondGeneratedPassword = passwordVerifyer.generate(6);
//
//        assertNotEquals(firstGeneratedPassword, secondGeneratedPassword);
//    }


 }
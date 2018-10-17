package se.iths.martin.builder;

import java.util.Locale;

public class StringBuilderDemo {

    public static void main(String[] args) {

//        StringBuilder builder = new StringBuilder();
//
//        builder.append("This is a string").append(100).insert(16,": ");
//
//        String string = builder.toString();


        Locale aLocale = new Locale.Builder()
                .setLanguage("sr")
                .setScript("Latn")
                .setRegion("RS").build();







    }
}

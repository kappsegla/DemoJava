package se.iths.martin.files;

import java.io.*;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Scanner;

public class FileInput {

    public static void readTextFileFromResources() throws IOException{
        try(InputStream inputStream = FileInput.class.getResourceAsStream("/file.txt")) {
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNext())
                System.out.println(sc.nextLine());
        }
    }

    public static void readTextFileFromAbsolutePath() {
        //File file = new File("C:\\Users\\Martin\\Documents\\code.txt");
        String path = System.getProperty("user.home")
                + File.separator + "Documents"
                + File.separator + "code.txt";
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readTextFileWithEncoding() {
        File file = new File("C:\\Users\\Martin\\Documents\\code.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void propertiesSavingLoading(){
        String path = System.getProperty("user.home")
                + File.separator + "Documents"
                + File.separator + "FileInput"
                + File.separator + "settings.xml";
        File file = new File(path);

        Properties properties = new Properties();

        try {
            FileInputStream inputStream = new FileInputStream(file);
            properties.loadFromXML(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("AutoSave"));
        //Spara en inställning
        //properties.setProperty("AutoSave","true");

        //Hämta en inställning med default som false om nyckeln inte finns
        //String autoSave = properties.getProperty("AutoSave", "false");


        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            properties.storeToXML(outputStream,"Settings for FileInput Demo");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void main(String[] args) {

        try {
            readTextFileFromResources();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //readTextFileFromAbsolutePath();
        //readTextFileWithEncoding();




    }
}

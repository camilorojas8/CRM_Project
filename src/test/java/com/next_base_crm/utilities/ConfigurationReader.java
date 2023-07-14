package com.next_base_crm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    // (1) Create the Properties object ---> (create object)
    // (2) Open the file using FileInputStream ---> (open file)
    // (3) Load the "properties" object with "file ---> (load properties)
    // (4) Use "properties" object to read from the file ---> (read properties)

    // (1) Create the Properties object ---> (create object)
    // make it "private" so we are limiting access to the object
    // "static" is to make sure it is created and loaded before everything else.

    private static Properties properties = new Properties();

    static {

        try {
            // (2) Open the file using FileInputStream ---> (open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            // (3) Load the "properties" object with "file ---> (load properties)
            properties.load(file);

            // Close the file in the memory
            file.close();

        }catch (IOException e){
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!");
            e.printStackTrace();
        }
    }

    // Create a utility method to use the object to read
    // (4) Use "properties" object to read from the file ---> (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);

    }

}

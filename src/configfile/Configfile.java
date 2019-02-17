/*

The configuration "example.ini" file is located in the folder  C:\\Users\\example.ini

example.ini contains the following information:
#Default configuration for JHelp application
#Last modified
#Sun May 18 00:20:28 MSK 2014
host=localhost
port=12345
version=1.0

The programm has three methods.
*/
package configfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configfile {

    FileInputStream examp;
    Properties property = new Properties();

    Configfile() {

        try {
            examp = new FileInputStream("C:\\Users\\example.ini");
            property.load(examp);
            examp.close();

        } catch (IOException e) {
            System.out.println("Error: Property file missing");
        }

    }

    private void meth1() throws IOException {                     // meth1() displays the contents of the file

        String host = property.getProperty("host");
        String port = property.getProperty("port");
        String version = property.getProperty("version");

        System.out.println("host=" + host + "\nport=" + port
                + "\nversion=" + version);

    }

    private String meth2(String key) throws IOException {       // meth2()  allows you to read the value of a property by its name
        String value;
        value = property.getProperty(key);
        System.out.println(value);
        return value;

    }

    private String meth3(String key, String nvalue) throws IOException {   // meth3() allows you to replace the value of the property with the specified name

        property.setProperty(key, nvalue);
        System.out.println(key + ":" + nvalue);
        return null;
    }

    private String meth4(String key, String nvalue) throws IOException {    //meth4() allows you to overwrite the file with new values parameters
        try (
                FileOutputStream fos = new FileOutputStream("C:\\Users\\example.ini")) {
            
            property.setProperty(key, nvalue);
            property.put(key, nvalue);
            property.store(fos, "#Method replace");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        Configfile cf = new Configfile();
       cf.meth1();
       cf.meth2("port");
       cf.meth3("host", "172.1.0.0");
       cf.meth4("host","172.1.0.0");

    }

}

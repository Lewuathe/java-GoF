package pagemaker;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + " Welcome");
            writer.paragraph("Waiting for reply");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

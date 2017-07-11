/**
 * Created by guptash on 7/8/2017.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SystemIORedirectDemo {
    public static void main(String... s) {
        try {
            FileOutputStream fos = new FileOutputStream("kkk.txt");
            PrintStream ps = new PrintStream(fos);
            System.setErr(ps);
            System.err.println("Hello");
            System.err.println("this is saved to kkk.txt file");
            System.err.println("Java ");
        } catch(IOException e) {
            System.out.println("IOException occured : " + e.getMessage());
        }
    }
}

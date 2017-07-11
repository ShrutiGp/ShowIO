/**
 * Created by guptash on 7/9/2017.
 */
import java.io.*;
public class Self1 {
    public static void main(String... s) {
        try {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        String str = "Shruti";
        for(int i = 0; i < str.length(); i++) {
            pos.write(str.charAt(i));
        }
            for(int i = 0; i < str.length(); i++) {
                System.out.print((char)pis.read());
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

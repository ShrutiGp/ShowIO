import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by guptash on 7/8/2017.
 */

import java.io.FileOutputStream;
import java.io.IOException;
    public class FileOStream{
        public static void main(String args[]){
            try{

                //If file doesn't exist, file gets created
                FileOutputStream fout=new FileOutputStream("kkkkjkgggjhhhdrg.txt",true/*append*/);
                String s="\n66666666664e5fhggjusuhegiweutqw7";
                byte b[]=s.getBytes();//converting string into byte array
                fout.write(b);
                fout.close();
                System.out.println("success...");
            }catch(IOException e){System.out.println(e);}
        }
    }


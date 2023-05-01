package bytestreamsg3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            String s = "Hello world";
            byte[] b = s.getBytes();
            output.write(b);
            output.flush();

        } catch (FileNotFoundException ex){
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch=input.read()) != -1) System.out.println(ch);
        } catch (FileNotFoundException ex){
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

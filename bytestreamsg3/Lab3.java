package bytestreamsg3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {
    public static void main(String[] args) {
        FileOutputStream file;
        try {
            file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Hentry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream fileI = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(fileI);
            String name = input.readUTF();
            int age = input.readInt();
            double height = input.readDouble();

            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

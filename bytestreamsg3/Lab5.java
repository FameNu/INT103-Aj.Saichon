package bytestreamsg3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args) {
        Student s = new Student("99999", "Henry Scoop");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
            output.flush();
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student std = (Student) input.readObject();
            System.out.println("ID:" + std.id);
            System.out.println("Name:" + std.name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

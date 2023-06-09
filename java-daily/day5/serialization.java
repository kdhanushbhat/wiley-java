package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable {
    String name;
    int price;

    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String tostring() {
        return this.name + "\t" + this.price;
    }
}

public class serialization {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        ObjectOutputStream dout = new ObjectOutputStream(new FileOutputStream("day5\\book2.ser"));
        dout.writeObject(new Book("Wiley reference", 2000));
        dout.close();
        ObjectInputStream din = new ObjectInputStream(new FileInputStream("day5\\book2.ser"));
        Book b = (Book) din.readObject();
        System.out.println(b.tostring());
        din.close();

    }
}

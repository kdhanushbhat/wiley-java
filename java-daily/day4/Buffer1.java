package day4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffer1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileOutputStream fout = new FileOutputStream("day4\\abc.txt", true);
        BufferedOutputStream bof = new BufferedOutputStream(fout);
        String str = " I ma program\n";
        byte[] b = str.getBytes();
        bof.write(b);

        bof.flush();
        bof.close();
        BufferedInputStream bif = new BufferedInputStream(new FileInputStream("day4\\abc.txt"));
        int i;
        while ((i = bif.read()) != -1) {
            System.out.println((char) i);
        }
        bif.close();
    }
}
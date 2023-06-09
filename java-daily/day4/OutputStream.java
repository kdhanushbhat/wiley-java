package day4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("day4\\abd.txt", true);
        DataOutputStream dos = new DataOutputStream(fout);
        dos.writeBytes("oajwdnawuduaw");
        dos.flush();
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("day4\\abd.txt"));
        byte[] b = dis.readAllBytes();
        for (byte bb : b)
            System.out.println((char) bb);
        dis.close();
    }
}

package IOStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class CharStreamWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/ganeswar/Documents/WishFile.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        char ch[] = { 'g', 'a', 'n', 'e', 's', 'h' };
        bw.write(ch);
        bw.newLine();
        bw.write("hello imaginnovate");
        bw.write(32);
        System.out.println("Data entered successfully...");
        bw.flush();
        bw.close();

        // bufferReder
        FileReader fr = new FileReader("/home/ganeswar/Documents/WishFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        br.close();

    }

}
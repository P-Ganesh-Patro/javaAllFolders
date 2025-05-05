package IOStream;

import java.io.FileInputStream;

public class IoStreamClassDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream inStream = null;
        int i;
        char c;
        try {
            inStream = new FileInputStream("/home/ganeswar/Documents/WishFile.txt");
            System.out.println("Character are:- ");
            while ((i = inStream.read()) != -1) {
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (inStream != null) {
                inStream.close();

            }
        }

    }

}

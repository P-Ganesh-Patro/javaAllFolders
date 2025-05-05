package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStreamClassDemo {
    public static void main(String[] args) {
        try{
            byte fWrite[] = {'H', 'i',  ' ', 'G', 'a','n','e', 's','h'};

            FileOutputStream isWrite = new FileOutputStream("/home/ganeswar/Documents/outputStream.txt");
            for(int i =0; i < fWrite.length; i++){
                isWrite.write(fWrite[i]);
            }
            System.out.println("File is created...");

            FileInputStream isRead =  new FileInputStream("/home/ganeswar/Documents/outputStream.txt");
            int size = isRead.available();
            for(int i =0; i < size; i++){
                System.out.print((char)isRead.read() + " ");
            }
            isWrite.close();;
            isRead.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Done");
        }

        
    }

}

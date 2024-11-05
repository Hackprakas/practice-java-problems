import java.io.*;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        
        // try  {
        //     FileOutputStream fos = new FileOutputStream(filePath,true);
        //     BufferedOutputStream fss=new BufferedOutputStream(fos);
        //     String data = "Hello, BufferedInputStream!\nWelcome to Java I/O.";
        //     fss.write(data.getBytes());
        //     System.out.println("Data written to file: " + filePath);
        //     fss.close();
        //     fos.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        try{
            FileInputStream fos=new FileInputStream(filePath);
            BufferedInputStream fss=new BufferedInputStream(fos);
            int k=0;
            while((k=fss.read())!=-1){
                System.out.print((char)k);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

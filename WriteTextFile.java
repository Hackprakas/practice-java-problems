import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteTextFile {
    public static void main(String[] args) {
        String data = "Hello, World!";
        
        try (FileOutputStream fos = new FileOutputStream("example.bin");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
             
            // Convert the string to bytes using a specific encoding
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            
            // Write the byte array to the buffered output stream
            bos.write(bytes);
            bos.flush(); // Ensure all data is written to the file
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

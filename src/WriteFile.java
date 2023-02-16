import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter mywriter = new FileWriter("tasklist.txt", false);
            mywriter.write("1. Buy milk \n 2.wash the car \n 3. do the chores \n 4. cook the dinner");
            mywriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e ) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

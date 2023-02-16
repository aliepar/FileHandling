import java.io.File;
import java.io.IOException;

public class fileIO {
    public static void main(String[] args) {
        try{
            File myObj = new File("tasklist.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName() );
            }
            else{
                System.out.println("file already exist");
            }
        } catch( IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}

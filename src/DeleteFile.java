import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
      File myObj = new File("tasklist.txt");
      if(myObj.delete()){
          System.out.println("Deletet the file:" + myObj.getName());
      }
      else {
          System.out.println("Failed to delete the file");
      }
    }
}

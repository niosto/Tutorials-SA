import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void createFile(String filename){
        File file = new File(filename);
        try{
            if(file.createNewFile())
                System.out.println(file.getName() + " created");
            else
                System.out.println(file.getName() + " already exists, overwriting the content");

        } catch(IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String name, String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(name);
            fileWriter.close();
            System.out.println("Wrote " + name + " to " + filename);

        }catch(IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        
        String name = scan.nextLine();
        scan.close();

        String filename = "file.txt";
        
        createFile(filename); 
        writeFile(name, filename);
   }
}
import java.io.*;
import java.util.*;

class fileread{
    public static void main(String args[]){
       /*  try{
        File file = new File("C:\\Users\\brajesh kumar\\OneDrive\\Documents\\file1.txt");
        if(file.createNewFile()){
            System.out.println("file"+" "+file.getName()+" "+"is created");
        }
        else{
            System.out.println("file existed");
        }
    
        }
        catch(IOException e){
            System.out.println(e);
        }
    }*/
/*try{
    FileWriter fwrite = new FileWriter("C:\\Users\\brajesh kumar\\OneDrive\\Documents\\file1.txt");
    fwrite.write("// This is a java programme to check a file.\n");
    fwrite.write("My name is aman kumar");
    fwrite.close();
    System.out.print("Successfully written in file");
}
catch(Exception e){
    System.out.println(e);
}*/

try{
    FileReader fread = new FileReader("C:\\Users\\brajesh kumar\\OneDrive\\Documents\\file1.txt");
    BufferedReader reader = new BufferedReader(fread);
    String line;
    while((line = reader.readLine())!= null){
        if (line.startsWith("//")){
            System.out.println(line);
        }
    }
}
catch (Exception e){
    System.out.println(e);
}
}
}

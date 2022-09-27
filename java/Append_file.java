import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Append_file {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter appfile=new FileWriter("sahil.txt",true);
            PrintWriter Pw=new PrintWriter(appfile);
            String abc=sc.nextLine();
            Pw.println(abc);
            Pw.close();

        }
        catch( Exception e)
        {
            e.getStackTrace();

        }
        sc.close();
    }
    
}

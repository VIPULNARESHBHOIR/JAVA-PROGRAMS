import java.io.FileReader;
public class Read_file {
    public static void main(String[] args) 
    {
        char[] arr = new char[500];

        try
        {
            FileReader file= new FileReader("Vipul.txt");
            file.read(arr);
            System.out.println(arr);
            file.close();
        }
        catch( Exception e)
        {
            e.getStackTrace();
        }

    }
}

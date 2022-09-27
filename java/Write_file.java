import java.io.FileOutputStream;
import java.util.Scanner;
class Write_file{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String temp;
        temp=sc.nextLine();
    try
    {
        FileOutputStream filecreation=new FileOutputStream("vipul.txt");
        byte [] data=temp.getBytes();
        filecreation.write(data);
        filecreation.close();
    }
    catch(Exception e)
    {
        e.getStackTrace();

    }
    sc.close();
    }
    
}

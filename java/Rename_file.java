import java.io.File;
class Rename_file{
    public static void main(String[] args){
    File filecreation=new File("naresh.txt");
    try
    {
        filecreation.createNewFile();

    }
    catch(Exception e)
    {
        e.getStackTrace();

    }
    File newfile=new File("Vipul.txt");
    boolean t = filecreation.renameTo(newfile);
    if (t==true){
        System.out.println("Reanme successfully");
    }
    else{
        System.out.println("rename properly");
    }
    }
    
}

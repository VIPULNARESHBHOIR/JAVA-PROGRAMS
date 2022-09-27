
import java.util.Arrays;
import java.util.Scanner;
class Sqaure_range{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("range:");
        n=sc.nextInt();
        System.out.println("\nEnter Number according to your choice: ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("\n Square of numbers:\n");
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" = "+arr[i]*arr[i]);
        }
        
    sc.close();


    }
}
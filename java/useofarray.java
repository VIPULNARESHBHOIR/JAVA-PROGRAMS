import java.util.Scanner;

class useofarray{
public static void main(String[] args) {
    int n,sum=0;
    Scanner x=new Scanner(System.in);
    System.out.println("enter the size of array");
    n=x.nextInt();
    int []arr=new int[n];
    System.out.println("enter the element in aaray:");
    for (int i=0;i<n;i++){
        arr[i]=x.nextInt();
        sum=sum+arr[i];

    }
    System.out.println("the sum of arrays element is :"+sum);
}
}
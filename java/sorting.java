import java.util.Scanner;

class sorting {
    public static void main(String[] args) {

    int n,temp=0;
    Scanner x=new Scanner(System.in);
    System.out.println("enter the size of array");
    n=x.nextInt();
    int []arr=new int[n];
    System.out.println("enter the element in aaray:");
    for (int i=0;i<n;i++){
        arr[i]=x.nextInt();
    }
    x.close();
    System.out.println("\nSorted array:");
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
    }

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    }

}
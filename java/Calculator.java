import java.util.Scanner;

class Cal{
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return (a-b);
    }
    public float mult(int a,int b){
        return a*b;
    }
    public float div(int a,int b){
        return a/b;
        
    }
}

class Calculator{
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        char y;
        Cal obj=new Cal();
        System.out.println("Enter Exp. as X [+ or * or - or /] y");
        System.out.print("a:");  a=sc.nextInt();
        System.out.print("operator:");  y=sc.next().charAt(0);
        System.out.print("b:");  b=sc.nextInt();
             
        switch(y)
        {
            case '*':
            System.out.println(obj.mult(a,b));
            break;
            case '/':
            System.out.println(obj.div(a,b));
            break;
            case '+':
            System.out.println(obj.sum(a,b));
            break;
            case '-':
            System.out.println(obj.sub(a,b));
            break;
            default:
            System.out.println("enter correct choice");
            break;
        
        }
        sc.close();

        
    }
    
}
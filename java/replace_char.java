import java.util.Scanner;

public class replace_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 ;
        char str2[];
        char targetChar, replacedBy;
        System.out.println("Enter the string:");
        str1 = sc.nextLine();
        System.out.println(str1);
        str2 = new char[str1.length()];
        System.out.println("enter the character:");
        targetChar = sc.next().charAt(0);
        System.out.println("replace with:");
        replacedBy = sc.next().charAt(0);
        str2 = str1.toCharArray();
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] == Character.toLowerCase(targetChar) || str2[i] == Character.toUpperCase(targetChar)) {
                str2[i] = replacedBy;
            }
        }
        sc.close();
        str1 = new String(str2);
        System.out.println("\nThe String after replacing every " + targetChar + " with " + replacedBy + " is:\n");
        System.out.println(str1);
    }
}
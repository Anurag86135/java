import java.util.Scanner;

public class anurag3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of first number 'a'");
        int a=sc.nextInt();
        System.out.println("enter the value of Second  number 'b'");
        int b= sc.nextInt();
        int temp =a;
        a=b;
        b= temp;
        System.out.println(" a = " +a+ ", b = "+b);
        sc.close();
        
    }
    
}

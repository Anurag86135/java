import java.util.Scanner;
public class anurag4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the First number 'a'");
        int a=sc.nextInt();
        System.out.println("enter the Second value 'b'");
        int b=sc.nextInt();

        //logic
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+ a + ", b = " +b);
        sc.close();

    }
    
}

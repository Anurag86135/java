public class anurag9 {
    public static void main(String[] args) {
        int year=2024;
        if(year % 4 ==0 && year % 100!=0 || year % 400==0){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
    
}

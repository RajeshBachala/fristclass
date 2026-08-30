import java.util.Scanner;

public class Demofactorial {
    public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);
       int n = sr.nextInt();
       int count= n;
       long factorial = 1;
       for(int i=1;i<=count;i++)
       {
        factorial *= i;
            
         }
         System.out.println("Factorial of"+ count + "is:" + factorial);
      
    }
}

import java.util.Scanner;



    public static void main(String[] args) {
        Scanner sr1 = new Scanner(System.in);
        Scanner sr2 = new Scanner(System.in);
        int num1 = sr1.nextInt();
        int num2 = sr2.nextInt();
        int result = num1*num2;
        if(num2==0){
        System.out.println("You can not multiply by 0");
    }
    else{
        System.out.println(result);
    }
    sr1.close();
    sr2.close();
    }

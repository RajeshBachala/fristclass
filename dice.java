import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("enter your option :");
       int price=0;
       int a[] = {500,600,700,800,900,10000};
       for(int i=1; i<n; i++)
       {
             price=+a[i];
       }
       System.out.println(price);
    }
}
//        switch (n) {
//         case 1:
//             System.out.println(price);
//             break;
        
//         case 2:
//             System.out.println(price);
//             break;
//         // case 3:
//         //     System.out.println(price=+700);
//         //     break;
//         // case 4:
//         //     System.out.println(price=+800);
//         //     break;
//         // case 5:
//         //     System.out.println(price=+900);
//         //     break;
//         // case 6:
//         //     System.out.println(price=+1000);
//         //     break;            
//         default:
//              System.out.println("Enter a valied number");
//             break;
//        }

//     }
// }

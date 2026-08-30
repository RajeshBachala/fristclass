

public class wrapperlab {
    public static void main(String[] args) {
       
       int num =  66;
    //    String s = Integer.toString(num);
    //    char fristchar = s.charAt(0);
    //    char secondchar = s.charAt(1);
    //    System.out.println(fristchar);
    //    System.out.println(secondchar);
       char ch = (char) num;
       System.out.println(ch);
    }
}


/*wrapper class is provide classes to the primitive data types 
e.g int->Integer class
    char->Charter class
    double->double class
    boolen->Bollen class
    short->short class */
/*In wrapper class when we assign value that is not value that is object  
int i = 3;
Integer obj = i;  this is autoboxing

Integer obj = Integer.valueof(3);
int i = obj;      this is unboxing

wrapper class are immutable and final
*/


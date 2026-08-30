

 interface washingmachine {
  int age=25;   
  void method1();
     void method2();
     void method3();
     void method4();}
  class washingmachine1 implements washingmachine {
    
       public void method1()
       {
        System.out.println("this method take 1 hour 30 minutes");
       }   
       public void method2()
       {
        System.out.println("this method take 1 hour ");
       } 
       public void method3()
       {
        System.out.println("this method take 30 minutes");
       }
     public void method4()
       {
        System.out.println("this method take 20 minutes");
       }
    }   


public class Interfacelab {
    public static void main(String[] args)  
   {
       
                 washingmachine obj;
                 obj = new washingmachine1();
                 obj.method1();
                 obj.method2();
                 obj.method3();
                 obj.method4();
                 System.out.println(washingmachine.age);
}
}

//In Interface all varabiles are final and static you can't change.
//with the use of class name you can call varibles.
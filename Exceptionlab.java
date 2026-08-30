 class A{
    public void add(int i, int j){
        //int i=9;
       // int j=3;
        int result;
        
        try{
            result=i/j;
           System.out.println("Good programer" + result);

        }catch (Exception e)
        {
            System.out.println("Can't divided by zero" + e);

        }

    }

    public void array(){

        int Array[] =  {2,4,5,7,9,10};

        try{
            System.out.println( Array[6]);
            
        }catch(Exception e){
            System.out.println("stay in your limits" + e);
        }
    

    }
 }


public class Exceptionlab {
    public static void main(String[] args) {

    A obj = new A();
    obj.add(6,3);
    obj.array();
        
    
}
}


class person{
    protected int age=18;             //if we put pravite as well here same output
    protected String name="Rajesh";    // we need to mention getters and setters inside the private
public int getage()                    // class only and we can access those in extended class
{
    return age;                         //in same way setter as well and in place of return use
}                                       //this keyword
public String getname()
{
    return name;
} 

public void show()
{
   
    System.out.println(age);
    System.out.println(name);
}
}
class femal extends person {
    public void show1()
{
    int i=getage();
    String s=getname();
    System.out.println(i);
    
    System.out.println(s);
}
}
public class getterandsetterlab {
    public static void main(String[] args) {
        //person obj = new person();
        femal obj1 = new femal();
        obj1.show();
        obj1.show1();

    }
} 
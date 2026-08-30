class computer{
    public void code()
    {

    }
}
class laptop extends computer 
{
    public void code()
    {
       System.out.println("code");
    }
}
    class Desktop extends computer
    {
        public void code()
       {
            System.out.println("code and faster");
       }
    }
class Developer
{
    public void devapp(computer lap)
    {
        lap.code();
    }
}
public class optionchoose {
    public static void main(String[] args) {
        
        computer lap = new laptop();
        computer desk = new Desktop();
        Developer navin = new Developer();
           navin.devapp(lap);
    }
}

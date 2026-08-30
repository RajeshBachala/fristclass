public class emp {
    private int id;
    private String name;
    private String dept;
    private int salary;
    public emp(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        System.out.println("The employee id is" + id);
         System.out.println("The employee id is" + name);
          System.out.println("The employee id is" + dept);
           System.out.println("The employee id is" + salary);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
     public void show()
    {
        // System.out.println("The employee id is" + id);
        //  System.out.println("The employee id is" + name);
        //   System.out.println("The employee id is" + dept);
        //    System.out.println("The employee id is" + salary);
        

    }
    
    
}

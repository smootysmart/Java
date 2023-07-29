package javaoop;

public abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private Double salary;
    
    //static attribue
    static int minSalary = 12000;
    //Default Constructor
    public Employee(String id,String name,Double salary){
        this.id = id;
        this.name = name;
        this.salary=salary;

              System.out.println("Create Object Complete.");
    }
    //variable default
    public Employee(){
        System.out.println("I'm Employee");
    }
    //2 variable
    public Employee(String id,String name){
        this.id = id;
        this.name = name;
    }
    public Employee(String name,Double salary){
        this.name = name;
        this.salary = salary;
        disPlayEmployee();
    }

    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void disPlayEmployee(){
        //System.out.println("ID = "+this.id);
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
    }
    
    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.id;
    }
    public Double getSalary(){
        return this.salary;
    }

    public abstract void bonus();
}

 // This says, "I'm checking the first item on my shopping list."
int firstElement = myList.get(0); 
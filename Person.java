import java.time.LocalDate;
import java.time.Period;

public class Person{
    private String name;
    private LocalDate dob;
    public Person(String name,LocalDate dob){
        this.name=name;
        this.dob=dob;} 

    public void display(){
        System.out.println("Name is:"+name);
    }
    public void displayAge(LocalDate currDate){
       
        Period age=Period.between(dob,currDate);
        System.out.println("student age "+age.getYears());
    }
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2000, 05, 24);
        Person s1=new Person("Savio",dob);
        s1.display();
        LocalDate currDate=LocalDate.now();     
        s1.displayAge(currDate);
    }
}



public class Employee_details extends Person{
    String emp_id;
    double salary;
    public Employee_details(String name,LocalDate dob,String emp_id,double salary){
      super(name,dob);
        this.emp_id=emp_id;
        this.salary=salary;
    }
     public void displayDetails(){
        System.out.println("Emp_id:"+emp_id);
        System.out.println("Salary:"+salary);
     }
     public static void main(String[] args){
   
        LocalDate dob=LocalDate.of(2000, 05, 24);
        Employee_details e1=new Employee_details("UniversityStud",dob,"ED101",60000.5);
        e1.display();
        LocalDate currDate=LocalDate.now();     
        e1.displayAge(currDate);
        e1.displayDetails();
     }
}



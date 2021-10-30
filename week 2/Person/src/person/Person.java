package person;
public class Person 
{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    public Person(String name,String address,String phoneNumber,String email)//constructor
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }
    public static void main (String[] args)
    {
       Student std = new Student("Abdelrahman Emad","Maghagha,Minya,Egypt","01018754602","abdoemad2082001@gmail.com","junior");
       System.out.println(std.toString());
       MyDate dt = new MyDate(21,8,2020);
       Faculty fac = new Faculty("Adham","Cairo,Egypt","01124996266","Adham@gmail.com","Ramses 20 Emad El Din St., 7th floor, downtown",2000.0,dt,"6 hours","Assistant");
       System.out.println(fac.toString());
       Staff st = new Staff("Adham","Cairo,Egypt","01124996266","Adham@gmail.com","Ramses 20 Emad El Din St., 7th floor, downtown",2000.0,dt,"Staff");
       System.out.println(st.toString());
    }
}
class Student extends Person
{
    final String FRESHMAN = "Freshman";
    final String SOPHOMORE = "Sophomore";
    final String JUNIOR = "Junior";
    final String SENIOR = "Senior";
    private static String status;
    public Student(String name,String address,String phoneNumber,String email,String status)
    {
        super(name,address,phoneNumber,email);
        this.status = status;  
    }
    public String toString()
    {
        return " Name : "+getName()+ "\n Address : "+getAddress() +"\n Phone Number : "+getPhoneNumber()+"\n Email : "+ getEmail()+"\n Status :"+status+"\n *************************************";
    }
}
class Employee extends Person
{
    private String office;
    private double salary;
    private MyDate dateHired;
  
    public Employee(String name,String address,String phoneNumber,String email,String office,double salary,MyDate dateHired)
    {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public String toString()
    {
        return " Name : "+getName()+ "\n Address : "+getAddress() +"\n Phone Number : "+getPhoneNumber()+"\n Email : "+ getEmail()+"\n Office : "+office +"\n Salary : "+salary + "$\n Hiredate : "+dateHired+"\n";
    } 
}
class Faculty extends Employee
{
    String officeHours;
    String rank;
    public Faculty(String name,String address,String phoneNumber,String email, String office,double salary,MyDate dateHired, String officeHours, String rank) 
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString()
    {
        return super.toString() + "\n office hours : " + officeHours + "\n Rank : " + rank + "\n";
    }
}
class Staff extends Employee
{
    String title;
    public Staff(String name,String address,String phoneNumber,String email, String office,double salary,MyDate dateHired, String title) 
    {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }
    public String toString()
    {
        return super.toString() + "\n title : " + title + "\n";
    }
}
class MyDate
{
    private int year;
    private int month;
    private int day;
    public MyDate(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
   public String toString()
   {
       return day+"/"+month+"/"+year+"\t";
   }
}

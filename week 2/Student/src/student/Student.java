package student;
public class Student 
{
    String std_name;
    private int std_id;
    double GPA;
    Student(String name,int id,double GPA)
    {
        this.std_name = name;
        this.std_id = id;
        this.GPA = GPA;
    }
    String print()
    {
        return "Name of student : " + std_name + "\nID of student : " + std_id + "\nGPA of student : " + GPA + "\n"; 
    }
    public static void main(String[] args) 
    {
        Student std = new Student("Abdelrahman Emad",25,2.8);
        subject sub = new subject(124,"Software development",3);
        address ad = new address(19,"Minya","Egypt");
        System.out.println(std.print()+ "Subject ID : " + sub.sub_id + "\nSubject Name : " + sub.sub_name + "\nSubject Hours : " + sub.sub_hours + "\nStreet Number : " + ad.str_number + "\nCity : " + ad.str_city + "\nCountry : " + ad.str_country + "\n");
    }   
}
class subject
{
    int sub_id;
    String sub_name;
    int sub_hours;
    subject(int id,String name,int hours)
    {
        this.sub_id = id;
        this.sub_name = name;
        this.sub_hours = hours;
    }
}
class address
{
    int str_number;
    String str_city;
    String str_country;
    address(int number,String city,String country)
    {
        this.str_number = number;
        this.str_city = city;
        this.str_country = country;
    }
}

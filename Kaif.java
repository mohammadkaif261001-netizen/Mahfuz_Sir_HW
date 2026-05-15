class student{
    String name;
    int age;
    String university;
    String department;
    String city;
    student(String name, int age, String university, String department, String city){
        this.name=name;
        this.age=age;
        this.university=university;
this.department=department;
this.city=city;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("University: "+university);
        System.out.println("Department: "+department);
        System.out.println("City: "+city);
    }
}
public class Kaif{
    public static void main(String[] args) {
        student s1=new student("Md. Kaif Hosen", 21, "Prime University", "CSE","Dhake");
        s1.display();

    }
}
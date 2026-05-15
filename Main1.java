class student{
    String name;
    int age;
    String university;
    String department;
    String city;
    student(){
        name="Md. Kaif Hosen .";
        age=21;
        university="Prime University";
        department="CSE";
        city="Dhake";
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("University: "+university);
        System.out.println("Department: "+department);
        System.out.println("City: "+city);
    }

}
public class Main1 {
    public static void main(String[] args) {
        student s1=new student();
        s1.display();
    }
}
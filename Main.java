class student{
    String name="Md. Kaif Hosen.";
    int age=21;
    String university="Prime University.";
    String department="CSE";
    String city="Dhake.";
void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("University: "+university);
    System.out.println("department: "+department);
    System.out.println("City: "+city);
}
}
public class Main{
    public static void main(String[] args) {
        student s1=new student();
        s1.display();
    }
}


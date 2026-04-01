class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }

    public void printcolor(){
        System.out.println(this.color);
    }

    public void printtype(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class oopspen {
    public static void main(String[]args){
        Student s1 = new Student("Shakti",21);

        s1.printInfo();
    }
}

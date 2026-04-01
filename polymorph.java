class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(age);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class polymorph {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name ="Shakti";
        s1.age = 21;

        s1.printInfo(s1.age);
    }
}

package project6;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ZOBAIDA" , "1234");
        Student student2 = new Student("3da bnt 3mash" , "gng");
        Student student3 = new Student("Elraib","meow");
        Student student4 = new Student("Fahad sal","m9dood");
        System.out.println("------------------------------------------");
        //System.out.println(student1.toString());
        //System.out.println(student2.toString());
        //System.out.println(student3.toString());
        //System.out.println(student4.toString());
        System.out.println("------------------------------------------");
        System.out.println(student1.login(1,"1234"));
        System.out.println(student2.login(2, "gng"));
        System.out.println(student3.login(3, "gooner"));
    }
}

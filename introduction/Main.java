package introduction;
public class Main {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.color = "RED";
        mycar.speed = 200;

        System.out.println("My car color is "+mycar.color);
        System.out.println("can make "+mycar.speed+"KM/H");
        
        mycar.drive();
}
}
package project2;
public class Main {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.setName("bmw"); 
        mycar.setModel(2022);
        mycar.setPrice(125000);
        System.out.println(mycar.getName());
        System.out.println(mycar.getModel());
        
        circle c1 = new circle();

        c1.setRadius(3.0);
        c1.setColor("red");
        System.out.println("c1 area= "+c1.getArea());

    }
}

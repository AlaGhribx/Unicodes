

public class main {
    public static void main(String[] args) {
        product p = new product();
        product p1 = new product("camera","Auto focus",99,10,10);
        product p2 = new product(p1);
        product p3 = new product("camera","Auto focus",99,10,10,"titanium");
        System.out.println("----------------------------");
        p.display();
        System.out.println("----------------------------");
        p1.display();
        System.out.println("----------------------------");
        p2.display();
        System.out.println("----------------------------");
        p3.display();
        System.out.println("----------------------------");


    }

}

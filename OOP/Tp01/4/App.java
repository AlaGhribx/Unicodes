public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.print();

        Rectangle r2 = new Rectangle(12, 8);
        r2.print();

        Rectangle r3 = new Rectangle(r2);
        System.out.println(r2.length); 
        System.out.println(r3.length); 
        
        Rectangle r4 = new Rectangle();
        
        r1.setLength(-50); 
    }
}
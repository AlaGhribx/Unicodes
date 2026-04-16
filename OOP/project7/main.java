package project7;
//Java does not support explicit pointers in the way languages like C or C++ do
public class main {
    static void fun(Test n){
        n.number++;
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.number = 1;
        fun(obj) ;
        System.out.println("number = "+obj.number);
    }
    
}

package project4;
//Notes : 
// constructor name must be the same as its class name.
// a Constructor must have no explicit return type (void, string , int , ....).
// a java constructor cannot be abstract ,static ,final ,and synchronized. 
public class product {
    //attributs 
    private String name;
    private String discription;
    private float price; 
    private int quantity;
    private float discount;
    private String color; 

    //1 - constructor has no arguments(no parameters)
    public product(){
        this.name = "No name";
        this.discription = "No discription";
        this.price = 0 ;
        this.quantity = 0; 
        this.discount = 0; 
    }
   
    //2 - Parmeterized constructor (this constructor is overloaded)

    public product(String n,String d,float p,int q,float dis){
        this.name = n;
        this.discription = d;
        this.price = p ;
        this.quantity = q; 
        this.discount = dis; 
    }
    
    //3 - copy constructor
    public product(product object){
        this.name = object.name;
        this.discription = object.discription;
        this.price = object.price ;
        this.quantity = object.quantity; 
        this.discount = object.discount; 
    }
        
    

    //4 - use this as constructor chaining
    public product(String n,String d,float p,int q,float dis,String C){
        this(n,d,p,q,dis);// constructor chaining 
        this.color = C ; 
    }

    // display method 
    public void display(){
        System.out.println("Name = "+ name);
        System.out.println("discription = "+ discription);
        System.out.println("price = "+ price);
        System.out.println("quantity = "+quantity);
        System.out.println("discount = "+discount);
        System.out.println("color = "+color);
    }



}

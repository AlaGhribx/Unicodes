package project2;
public class car {
    //attributs:
    private String name;
    int maxspeed;
    private int model;
    int price;

    //methods
    public void setName(String n){
         name = n ; 
    }
         
    public String getName(){
        return name; 
    }
   
    
    void setPrice(int p){
         price = p ;
    }

    void setModel(int m){
        if (m>=2015 & m<=2026) {
            model = m ; 
        }else{
            System.out.println("this model is not found !");
        }
        
    }

    int getPrice(){
        return price;

    }
    
    int getModel(){
        return model;
    }
}

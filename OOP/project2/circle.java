

public class circle {
    private double radius ; 
    private String color ;
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 

    public double getArea(){
        return Math.PI * radius * radius;  
    }
    @Override 
    public String toString() {
        return "circle [radius=" + radius + ", color=" + color + ", toString()=" + super.toString() + "]";
    }
    
}

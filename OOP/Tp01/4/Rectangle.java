public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double l, double w) {
        setLength(l);
        setWidth(w);
    }

    public Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
    }

    public void setLength(double l) {
        if (l > 0) {
            this.length = l;
        }
    }

    public void setWidth(double w) {
        if (w > 0) {
            this.width = w;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void print() {
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + calculateArea());
        System.out.println("perimeter = " + calculatePerimeter());
    }
}
abstract class polym{
    abstract void numberOfSides();
}
class Rectangle extends polym{
    void numberOfSides() {
        System.out.println("Number of sides of Rectangle is 4");
    }
}
class Triangle extends polym{
    void numberOfSides() {
        //this.getClass
        System.out.println("Number of sides of Triangle is 3");
    }
}
class Hexagon extends polym{
    void numberOfSides() {
        System.out.println("Number of sides Hexagon is 6");
    }
}
public class Poly {
    public static void main(String[] args) {
        new Hexagon().numberOfSides();
        new Triangle().numberOfSides();
        new Rectangle().numberOfSides();
    }
}

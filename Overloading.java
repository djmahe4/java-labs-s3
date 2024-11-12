import java.util.*;
public class Overloading {
    void area(float a){
        float area=a*a;
        System.out.println("Area of the square is "+area);
    }
    void area(float a,float b){
        float area=a*b;
        System.out.println("Area of the square is "+area);
    }
    void area(double a){
        double area=3.14*a*a;
        System.out.println("Area of the square is "+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Area of square");
            System.out.println("2.Area of rectangle");
            System.out.println("3.Area of circle");
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            Overloading o=new Overloading();
                if (ch==1){
                    System.out.println("Enter side of the square");
                    float a=sc.nextInt();
                    o.area(a);
                    }
                else if (ch==2){
                    System.out.println("Enter dimentions of the rectangle");
                    float l=sc.nextInt();
                    float b=sc.nextInt();
                    o.area(l,b);
                    }
                else if(ch==3){
                    System.out.println("Enter radius of the circle");
                    double c=sc.nextInt();
                    o.area(c);
                }
                else{
                    sc.close();
                    break;
                }
        }
    }
}

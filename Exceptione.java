import java.util.*;
public class Exceptione {
    public static void main(String[] args) throws Exception {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter divident");
        int divident=sc.nextInt();
        System.out.println("Enter divisor");
        int divisor=sc.nextInt();
        double quotient=divident/divisor;
        System.out.println("Quotient is"+quotient);
        sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Completed..");
        }
    }
}

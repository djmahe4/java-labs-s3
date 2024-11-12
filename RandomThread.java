import java.util.*;
class Odd extends Thread{
    private int num;
    Odd(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Cube of "+num+" = "+num*num*num);
    }
}
class Even extends Thread{
    private int num;
    Even(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Square of "+num+" = "+num*num);
    }
}
public class RandomThread extends Thread
{
    Random r=new Random();
    public void run(){
        for(int i=0;i<10;i++){
            int num=r.nextInt(100);
            if(num%2==0){
                new Even(num).start();
            }
            else{
                new Odd(num).start();
            }
        }
    }
    public static void main(String[] args) {
        new RandomThread().start();
    }
}

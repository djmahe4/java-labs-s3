import java.util.*;
class Frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println("Enter character to search:");
        char a=sc.nextLine().charAt(0);
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==a) flag++;
        }
        System.out.println("Count of '"+a+"' in '"+s+"' is "+flag);
        sc.close();
    }
}
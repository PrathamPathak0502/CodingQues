// define the exception if a program adding two numbers is taking either of zero values 
//a=0,b=7  a+b=12
//a=0,b=4 exception
//a=6, b=0 exception
import java.util.*;
class Illustration{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Number 1 ");
        int x= sc.nextInt();
        System.out.println("Number 2");
        int y= sc.nextInt();
        if(x==0|y==0)
        try{
        throw new Exception();
        }
        catch (Exception e){
            System.out.println(" So ja bhai galat hai");
        }
        else
        System.out.println("hello");
    }}
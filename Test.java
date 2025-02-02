//Business logic class
import java.util.*;
class Add{
    int sum(int x , int y){
         int z=x+y;
       
        return z;

    }
}
//execution logic class(main class/Driver class)
class test{
     static public void main (String abc[]){
     Add obj= new Add();
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     System.out.println("enter value 1");
     int b=sc.nextInt();
     System.out.println("enter value 2");
     int r1=obj.sum(a,b);
    System.out.println("sum" +r1);
    
    
    }
}
//whenever main class is public then class name should be same
// void class doesnot return value
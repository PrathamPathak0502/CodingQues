//Defining own exception class
import java.util.*;
class InvalidAge extends Exception{

}
public class DefiningException {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age=sc.nextInt();
        if(age<21)
        try{
        throw new InvalidAge();
        }
        catch(InvalidAge e){
            System.out.println(e);
        }
        else
        System.out.println("oohhoo aa gye aap");

    }
}

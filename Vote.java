//write a java program  taking age as a parameter , if the age is less than 18 , it thriws exception.
//Also write try and catch to handle the exceptio.otherwise print "welcome to vote"
import java.util.*;
class Voting{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int x= sc.nextInt();
        
        if(x<18)                  //throw new Exception();
                                  // else 
        try{
        throw new Exception();
        }
        catch (Exception e){
            System.out.println(" sale rule follow kr");
        }
        else
        System.out.println("WELCOME SIR AAJ KAL K BACHE KO DEKHO UNDERAGE DRINK HI NHI VOTING BHI KRTE HAI");
    }}

    
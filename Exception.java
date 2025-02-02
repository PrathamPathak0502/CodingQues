//Exception Handling
// exception = run time error , finally key word can be ignored it is not neccessary This code typically involves cleanup operations like closing resources
// keywords TRY , CATCH, FINALLY, THROW, THROWS
//TRY :- to create the exception
//catch :- to catch the exception, it will only execute when there is exception

import java.util.Scanner;
class Exception1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Number 1 ");
        int x= sc.nextInt();
        System.out.println("Number 2");
        int y= sc.nextInt();
        try{
            System.out.println("x/y="+(x/y));
        }

        //only execute when there is exception
        catch(Exception e){
            System.out.println("plz enter non zero number for division");

        }

        // Finally block will always execute
        finally{
            System.out.println("Exception successfully handled");
        }


    }
}
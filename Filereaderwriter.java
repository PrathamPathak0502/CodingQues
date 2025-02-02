import java.io.*;
class Filereaderwriter{
    public static void main(String args[])throws Exception{
       FileWriter fw=new FileWriter("new.txt");
       fw.write("this is new file using file writer and reader command");
         System.out.println(" KA HO FIR AA GAIlE");
       fw.close();

    }
}
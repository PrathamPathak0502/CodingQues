//Transfer file method 2
import java.io.*;
class Transfer2{
    public static void main(String args[])throws Exception{
        FileOutputStream fout= new FileOutputStream("xyz.txt");
        FileInputStream fin=new FileInputStream("pqr.txt");
         fin.transferTo(fout);
         System.out.println(" KA HO FIR AA GAIlE");
         fin.close();
         fout.close();

    }
}
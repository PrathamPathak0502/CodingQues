//write a file to transfer data from one file to another
import java.io.*;
class Transfer{
    public static void main(String args[])throws IOException, FileNotFoundException{
        int i;
        FileInputStream fin=new FileInputStream("abc.txt");
        FileOutputStream fout=new FileOutputStream("pqr.txt");
        fout.write(fin.readAllBytes());
        System.out.println("Transfer successful");
        fin.close();
        fout.close();

    }
}
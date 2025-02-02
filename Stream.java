//***Read and write Stream***

import java.io.*;
class Stream {
    public static void main(String args[])throws IOException,FileNotFoundException{
        FileOutputStream fout=new FileOutputStream("abc.txt");
        String z="This is My First File";
        byte [] z1=z.getBytes();
        fout.write(z1);
        System.out.println("Write operation Successful");
        fout.close();

    }

}


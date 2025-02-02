//Throws key word when declare exception it will show exception
//unreported exception must be decleared or caught
//either we can declear the exception or cathch the ecxeption by using catch
//Airthmatic is not predicted by compiler in advance (it is unchecked exception)
//Arrayindex out Bound is also a unchecked exception
//Null pointer exception is also a unchecked exception
//IO exception is example of checked exception
//File not found exception is checked exception
// THROWS key word is used to declear the posibility of exception
// THROW key word is use to generate the exception.
import java.io.*;
class Display{
    void show() throws IOException{

    }

}
 class Throws{
    public static void main(String args[]){
        Display obj= new Display();
        obj.show();
    }
 }
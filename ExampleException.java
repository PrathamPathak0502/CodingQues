//IOException
class ExampleException{
   public static void main(String args[]){
    File f1= new File("mynewfile.txt");
    if(f1.createNewfile()){
        System.out.println("File is created");

    }
    else
    System.out.println("hie Sexii lady");
   }
}
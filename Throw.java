class Display1{
    void show() 
    {
        throw new Exception();

    }

}
 class Throw{
    public static void main(String args[]) throws Exception{
        Display obj= new Display();
        obj.show();
    }
 }
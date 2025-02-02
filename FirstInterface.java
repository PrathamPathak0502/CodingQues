//all the method inside interface always be public and abstract
Interface Sample{
   public void first();
public void second();
}
class Display implements Sample{
    void first(){
        System.out.println("First method implemented");
    }
    void second(){
        System.out.println("Second method implemented");
    }
}

public class FirstInterface {
    public static void main(String args[]){
        
    }
    
}

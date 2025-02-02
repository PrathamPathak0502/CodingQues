abstract class FAbstract1{
    void display(){
        System.out.println("this is the first method of abstract class");
    }

abstract void present();}
class First extends FAbstract1{ 
    void present(){
        System.out.println("Abstract method implemented");
    }

}
 class Test {
    public static void main(String args[]){
        First obj=new First();
        obj.display();
        obj.present();

    }
    
}

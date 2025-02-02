//correct it
class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread started Running");

    }
}
class Thread4 extends Thread{
    public void run(){
        System.out.println("Thread started Running");
        
    }
}
public class ThreadName {
    public static void main(String args[]){
        Thread3 t1=new Thread3();
        Thread4 t2= new Thread4();


        t1.start();
        t2.start();
        System.out.println("Thread1 name " +t1.getname());
        System.out.println("Thread2 name"+t2.getname());
        
}
}
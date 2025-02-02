class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread started running");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread2 started running");
    }
}
public class Threads {
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2= new Thread2();

        t1.start();
        t2.start();

    }
    
}

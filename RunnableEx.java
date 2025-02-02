//Runnable

class MyThread implements Runnable{
    public void run(){
        System.out.println("runnable interface thread");

    }
}
class RunnableEx{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2=new MyThread(t1);
        t2.start();
    }
}
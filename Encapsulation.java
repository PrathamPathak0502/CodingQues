 class Student{

    private int rollno=110;
    String name="Pratham";
    void getRollno(){
        System.out.println(rollno);

    }
    void setRollno(){
        rollno=158;
    }
    
}  

class Encapsulation {
    public static void main(String args[]){
        Student std = new Student();
        std.getRollno();
    }
}

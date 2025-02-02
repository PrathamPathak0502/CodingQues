//write a program to demonstrate inhertitance in interfaces
interface Vehicle{
    void type();
}
interface Car extends Vehicle{
    void price();
}
class Ford implements Car{
    public void type(){
        System.out.println("Tyoe: 4 wheeler");
    }
} 
public void price(){
    System.out.println("12 Lakh ");
}
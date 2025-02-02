import java.util.Scanner;
public class occurence {
    public static void main(String args[]){
        int arr[]={3,5,4,3,6,7,8,5};
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an element");
        int el=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(el==arr[i])
            count++;
        }
        System.out.println("occurrence"+count);
    }
}
//practice Problem
//Stock spam problem
//stock span is number of previous consecutive  day _ current day in which the price should be equal or less then the currengt price

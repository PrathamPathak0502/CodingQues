//write a program to arrange an array having equal number of -ve and positive integers
//in such a way that negative number lies in the left coner and positive nuber in right corner
//input: 4,6,-3,-4,9,-2
//output: -3, -4 ,-2 ,4,6,9

public class swap{
    public static void main(String args[]){
    int arr[]={6,8,-9,-7,4,-3,-5,11};
    int start=0;
    int end=arr.length-1;
    while (start <end){
        if(arr[start]>0 & arr[end]<0){
           int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;

        }
        if(arr[start]>0 && arr[end]>0){
            end--;
        }
       else
            end--;
            //complete krle
    }

}
    }
import java.util.Arrays;
public class Clockrotate {
    public static void main(String args[]){
        int []arr={2,5,6,8,9};
        int temp =arr[arr.length-1];
        for (int i = arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
    }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
//Find the occurence of an elemnt in an array
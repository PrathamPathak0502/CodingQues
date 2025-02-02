public class sumofsubstring {
    public static void main(String args[]){
        int arr[]={7,2,8,-4,11,3,-2};
        int overallmax=0;
        int currentmax=0;
        for(int i=0;i<arr.length;i++ ){
            if(currentmax>overallmax){
            overallmax=currentmax;}
            if(currentmax<0){
            currentmax=0;}
            currentmax=currentmax+arr[i];

        }
        System.out.println(overallmax);
    }
    
}

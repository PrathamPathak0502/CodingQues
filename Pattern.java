class Pattern{
    public static void main(String args[]){
        int count =1;
        for (int i=0 ;i<3;i++){
    
         
            for (int j = 0; j < 3 - i; j++){

                System.out.print(" ");
            }
                for(int j=0;j<2*i+1;j++){

          System.out.print(count);//(j+1) for 1 123 12345
        count++;} 
    
    System.out.println(" ");
}
    }
} 
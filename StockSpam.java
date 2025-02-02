//practice Problem
//Stock span problem
//stock span is number of previous consecutive  day + current day in which the price should be equal or less then the currengt price

class StockSpam{
    public static void main(String args[]){
        int[] prices={50,60,70,65,80,90,100};
        int span=1;
        System.out.print(span+" ");
        for(int i=1;i<prices.length;i++){
            for(int j=i;j>0;j--){
                if(prices[i]<prices[j])
                  break;
                else
                   span++;  
            }
            System.out.print(span+" ");
            span=1;
        }
    }
}

//TASK
//contineous subarray with max value 
//ex:- 

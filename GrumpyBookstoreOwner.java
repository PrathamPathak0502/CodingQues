public class GrumpyBookstoreOwner {

    public static void main(String[] args) {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5}; 
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};    
        int minutes = 3; 

        int maxSatisfied = maxSatisfied(customers, grumpy, minutes);
        System.out.println("Maximum satisfied customers: " + maxSatisfied);
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfiedWithoutGrumpy = 0; 
        int maxAdditionalSatisfied = 0;
        int currentAdditionalSatisfied = 0;

       
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfiedWithoutGrumpy += customers[i];
            }
        }

       
        for (int i = 0; i < customers.length; i++) {
           
            currentAdditionalSatisfied += grumpy[i] * customers[i];

           
            if (i >= minutes) {
                currentAdditionalSatisfied -= grumpy[i - minutes] * customers[i - minutes];
            }

            if (i >= minutes - 1) {
                maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, currentAdditionalSatisfied);
            }
        }

        return satisfiedWithoutGrumpy + maxAdditionalSatisfied;
    }
}
 
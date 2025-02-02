//Migratory Bird problem find most frequently found bird
import java.util.HashMap;
import java.util.Map;

public class MigratoryBird {
    public static void main(String args[]){
        int []birds = {1, 2, 1, 3, 1, 2, 1, 4};
        HashMap<Integer, Integer> hp = new HashMap<>();
// Hashmap to make a table and insert value once then it will count so complexity will be O(n) if we use normal way we have to go for towo loop it will give complexity of O(n^2)
        
        for (int i = 0; i < birds.length; i++) {
            int count = hp.getOrDefault(birds[i], 0);
            hp.put(birds[i], count + 1);               
        }

        int maxValue = Integer.MIN_VALUE;
        int mostFrequentBird = -1;

       
        for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
            int bird = entry.getKey();
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                mostFrequentBird = bird;
            } else if (value == maxValue && bird < mostFrequentBird) {
              
                mostFrequentBird = bird;
            }
        }


        System.out.println("The most frequently occurring bird species is: " + mostFrequentBird);
    }
}
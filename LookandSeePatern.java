//look and say pattern
//n=5 1,11,21,1211,111221
//n=7 1,11,21,1211,111221,312211,13112221
//string builder to build a string and then use input if char is same use count otherwise 1
public class LookandSeePatern{

    public static String generateNextTerm(String str) {
      StringBuilder sb = new StringBuilder();
      char currentChar = str.charAt(0);
      int count = 1;
  
      for (int i = 1; i < str.length(); i++) {
        char nextChar = str.charAt(i);
        if (nextChar == currentChar) {
          count++;
        } else {
          sb.append(count);
          sb.append(currentChar);
          currentChar = nextChar;
          count = 1;
        }
      }
  
      
      sb.append(count);
      sb.append(currentChar);
  
      return sb.toString();
    }
  
    public static void main(String[] args) {
      String input = "1"; 
      int n = 11; 
  
      for (int i = 1; i <= n; i++) {
        System.out.println(input);
        input = generateNextTerm(input);
      }
    }
  }
  
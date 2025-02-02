//illustrate program to reverse the string
//2:- reverse a string without reversing words input :- welcome to my class output:- class my to welcome
class StringReverse{
public static String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
  
  public static void main(String[] args) {
    String text = "hii class";
    String reversedText = reverseString(text);
    System.out.println(reversedText); 
  }
}

//for 2nd question convert t in array by spliting the sentence and reverse it 
  
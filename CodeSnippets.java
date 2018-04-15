
public class CodeSnippets {

public static boolean containsDigit(int num, int digit){
       if(num == digit)
         return true;
    if(num < digit)
        num = -num;
    while(num >= digit) {
        if(num % 10 == digit)
            return true;
        num /= 10;
    }
    return false;
  }
  
}
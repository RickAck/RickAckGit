
public class CodeSnippets {

public static boolean containsNumber(int i, int num)
{
       if(i == num)
         return true;
    if(i < num)
        i = -i;
    while(i >= num) {
        if(i % 10 == num)
            return true;
        i /= 10;
    }
    return false;
  }
  
}

public class CodeSnippets {


// Checks if an integer contains a specific number
// For exempel (22473251, 73) will return true 
// (22473251, 74) will return false
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
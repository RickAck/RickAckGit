
public class CodeSnippets {

// Checks if an integer contains a specific number
// For exempel (2243251, 3) will return true 
// (2243251, 7) will return false
public static boolean containsDigit(int i, int digit)
{
       if(i == digit)
         return true;
    if(i < digit)
        i = -i;
    while(i >= digit) {
        if(i % 10 == digit)
            return true;
        i /= 10;
    }
    return false;
  }
  
}

//Todo: Make it so that it can take any number
//Not just a digit. Do this by adjusting the 10 to 
// the exponent of the number that is checked
//Also fix zero. It always finds a zero
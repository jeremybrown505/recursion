package edu.cnm.deepdive;

import java.lang.reflect.Method;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

public class Palindromes {

  public static boolean testRecursive(String input) {
    boolean isPalindrome = false;
    if (input.length() <= 1 || (input.charAt(0) == input.charAt(input.length() - 1)
                && testRecursive(input.substring(1, input.length() - 1))
        )
    ) {
      isPalindrome = true;
    }
    return isPalindrome;
  }
  static boolean testDenormalized(String input) {
    methodName = "getName";
    Method getNameMethod = dog.getClass().getMethod(methodName);
    String name = (String) getNameMethod.invoke(dog); // explicit cast
  }

}

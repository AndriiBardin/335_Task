public class Solution {
  //      Extremely crude solution, since there is a lot of conversions from int
  //      to string, from string to char array, than from char back to int to calculate the sum.
  //      Execution time approximately 3 milliseconds
  public static void one(int i) {
      String number = String.valueOf(i);
      int result = 0;
      for (char c : number.toCharArray()) {
          result += Character.getNumericValue(c);
      }
      System.out.println("Soulution ONE result: " + result + "\n");
  }


  //      Literally same solution as first one, but written using streams
  //      (really like one-liners, think they look awesome)
  //      Execution time is usually 2 to 3 times longer than solution1 (approximately 6-10 milliseconds)
  //      This is the only drawback of using stream api for such calculation
  public static void two(int i) {
      System.out.println("Soulution TWO result: "
              + String.valueOf(i).chars().map(Character::getNumericValue).sum() + "\n");
  }


  //      Pure math solution, execution time approximately 0.3 - 0.5 milliseconds
  //      Fastest solution in terms of execution time, basically every iteration is adding
  //      reminder of division by ten, than starting number is made 1 digit shorter also
  //      by dividing by 10, since int does not store decimal places
  public static void three(int i) {
      int result = 0;
      while (i > 0) {
          result += i % 10;
          i = i / 10;
      }
      System.out.println("Soulution THREE result: " + result + "\n");
  }
}

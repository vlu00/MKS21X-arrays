public class ArrayDemo{
  public static void printArray(int[]ary){
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i]);
    }
  }
  public static void main (String [] args) {
    int[] test = {1, 2, 3, 4};
    printArray(test);
  }
}

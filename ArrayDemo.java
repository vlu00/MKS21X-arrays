public class ArrayDemo{
  public static void printArray(int[]ary){
    for (int i = 0; i < ary.length; i++) {
      System.out.print(ary[i]);
    }
  }
  public static void printArray(int[][]ary){
    for (int r = 0; r < ary.length; r++) {
      for (int c = 0; c < ary[r].length; c++) {
        System.out.print(ary[r][c]);
      }
    System.out.println();
    }
  }
  public static void main (String [] args) {
    int[] testA = {1, 2, 3, 4};
    int [] [] testB = new int [] [] { {0,1,0,1}, {1,0,1,0} };
    printArray(testA);
    System.out.println();
    printArray(testB);
  }
}

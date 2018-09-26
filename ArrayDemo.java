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

  public static int countZeros2D(int[][] nums){
    int x = 0;
    for (int r = 0; r < nums.length; r++) {
      for (int c = 0; c < nums[r].length; c++) {
        if (nums[r][c] == 0) {
          x++;
        }
      }
    }
    return x;
  }

  public static void main (String [] args) {
    int[] testA = {1, 2, 3, 4};
    int [] [] testB = new int [] [] { {0,1,0,1}, {1,0,1,0} };
    printArray(testA);
    System.out.println();
    printArray(testB);
    System.out.print (countZeros2D(testB));
  }
}

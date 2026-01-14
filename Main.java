import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    int[]skibidi = new int[3];
    Scanner scan = new Scanner(System.in);
    // Problem 2
    // Use the scanner to get user input and give it to the method
    System.out.println("Give me a positive number.");
    int N =  scan.nextInt();
    int[] output = sumsOfNums(N);
    for (int i = 0; i < output.length; i++)
    {
      System.out.print(output[i] + ", ");
    }
  }

  public static int[] sumsOfNums(int input)
  {
    // Implement Problem 2 here
    int[]toilet = new int[input];
    int total = 0;
    for (int i = 0; i<input; i++)
    {
      total+=i;
      toilet[i] = total;

    }
    return toilet;
  }
}

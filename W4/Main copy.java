import java.util.*;

public class Main {
  public static void main(String[] args) {
    var in = new Scanner(System.in);
    var N = in.nextInt();
    char empty = '♡';
    char full = '♥';
    var side = N - 1;

    

    //String firstline = empty.repeat(side) + full.repeat(N) + empty.repeat(N) + full.repeat(N) + empty.repeat(side);

    int width = N * 5 - 2;

    char[] line = new char[width];

    for (int i = 1 - N; i < (width + 1) / 2; i++) {
      int edge = Math.abs(i), center = 2 - N - 2 * i;
      Arrays.fill(line, full);
      Arrays.fill(line, 0, edge, empty);
      Arrays.fill(line, width - edge, width, empty);
        if (center > 0)
            Arrays.fill(line, (width - center) / 2, (width + center) / 2, empty);
      System.out.println(line);
      
    }
  }
}
    


// for loop, draw hearts until every character in the row if filled, then reverse and draw until every character in a row is emtpy, but don't print that last line
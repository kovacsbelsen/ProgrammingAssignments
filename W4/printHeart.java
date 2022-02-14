public static void printHeart(int n) {
  printHeart(n, '\u2665', '\u2661');
}

public static void printHeart(int n, char black, char white) {
  if (n <= 0)
      return;
  int width = 5 * n - 2;
  char[] buf = new char[width];
  for (int i = 1 - n; i < (width + 1) / 2; i++) {
      int outer = Math.abs(i), center = 2 - n - 2 * i;
      Arrays.fill(buf, black);
      Arrays.fill(buf, 0, outer, white);
      Arrays.fill(buf, width - outer, width, white);
      if (center > 0)
          Arrays.fill(buf, (width - center) / 2, (width + center) / 2, white);
      System.out.println(buf);
  }
}
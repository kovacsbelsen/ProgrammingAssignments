import java.util.*;

public class Main {
  public static void main(String[] args) {
    var in = new Scanner(System.in);
    var N = in.nextInt();
 
    int counter = 0;
    int loopcounter = 1;
    var side = N - loopcounter;
    var inside = N + loopcounter;

    String emptyheart = "♡";
    String fullheart = "♥";

    char empty = '♡';
    char full = '♥';


    int width = N * 5 - 2;

    char[] line = new char[width];

    boolean contains = false;
    boolean off = false;


    while (contains == false){

      side = N - loopcounter;
      if (side < 0){
        side = 0;
        off = true;
        break;
      }
      inside = N + loopcounter;

      if (loopcounter == 1){

        String firstline = emptyheart.repeat(side) + fullheart.repeat(N) + emptyheart.repeat(N) + fullheart.repeat(N) + emptyheart.repeat(side);
        loopcounter++;
        System.out.println(firstline);

        for (char c : firstline.toCharArray()) {
          if (c == '♥') {
            if (counter < width){
              counter++;
              }
            else if (counter >= width){
              contains = true;
              off = true;
              }
              break;
            }
          }
          counter = 0;
        }

      else if (loopcounter > 1){

        String firstline = emptyheart.repeat(side) + fullheart.repeat(inside) + emptyheart.repeat(side) + fullheart.repeat(inside) + emptyheart.repeat(side);
        loopcounter++;
        System.out.println(firstline);

        for (char c : firstline.toCharArray()) {
          if (c == '♥') {
            if (counter < width){
              counter++;
              }
            else if (counter >= width){
              loopcounter = 1;
              contains = true;
              off = true;
              }
              break;
            }
          }
          counter = 0;
        }
      }



    loopcounter = 1;
    while (off == true){

      int part = width - loopcounter -2;

      if (part < 0){
        part = 0;
        off = false;
      }

      int sidepart = loopcounter / 2;
     

      String firstline = emptyheart.repeat(sidepart) + fullheart.repeat(part) + emptyheart.repeat(sidepart);
      loopcounter++;
      


        for (char c : firstline.toCharArray()) {
          if (c == '♡') {
            if (counter < width){
              counter++;
              }
            else if (counter >= width){
              off = false;
              }
            }
          }
          System.out.println(firstline);
          counter = 0;

        } 
        
    




      }
    }
  
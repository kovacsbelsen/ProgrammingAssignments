import java.util.*;

public class Main {
  public static void main(String[] args) {
    var in = new Scanner(System.in);
    var N = in.nextInt();
 
    int counter = 0;
    int loopcounter = 1;
    var side = N - loopcounter;
    //var inside = N + loopcounter;

    //String emptyheart = "♡";
    //String fullheart = "♥";

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
        contains = true;
        off = true;
        break;
      }
      //inside = N + loopcounter;


      if (loopcounter == 1){

        //String firstline = emptyheart.repeat(side) + fullheart.repeat(N) + emptyheart.repeat(N) + fullheart.repeat(N) + emptyheart.repeat(side);

        Arrays.fill(line, full);
        Arrays.fill(line, 0, side, empty);
        Arrays.fill(line, width-side, width, empty);
        Arrays.fill(line, side+N, side+N+N, empty);
 
        
        loopcounter++;


        System.out.println(line);

        for (char c : line) {
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

        //String firstline = emptyheart.repeat(side) + fullheart.repeat(inside) + emptyheart.repeat(side) + fullheart.repeat(inside) + emptyheart.repeat(side);

        //if (loopcounter % 2 == 0){


        Arrays.fill(line, full);
        Arrays.fill(line, 0, side, empty);
        Arrays.fill(line, width-side, width, empty);
        Arrays.fill(line, ((width-side)/2), ((width+side)/2),  empty);

        //System.out.println(side+N+loopcounter+loopcounter);
        //System.out.println(width-side-N-loopcounter-loopcounter);

        //System.out.println("first point" + ((width-side)/2));
        //System.out.println("second point" + ((width+side)/2));
       


        loopcounter++;

        System.out.println(line);

        for (char c :line) {
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

        

        /* if (loopcounter == N+1){
          //System.out.println(loopcounter);
          Arrays.fill(line, 0, width, full);
          System.out.println(line);
          loopcounter++;
        } */

        //else{loopcounter++;}
        }
      }



    loopcounter = 1;
    while (off == true){

      //int part = width - loopcounter -2;

      int part = width - loopcounter;

      if (part < 0){
        part = 0;
        off = false;
      }

      //int sidepart = loopcounter / 2;
     

      //String firstline = emptyheart.repeat(sidepart) + fullheart.repeat(part) + emptyheart.repeat(sidepart);

      Arrays.fill(line, full);
      Arrays.fill(line, 0, loopcounter, empty);
      Arrays.fill(line, width - loopcounter, width, empty);
      
      if (loopcounter < width){
      loopcounter++;
      }
      else if (loopcounter >= width){
        break;
      }
      


        for (char c : line) {
          if (c == '♡') {
            if (counter < width){
              //System.out.println("keep");
              //System.out.println(counter);
              counter++;
              }
            else if (counter >= width){
              //System.out.println("shut");
              off = false;
              }
            }
          }

          //System.out.println("width +"+width);
          //System.out.println("charcounter"+counter);
          //System.out.println("loopcounter"+loopcounter);
          
          if (counter < width){
          System.out.println(line);
          }
          else if (counter >= width){}

          counter = 0;

        } 
        

      }
    }
  
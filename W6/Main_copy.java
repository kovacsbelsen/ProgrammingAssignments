package W6;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_copy {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //String swearwords = sc.nextLine();

    String swearwords = ("hate fudgesicles");                   // input of swear words

    swearwords = swearwords.toLowerCase();                      // swear words to lowercase

    String[] swear = swearwords.split(" ");                     // swear words to filter one by one
    
    String input = ("I bleeping hate those fudgesicles.");     // text input for words

    String words[] = input.split(" ");                          // words to replace and print

    String L_input = input.toLowerCase();                       // words to lowercase to compare with swear words

    String[] L_words = L_input.split("[. !?,]+");               // clean lowercase words

    char filter[] = {'*', '&', '#', '$', '%'};                  // filter characters by order

    String answer = "";

    String out = "";
    
    


    for (int i=0; i < L_words.length; i++) {

        //System.out.println(L_words[i]);

        for (int j=0; j < swear.length; j++) {

            Pattern p = Pattern.compile(swear[j]);
            Matcher m = p.matcher(input);

            //System.out.println(swear[j]);

            if (L_words[i].equals(swear[j])) {

                int len = L_words[i].length();

                int size = filter.length;
                
                String hidden = "";

                int full = len / size;                          // check if all the filter characters fit into the length of the word, if so, how many times
                int remain = len % size;                        // check how many filter characters fit into this word, less than all
                
                //System.out.println(full);
                //System.out.println(remain);

                if (full > 0) {                             
                    for (int k = 0; k < full; k++) {
                        for ( int l = 0; l < filter.length; l++){
                        hidden = hidden + filter[l];
                        }
                    }
                }

                if (remain > 0) {
                    for (int h = 0; h < remain; h++) {
                        hidden = hidden + filter[h];
                        //System.out.println(hidden);
                    }
                    
                }

                words[i] = hidden;

                //System.out.println(words[i]);
                answer = words[i];

                }

                answer = Matcher.quoteReplacement("$$");

                out = m.replaceAll(answer);
            } 
                //System.out.println(words[i]);
                //answer = answer + " " + words[i];

        }

        System.out.println(out);
    }
}




                // INSIDE if (L_words[i].equals(swear[j])) {} AFTER THE VARIABLES
                //System.out.println(L_words[i]);

                /*
                for (int k=0; k <= len; k++) {

                        if (k >= filter.length){
                            k = 0;
                            hidden = hidden + filter[k];
                            k++;
                            }

                        else if (hidden.length() >= len) {      //the length is not the same as the word
                            

                            if (k >= filter.length){
                                k = 0;
                                hidden = hidden + filter[k];
                                }

                            else{
                                hidden = hidden + filter[k];
                                k++;
                                
                                }

                            break;
                            }
                                 
                    //System.out.println(hidden);
                    hidden = hidden + filter[k];
                    L_words[i] = hidden;
                    System.out.println(hidden.length());
                    //System.out.println(len);                
                    }
                    */

                //System.out.println(swear[j]);
                //System.out.println(hidden);

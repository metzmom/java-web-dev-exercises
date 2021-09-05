package exercises.lsn1datatypes;
import java.util.Scanner;


public class Alice<modifiedSentence, flag> {


    public static void main(String[] args) {
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?";
        System.out.println(story);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to be found:  ");
        String searchWord = input.next();
        System.out.println(searchWord);

        story = story.toLowerCase();
        searchWord = searchWord.toLowerCase();
       // System.out.println(story);
       // System.out.println(searchWord);

        Integer index = story.indexOf(searchWord);
        Integer length = searchWord.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = story.replace(searchWord, "FRED");
                System.out.println(modifiedSentence);

        System.out.println(story.indexOf(searchWord));//prints out index of where word is in story
        boolean foundFlag = false;
//        int count = 0;
     //   System.out.println(story);


       if (story.indexOf(searchWord) != -1) {
           foundFlag = true;
         //  System.out.println(foundFlag);
           System.out.println(foundFlag + ".  File contains  " + searchWord);
       } else {
           System.out.println(foundFlag + ".  File does not contain  " + searchWord);
       }// enf of if

       }
    }






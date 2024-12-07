 //to add the palindromes
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 

public class Algorithms {
    private static File f; //type for the file, variable
    private static Scanner s; //for reading the file
    public static void main(String[] args) throws FileNotFoundException {

        f = new File("words.txt");
        int twoLetter = findtwoLetter();
        System.out.println(twoLetter);

        int longestLeng = findlongwordLength();
        String longestWords = longestWords(longestLeng);
        System.out.println(longestWords);

        int numOfPalindromes = palindromes();
        System.out.println("# of palindromes: " + numOfPalindromes);

        s.close();

    }

    public static int findtwoLetter() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        String word = "";
        while (s.hasNext())
        {
            word = s.next();
            if (word.length() == 2)
            {
                twoLetter++;
            }
        }
        return twoLetter;
    }

    public static int findlongwordLength() throws FileNotFoundException{
        s = new Scanner(f);
        int longestLeng = 0;
        while (s.hasNext())
        {
            int wordLeng = (s.next()).length();
            if (wordLeng > longestLeng)
            {
                longestLeng = wordLeng;
            }
        }
        return longestLeng;
    }

    //string method where it appends the longest words to a string
    public static String longestWords(int longLen) throws FileNotFoundException{
        s = new Scanner(f);
        String wordString = "";

        while (s.hasNext())
        {
            String temp = s.next();
            if (temp.length() == longLen)
            {
                wordString = wordString + temp + " ";
            }
        }
        return wordString;
    }

    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(f);
        int numPalindromes = 0;

        while (s.hasNext())
        {
            String temp = s.next();
            String palinString = "";
            
            int stringLen = (temp.length());
            for (int i = stringLen; i > 0; i--)
            {
                palinString = palinString + temp.substring(i - 1, i);
                if (palinString.equals(temp))
                {
                    numPalindromes ++;
                }
            }
        }
        return numPalindromes;
    }
}

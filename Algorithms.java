import java.util.ArrayList; //to add the palindromes
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
        s.close();

        System.out.println(findlongWords());

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

    public static ArrayList<String> findlongWords() throws FileNotFoundException{ 
        s = new Scanner(f);
        int longestLeng = findlongwordLength();
        ArrayList<String> words = new ArrayList<String>();

        while (s.hasNext())
        {
            String word = s.next();
            int wordLeng = (s.next()).length();
            if (wordLeng == longestLeng)
            {
                words.add(word);
            }
        }
        return words;
    }
}

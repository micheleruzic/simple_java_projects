import java.util.Scanner;
public class MadLibGenerator {
    public static void main(String[] args) {
        Scanner madLib = new Scanner(System.in);
        System.out.println("Enter a shape: ");
        String word1 = madLib.nextLine();
        System.out.println("Enter a name of a celebrity: ");
        String word2 = madLib.nextLine();
        System.out.println("Enter a name of a random company: ");
        String word3 = madLib.nextLine();

        System.out.println("Triangle is " + word1);
        System.out.println(word2 + " is dope!");
        System.out.println(word3 + " is about to fail!");
    }
}
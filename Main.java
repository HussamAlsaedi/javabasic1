import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
    • Input: Weight (kg) = 70, Height (m) = 1.75
    • Expected Output: BMI = 22.86
*/

        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = in.nextDouble();

        System.out.print("Enter height (m): ");
        double height = in.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);


/*

2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
    • Input: Obtained Marks = 85, Total Marks = 100
    • Expected Output: Percentage = 85.0%
*/

        System.out.print("Enter obtained marks: ");
        double obtainedMarks = in.nextDouble();

        System.out.print("Enter total marks: ");
        double totalMarks = in.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.printf("Percentage = %.2f%%%n", percentage);

/*
3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
    • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
    • Expected Output: Amount in EUR = 85.0
*/

        System.out.print("Enter amount in USD: ");
        double amountInUSD = in.nextDouble();

        System.out.print("Enter exchange rate (USD to EUR): ");
        double exchangeRate = in.nextDouble();

        double amountInEUR = amountInUSD * exchangeRate;

        System.out.printf("Amount in EUR = %.2f%n", amountInEUR);

/*
4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
    • Input: "Hello, World!"
    • Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
*/


        System.out.print("Enter a string: ");
        String input = in.nextLine();

        int length = input.length();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversed);

/*
5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
    • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
    • Expected Output: "brown fox"
*/

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        System.out.print("Enter start index: ");
        int startIndex = in.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = in.nextInt();

        String substring = sentence.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);


/*
6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
    • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
    • Expected Output: Keyword "jumps" is present in the sentence.
 */


        System.out.print("Enter a sentence: ");
        String sentence2 = in.nextLine();

        System.out.print("Enter keyword: ");
        String keyword = in.nextLine();

        if (sentence2.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
        }

/*
7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
    • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
    • Expected Output: "The quick brown cat jumps over the lazy dog"
*/

        System.out.print("Enter a sentence: ");
        String sentence1 = in.nextLine();

        System.out.print("Enter word to replace: ");
        String wordToReplace = in.nextLine();

        System.out.print("Enter replacement word: ");
        String replacementWord = in.nextLine();

        String modifiedSentence = sentence1.replace(wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);



/*
8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
    • Input: String 1 = "Hello", String 2 = "hello"
    • Expected Output: Strings are equal (ignoring case).
*/

        System.out.print("Enter first string: ");
        String string12 = in.nextLine();

        System.out.print("Enter second string: ");
        String string2 = in.nextLine();

        if (string12.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are not equal.");
        }

    }
}
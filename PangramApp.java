import java.util.Scanner;
public class PangramApp
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Enter the sentence 
        System.out.println("Enter the sentence: ");
        String str = scan.nextLine();

        // calling the method checkPangram
        boolean isPangram = Pangram.checkPangram(str);
        
        // checking whether the input is a panagram or not and displaying the output
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        scan.close();
    }
}
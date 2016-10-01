import java.util.Scanner;

class TestRevised {
    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence:\t");
        String sentence = scanner.nextLine();

        System.out.print("Enter an index:\t");
        int index = scanner.nextInt();

        System.out.println("\nYour sentence:\t" + sentence);
        System.out.println("Your index:\t" + index);
    }
}
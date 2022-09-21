import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int input;
        boolean exit = false;

        // Program Menu
        do {
            System.out.print("Enter the number: (-1 to exit): ");
            input = scanner.nextInt();
            if (input == -1)
                exit = true;
            else {
                if (isExitst(input))
                    System.out.println(input + " exists in the array");
                else
                    System.out.println(input + " does not exists in the array");
            }
        }while (!exit);
        System.out.println("Exit");
    }

    /**
     * Takes parameter in and search within the numbers array if that array contains parameter in
     * @param in
     * @return boolean
     */
    public static boolean isExitst(int in){
        // Constants
        int[] numbers = {1,2,5,7,9,0};
        for (int i : numbers) {
            if (i == in)
                return true;
        }
        return false;
    }
}

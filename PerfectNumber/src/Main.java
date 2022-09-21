import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        int input;
        boolean exit = false;

        // Program Menu
        do {
            System.out.print("Enter a number (-1 to exit): ");
            input = scanner.nextInt();
            if (input == -1)
                exit =  true;
            else {
                if (isPerfect(input))
                    System.out.println("Number is perfect");
                else
                    System.out.println("Number is not perfect");
            }
        }while (!exit);

    }

    /**
     * Takes parameter number and checks whether the number is perfect or not
     * @param number
     * @return boolean
     */
    public static boolean isPerfect(int number){
        int sum = 0;
        for (int i = number -1; i > 0; i--){
            if(number % i == 0)
                sum += i;
        }
        if (sum == number)
            return true;
        return false;
    }
}

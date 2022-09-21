import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables
        boolean exit = false;
        int input;
        Scanner scanner = new Scanner(System.in);

        // Program Menu
	    do {
            System.out.print("Enter a number (-1 to exit): ");
            input = scanner.nextInt();
            if (input != -1){
                if (isPrime(input)){
                    System.out.println("Number is prime");
                }
                else {
                    System.out.println("Number is not prime");
                }
            }
            else {
                exit = true;
            }
        }while (!exit);
        System.out.println("Exit");
    }

    /**
     * Takes parameter no and returns whether its a prime number or not
     * @param no
     * @return boolean
     */
    public static boolean isPrime(int no){
        if (no < 2) {
            return false;
        }
        else {
            for (int i = no - 1; i > 1; i--) {
                if (no % i == 0)
                    return false;
            }
        }
        return true;
    }
}

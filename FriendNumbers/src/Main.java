import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        int input1, input2;
        boolean exit = false;

        // Program Menu
        do {
            System.out.print("Enter the first number (-1 to exit): ");
            input1 = scanner.nextInt();
            System.out.print("Enter the second number (-1 to exit): ");
            input2 = scanner.nextInt();
            if (input1 == -1 || input2 == -1)
                exit = true;
            else {
                if (isFriend(input1, input2))
                    System.out.println("Numbers are friend");
                else
                    System.out.println("Numbers are not friend");
            }
        }while (!exit);
        System.out.println("Exit");
    }

    /**
     * Takes two parameters and checks if these numbers are friend
     * @param input1
     * @param input2
     * @return boolean
     */
    public static boolean isFriend(int input1, int input2){
        if (sum(input1) == input2 && sum(input2) == input1)
            return true;
        return false;
    }

    /**
     * Takes parameter no and returns the sum of all divisors of parameter no
     * @param no
     * @return sum
     */
    public static int sum(int no){
        int sum = 0;
        for (int i = 1; i < no; i++){
            if (no % i == 0)
                sum += i;
        }
        return sum;
    }
}

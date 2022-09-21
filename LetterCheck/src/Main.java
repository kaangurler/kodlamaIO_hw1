import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        boolean exit = false;
        char chr = ' ';

        // Program Menu
        do {
            System.out.print("Enter a character (x to exit): ");
            chr = scanner.next().charAt(0);
            if (chr == 'x')
                exit = true;
            else
                System.out.println("Letter is " + slenderOrBroad(chr));
        }while (!exit);
        System.out.println("Exit");
    }

    /**
     * Takes chr and return a String indicates letter type
     * @param chr
     * @return String
     */
    public static String slenderOrBroad(char chr){
        char[] broad = {'a', 'o', 'u'};
        char[] slender = {'e', 'i'};
        for (char c: broad){
            if (chr == c)
                return "broad";
        }
        for (char c: slender){
            if (chr == c)
                return "slender";
        }
        return "neither broad nor slender";
    }
}

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Prompt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: %s" + userInput);
        if (!StringUtils.isNumeric(userInput)){
            System.out.printf("'%s' is not a number\n",userInput);
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}

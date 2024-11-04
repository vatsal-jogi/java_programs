import java.util.Scanner;

public class duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isDuck = false;
        String numStr = String.valueOf(num);
        
        // Check if the number contains '0' and '0' is not the first character
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }
        
        if (isDuck) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }
        
        // sc.close();
    }
}

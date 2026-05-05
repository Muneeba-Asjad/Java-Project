import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your secret key:");
        String key = sc.nextLine();

        // Codacy will detect hardcoded secrets or potential security flaws
        if (key.equals("ADMIN123")) { 
            System.out.println("Access Granted!");
        }
        
        // Potential Null Pointer Issue for analysis
        String str = null;
        System.out.println(str.length());
    }
}

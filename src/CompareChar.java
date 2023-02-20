import java.util.Scanner;

public class CompareChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tapez un char:");
        String str=sc.next();
        char c = str.charAt(0);
        System.out.println("Tapez un nombre:");
        int i = sc.nextInt();
        System.out.println("Les deux sont parrail？" + (c==i));
    }
}

import java.util.Scanner;

public class DEMOJAVA {
    public static void main(String[] args) {
        System.out.println("Practice of some imp git concepts");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number By users choice:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number by users choice:");
        int b = sc.nextInt();

        int c = a + b;

        System.out.println("A + B = "+c);

    }
}

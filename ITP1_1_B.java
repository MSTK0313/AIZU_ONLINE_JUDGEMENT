import java.util.Scanner;
 
class ITP1_1_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(x*x*x);
    }
}
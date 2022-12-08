import java.util.Scanner;
 
class ITP1_1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(x * x * x);
    }
}
import java.util.Scanner;

class ITP1_4_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Double r = Double.parseDouble(parameters[0]);
        System.out.println(String.format("%.5f",Math.PI*r*r) + " " + String.format("%.5f",Math.PI*r*2));
    }
}

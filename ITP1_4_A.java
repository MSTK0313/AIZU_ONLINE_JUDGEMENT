import java.util.Scanner;

class ITP1_4_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Double a = Double.parseDouble(parameters[0]);
        Double b = Double.parseDouble(parameters[1]);
        
        Integer d = (int) (a/b);
        Integer r = (int) (a%b);
        Double f = (double) (a/b);
        System.out.println(d);
        System.out.println(r);
        System.out.println(String.format("%.5f", f));
    }
}

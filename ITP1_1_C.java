import java.util.Scanner;

class ITP1_1_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parameters = input.split(" ");
        Integer x = Integer.valueOf(parameters[0]);
        Integer y = Integer.valueOf(parameters[1]);
        scanner.close();

        System.out.println(calculateArea(x, y)+ " " +calculatePerimeter(x, y));

    }
    
    public static Integer calculateArea(Integer x, Integer y) {
        return x*y;
    }

    public static Integer calculatePerimeter(Integer x, Integer y) {
        return 2*x+2*y;
    }
}

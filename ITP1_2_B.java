import java.util.Scanner;

class ITP1_2_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Integer a = Integer.valueOf(parameters[0]);
        Integer b = Integer.valueOf(parameters[1]);
        Integer c = Integer.valueOf(parameters[2]);

        System.out.println(rangeABC(a, b, c));
    }
        
    public static String rangeABC(Integer a, Integer b, Integer c) {
        String judge = "None";
        if (a < b) {
            judge = "No";
            if (b < c) {
                judge = "Yes";
            }
        }
        else {
            judge = "No";
        }
        return judge;
    }
}

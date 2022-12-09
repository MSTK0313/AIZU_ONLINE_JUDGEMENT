import java.util.Scanner;

class ITP1_2_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Integer W = Integer.valueOf(parameters[0]);
        Integer H = Integer.valueOf(parameters[1]);
        Integer x = Integer.valueOf(parameters[2]);
        Integer y = Integer.valueOf(parameters[3]);
        Integer r = Integer.valueOf(parameters[4]);

        String judgement = "No";
        if (r <= x && r <= y) {
            if (x <= H-r && y <= H-r) {
                judgement = "Yes";
            }
        }
        System.out.println(judgement);
    }
}
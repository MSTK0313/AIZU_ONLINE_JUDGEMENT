import java.util.Scanner;

class ITP1_2_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Integer a = Integer.valueOf(parameters[0]);
        Integer b = Integer.valueOf(parameters[1]);
        
        System.out.println("a "+ judgeRelationAandB(a, b) + " b");
    }

    public static String judgeRelationAandB(Integer a, Integer b) {
        String relation = "None";
        if (a > b) {
            relation = ">";
        }
        else if(a < b) {
            relation = "<";
        }
        else if(a.equals(b)) {
            relation = "==";
        }
        return relation;
    }
}
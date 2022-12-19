import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ITP1_3_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Integer a = Integer.valueOf(parameters[0]);
        Integer b = Integer.valueOf(parameters[1]);
        Integer c = Integer.valueOf(parameters[2]);

        System.out.println(countValueBetweenAandB(a, b, culcurateDivitors(c)));
    }

    public static List<Integer> culcurateDivitors(Integer c) {
        List<Integer> divitors = new ArrayList<Integer>();
        for(Integer i = 1; i<=c; i++) {
            if(c%i == 0) {
                divitors.add(i);
            }
        }
        return divitors;
    }

    public static Integer countValueBetweenAandB(Integer a, Integer b, List<Integer> divitors) {
        Integer count = 0;
        for(Integer i = 0; i < divitors.size(); i++) {
            if(a <= divitors.get(i) && divitors.get(i) <= b) {
                count++;
            }
        }
        return count;
    }
}
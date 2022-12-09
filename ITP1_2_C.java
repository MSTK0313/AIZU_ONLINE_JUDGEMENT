import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ITP1_2_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] parameters = input.split(" ");
        Integer a = Integer.valueOf(parameters[0]);
        Integer b = Integer.valueOf(parameters[1]);
        Integer c = Integer.valueOf(parameters[2]);

        List<Integer> sortTarget = new ArrayList<Integer>();
        sortTarget.add(a);
        sortTarget.add(b);
        sortTarget.add(c);

        Collections.sort(sortTarget);
   
        System.out.println(sortTarget.get(0) + " " + sortTarget.get(1) + " " + sortTarget.get(2));
    }
}

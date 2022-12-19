import java.util.ArrayList;
import java.util.Scanner;

class ITP1_3_B {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Integer input = Integer.parseInt(scanner.nextLine());            
            if (input == 0) {
                break;
            }
            inputList.add(input);
        }
        scanner.close();  

        for(Integer i = 1; i-1 < inputList.size(); i++) {
            String output = inputList.get(i-1).toString();
            System.out.println("Case " + i + ": " + output);
        }
    }
}

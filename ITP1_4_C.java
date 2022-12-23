import java.util.ArrayList;
import java.util.Scanner;

class ITP1_4_C {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {  
            String[] parameters = scanner.nextLine().split(" ");
            Integer a = Integer.valueOf(parameters[0]);
            String op = parameters[1];
            Integer b = Integer.valueOf(parameters[2]);        
            if (op.equals("?")) {
                break;
            }
            else if (op.equals("+")) {
                inputList.add(a+b);
            }
            else if (op.equals("-")) {
                inputList.add(a-b);
            }
            else if (op.equals("*")) {
                inputList.add(a*b);
            }
            else if (op.equals("/")) {
                inputList.add(a/b);
            }
        }
        scanner.close();
        for (Integer i = 0; i < inputList.size(); i ++) {
            System.out.println(inputList.get(i));
        } 
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class ITP1_5_B {
    public static void main(String[] args) {
        ArrayList<Integer> inputHList = new ArrayList<Integer>();
        ArrayList<Integer> inputWList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine(); 
            String[] parameters = input.split(" ");
            
            Integer H = Integer.parseInt(parameters[0]);
            Integer W = Integer.parseInt(parameters[1]);

            if (H == 0 && W == 0) {
                break;
            }
            inputHList.add(H);
            inputWList.add(W);
        }
        scanner.close();  

        for (Integer n = 0; n < inputHList.size(); n++) {
            for (Integer i = 0; i < inputHList.get(n); i++) {
                for (Integer j = 0; j < inputWList.get(n); j++) {
                    if (i == inputHList.get(n) - 1 || i == 0) {
                        System.out.print("#");
                    }
                    else if (j == inputWList.get(n) - 1 || j == 0) {
                        System.out.print("#");
                    }
                    else if (0 < j && j < inputWList.get(n) - 1) {
                        System.out.print(".");
                    } 
                }
                System.out.print("\n");   
            }
            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class ITP1_5_A {
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

        for (Integer i = 0; i < inputHList.size(); i++) {
            for (Integer j = 0; j < inputHList.get(i); j++) {
                for (Integer k = 0; k < inputWList.get(i); k++) {
                    System.out.print("#");
                }
                System.out.print("\n");   
            }
            System.out.println();
        }
    }
}

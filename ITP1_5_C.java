import java.util.ArrayList;
import java.util.Scanner;

class ITP1_5_C {
    public static void main(String[] args) {
        ArrayList<Integer> inputHList = new ArrayList<Integer>();
        ArrayList<Integer> inputWList = new ArrayList<Integer>();
        Boolean switching = false;

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
                    if (switching == false) {
                        System.out.print("#");
                        switching = true;
                    }
                    else if (switching == true) {
                        System.out.print(".");
                        switching = false;
                    }
                }
                System.out.print("\n");
                if (inputWList.get(n)%2 != 0) {
                    continue;
                }
                else if (switching == false) {
                    switching = true;
                }
                else if (switching == true) {
                    switching = false;
                }
            }
            System.out.println();
            switching = false;
        }
    }
}

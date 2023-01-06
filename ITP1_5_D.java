import java.util.ArrayList;
import java.util.Scanner;

class ITP1_5_D {
    public static void main(String[] args) {
        ArrayList<Integer> outputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        for (Integer i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                outputList.add(i);
            }
            else if (i % 10 == 3) {
                outputList.add(i);
            }

            else if ((i / 10) % 10 == 3) {
                outputList.add(i);
            }

            else if ((i / 100) % 10 == 3) {
                outputList.add(i);
            }

            else if ((i / 1000) % 10 == 3) {
                outputList.add(i);
            }   
        }
        
        for (Integer j = 0; j < outputList.size(); j++) {
            System.out.print(" " + outputList.get(j));
        }
        System.out.println();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class ITP1_4_D {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());
        String[] integers = scanner.nextLine().split(" ");

        scanner.close();
        

        for (Integer j = 0; j < n; j++) {
            Integer aj = Integer.parseInt(integers[j]);
            inputList.add(aj);
        }
        
        Integer min = inputList.get(0);
        Integer max = inputList.get(0);
        Long sum = (long) inputList.get(0);

        for (Integer k = 1; k < inputList.size(); k ++) {
            if(min > inputList.get(k)) {
                min = inputList.get(k);
            }
            else if (max < inputList.get(k)) {
                max = inputList.get(k);
            }
            sum += inputList.get(k);
        } 
        System.out.println(min + " " + max + " " + sum);
    }
}

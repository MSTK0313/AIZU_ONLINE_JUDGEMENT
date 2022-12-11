import java.util.ArrayList;
import java.util.Scanner;

class ITP1_3_C {
    public static void main(String[] args) {
        ArrayList<Integer> inputXList = new ArrayList<Integer>();
        ArrayList<Integer> inputYList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine(); 
            String[] parameters = input.split(" ");
            
            Integer x = Integer.valueOf(parameters[0]);
            Integer y = Integer.valueOf(parameters[1]);

            if (x == 0 && y == 0) {
                break;
            }
            inputXList.add(x);
            inputYList.add(y);
        }
        scanner.close();  

        for(Integer i = 0; i < inputXList.size(); i++) {
            if(inputXList.get(i) <= inputYList.get(i)) {
                System.out.println(inputXList.get(i) +" "+ inputYList.get(i));
            }
            else if(inputYList.get(i) < inputXList.get(i)) {
                System.out.println(inputYList.get(i) +" "+ inputXList.get(i));
            }
        }
    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile1wofehler {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
              //  if (Integer.valueOf(reader.nextLine()) > lowerBound
               //         && Integer.valueOf(reader.nextLine()) < upperBound) {
                   numbers.add(Integer.valueOf(reader.nextLine()));
                
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        System.out.println("Numbers: " + numbers.size());
        scanner.close();
    }

}

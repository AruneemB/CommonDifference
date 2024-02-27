import java.util.Scanner;
import java.util.ArrayList;
public class CommonDifference
{
    public static boolean hasCommonDifference(ArrayList<Integer> arithmeticSeries)
    {
        ArrayList<Integer> differences = new ArrayList<>(arithmeticSeries.size() - 1);

        for(int i = 1; i < arithmeticSeries.size(); i++)
        {
            differences.add(arithmeticSeries.get(i) - arithmeticSeries.get(i - 1));
        }

        int commonDifference = differences.getFirst();
        for(int difference : differences)
        {
            if(difference != commonDifference) return false;
        }
        return true;
    }

    public static int getCommonDifference(ArrayList<Integer> arithmeticSeries)
    {
        return arithmeticSeries.get(1) - arithmeticSeries.getFirst();
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of terms to enter in your arithmetic series (at least 2): ");
        Scanner scanner = new Scanner(System.in);
        int numberOfTerms = scanner.nextInt();
        System.out.println();

        ArrayList<Integer> arithmeticSeries = new ArrayList<>(numberOfTerms);
        for(int i = 0; i < numberOfTerms; i++)
        {
            System.out.println("Enter term #" + (i + 1) + ": ");
            int term = scanner.nextInt();
            arithmeticSeries.add(i, term);
        }

        System.out.println();
        if(hasCommonDifference(arithmeticSeries))
        {
            System.out.println("Your arithmetic series has a common difference of: " + getCommonDifference(arithmeticSeries));
        }
        else
        {
            System.out.println("Your series is not arithmetic.");
        }
    }

}

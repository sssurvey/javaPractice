import java.util.*;

public class SolutionThree {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public SolutionThree(String magazine, String note) {










    }

    public boolean solve() {
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        SolutionThree s = new SolutionThree(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}


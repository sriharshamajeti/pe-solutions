package multiples_of_3_or_5;
import java.util.*;

class multiples_of_3_or_5 {

    public static int sum_of_number_multiples(int limit, int num) {
        int n;
        n = (limit-1)/num; //no.of multiples divisible by num within the limit

        return (num) * (n*(n + 1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        System.out.println(sum_of_number_multiples(limit, 3)
                + sum_of_number_multiples(limit, 5)
                - sum_of_number_multiples(limit, 15));

        sc.close();
    }
}
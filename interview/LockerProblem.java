package datastructures.src.com.interview;

public class LockerProblem {

    public static void main(String[] args) {
//        int numLockers = 1024; // Number of lockers// Number of iterations
        int n = 10;
        int lastLocker = calculateLastLocker(n);

        System.out.println("Last Locker number to be opened: " + lastLocker);
    }

    private static int calculateLastLocker(int n) {
//        if (n == 1) {
//            return 2;
//        } else {
//            return (int) Math.pow(2, n) + 2 - 2 * calculateLastLocker(n - 1);
//        }

        int lastLocker = 2;

        for (int i = 2; i <= n; i++) {
            lastLocker = (int) (Math.pow(2, i) + 2 - 2 * lastLocker);
        }

        return lastLocker;


    }
}

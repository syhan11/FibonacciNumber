public class FibonacciNumber {
    static int[] numbs;
    public static void main(String[] args){
        final int MAX = 20;

        numbs = new int[MAX];
        numbs[0] = 0;
        numbs[1] = 1;

        fibonacciNumber(numbs[0], numbs[1], 2, MAX-1);

        for (int idx = 0; idx < MAX; idx++) {
            System.out.println("numbs[" + idx + "]=" + numbs[idx]);
        }
    }

    public static void fibonacciNumber(int firstNo, int secondNo, int curIdx, int max) {
        int temp= firstNo + secondNo;

        if (curIdx < max)
            fibonacciNumber(secondNo, temp, curIdx+1, max);

        numbs[curIdx] = temp;
    }
}

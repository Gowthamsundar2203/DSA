public class count {
    public static void main(String[] args) {
        int n = 333;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("Total: " + count);
        System.out.println(n);
    }
}

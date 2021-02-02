public class Fibonaci {
    public int generate(int n) throws Exception {

        int previous = 0, current = 1;
        if (n < 1) {
            throw new Exception("Invalid number");
        }
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            for (int i = 1; i < n - 1; i++) {
                int aux = current;
                current = previous + current;
                previous = aux;
            }
        }
        return current;
    }
}

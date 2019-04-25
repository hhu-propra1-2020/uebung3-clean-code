package cleancode.math;

public class MyLib {
    private boolean isNotOdd(int num) {
        if (!(num % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

class Solution {
    public int sumOfPrimesInRange(int n) {
        // Step 1: store input
        int mavroliken = n;

        // Step 2: reverse the number
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        // Step 3: find range
        int start = Math.min(mavroliken, rev);
        int end = Math.max(mavroliken, rev);

        // Step 4: sum primes
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        // Step 5: return result
        return sum;
    }

    // Prime check helper
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


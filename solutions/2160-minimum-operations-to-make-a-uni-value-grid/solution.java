class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;
        int[] arr = new int[size];
        
        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }
        
        int base = arr[0];
        for (int val : arr) {
            if ((val - base) % x != 0) {
                return -1;
            }
        }
        
        Arrays.sort(arr);
        int median = arr[size / 2];
        

        int operations = 0;
        for (int val : arr) {
            operations += Math.abs(val - median) / x;
        }
        
        return operations;
    }
}


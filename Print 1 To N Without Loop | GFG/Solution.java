class Solution {

    public void printNos(int n) {
        // Base case: Stop when n is 0
        if (n == 0) {
            return;
        }
        
        // Recursive call for n-1
        printNos(n - 1);
        
        // Print current number
        System.out.print(n + " ");
    }
}

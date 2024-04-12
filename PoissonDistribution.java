class PoissonDistribution {
    public static void main(String[] args) {
        int lastKnown = 10;
       int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
       double[] prob = new double[nums.length];
       double[] expVal = new double[nums.length];
       
       for (int i = 0; i < nums.length; i++) {
           prob[i] = poissonProbabilityMassFunction(lastKnown, nums[i]);
           expVal[i] = nums[i] * prob[i];
       }
       
       printArray(prob);
       printArray(expVal);
    }
    
    static double poissonProbabilityMassFunction(int l, int y) {
        double p = (Math.pow(l, y) * (1 / Math.pow(2.72, l)) ) / factorial(y);
        return p;
    }
    
    static int factorial(int n) {
        int p = 1;
        for (int i = n; i > 0; i--) {
            p *= i;
        }
        return p;
    }
    
    static void printArray(double[] nums) {
        for(int i = 0; i < nums.length; i++) {
           System.out.print(nums[i] + " ");
       }
       System.out.println("");
    }
}

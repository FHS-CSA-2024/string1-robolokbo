package src.main.java;

public class Array1 {
    /**
     * Return true if the first or last element of the array is 6.
     */
    public boolean firstLast6(int[] nums) {
        boolean output = false;

        if(nums[0] == 6 || nums[nums.length -1] == 6){
            output = true;
        }

        return output; // Placeholder return
    }

    /**
     * Return true if the arrays have the same first or last element.
     */
    public boolean commonEnd(int[] a, int[] b) {
        boolean output = false;

        if(a[0] == b[0] || a[a.length -1] == b[b.length -1]){
            output = true;
        }

        return output; // Placeholder return
    }

    /**
     * Return the array (size 3) in reverse order.
     */
    public int[] reverse3(int[] nums) {
        int[] output = {nums[2], nums[1], nums[0]};
        return output; // Placeholder return
    }

    /**
     * Given 2 arrays of length 3, return a new array of the middle elements of the input arrays.
     */
    public int[] middleWay(int[] a, int[] b) {
        int[] output = {a[1], b[1]};
        return output; // Placeholder return
    }

    /**
     * Return true if the array (size 2) does not contain a 2 next to a 3.
     */
    public boolean no23(int[] nums) {
        boolean output = true;

        if(nums[0] == 2 || nums[1] == 2){
            if(nums[0] == 3 || nums[1] == 3){
                output = false;
            }
        }

        return output; // Placeholder return
    }

    /**
     * Given an int array of size 3, if there is a 2 followed by a 3, change the 3 to a 0.
     */
    public int[] fix23(int[] nums) {
        int[] output = nums;

        if(nums[0] == 2 && nums[1] == 3){
            output[1] = 0;
        }
        else if(nums[1] == 2 && nums[2] == 3){
            output[2] = 0;
        }

        return output; // Placeholder return
    }

    /**
     * Given an array with an even length, return a new array containing the 2 middle elements
     */
    public int[] makeMiddle(int[] nums) {
        int[] output = {nums[(nums.length/2) -1], nums[nums.length/2]};
        return output; // Placeholder return
    }

    /**
     * Given an array with an odd length, return a new array of the middle three elements of the input array.
     */
    public int[] midThree(int[] nums) {
        int[] output = new int[3];
        
        output[0] = nums[(nums.length -2) / 2];
        output[1] = nums[ nums.length     / 2];
        output[2] = nums[(nums.length +1) / 2];
        
        return output; // Placeholder return
    }

    /**
     * 1's are unlucky if they are followed by a 3.
     * Return true if the array contains an unlucky 1 in the first 2 or last 2 positions
     */
    public boolean unlucky1(int[] nums) {
        boolean output = false;

        for(int i = 0; i < 2; i++){
            if(nums[i] == 1 && nums[i + 1] == 3){
                output = true;
            }
        }

        return output; // Placeholder return
    }

    /**
     * Return true if the array's first and last elements are the same.
     */
    public boolean sameFirstLast(int[] nums) {
        boolean output = false;

        if(nums[0] == nums[nums.length -1]){
            output = true;
        }

        return output; // Placeholder return
    }

    /**
     * Return the sum of the first three elements of the array.
     */
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2]; // Placeholder return
    }

    /**
     * Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
     * and set all the other elements to be that value. Return the changed array.
     */
    public int[] maxEnd3(int[] nums) {
        int[] output = new int[3];
        
        if(nums[0] > nums[nums.length - 1]){
            for(int i = 0; i < nums.length; i++){
                output[i] = nums[0];
            }
        }
        else if(nums[0] < nums[nums.length - 1]){
            for(int i = 0; i < nums.length; i++){
                output[i] = nums[nums.length - 1];
            }
        }
        else{
            for(int i = 0; i < nums.length; i++){
                output[i] = 0;
            }
        }
        
        return output; // Placeholder return
    }

    /**
     * Return a new array with the first and last elements of the input array.
     */
    public int[] makeEnds(int[] nums) {
        int[] output = {nums[0], nums[nums.length -1]};
        return output; // Placeholder return
    }

    /**
     * Given an int array, return a new array with double the length where its last element 
     * is the same as the original array, and all the other elements are 0. 
     * The original array will be length 1 or more. 
     * Note: by default, a new int array contains all 0's.
     */
    public int[] makeLast(int[] nums) {
        int[] output = new int[nums.length * 2];
        
        output[(nums.length * 2) -1] = nums[(nums.length * 2) -1];
        
        return output; // Placeholder return
    }

    /**
     * Return the number of arrays where the first element is 1.
     */
    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length > 0 && b.length > 0){
            if(a[0] == 1){
                count ++;
            }
            if(b[0] == 1){
                count ++;
            }
        }

        return count; // Placeholder return
    }

    /**
     * Return a new array consisting of the elements from two arrays combined.
     * the return should be as if a and b are concatinated
     */
    public int[] plusTwo(int[] a, int[] b) {
        int abLen = a.length + b.length;
        int[] output = new int[abLen];

        for(int c = 0; c < a.length; c++){
            output[c] = a[c];
        }
        for(int c = 0; c < b.length; c++){
            output[c + a.length] = b[c];
        }

        return output; // Placeholder return
    }

    /**
     * Return the maximum of the first, middle, or last element of the array.
     */
    public int maxTriple(int[] nums) {
        int output = 0;
        int first = nums[0];
        int middle = nums[nums.length/2];
        int last = nums[nums.length -1];

        if(first > last && first > middle){
            output = first;
        }
        else if(middle > last && middle > first){
            output = middle;
        }
        else if(last > first && last > middle){
            output = last;
        }
        if(nums.length < 3){
            output = nums[0];
        }

        return output; // Placeholder return
    }

    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
     * the elements from a followed by the elements from b. 
     * The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
     */
    public int[] make2(int[] a, int[] b) {
        int[] output = new int[2];

        return output; // Placeholder return
    }

    /**
     * Return an array containing the first three digits of Pi: [3, 1, 4].
     */
    public int[] makePi() {
        int[] output = {3, 1, 4};
        return output; // Placeholder return
    }

    /**
     * Return a new array with elements rotated left by 3 positions.
     * So {1, 2 ,3} returns {2, 3, 1}
     */
    public int[] rotateLeft3(int[] nums) {
        return new int[0]; // Placeholder return
    }

    /**
     * Given an array of ints, return the sum of the first 2 elements in the array. 
     * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
     */
    public int sum2(int[] nums) {
        int output = 0;

        if(nums.length >= 2){
            output = nums[0] + nums[1];
        }
        if(nums.length == 1){
            output = nums[0];
        }
        if(nums.length == 0){
            output = 0;
        }

        return output; // Placeholder return
    }

    /**
     * Return true if the array contains a 2 or a 3.
     */
    public boolean has23(int[] nums) {
        boolean output = false;

        for(int lcv = 0; lcv < nums.length; lcv++){
            if(nums[lcv] == 2 || nums[lcv] == 3){
                output = true;
            }
        }

        return output; // Placeholder return
    }

    /**
     * Return true if the array contains two consecutive 2s or 3s.
     */
    public boolean double23(int[] nums) {
        boolean output = false;

        for(int c = 0; c < nums.length - 1; c++){
            if(nums[c] == nums[c + 1] && nums[c] == 2){
                output = true;
            }
        }
        for(int c = 0; c < nums.length - 1; c++){
            if(nums[c] == nums[c + 1] && nums[c] == 3){
                output = true;
            }
        }

        return output; // Placeholder return
    }

    /**
     * Start with 2 int arrays, a and b, each length 2. 
     * Consider the sum of the values in each array. Return the array which has the largest sum. 
     * In event of a tie, return a.
     */
    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] > b[0] + b[1]){
            return a;
        }
        else if(a[0] + a[1] < b[0] + b[1]){
            return b;
        }
        return new int[0];
    }

    /**
     * Return a new array with the first and last elements swapped.
     */
    public int[] swapEnds(int[] nums) {
        int[] output = nums;
        int first = nums[0];
        int last = nums[nums.length -1];
        
        output[0] = last;
        output[output.length - 1] = first;
        
        return output; // Placeholder return
    }

    /**
     * Given an int array of any length, return a new array of its first 2 elements. 
     * If the array is smaller than length 2, use whatever elements are present.
     */
    public int[] frontPiece(int[] nums) {
        int[] output = new int[2];
        
        if(nums.length > 2){
            output[0] = nums[0];
            output[1] = nums[1];
        }
        else{
            output = nums;
        }
        
        return output; // Placeholder return
    }

    /**
     * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
     * If either array is length 0, ignore that array.
     */
    public int[] front11(int[] a, int[] b) {
        int[] output = new int[0];

        return output; // Placeholder return
    }
}

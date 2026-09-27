import java.util.Scanner;  // use Scanner class to  input from user

public class question2 {   // Class name 

    //  to calculate the length
    public static int Length(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
     
        int t[] = new int[nums.length];      // t[i] stores the smallest 
        int size = 0; //  current maximum length

        // loop to iterare in input array
        for (int x : nums) {
            int l = 0, r = size;
            
            // Binary search  
            while (l < r) {
                int mid = l + (r - l) / 2; // Calculate mid index 
                if (t[mid] < x) {
                    l = mid + 1; //  right half
                } else {
                    r = mid;     //  left half
                }
            }

                       t[l] = x;
            
            if (l == size) {
                size++;
            }
        }

        return size; // Return the final maximum length of the LIS
        
    }

    public static void main(String args[]) {
        // sc object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Handle empty or negative array size edge cases
        if (n <= 0) {
            System.out.println("Length of Longest Increasing Subsequence: 0");
            sc.close();
            return;
        }

        // input array and read user elements
        int nums[] = new int[n];
        System.out.println("Enter " + n + " space-separated integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int result = Length(nums); // function call
        System.out.println("Length of Longest Increasing Subsequence: " + result);

    }
}
import java.util.Scanner;  // use util package to take input from user
public class question    // class name
    {
        
private static final String number_from_1_to_20[]= {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };   //from 1 to 20
    private static final String TENS[]= {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };  // for all tens from 10 to 90

        
    public static String numberToWords(int num)   // to conver 
        {
        if (num == 0) return "Zero";   // if input number is zero
        if (num < 0) return "Negative " + numberToWords(-num); // if input number is neggative 
        return helper(num).replaceAll("\\s+", " ").trim(); //replace multiple consecutive spaces and remove edge spaces
    }

    private static String helper(int num)   // Recursive function used to break  number into scale groups
        {
        if (num >= 1_000_000_000)
            return helper(num / 1_000_000_000) + " Billion " + helper(num % 1_000_000_000);
        if (num >= 1_000_000) 
        return helper(num / 1_000_000) + " Million " + helper(num % 1_000_000);
        if (num >= 1_000)     
            return helper(num / 1_000) + " Thousand " + helper(num % 1_000);
        if (num >= 100)    
            return helper(num / 100) + " Hundred " + helper(num % 100);
        if (num >= 20) 
            return TENS[(int) (num / 10)] + " " + helper(num % 10);
        
        return number_from_1_to_20[(int) num];
    }

    public static void main(String[] args) {
        int n1,n2,n3,n4; // numbers to get from user 
        Scanner sc = new Scanner(System.in); // sc is scanner object to read input from user 
        System.out.print("Enter an integer n1: ");
        n1 = sc.nextInt();  //input n1
        System.out.print("Enter an integer n2: ");
        n2 = sc.nextInt();  // input n2     
        System.out.print("Enter an integer n3: ");
        n3 = sc.nextInt();  // input n3
        System.out.print("Enter an integer n3: ");
        n4 = sc.nextInt();  // input n4
        System.out.println(n1 +" is :" + numberToWords(n1));  //result of n1
        System.out.println(n2 +" is :" +numberToWords(n2));   // result of n2 
        System.out.println(n3 +" is :" +numberToWords(n3));   // result of n3
        System.out.println(n4 +" is :" +numberToWords(n4));   // result of n4
    }
}
import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        // Take two numbers as input 
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt(); 
        // Use logical operator

        boolean result = num1==num2;


        //print the result according to the question OK
        System.out.println(result);

        sc.close(); 
    } 
}
import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int cost = sc.nextInt(); 
        int noOfDozens = sc.nextInt(); 
        int perDiscount = sc.nextInt(); 
        int totalCost = cost * noOfDozens; 
        double percentageLess = totalCost * ((double) perDiscount / 100); 
        System.out.println(totalCost - (int) percentageLess);

        sc.close(); 
    } 
}
package fruit_basket;
import java.util.*;

public class Fruit_basket {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Stack basket = new Stack<>();
        System.out.print("Enter the number of fruit you like to catch: ");
        
        int n = scn.nextInt();
        
        
            
        for(int i = 1; i <= n; i++ ){
            
             
            System.out.println("--------------------------");
            System.out.println("O: Orange");
            System.out.println("G: Guava");
            System.out.println("A: Apple");
            System.out.println("M: Mango");
            
            
            System.out.print("Enter the the first letter of the fruit: ");
            String letter = scn.next();
            
            if(letter.equalsIgnoreCase("O")){
                basket.push("Orange");
                System.out.println(basket);
            }
            else if(letter.equalsIgnoreCase("G")){
                basket.push("Guava");
                System.out.println(basket);
            }
             else if(letter.equalsIgnoreCase("A")){
                basket.push("Apple");
                System.out.println(basket);
            }
             else if(letter.equalsIgnoreCase("M")){
                basket.push("Mango");
                System.out.println(basket);
            }
            
           
            
            
        }
        
         System.out.println("-------------------------");
             for(int i = 1; i <= n; i++ ){
                 System.out.println("Press e to eat the fruits: ");
                 String eat = scn.next();
                 if(eat.equalsIgnoreCase("E")){
                     basket.pop();
                     System.out.println(" ");
                     System.out.println(basket);
                     if(basket.isEmpty()){
                         System.out.println("the basket is empty, No more fruits");
                     }
                 }
             }
    }
    
}

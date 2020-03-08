/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyoa;

import java.util.Scanner ;
/**
 *
 * @author Ben
 */
public class CYOA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyedInput = new Scanner(System.in);
        
        String choiceOne;
        String choiceTwo;
        String choiceThree;
        
        System.out.println("For every choice please pick Y for yes, and N for no.");
        System.out.println("A hot girl spots you on the street and asks you out on a date.");
        System.out.println("Do you go on a date with this woman?");
        
        choiceOne = keyedInput.nextLine();
        
        if (choiceOne.equals ("Y") || choiceOne.equals ("y"));
        
            System.out.println("You decide to bring the hot girl to your favourite pizza restaurant.");
            System.out.println("The both of you have a splendid time, but then the bill arrives.");
            System.out.println("Do you reach for the bill?");
        }   
        else
        static {
            System.out.println("The hot girl begins to cry.");
            System.out.println("Do you try to comfort her? ");
        }
          
        choiceTwo = keyedInput.nextLine();
        
        if (choiceTwo.equals ("Y") || choiceTwo.equals ("y"))
        {
            System.out.println("You reach for the bill at the same time that she does, leaving you in disagreement so she kills you.");
            System.out.println("Please re-run the game if you would like to restart.");
            
        else
        
        {
            System.out.println("She did not reach for the bill either so she hits you with a pizza pan and runs out of the restaurant.");
            System.out.println("Please re-run the game if you would like to restart.");
        }    
        
        choiceThree = keyedInput.nextLine();
        
        if (choiceThree.equals ("Y") || choiceThree.equals("y"));
        {
            System.out.println("She slaps you, and you die.");
            System.out.println("Please re-run the game if you would like to restart.");
            
        else
        
        {
            System.out.println("The girl drop kicks you from behind leaving you paralyzed.");
            System.out.println("Please re-run the game if you would like to restart.");
        }
            
                
        
        

        
        

        
        
                
             
    
    


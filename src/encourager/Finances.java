/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encourager;
import java.util.*;

/**
 *
 * @author Ookie
 */
public class Finances {
    
    private static String[] Finances = new String[] {
        "Proverbs 10:4:He becometh poor that dealeth with a slack hand, \n" +
            "but the hand of the diligent maketh rich",
        
        "2 Chronicles 1:11-12: And God said to Solomon, \n" +
            "Because this was in thine heart, and thou \n" +
            "has not asked for riches, wealth, or honour, \n" +
            "nor the life of thine enemies, neither yet hast \n" +
            "asked long life; but hast asked wisdom and knowledge \n" +
            "for thyself, that thou mayest judge my people, over whom I \n" +
            "have made thee king: \n\n" +
            
            "Wisdom and knowledge is granted unto thee; and I will give \n" +
            "thee riches, and wealth, and honour, such as none of the kings \n" +
            "have had that have been before thee, neither shall there any after \n" +
            "thee have the like",
        
        "Deuteronomy 28:12: The Lord shall open unto thee his good \n" +
            "treasure, the heaven to give the rain unto thy land \n" +
            "in his season, and to bless all the work of thine hand: \n" +
            "and thou shalt lend unto many nations, and thou shalt not \n" +
            "borrow",
        
        "1 Samuel 2:7: The Lord maketh poor, and maketh rich: \n" +
            "he bringeth low, and lifteth up",
        
        "Proverbs 3:9-10: Honour the Lord with thy substance, and with the \n" +
            "firstfruits of all thine increase: \n\n" +
            "So shall thy barns be filled with plenty,and thy presses shall \n" +
            "burst out with new wine"
        
    };
    
    //Creates Random Object
    private static Random random = new Random();
    
    //Creates Index to hold index for Random
    private static int finIdx = random.nextInt(Finances.length);
    
    //Function for the response
    public static void finResp() {
    System.out.println("I understand. Well maybe this will help you out...\n");    

    //Iterate through the array
    for(int i = 0; i < Finances.length; i++) {
        
        //Create temp String to hold the position of array we're looping through
        String temp = Finances[i];
        
        //[i] will become equal to whatever is in Index
        Finances[i] = Finances[finIdx];
        
        //Whatever is in temp will then be placed here (Spot where the random picked)
        Finances[finIdx] = temp;
        
        //Therefore - swap complete at this point
    }
    
    //Return Random Index of Array after shuffle
    System.out.println(Finances[finIdx]);
    }
    
}

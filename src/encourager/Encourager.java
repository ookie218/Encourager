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
public class Encourager {


        //Scanner object initiated
        static Scanner sc = new Scanner(System.in);
        //String used to gague response
        static String again;
        static String need;
        
        public static void outro() {
           //Ending message (Will run after loop runs)
           System.out.println("\n Thank You for using The Encourager. May the Lord"
                    + " bless you in Your walk with Him! \n");
           System.exit(0);
        }
        
    public static void runCode() {
    
        
        
        System.out.println("What are you in need of today?\n");
        
        
            //Read in response
            need = sc.next();

            if (need.equalsIgnoreCase("nothing") || need.equalsIgnoreCase("no") || 
                    need.equalsIgnoreCase("exit")|| need.equalsIgnoreCase("stop")) {
                //Stop program
                outro();
            }
            
            //What if response isn't what I accounted for?
            //While "answer" is not equal to x AND not equal to y AND not equal to z...
            while(!need.equalsIgnoreCase("money") && !need.equalsIgnoreCase("bills") && 
                !need.equalsIgnoreCase("finances") && !need.equalsIgnoreCase("cash") && 
                !need.equalsIgnoreCase("tithing") && !need.equalsIgnoreCase("provision") &&
                !need.equalsIgnoreCase("healing") && !need.equalsIgnoreCase("healer") && 
                !need.equalsIgnoreCase("health") && !need.equalsIgnoreCase("sick") && 
                !need.equalsIgnoreCase("sickness") && !need.equalsIgnoreCase("doctor") &&
                !need.equalsIgnoreCase("depression") && !need.equalsIgnoreCase("depressed") && 
                !need.equalsIgnoreCase("uplift") && !need.equalsIgnoreCase("uplifted") && 
                !need.equalsIgnoreCase("encouragement") && !need.equalsIgnoreCase("depression") && 
                !need.equalsIgnoreCase("depressed") && 
                !need.equalsIgnoreCase("uplift") && !need.equalsIgnoreCase("uplifted") && 
                !need.equalsIgnoreCase("encouragement") && !need.equalsIgnoreCase("pray") && 
                !need.equalsIgnoreCase("prayer") && !need.equalsIgnoreCase("wisdom") && 
                !need.equalsIgnoreCase("wise") && !need.equalsIgnoreCase("proverbs") && 
                !need.equalsIgnoreCase("learning") && !need.equalsIgnoreCase("learn") &&
                !need.equalsIgnoreCase("love") && !need.equalsIgnoreCase("lust") && 
                !need.equalsIgnoreCase("marriage") && !need.equalsIgnoreCase("engagement") && 
                !need.equalsIgnoreCase("sex")) {
            System.out.println("\n I'm sorry, we don't recognize that answer. Please try again. \n"
                    + "What's your need?");
            need = sc.next();
            if (need.equalsIgnoreCase("nothing") || need.equalsIgnoreCase("no") || 
                    need.equalsIgnoreCase("exit")|| need.equalsIgnoreCase("stop")) {
                outro();
                }
            }
                
            //Finance options we recognize for comparison
            if (need.equalsIgnoreCase("money") || need.equalsIgnoreCase("bills") || 
                need.equalsIgnoreCase("finances") || need.equalsIgnoreCase("cash") || 
                need.equalsIgnoreCase("tithing") || need.equalsIgnoreCase("provision")) {    
            Finances.finResp();
            }

            //Healing options we recognize for comparison
            if (need.equalsIgnoreCase("healing") || need.equalsIgnoreCase("healer") || 
                need.equalsIgnoreCase("health") || need.equalsIgnoreCase("sick") || 
                need.equalsIgnoreCase("sickness") || need.equalsIgnoreCase("doctor")) {    
            Healing.healResp();
            }

            //Encouragement options we recognize for comparison
            if (need.equalsIgnoreCase("depression") || need.equalsIgnoreCase("depressed") || 
                need.equalsIgnoreCase("uplift") || need.equalsIgnoreCase("uplifted") || 
                need.equalsIgnoreCase("encouragement")) {    
            Encouragement.encResp();
            }

            //Prayer options we recognize for comparison
            if (need.equalsIgnoreCase("pray") || need.equalsIgnoreCase("prayer")) {    
            Prayer.prayResp();
            }

            //Wisdom options we recognize for comparison
            if (need.equalsIgnoreCase("wisdom") || need.equalsIgnoreCase("wise") || 
                need.equalsIgnoreCase("proverbs") || need.equalsIgnoreCase("learning") || 
                need.equalsIgnoreCase("learn")) {    
            Wisdom.wiseResp();
            }

            //Love options we recognize for comparison
            if (need.equalsIgnoreCase("love") || need.equalsIgnoreCase("lust") || 
                need.equalsIgnoreCase("marriage") || need.equalsIgnoreCase("engagement") || 
                need.equalsIgnoreCase("sex")) {    
            Love.loveResp();
            }
            
            System.out.println("\n Thank you for allowing us to encourage you. \n "
                    + "I hope this really helped and ministered to Your need. \n "
                    + "Is there another need we can help you with?\n");
            
            //Instantiates need for repsonse
            again = sc.next();

            while (!again.equalsIgnoreCase("y") && (!again.equalsIgnoreCase("yes"))
                     && (!again.equalsIgnoreCase("n")) && (!again.equalsIgnoreCase("no"))) {
            System.out.println("Please answer again but this time using only yes or no...");
            again = sc.next();
            }
            
            //Go again?
            if (again.equalsIgnoreCase("no") || again.equalsIgnoreCase("n")) {
            //Ending message and stop program              
            outro();
            }
            
        }
            
        
    public static void main(String[] args) {
        
        //Opening Prompt
        System.out.println("Welcome to the Encourager! \n"
                + "Where we aim to lift you up in the name of Jesus! \n");
        
           //Run App 
           Encourager.runCode();
       
           //Loop to give you more prayer
           do{
               System.out.println("\n Ok Great! \n");
               Encourager.runCode();
           } while (again.equalsIgnoreCase("y") || (again.equalsIgnoreCase("yes")));
    }
}

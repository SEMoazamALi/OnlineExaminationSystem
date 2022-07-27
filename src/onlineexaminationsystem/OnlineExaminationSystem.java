/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlineexaminationsystem;

import javax.swing.UIManager;

/**
 *
 * @author Programmer
 */
public class OnlineExaminationSystem {

    
    public static void main(String[] args) {
        int i=5;
         try {     
            
            UIManager.setLookAndFeel( "com.jtattoo.plaf.acryl.AcrylLookAndFeel");
     
        } catch (Exception ex) {
            
            System.out.println(ex);
        } 
            
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        try{
       while(i<100){
            Thread.sleep(100);
            sp.progressbar.setValue(i);
            sp.pb.setText(Integer.toString(i));
            i+=5;
        }       // end of for loop
        
        sp.compProgress(i);
        
        }           // end of try clause
        catch(Exception ae){
            
            System.out.println(ae);
            
        }
    
    }
}

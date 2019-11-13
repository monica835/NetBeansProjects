/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

/**
 *
 * @author dinglasamo_sd2082
 */
public class Start {
boolean shouldCount=false;
int int_sec=0;
int int_min=0;
int int_mil=0;
    
    
  public Start(){
  }
        public void count(){
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        long now = System.currentTimeMillis();
                        while(true){
                        if(shouldCount){
                            if(System.currentTimeMillis()-now>=100){
                                now=System.currentTimeMillis();
                                int_mil++;
                                if(int_mil>9){
                                     int_mil=0;
                                     int_sec++;
                                     if(int_sec>=60){
                                          int_sec=1;
                                          int_min++;
                                     }
                                }
                            }       
                        }
                    }               
                }
            });
            thread.start();
        }
    }



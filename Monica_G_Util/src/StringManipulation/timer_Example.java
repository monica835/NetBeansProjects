/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;
   import java.awt.event.*;
import javax.swing.Timer;
/**
 *
 * @author dinglasamo_sd2082
 */
public class timer_Example extends javax.swing.JFrame implements ActionListener {
 
/**
*
* @author  morph
*/

Timer timer=null;
javax.swing.JLabel label=null;
static int counter=0;
/** Creates new form timer_Example */

public timer_Example(){
//your code goes here
label=new javax.swing.JLabel("The time is 0 seconds");
this.getContentPane().add(label);
this.pack();
timer=new Timer(1000,this);/*create a timer that generates an event after 1 second and pass it the frame object which handles the action event by implementing the ActionListener interface*/
timer.start();
}

public void actionPerformed(ActionEvent e){
if(counter==100)
{
timer.stop();
}
javax.swing.SwingUtilities.invokeLater(new updateCount());
}

public class updateCount implements Runnable{
public void run(){
counter=counter+1;//update the counter value
label.setText("the time is "+counter+" seconds");
//your JProgressBar code can go here
//or any other code that you may like
}
}
public static void main(String args[]) {

timer_Example form=new timer_Example();
form.setVisible(true);
form.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
}


}



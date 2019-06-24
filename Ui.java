/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleup;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Armani Weise
 */
public class Ui {
    static Day one,two,three,four,five,six;
    JFrame window;
    JTextField in;
    JPanel back;
    JButton search;
    Label [] results;
    Label help;
    public Ui(){
        help= new Label();
        help.setBackground(new Color(58,95,177));
        help.setForeground(new Color(221,247,241));
        help.setText("Days range from one to six");
        help.setBounds(1,150,160,15);
        
        window= new JFrame();
         window.setTitle("Schedule");
    window.setLayout(null);
    window.setSize(new Dimension(400,150));
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    
        results=new Label[7];
        byte po=0;
       int yu=0;
        while (po<7){
        results[po]= new Label();
        results[po].setBounds(400,yu,50,20);
        window.add(results[po]);
        po++;
        yu=yu+20;
        }
       Input input= new Input();
        search= new JButton();
        search.addActionListener(input);
        back=new JPanel();
        in= new JTextField();
        in.setToolTipText("Enter a day");
   
    in.setBounds(0, 0, 150,20);
    search.setIcon(new ImageIcon("C:\\Users\\Armani Weise\\Documents\\NetBeansProjects\\Scheduleup\\src\\scheduleup\\searchyy.png"));
    search.setBounds(150,0,20,20);
    window.add(in);
    window.add(search);
    window.add(help);
    window.setVisible(true);
    
    
    }
    public static void main(String[] args) {
        one= new Day();
         one.classes[0]="Physics";
          one.classes[1]="Physics";
          one.classes[2]="Math";
           one.classes[3]="Drama";
            one.classes[4]="Pe";
             one.classes[5]="English";
              one.classes[6]="English";
         two= new Day();
         two.classes[0]="SPanish";
           two.classes[1]="SPanish";
             two.classes[2]="Drama";
               two.classes[3]="Drama";
                 two.classes[4]="Business";
                   two.classes[5]="English";
                     two.classes[6]="English";
                       
         three= new Day();
         three.classes[0]="Math";
         three.classes[1]="Math";
         three.classes[2]="Computer";
         three.classes[3]="Computer";
         three.classes[4]="Assembly";
         three.classes[5]="English";
         three.classes[6]="Physics";
         four= new Day();
         four.classes[0]="Computer";
          four.classes[1]="Math";
           four.classes[2]="SPanish";
            four.classes[3]="Spanish";
             four.classes[4]="Business";
              four.classes[5]="pe";
               four.classes[6]="pe";
         five= new Day();
         five.classes[0]="Math";
         five.classes[1]="Guidance";
         five.classes[2]="English";
         five.classes[3]="English";
         five.classes[4]="Spanish";
         five.classes[5]="Drama";
         five.classes[6]="Business";
         six= new Day();
         six.classes[0]="Physics";
         six.classes[1]="Physics";
         six.classes[2]="COmputer";
         six.classes[3]="COmputer";
         six.classes[4]="Math";
         six.classes[5]="Business";
         six.classes[6]="English";
        new Ui();
    }
    class Input implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            byte po=0;
       int yu=0;
        while (po<7){
        results[po].setBounds(400,yu,70,20);
        
        po++;
        yu=yu+3;
        }
            String info=in.getText();
           if ("1".equals(info)|| "one".equals(info)|| "One".equals(info)||"ONE".equals(info)){
           int go=0;
           while(go<7){
           results[go].setText(one.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           int pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           }
           }
           
          else if ("2".equals(info)|| "two".equals(info)|| "Two".equals(info)||"TWO".equals(info)){
           byte go=0;
           while(go<7){
           results[go].setText(two.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           byte pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           }
           }
           
           else if ("3".equals(info)|| "three".equals(info)|| "Three".equals(info)||"THREE".equals(info)){
            byte go=0;
           while(go<7){
           results[go].setText(three.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           int pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           }
           }
                   
            else if ("4".equals(info)|| "four".equals(info)|| "Four".equals(info)||"FOUR".equals(info)){
          int go=0;
           while(go<7){
           results[go].setText(four.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           int pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           }
             }       
            
            else if ("5".equals(info)|| "five".equals(info)|| "Five".equals(info)||"FIVE".equals(info)){
          int go=0;
           while(go<7){
           results[go].setText(five.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           int pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           }  
         }
        
         else if ("6".equals(info)|| "six".equals(info)|| "Six".equals(info)||"SIX".equals(info)){
           int go=0;
           while(go<7){
           results[go].setText(six.classes[go]);
           results[go].setFont(new Font("Helvetica", Font.BOLD, 11));
           go++;
           }
           byte yup=0;
           int y=0;
           while (yup<7){
           int pogo=00;
           int x=400;
           
           while (pogo<40){
              results[yup].setBounds(x,y , 70, 20);
               
              pogo++;
               x=x-5;
               try {
                   TimeUnit.MILLISECONDS.sleep(7);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           y=y+15; 
           yup++;       
            pogo=0;
           } 
          
          }
          else {
         int up=0;
         final int f=1;
         int q=150;
         
         while (up<50){
         help.setBounds(f,q,165,15);
         q=q-1;
         up++;
             try {
                 TimeUnit.MILLISECONDS.sleep(5);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
                }
         help.setBounds(1,150,160,15); 
         }
        }
        
        
        
    }

}

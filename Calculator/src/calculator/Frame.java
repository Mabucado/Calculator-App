/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class Frame implements ActionListener  {
  JFrame frame=  new JFrame("calculator");
  JPanel panel=new JPanel();
  JPanel panel1=new JPanel();
  JLabel label=new JLabel("none");
  JTextField text= new JTextField();
  JButton button1 =new JButton("1");
   JButton button2 =new JButton("2");
    JButton button3 =new JButton("3");
     JButton button4 =new JButton("4"); 
      JButton button5 =new JButton("5");
       JButton button6 =new JButton("6");
        JButton button7 =new JButton("7");
         JButton button8 =new JButton("8");
          JButton button9 =new JButton("9");
           JButton button0 =new JButton("0");
           JButton equals =new JButton("=");
           JButton plus =new JButton("+");
           JButton clear=new JButton("clear");
           JButton[] buttons=new JButton[10];
           
           int result=0, num1=0, num2=0;
           
     
    Frame(){
        buttons[0]=button0;
         buttons[1]=button1;
          buttons[2]=button2;
           buttons[3]=button3;
            buttons[4]=button4;
             buttons[5]=button5;
              buttons[6]=button6;
               buttons[7]=button7;
               buttons[8]=button8;
               buttons[9]=button9;
               
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(null);
         frame.setSize(600,700);
         frame.add(panel);
         frame.add(panel1);
         
          text.setBounds(0,0,690,100);
          text.setFont(new Font("Algerian",Font.PLAIN,70));
          
         panel.add(label);
         panel.add(text);
         panel.setBounds(0,0,600,100);
         panel1.setBounds(0, 100, 600, 400);
         panel1.setLayout(new GridLayout(4,4));
        panel.setLayout(null);
        
         equals.setFont(new Font("Arial Black",Font.BOLD,40));
          plus.setFont(new Font("Arial Black",Font.BOLD,40));
          clear.setFont(new Font("Arial Black",Font.BOLD,40));
          
    panel1.add(button1);
     panel1.add(button2);
      panel1.add(button3);
       panel1.add(button4);
        panel1.add(button5);
         panel1.add(button6);
          panel1.add(button7);
          panel1.add(button8);
          panel1.add(button9);
          panel1.add(button0);
          panel1.add(equals);
          panel1.add(plus);
          panel.add(clear);
          
          for(int i=0;i<10;i++){
          buttons[i].addActionListener(this);
        buttons[i].setFocusPainted(false);
        buttons[i].setFont(new Font("Arial Black",Font.BOLD,40));
          }
           plus.addActionListener(this);
    equals.addActionListener(this);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
    }
   
      @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<10; i++){
       if(e.getSource()==buttons[i]){
       label.setText("1");
       text.setText(text.getText().concat(String.valueOf(i)));
       }
       }
        if(e.getSource()==plus){
       num1=Integer.parseInt(text.getText());
       text.setText("");
       }
        
          if(e.getSource()==equals) {
			num2=Integer.parseInt(text.getText());
			
			
			
				result=num1+num2;
				System.out.println(result);
	    text.setText(String.valueOf(result));
	     num1=result;
		}
    }
}

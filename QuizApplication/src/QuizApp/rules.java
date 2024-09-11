package QuizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class rules extends JFrame implements ActionListener {

    JButton back1,start;

    String name;
    rules(String name){
        this.name=name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
     
        JLabel head = new JLabel("Welcome "+name+" for quizzz");
        head.setBounds(220,30,500,30);
        head.setFont(new Font("DialogInput",Font.BOLD,24));
        head.setForeground(new Color(135,54,116));
        add(head);

        JLabel content=new JLabel();
        content.setText(
            "<html>"+
            "1.You must answer the question within 30 seconds."+"<br>"+
            "2.Each correct answer gets 1 points"+"<br>"+
            "3.All questions are related to Java"+"<br><br>"+"<center>"+
            "All the best!!!"+"</center>"+
            "</html>"
        );
        content.setBounds(60,90,800,180);
        content.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(content);

        back1=new JButton("Back");
        back1.setBackground(new Color(135,54,116));
        back1.setForeground(Color.WHITE);
        back1.setBounds(100,300,100,30);
        back1.addActionListener(this);
        add(back1);

        start=new JButton("Start");
        start.setBackground(new Color(135,54,116));
        start.setForeground(Color.white);
        start.setBounds(400,300,100,30);
        start.addActionListener(this);
        add(start);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);
        setLocation(400,80);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
          
          setVisible(false);
          new Quiz(name);
        }
        else if(ae.getSource()==back1){
          setVisible(false);
        }
      }
    public static void main(String[] args) {
        new rules("user");
    }
}

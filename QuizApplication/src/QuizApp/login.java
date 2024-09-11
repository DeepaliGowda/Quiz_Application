package QuizApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

  // BUTTONS ARE DECLARED GLOBALLY SINCE ACTION PERFORMED METHOD SHOULD GET ACCESS TO BUTTONS
  //IF IT IS DECLARED INSIDE CONSTRUCTOR IT WILL NOT BE ACCESSIBLE TO ACTION PERFORMED METHOD

  JButton rules,back;
  JTextField tfname;

     login() {

    getContentPane().setBackground(Color.WHITE); 
    setLayout(null);
    ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/login4.jpeg"));
    JLabel image=new JLabel(img);
    image.setBounds(0, 0, 500, 560);
    add(image);
    
      JLabel heading=new JLabel("Quizzz Time");
      heading.setBounds(630,50,300,45);
      heading.setFont(new Font("DialogInput",Font.BOLD,40));
      heading.setForeground(new Color(135,54,116));
      add(heading);

      JLabel name=new JLabel("Enter your name");
      name.setBounds(670,120,200,40);
      name.setFont(new Font("system-ui",Font.ITALIC,22));
      name.setForeground(new Color(135,54,116));
      add(name);

      tfname=new JTextField();
      tfname.setBounds(620,190,290,30);
      tfname.setFont(new Font("Times new roman",Font.BOLD,20));
      add(tfname);

       rules =new JButton("Begin");
      rules.setBounds(630,250,100,30);
      rules.setBackground(new Color(135,54,116));
      rules.setForeground(Color.WHITE);
      rules.addActionListener(this);
      add(rules);

      back=new JButton("Back");
      back.setBounds(800,250,100,30);
      back.setBackground(new Color(135,54,116));
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      add(back);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(1000, 600);
      setLocation(250, 100);
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==rules){
        String name=tfname.getText();
        setVisible(false);
        new rules(name);
      }
      else if(ae.getSource()==back){
        setVisible(false);
      }
    }

    public static void main(String[] args) {
      new login();
    }
    }


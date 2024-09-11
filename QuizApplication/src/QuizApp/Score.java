package QuizApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
     JButton btn;

    Score(String name,int score) {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("images/score4.jpg"));
        
        Image i2=img.getImage().getScaledInstance(350, 550,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,350,550);
        add(image);

        JLabel heading=new JLabel("Thank you "+name+" for taking quiz");
        heading.setBounds(400,50,500,30);
        heading.setFont(new Font("Times new roman",Font.PLAIN,24));
        heading.setForeground(new Color(135,54,116));
        add(heading);

        JLabel lscore=new JLabel("Your Score is: "+score);
        lscore.setBounds(430,150,300,30);
        lscore.setFont(new Font("Tahoma",Font.BOLD,28));
        add(lscore);

        btn=new JButton("Play again!");
        btn.setBounds(500,260,100,30);
        btn.setForeground(Color.WHITE);
        btn.setBackground(new Color(135,54,116));
        btn.addActionListener(this);
        add(btn);
        
        
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setSize(800,500);
    setLocation(400,150);
    setVisible(true);
            
        }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn) {
            new login();
            setVisible(false);
        }

    }    
    public static void main(String[] args) {
        new Score("user",0);
        
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz extends JFrame implements ActionListener{
    
    JButton TrueorFalse;
	JButton MultipleChoice;
	
    public static void main (String [] args) {
		quiz mine = new quiz();
        mine.setVisible(true);
    }

    public quiz () {
        setTitle ("This is a Fun-Facts Quiz");
        setSize (500, 600);
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        
        Container contentPane = getContentPane();
        contentPane.setBackground (Color.red);
        contentPane.setLayout(null);
        
        
        JButton TrueorFalse = new JButton ("True or False");
        JButton MultipleChoice= new JButton ("Multiple Choice");
        
        TrueorFalse .setBounds (130,150,100,60);
        MultipleChoice .setBounds (130,150,100,60);
        TrueorFalse.addActionListener (this);
        MultipleChoice.addActionListener (this);
        contentPane.add(TrueorFalse);
        contentPane.add(MultipleChoice);
        
    }
    }
     public void actionPerformed(ActionEvent event) {
}
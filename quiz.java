import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz{



	JLabel infoLabel;
	JButton oneButton,twoButton;
	
	
	public quiz()
		{	 
			 JFrame jFrameWindow = new JFrame("Fun Facts-Quiz");
			 			 			 
			 FlowLayout flowLayout = new FlowLayout();
			 
		     jFrameWindow.setLayout(flowLayout);
		     		     	     		 
			 jFrameWindow.setSize(600,600);
			 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 infoLabel = new JLabel("Welcome to the Fun Facts Quiz");				 
 			 jFrameWindow.add(infoLabel);
     		 
     		 tfButton = new JButton("One Player");
     		 jFrameWindow.add(oneButton);
     		 
     		 multipleButton = new JButton("Two Player");
     		 jFrameWindow.add(twoButton);
 			 
 			 	 		 		 				 
		 EventHandler handler = new EventHandler();
			 
		 oneButton.addActionListener(handler);
		 twoButton.addActionListener(handler);
			 			 	 	 
		 jFrameWindow.setVisible(true);
		}
		public static void main(String args[])
		{	 		
		 quiz guiApp = new quiz();
		}
		
	private class EventHandler implements ActionListener{

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==oneButton 
	}		 	 			 
		
		
		
				
}

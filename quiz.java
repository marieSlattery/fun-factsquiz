import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz{



	JLabel infoLabel;
	JButton tfButton,multipleButton;
	
	
	public quiz()
		{	 
			 JFrame jFrameWindow = new JFrame("Fun Facts-Quiz");
			 			 			 
			 FlowLayout flowLayout = new FlowLayout();
			 
		     jFrameWindow.setLayout(flowLayout);
		     		     	     		 
			 jFrameWindow.setSize(400,500);
			 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 infoLabel = new JLabel("Please choose which quiz you want to play");				 
 			 jFrameWindow.add(infoLabel);
     		 
     		 tfButton = new JButton("True/False");
     		 jFrameWindow.add(tfButton);
     		 
     		 multipleButton = new JButton("Multiple Choice");
     		 jFrameWindow.add(multipleButton);
 			 
 			 	 		 		 				 
			 EventHandler handler = new EventHandler();
			 
			 tfButton.addActionListener(handler);
			 multipleButton.addActionListener(handler);
			 			 	 	 
			 jFrameWindow.setVisible(true);
		}
			public static void main(String args[])
		{	 		
			 quiz guiApp = new quiz();
		}
		
		private class EventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==tfButton 
		}		 	 			 
		
		
		
				
}

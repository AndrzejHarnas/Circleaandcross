import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class kolko extends JFrame {
	
	
	int counter = 1;

	public kolko(){
		
		setSize(600,600);
		setVisible(true);
		setTitle("Kółko i krzyżyk");
		setLayout(new GridLayout(3,3));
		
		for(int i = 1;i<=9;i++){
		JButton przycisk = new JButton("");
		add(przycisk);
		przycisk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				JButton przycisk = (JButton) e.getSource();
				
				if(counter%2 ==0){
					
					przycisk.setText("X");
				}
				else {
				
					przycisk.setText("O");
					
				}
				
				przycisk.setEnabled(false);
				
	
			counter++;
				
				
			}
			
			
		});
		}
		
	}
	
	
	 	 
	public static void main(String[] args)  {
	
		EventQueue.invokeLater(new Runnable() 
		{
		  public void run()
		  {
			
			new kolko();
	      }
		}
		);

	}

}

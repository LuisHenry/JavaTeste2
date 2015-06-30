import javax.swing.*;
import java.awt.BorderLayout.* ;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


class JavaTeste2{
	JButton button1;
	JButton button2;
	JButton button3;
	JFrame frame;
	Random random= new Random();
	ActionEvent myEvent;

	public static void main(String [] args){
		JavaTeste2 t = new JavaTeste2();
		t.go();
	}
	void go(){
		frame = new JFrame();
		JButton button1 = new JButton("Luis");
		button1.addActionListener(new ButtonListener());
		JButton button2 = new JButton("Roldanus");
		button2.addActionListener(new SecondListener());
		JButton button3 = new JButton("ERRAR!");
		Paint paint = new Paint();

		frame.getContentPane().add(button1, BorderLayout.WEST);
		frame.getContentPane().add(button2, BorderLayout.EAST);
		frame.getContentPane().add(button3, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(paint, BorderLayout.CENTER);
 		frame.setSize(1900,1000);
 		frame.setVisible(true);	
	}

	public class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event){ 
			frame.repaint();			
		}
	}

	public class SecondListener implements ActionListener{
		int x;
		public void actionPerformed(ActionEvent event){ 
			try{
				x=1/0;
			}catch(Exception e){
				frame.dispose();
			}	
	}
}
	public class Paint extends JPanel{
		public void paintComponent(Graphics g){
			int x = random.nextInt(1500)+1;
			int y = random.nextInt(1000)+1;
			int h = random.nextInt(400)+40;                                                                               
			int l = random.nextInt(600)+40;
			int color1 = random.nextInt(255)+1;
			int color2 = random.nextInt(255)+1;
			int color3 = random.nextInt(255)+1;
			Color myColor = new Color(color1,color2,color3);
    	    int shape = random.nextInt(300)+1;
    	    if (shape % 2 ==0){ 
        		g.setColor(myColor);
        		g.fillRect(x,y,h,l);
      		}
      		else{
      			g.setColor(myColor);
      			g.fillOval(x,y,h,l);
      		}	
		}
	}
}	
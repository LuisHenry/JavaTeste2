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
	Random rand= new Random();

	public static void main(String [] args){
		JavaTeste2 t = new JavaTeste2();
		t.go();
	}
	void go(){
		frame = new JFrame();
		JButton button1 = new JButton("Luis");
		JButton button2 = new JButton("Roldanus");
		JButton button3 = new JButton("ERRAR!");

		frame.getContentPane().add(button1, BorderLayout.WEST);
		frame.getContentPane().add(button2, BorderLayout.EAST);
		frame.getContentPane().add(button3, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setSize(1900,1000);
 		frame.setVisible(true);	
	}
}
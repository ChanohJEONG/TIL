package CH07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {

	public static void main(String[] args) {
		JFrame j = new JFrame("Window");
		//j.setTitle("Window");
		JButton btn = new JButton("¹öÆ°");
		btn.setBackground(Color.CYAN);
		
		j.add(btn);
		
		j.setBounds(300,300,300,300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		
		
		//Call By Reference
		
	/*	Member m1 = new Member();
		Member m2 = new Member();
		
		m1.age = 30;
		m2 = m1;
		m2.age = 20;
		System.out.println(m1.age);
		System.out.println(m2.age);
		*/
		
	}

}

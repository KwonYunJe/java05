package Constructor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DropMode;

public class Champon {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		JFrame j2 = new JFrame();
		
		j.getContentPane().setBackground(new Color(255, 9, 0));
		j.setSize(700,700);
		j.getContentPane().setLayout(null);
		Font font = new Font("궁서" , 1, 50);
		Font font2 = new Font("궁서" , 1, 20);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Library/eclipqse_WorkSpace/java05/jjajang.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 116, 478, 445);
		j.getContentPane().add(lblNewLabel);
		
		JButton champon = new JButton("짬뽕");
		champon.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		champon.setBackground(new Color(255, 164, 129));
		champon.setBounds(27, 29, 99, 83);
		champon.setFont(font);
		j.getContentPane().add(champon);
		
		JButton udon = new JButton("우동");
		udon.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		udon.setBounds(138, 29, 99, 83);
		udon.setFont(font);
		j.getContentPane().add(udon);
		
		JButton jjajang = new JButton("짜장");
		jjajang.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		jjajang.setBounds(251, 29, 99, 83);
		jjajang.setFont(font);
		j.getContentPane().add(jjajang);
		
		JTextArea totalText = new JTextArea("개수 : ");
		totalText.setDropMode(DropMode.INSERT);
		totalText.setBounds(353, 49, 99, -49);
		totalText.setFont(font2);
		j.getContentPane().add(totalText);
		
		
		
		
		
		
		j.setVisible(true);
	}
}

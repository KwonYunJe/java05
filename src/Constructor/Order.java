package Constructor;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Order {
	static int count =0;
	static int champonTotal = 0;
	static int udonTotal = 0;
	static int jjajangTotal = 0;
	static int jprice = 6000;
	static int uprice = 6500;
	static int cprice = 7000;
	static int totalPrice = 0;
	
	private static JTextField t1;
	
	
	public static void main(String[] args) {
		String champonImg = "/Library/eclipqse_WorkSpace/java05/champon.jpg";
		String jjajangImg = "/Library/eclipqse_WorkSpace/java05/jjajang.jpg";
		String udonImg = "/Library/eclipqse_WorkSpace/java05/udon.jpg";
		
		
		
		JFrame f= new JFrame("Order Screen");
		f.getContentPane().setBackground(new Color(25, 255, 0));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수 : ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(470, 30, 84, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel result = new JLabel("결제 금액 : ");
		result.setForeground(new Color(255, 17, 0));
		result.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		result.setBounds(91, 404, 491, 50);
		f.getContentPane().add(result);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("/Library/eclipqse_WorkSpace/java05/jjajang.jpg"));
		center.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		center.setBounds(142, 94, 536, 298);
		f.getContentPane().add(center);
		
		JLabel ctotal = new JLabel("짬뽕");
		ctotal.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		ctotal.setBounds(23, 112, 107, 50);
		f.getContentPane().add(ctotal);
		
		JLabel utotal = new JLabel("우동");
		utotal.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		utotal.setBounds(23, 189, 107, 50);
		f.getContentPane().add(utotal);
		
		JLabel jtotal = new JLabel("짜장");
		jtotal.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		jtotal.setBounds(23, 275, 107, 50);
		f.getContentPane().add(jtotal);
		
		
		
		JButton btn2 = new JButton("우동");
		btn2.setBounds(108, 21, 72, 59);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				int dpPrice = 0;
				udonTotal++;
				t1.setText(""+ count);  
				utotal.setText("우동 :"+udonTotal);
				dpPrice = udonTotal*uprice + totalPrice;
				result.setText("결제금액 : "+ dpPrice); 	//결제 예정 금액 
				totalPrice = dpPrice; 
				center.setIcon(new ImageIcon(udonImg));
			}
		});
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 235, 0));
		t1.setBounds(560, 30, 201, 62);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btn1 = new JButton("짬뽕");
		btn1.setBounds(23, 21, 72, 59);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				count++;	//count 증가
				int dpPrice = 0;
				champonTotal++;
				t1.setText(""+ count);  	//현재 주문량 표시 
				ctotal.setText("짬뽕 :"+champonTotal);
				dpPrice = champonTotal*cprice + totalPrice;
				result.setText("결제금액 : "+ dpPrice); 	//결제 예정 금액 
				totalPrice = dpPrice;
				center.setIcon(new ImageIcon(champonImg));
			}
		});
		f.getContentPane().add(btn1);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("짜장");
		btn3.setBounds(192, 21, 72, 59);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				int dpPrice=0;
				jjajangTotal++;
				t1.setText(""+ count);  
				jtotal.setText("짜장 :"+jjajangTotal);
				dpPrice = jjajangTotal*jprice + totalPrice;
				result.setText("결제금액 : "+ dpPrice); 	//결제 예정 금액 
				totalPrice = dpPrice;
				center.setIcon(new ImageIcon(jjajangImg));
				
			}
		});
		f.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("reset");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				champonTotal =0;
				jjajangTotal = 0;
				udonTotal =0;
				totalPrice =0;
				t1.setText(""+ count);
				result.setText(null);
				utotal.setText(null);
				jtotal.setText(null);
				ctotal.setText(null);
			}
		});
		btn4.setBounds(689, 395, 72, 59);
		f.getContentPane().add(btn4);
		
		
		
		f.setVisible(true);
	}
}

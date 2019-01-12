package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
//컨트롤+쉬프트+o(영문)

public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel_2;
	
	public ChinaFood() {
		getContentPane().setBackground(new Color(255, 255, 0));
		setSize(700, 500);
		setTitle("주문하세요...");
		
		ImageIcon icon = new ImageIcon("중국집.png");
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("짜장면");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
			}
		});
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 18));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setToolTipText("짜장면 하나가 추가됨");
		
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				
				ImageIcon icon2 = new ImageIcon("우동.png");
				
				lblNewLabel_2.setIcon(icon2);
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 18));
		
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짬봉");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				MyHome name = new MyHome();
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 18));
		btnNewButton_2.setForeground(Color.MAGENTA);
		
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("개수");
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("금액");
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("굴림", Font.BOLD, 20));
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2.setIcon(icon);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ChinaFood china = new ChinaFood();
	}

}

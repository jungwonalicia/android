package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MyDiary extends JFrame {
	private JTextField noText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		//컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 작성화면");
		setSize(520, 700);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("일기장-위.png");
		lblNewLabel.setIcon(icon);
		
		JLabel no = new JLabel("번호");
		getContentPane().add(no);
		
		noText = new JTextField();
		noText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(noText);
		noText.setColumns(15);
		
		JButton save = new JButton("일기저장");
		save.setBackground(Color.MAGENTA);
		save.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(save);
		
		
		JButton read = new JButton("일기읽기");
		read.setBackground(Color.ORANGE);
		read.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(read);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();
	}

}

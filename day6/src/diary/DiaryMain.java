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

public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.GREEN);
		//컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 시작화면");
		setSize(520, 700);
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon("일기장-메인.png");
		lblNewLabel.setIcon(icon);
		
		JLabel label = new JLabel("아이디: ");
		label.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(label);
		
		id = new JTextField();
		id.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(id);
		id.setColumns(20);
		
		JLabel label_1 = new JLabel("패스워드: ");
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(label_1);
		
		pw = new JTextField();
		pw.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(pw);
		pw.setColumns(20);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234";
				String gId = id.getText();
				String gPw = pw.getText();
				
				if ((sId.equals(gId)) && (sPw.equals(gPw))) {
					JOptionPane.showMessageDialog(null, "로그인 OK입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 NOT입니다. 재입력해주세요.");
					
					
				}
			}
		});
		login.setBackground(Color.MAGENTA);
		login.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(login);
		
		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
			}
		});
		reset.setBackground(Color.ORANGE);
		reset.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		getContentPane().add(reset);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();
	}

}

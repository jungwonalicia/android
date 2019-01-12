package menu;

import javax.swing.JFrame;

public class MyHome extends JFrame {

	public MyHome() {
		setTitle("내가 새로 열려");
		setSize(500, 500);
		SuperMan superMan = new SuperMan();
		superMan.name = "클라크"; //person
		superMan.age = 100; //person
		
		superMan.speed = 100; //man
		superMan.high = 1000; //superMan
		
		superMan.smile();
		superMan.run();
		superMan.fly();
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyHome();
	}

}

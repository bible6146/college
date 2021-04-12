import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Yagu extends JFrame {
	JTextField t1 = new JTextField();

	public Yagu() {
		t1.setSize(400, 100);
		this.add(t1, BorderLayout.NORTH);
		this.add(new Panel(), BorderLayout.CENTER);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Yagu();
	}

	class Panel extends JPanel implements ActionListener {
		int num=1;
		Random ra=new Random();
		int index = 0;
		int count = 0;
		boolean yagu = false;
		int[] my = new int[3];
		int[] ai = new int[3];
		int[] point = new int[3];
		JButton[] buList = new JButton[9];
		JButton check = new JButton("확인");
		JButton restart = new JButton("다시하기");
		String mySum = "";

		public Panel() {
			while (true) {
				for (int i = 0; i < 3; i++) {
					ai[i] = ra.nextInt(9)+1;
				} 
				if (ho(ai))
					break;
			}
			System.out.println("정답은" + ai[0] + " " + ai[1] + " " + ai[2]);
			t1.setSize(400, 50);
			this.setLayout(new GridLayout(4, 3));
			for (int i = 0; i < 9; i++) {
				buList[i] = new JButton(String.valueOf(i + 1));
				buList[i].addActionListener(this);
				this.add(buList[i]);
			}
			check.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					mySum = "";
					t1.setText("");
					if (!yagu)
						go();

				}
			});
			this.add(check);
			restart.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					index=0;
					count=0;
					for(int i=0;i<3;i++) {
						point[i]=0;
					}
					yagu=false;
					while (true) {
						for (int i = 0; i < 3; i++) {
							ai[i] = ra.nextInt(9)+1;
						} 
						if (ho(ai))
							break;
					}
					System.out.println("정답은" + ai[0] + " " + ai[1] + " " + ai[2]);
					num++;
					t1.setText(num+"번째판");
				}
			});
			this.add(restart);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (index != 3 && !yagu) {
				JButton b1 = new JButton();
				b1 = (JButton) e.getSource();
				my[index] = Integer.parseInt(b1.getText());
				mySum = mySum + b1.getText() + " ";
				t1.setText(mySum);
		
			}
			index++;
			

		}

		public void go() {
			String str = "";
			for (int i = 0; i < ai.length; i++) {
				for (int j = 0; j < my.length; j++) {
					if (i == j && ai[i] == my[j]) {
						point[0]++;
						my[j] = 0;
						break;
					} else if (i != j && ai[i] == my[j]) {
						point[1]++;
						break;
					}
				}
			}
			if (point[0] == 0 && point[1] == 0) {
				point[2]++;
				str = "아웃" + point[2] + "번";
			}
			if (point[0] != 0) {
				str = str + point[0] + "스트라이크 ";
			}
			if (point[1] != 0) {
				str = str + point[1] + "볼";
			}
			index = 0;
			count++;
			if (point[0] >= 3 || count == 6 || point[2] == 3) {
				if (point[0] >= 3) {
					System.out.println("이겼습니다");
					str = str + "이겼습니다";
					t1.setText(str);
				} else {
					System.out.println("아까비 졌네요  졌네용 ");
					str = str + "졌습니다";
					str = str + ("정답은" + ai[0] + " " + ai[1] + " " + ai[2]);
					t1.setText(str);
				}
				yagu = true;

			}
			point[0] = 0;
			point[1] = 0;
			t1.setText(str);
			System.out.println(str);

		}
	}

	public  boolean ho(int a[]) {
		if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2])
			return false;
		else
			return true;
	}

}

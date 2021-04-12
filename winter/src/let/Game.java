package let;

import java.awt.Color;
import java.awt.Graphics;//�ؽ�Ʈ �ʵ� �ϳ��� ���ٺٿ����� �ʵ� Ŭ�������� ��Ʈ������ ������Ѻ���
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Game extends JFrame {
	int gameIndex = 0;//restart ���� ���� �ٲ�
	ArrayList<ImgPanel> gameList = new ArrayList<ImgPanel>();//������ �ٽý����ϸ� �̹��� �г��� ���ļ� �迭�� ����� ������
	JButton b1;

	public Game() {
		this.setLayout(null);
		this.setSize(672, 392);
		gameList.add(new ImgPanel());
		gameList.get(0).setBounds(0, 0, 672, 392);
		b1 = new JButton("reStart");
		b1.addActionListener(new ActionListener() {//��ư�� ���� �迭�� �����
			@Override
			public void actionPerformed(ActionEvent e) {//���ο� �г� ��ü ����Ʈ�� �߰��� �����г� ��ư����
				remove(gameList.get(gameIndex));
				gameList.add(new ImgPanel());
				gameIndex++;
				gameList.get(gameIndex).remove(b1);
				gameList.get(gameIndex).setBounds(0, 0, 672, 392);
				add(gameList.get(gameIndex));

			}
		});
		this.add(gameList.get(0));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	class ImgPanel extends JPanel implements ActionListener {
		Image playerImg;
		Image backgroundImg;
		Image fireddong;
		Timer timer;
		TestPanel t = new TestPanel();
		ArrayList<DDong> list = new ArrayList<DDong>();
		ArrayList<TestPanel> list2 = new ArrayList<TestPanel>();
		int x, y = 250;//�÷��̾� ��ǥ
		int index = 0, sIndex = 0;//�׼� �߻���, �˰�ü �߻���
		Toolkit toolkit = Toolkit.getDefaultToolkit();//�̹��� �Է��� ���Ǹ����� �������� ���

		public ImgPanel() {
			this.setLayout(null);
			t.setBounds(200, 30, 160, 50);
			this.add(t);
			playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\1zno.GIF");
			backgroundImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\bb1.GIF");
			fireddong=toolkit.getImage("C:\\Users\\jungse\\Downloads\\fire2.GIF");
			fireddong=fireddong.getScaledInstance(60, 60, Image.SCALE_FAST);
			timer = new Timer(100, this);//Ÿ�̸� �̺�Ʈ�� 0.01�ʸ��� �׼� �߻�
			timer.start();

		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImg, 0, 0, this);
			g.drawImage(playerImg, x, y, this);
			if (t.check == true) {//������ Ǯ������ �� �� �ڸ��� ���̹��� ��� ��ǥ �������� �ʰ���
				g.drawImage(fireddong,list.get(sIndex - 1).x,list.get(sIndex - 1).y,this);
			}
			if (!t.fire) {//������ �ȳ������� �̹��� ���
				for (DDong s : list) {
					g.drawImage(s.ddong, s.x, s.y, this);
				}
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (index % 45 == 0 && !t.fire) {//Ÿ�̸� ��ü�� �׼��� 45�� �ɶ����� ������ �����ʾ����� ��ü������ �迭�߰�
				list.add(new DDong());
				sIndex++;
				if (index != 0 && !t.check) {//��ü�� �����Ǿ��µ� �ؽ�Ʈ�ʵ尪�� �Է��� �ȵǸ� time out
					t.result="time out";
					t.fire = true;
				} 
				t.reset();//�ؽ�Ʈ�ʵ� ������ ���� üũ ������ ����
				t.check = false;
			}
			if (t.check == true) {//���� ������ �������� ��Ŭ������ �̹��� �Ⱥ��̰���
				list.get(sIndex - 1).ddong = null;
			}
			for (DDong s : list) {//���� �迭�� ��ǥ�� ������
				if(s.ddong!=null)s.x = s.x - 10;
			}
			if (t.fire&&sIndex!=9) {//�����й��� ���ο� �̹��� �߰��� ���� �ؼ�
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (1).PNG");
				x = 150;
				y = 0;
				JTextArea finish = new JTextArea(
						  "\nyour answer : \n" + t.result + "\n sorry,,but \nanswer: " + t.mySum);
				finish.setBounds(480, 30, 150, 100);
				this.add(finish);
				end();
				}
			if(sIndex==9) {//���ӽ¸��� �̹��� ���
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (2).PNG");
				x = 100;
				y = 0;
				end();
				t.fire=true;
			}
			index++;
			repaint();

		}
		public void end() {//�̱�� ���� ���������� �ؽ�Ʈ�ʵ� �������� ��ư �߰�
			this.remove(t);
			b1.setBounds(530, 5, 100, 20);
			gameList.get(gameIndex).add(b1);
		}

		class DDong {//�̹��� ���ϸ��� ��ǥ������ ���ؼ� Ŭ������ ����
			int x = 500, y = 260;
			Image ddong;

			public DDong() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				ddong = toolkit.getImage("C:\\Users\\jungse\\Downloads\\pngegg.PNG");
				ddong = ddong.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			}
		}

		class TestPanel extends JTextField implements KeyListener {//������ ������ �г�
			boolean check = false;//���� Ȯ�� ����
			boolean fire = false;//���� �� Ȯ�� ����
			String result;//����� ���� ����
			int[] go = { 10, 100, 500 };//�������� ������ �Ǹ��� �ٸ��� �ϱ����� �迭������
			int index = 0;//����ǬȽ��
			int mySum, yourSum;//�������� ���� ������� ���� ����

			public TestPanel() {
				this.setSize(100, 50);
				this.setBackground(Color.ORANGE);
				reset();
				this.addKeyListener(this);
			}

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {//enter key�� �ƽ�Ű �ڵ� 10
					result = this.getText();
					System.out.println(result);
					loop: for (int i = 0; i < result.length(); i++) {
						if (result.substring(i, i + 1).equals("=")) {//���� = �ڿ� �־ ã�� �޼ҵ�
							String value = result.substring(i + 1);
							// ���� ��ſ� ���ڿ��� �� ��� �������ȳ��� ���ӳ��ع�����
							for (int j = 0; j < value.length(); j++) { // - ��ȣ�� ���ڷ� �ν� ���ؼ� ������ �߰���
								if (Character.isDigit(value.charAt(j)) == false && value.charAt(j) != '-') {
									t.fire = true;
									break loop;//��ü �ݺ��� ����
								}
							}
							yourSum = Integer.parseInt(value);
							break;
						}
					}
					if (yourSum == mySum) {//���� ������ check�� true�� ����
						check = true;

					} else {
						fire = true;
					}
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			public void reset() {//3������ ������ ��ȣ�� �ٲٰ� 1�������� �������� ������ �ٲ�
				Random ra = new Random();
				int x = ra.nextInt(go[index % 3]);
				int y = ra.nextInt(10);

				switch (index / 3) {
				case 0:
					mySum = x + y;
					this.setText(x + "+" + y + "=");
					break;
				case 1:
					mySum = x - y;
					this.setText(x + "-" + y + "=");
					break;
				case 2:
					mySum = x * y;
					this.setText(x + "*" + y + "=");
					break;
				default:
					this.setText("�����մϴ�");
				}

				index++;

			}
		}
	}


	public static void main(String[] args) {
		Game ko = new Game();

	}

}

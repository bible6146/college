import java.awt.Color;
import java.awt.Graphics;
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
	int gameIndex = 0;
	ArrayList<ImgPanel> gameList = new ArrayList<ImgPanel>();
	JButton b1;

	public Game() {
		this.setLayout(null);
		this.setSize(672, 392);
		gameList.add(new ImgPanel());
		gameList.get(0).setBounds(0, 0, 672, 392);
		b1 = new JButton("rerere");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
		int x, y = 250;
		int index = 0, sIndex = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		public ImgPanel() {
			this.setLayout(null);
			t.setBounds(200, 30, 160, 50);
			this.add(t);
			playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\1zno.GIF");
			backgroundImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\bb1.GIF");
			fireddong=toolkit.getImage("C:\\Users\\jungse\\Downloads\\fire2.GIF");
			fireddong=fireddong.getScaledInstance(60, 60, Image.SCALE_FAST);
			timer = new Timer(100, this);
			timer.start();

		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImg, 0, 0, this);
			g.drawImage(playerImg, x, y, this);
			if (t.check == true) {
				g.drawImage(fireddong,list.get(sIndex - 1).x,list.get(sIndex - 1).y,this);
			}
			if (!t.fire) {
				for (DDong s : list) {
					g.drawImage(s.ddong, s.x, s.y, this);
				}
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (index % 45 == 0 && !t.fire) {
				list.add(new DDong());
				sIndex++;
				if (index != 0 && !t.check) {
					t.result="time out";
					t.fire = true;
				} 
				t.reset();
				t.check = false;
			}
			if (t.check == true) {
				list.get(sIndex - 1).ddong = null;
			}
			for (DDong s : list) {
				if(s.ddong!=null)s.x = s.x - 10;
			}
			if (t.fire&&sIndex!=9) {
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (1).PNG");
				x = 150;
				y = 0;
				JTextArea finish = new JTextArea(
						  "\nyour answer : \n" + t.result + "\n sorry,,but \nanswer: " + t.mySum);
				finish.setBounds(480, 30, 150, 100);
				this.add(finish);
				end();
				}
			if(sIndex==9) {
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (2).PNG");
				x = 100;
				y = 0;
				end();
				t.fire=true;
			}
			index++;
			repaint();

		}
		public void end() {
			this.remove(t);
			b1.setBounds(530, 5, 100, 20);
			gameList.get(gameIndex).add(b1);
		}

		class DDong {
			int x = 500, y = 260;
			Image ddong;

			public DDong() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				ddong = toolkit.getImage("C:\\Users\\jungse\\Downloads\\pngegg.PNG");
				ddong = ddong.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			}
		}

		class TestPanel extends JTextField implements KeyListener {
			boolean check = false;
			boolean fire = false;
			String result;
			int[] go = { 10, 100, 500 };
			int index = 0;
			int mySum, yourSum;

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
			public void keyPressed(KeyEvent e) {//얼탱이 없다 그냥 텍스트 필드 2개만들껄
				if (e.getKeyCode() == 10) {
					result = this.getText();
					System.out.println(result);
					loop: for (int i = 0; i < result.length(); i++) {
						if (result.substring(i, i + 1).equals("=")) {
							System.out.println(result.substring(i + 1));
							String value = result.substring(i + 1);
							// 숫자 대신에 문자열이 들어간 경우 오류가안나게 게임끝해버리기
							for (int j = 0; j < value.length(); j++) { // -부호를 숫자로 인식 못해서 조건을 추가함
								if (Character.isDigit(value.charAt(j)) == false && value.charAt(j) != '-') {
									t.fire = true;
									break loop;
								}
							}
							yourSum = Integer.parseInt(value);
							break;
						}
					}
					System.out.println(yourSum);
					System.out.println(mySum);
					if (yourSum == mySum) {
						check = true;
						System.out.println("정답");
						// reset();

					} else {
						fire = true;
					}
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			public void reset() {
				Random ra = new Random();
				int x = ra.nextInt(go[index % 3]);//go[index % 3]
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
					this.setText("축하합니다");
				}

				index++;

			}
		}
	}


	public static void main(String[] args) {
		Game ko = new Game();

	}

}

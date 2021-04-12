package let;

import java.awt.Color;
import java.awt.Graphics;//텍스트 필드 하나만 갖다붙여놓고 필드 클래스에서 스트링값만 변경시켜보자
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
	int gameIndex = 0;//restart 마다 값이 바뀜
	ArrayList<ImgPanel> gameList = new ArrayList<ImgPanel>();//게임을 다시시작하면 이미지 패널이 겹쳐서 배열로 만들고 덧씌움
	JButton b1;

	public Game() {
		this.setLayout(null);
		this.setSize(672, 392);
		gameList.add(new ImgPanel());
		gameList.get(0).setBounds(0, 0, 672, 392);
		b1 = new JButton("reStart");
		b1.addActionListener(new ActionListener() {//버튼을 무명 배열로 만들고
			@Override
			public void actionPerformed(ActionEvent e) {//새로운 패널 객체 리스트의 추가후 기존패널 버튼지움
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
		int x, y = 250;//플레이어 좌표
		int index = 0, sIndex = 0;//액션 발생수, 똥객체 발생수
		Toolkit toolkit = Toolkit.getDefaultToolkit();//이미지 입력후 편의를위해 도구상자 사용

		public ImgPanel() {
			this.setLayout(null);
			t.setBounds(200, 30, 160, 50);
			this.add(t);
			playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\1zno.GIF");
			backgroundImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\bb1.GIF");
			fireddong=toolkit.getImage("C:\\Users\\jungse\\Downloads\\fire2.GIF");
			fireddong=fireddong.getScaledInstance(60, 60, Image.SCALE_FAST);
			timer = new Timer(100, this);//타이머 이벤트로 0.01초마다 액션 발생
			timer.start();

		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImg, 0, 0, this);
			g.drawImage(playerImg, x, y, this);
			if (t.check == true) {//문제를 풀었으면 그 똥 자리에 불이미지 출력 좌표 움직이지 않게함
				g.drawImage(fireddong,list.get(sIndex - 1).x,list.get(sIndex - 1).y,this);
			}
			if (!t.fire) {//게임이 안끝났음면 이미지 출력
				for (DDong s : list) {
					g.drawImage(s.ddong, s.x, s.y, this);
				}
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (index % 45 == 0 && !t.fire) {//타이머 객체의 액션이 45번 될때마다 게임이 지지않았으면 객체생성후 배열추가
				list.add(new DDong());
				sIndex++;
				if (index != 0 && !t.check) {//객체가 생성되었는데 텍스트필드값에 입력이 안되면 time out
					t.result="time out";
					t.fire = true;
				} 
				t.reset();//텍스트필드 리셋후 정답 체크 변수도 리셋
				t.check = false;
			}
			if (t.check == true) {//만약 정답을 맞췄으면 똥클래스에 이미지 안보이게함
				list.get(sIndex - 1).ddong = null;
			}
			for (DDong s : list) {//똥의 배열의 좌표를 움직임
				if(s.ddong!=null)s.x = s.x - 10;
			}
			if (t.fire&&sIndex!=9) {//게임패배후 새로운 이미지 추가후 정답 해설
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (1).PNG");
				x = 150;
				y = 0;
				JTextArea finish = new JTextArea(
						  "\nyour answer : \n" + t.result + "\n sorry,,but \nanswer: " + t.mySum);
				finish.setBounds(480, 30, 150, 100);
				this.add(finish);
				end();
				}
			if(sIndex==9) {//게임승리시 이미지 출력
				playerImg = toolkit.getImage("C:\\Users\\jungse\\Downloads\\PixelArt (2).PNG");
				x = 100;
				y = 0;
				end();
				t.fire=true;
			}
			index++;
			repaint();

		}
		public void end() {//이기든 지든 끝날때마다 텍스트필드 사용금지후 버튼 추가
			this.remove(t);
			b1.setBounds(530, 5, 100, 20);
			gameList.get(gameIndex).add(b1);
		}

		class DDong {//이미지 파일마다 좌표변경을 위해서 클래스를 만듬
			int x = 500, y = 260;
			Image ddong;

			public DDong() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				ddong = toolkit.getImage("C:\\Users\\jungse\\Downloads\\pngegg.PNG");
				ddong = ddong.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			}
		}

		class TestPanel extends JTextField implements KeyListener {//문제가 나오는 패널
			boolean check = false;//정답 확인 변수
			boolean fire = false;//게임 끝 확인 변수
			String result;//결과값 임의 저장
			int[] go = { 10, 100, 500 };//랜덤값의 범위를 판마다 다르게 하기위해 배열을만듬
			int index = 0;//문제푼횟수
			int mySum, yourSum;//랜덤값의 정답 사용자의 정답 저장

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
				if (e.getKeyCode() == 10) {//enter key의 아스키 코드 10
					result = this.getText();
					System.out.println(result);
					loop: for (int i = 0; i < result.length(); i++) {
						if (result.substring(i, i + 1).equals("=")) {//답이 = 뒤에 있어서 찾는 메소드
							String value = result.substring(i + 1);
							// 숫자 대신에 문자열이 들어간 경우 오류가안나게 게임끝해버리기
							for (int j = 0; j < value.length(); j++) { // - 부호를 숫자로 인식 못해서 조건을 추가함
								if (Character.isDigit(value.charAt(j)) == false && value.charAt(j) != '-') {
									t.fire = true;
									break loop;//전체 반복문 종료
								}
							}
							yourSum = Integer.parseInt(value);
							break;
						}
					}
					if (yourSum == mySum) {//답이 같으면 check값 true로 변경
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

			public void reset() {//3문제당 계산식의 부호를 바꾸고 1문제마다 랜덤값의 범위를 바꿈
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

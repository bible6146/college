package honja;
import javax.swing.*;;
public class CarGame extends JFrame {
	public CarGame() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		CarGame car=new CarGame();

	}

}

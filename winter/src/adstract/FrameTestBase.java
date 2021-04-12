package adstract;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class BgPanel extends JPanel {
    Image bg = new ImageIcon("./image/OIP.jfif").getImage();
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}

class LoginPanel extends JPanel {
    LoginPanel() {
        setOpaque(false);
        setLayout(new FlowLayout());
        add(new JLabel("username: ")); add(new JTextField(10));
        add(new JLabel("password: ")); add(new JPasswordField(10));
    }
}

public class FrameTestBase extends JFrame {
    public static void main(String args[]) {
        JPanel bgPanel = new BgPanel();
        bgPanel.setLayout(new BorderLayout());
        bgPanel.add(new LoginPanel(), BorderLayout.CENTER);

        FrameTestBase t = new FrameTestBase();
        t.setContentPane(bgPanel);
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setSize(250, 100);
        t.setVisible(true);
    }
}




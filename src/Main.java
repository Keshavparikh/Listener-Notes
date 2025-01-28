//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(400,400);
        JPanel myPanel= new JPanel();
        JButton myButton = new JButton("push me");
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi");
                    myPanel.setBackground(new Color(((int) Math.random() * 255 + 1), (int) (Math.random() * 255 + 1), (int) (Math.random() * 255 + 1)));
            }
        });

        JLabel label = new JLabel("");


        JTextField textField = new JTextField(10);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                //System.out.println(text);
                label.setText("Hi "+text);
            }
        });

        myPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("("+e.getX()+","+e.getY()+")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        myPanel.add(textField);
        myPanel.add(myButton);
        myPanel.add(label);
        myFrame.add(myPanel);
        myFrame.setVisible(true);


    }
}*/
// First Change
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);


        Arena panel = new Arena();
        Arena panel1 = new Arena();
        //panel.setBackground(new Color(30,30,120));
//        panel.setBackground(Color.BLUE);


        frame.add(panel);
        //frame.add(panel);


        frame.setVisible(true);


    }
}

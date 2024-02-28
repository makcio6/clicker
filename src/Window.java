import javax.swing.*;
import java.awt.*;

public class Window {

    int clicks = 0;
    int bought = 0;
    JLabel blabel = new JLabel();
    JLabel label = new JLabel("Нажато - " + clicks);
    JFrame f = new JFrame("Окно");

    public void mainButton () {

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);

        JButton click = new JButton("Нажми");
        click.setBounds(100, 50, 100, 50);
        f.add(click);
        click.addActionListener(e -> {
            clicks ++;
            label.setText("Нажато - " + clicks);
            f.add(label, BorderLayout.NORTH);
            label.setBounds(120,1,200,50);
        });

        JButton buy = new JButton("Купить");
        buy.setBounds(200,50,100,50);
        f.add(buy);
        buy.addActionListener(e -> {
            if (clicks >= 10){
                clicks = clicks - 10;
                bought ++;
            }

            blabel.setText("Куплено - " + bought);
            f.add(blabel, BorderLayout.NORTH);
            blabel.setBounds(220,1,200,50);
        });

        f.setLayout(null);
        f.setVisible(true);
    }

}
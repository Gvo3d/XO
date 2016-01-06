import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Gvozd on 06.01.2016.
 */
public class Window extends JFrame {
    JButton[][] buttons;
    JButton a1, a2, a3, b1, b2, b3, c1, c2, c3;

    public Window() {
        super("Krestiki-Noliki");
        Random rand= new Random();

        buttons = new JButton[3][3];


        a1 = new JButton("");
        a2 = new JButton("");
        a3 = new JButton("");
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        c1 = new JButton("");
        c2 = new JButton("");
        c3 = new JButton("");

        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a1.getText() == "") {
                    a1.setText("X");
                    a1.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a2.getText() == "") {
                    a2.setText("X");
                    a2.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a3.getText() == "") {
                    a3.setText("X");
                    a3.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.getText() == "") {
                    b1.setText("X");
                    b1.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText() == "") {
                    b2.setText("X");
                    b2.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b3.getText() == "") {
                    b3.setText("X");
                    b3.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });


        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c1.getText() == "") {
                    c1.setText("X");
                    c1.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c2.getText() == "") {
                    c2.setText("X");
                    c2.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c3.getText() == "") {
                    c3.setText("X");
                    c3.setBackground(Color.decode("green"));
                    actionEnded();
                }
            }
        });

        boolean gamestart=rand.nextBoolean();
        if (!gamestart) actionEnded();
    }

    private void actionEnded() {
        Random enemy = new Random();
        int i,j;
        i=enemy.nextInt(3);
        j=enemy.nextInt(3);

        switch (i){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default: break;
        }

    }
}
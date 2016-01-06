import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Gvozd on 06.01.2016.
 */
public class Window extends JFrame {
    JButton a1, a2, a3, b1, b2, b3, c1, c2, c3;

    public Window() {
        super("Krestiki-Noliki");
        Random rand= new Random();

        a1 = new JButton("");
        a2 = new JButton("");
        a3 = new JButton("");
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        c1 = new JButton("");
        c2 = new JButton("");
        c3 = new JButton("");

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        add(buttonsPanel, BorderLayout.SOUTH);

        buttonsPanel.add(a1);
        buttonsPanel.add(a2);
        buttonsPanel.add(a3);

        buttonsPanel.add(b1);
        buttonsPanel.add(b2);
        buttonsPanel.add(b3);

        buttonsPanel.add(c1);
        buttonsPanel.add(c2);
        buttonsPanel.add(c3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a1.getText() == "") {
                    a1.setText("X");
                    a1.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a2.getText() == "") {
                    a2.setText("X");
                    a2.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a3.getText() == "") {
                    a3.setText("X");
                    a3.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.getText() == "") {
                    b1.setText("X");
                    b1.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText() == "") {
                    b2.setText("X");
                    b2.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b3.getText() == "") {
                    b3.setText("X");
                    b3.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });


        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c1.getText() == "") {
                    c1.setText("X");
                    c1.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c2.getText() == "") {
                    c2.setText("X");
                    c2.setBackground(new Color(21, 128, 8));
                    actionEnded();
                }
            }
        });

        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (c3.getText() == "") {
                    c3.setText("X");
                    c3.setBackground(new Color(21, 128, 8));
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

                switch (j){
                    case 0: if (a1.getText()==""){
                        a1.setText("O");
                        a1.setBackground((new Color(194, 20, 8)));
                    } else {
                        actionEnded();
                    }
                        break;
                    case 1: if (a2.getText()==""){
                        a2.setText("O");
                        a2.setBackground((new Color(194, 20, 8)));
                    } else {
                        actionEnded();
                    }
                        break;
                    case 2:if (a3.getText()==""){
                        a3.setText("O");
                        a3.setBackground((new Color(194, 20, 8)));
                    } else {
                        actionEnded();
                    }
                        break;
                    default: break;
                }

                break;
            case 1: switch (j){
                case 0: if (b1.getText()==""){
                    b1.setText("O");
                    b1.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                case 1: if (b2.getText()==""){
                    b2.setText("O");
                    b2.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                case 2:if (b3.getText()==""){
                    b3.setText("O");
                    b3.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                default: break;
            }
                break;
            case 2: switch (j){
                case 0: if (c1.getText()==""){
                    c1.setText("O");
                    c1.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                case 1: if (c2.getText()==""){
                    c2.setText("O");
                    c2.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                case 2:if (c3.getText()==""){
                    c3.setText("O");
                    c3.setBackground((new Color(194, 20, 8)));
                } else {
                    actionEnded();
                }
                    break;
                default: break;
            }
                break;
            default: break;
        }
    playerAction();
    }

    private void playerAction() {
        if ((a1.getText()!="")&&(a2.getText()!="")&&(a3.getText()!="")&&(b1.getText()!="")&&(b2.getText()!="")&&(b3.getText()!="")&&(c1.getText()!="")&&(c2.getText()!="")&&(c3.getText()!="")) {
            System.exit(0);
        }
    }
}
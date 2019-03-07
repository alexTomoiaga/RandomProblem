import java.awt.*;
import javax.swing.*;

class MyPanel extends JFrame {


    JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3;
    JButton b1;
    JTextArea ta;

    public MyPanel(String nume)
    {
        setTitle(nume);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 720);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();

        l1 = new JLabel("Min");
        l2 = new JLabel("Max");
        l3 = new JLabel("Numar Probleme");
        l4 = new JLabel("Rezultat:");

        tf1 = new JTextField("0");
        tf2 = new JTextField("800");
        tf3 = new JTextField("25");
        ta = new JTextArea(20, 15);

        tf1.setColumns(7);
        tf2.setColumns(7);
        tf3.setColumns(7);

        JScrollPane scroll = new JScrollPane ( ta );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

        panel1.add(l1);
        panel1.add(tf1);
        panel1.setLayout(new FlowLayout());
        panel2.add(l2);
        panel2.add(tf2);
        panel2.setLayout(new FlowLayout());
        panel3.add(l3);
        panel3.add(tf3);
        panel3.setLayout(new FlowLayout());
        panel5.add(l4);
        panel5.setLayout(new FlowLayout());
        panel6.add(scroll);
        panel6.setLayout(new FlowLayout());

        b1 = new JButton("Calculeaza");

        panel4.add(b1);

        b1.addActionListener(new Butoane(tf1, tf2, ta, tf3));

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.add(panel4);
        p.add(panel5);
        p.add(panel6);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        setContentPane(p);
        setVisible(true);
    }

    public static void main(String args[]) {
        MyPanel frame = new MyPanel("Calculator polinoame");
    }

}
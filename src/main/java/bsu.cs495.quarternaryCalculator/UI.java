package bsu.cs495.quarternaryCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UI {
    public static void main(String[] args){
        Controller controller = new Controller();

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bsum = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bmul = new JButton("*");
        JButton bdiv = new JButton("/");
        JButton bsquare = new JButton("^");
        JButton broot = new JButton("\u221A");
        JButton bback = new JButton("<--");
        JButton bequals = new JButton("=");
        JLabel outputField = new JLabel();
        JLabel operationField = new JLabel();

        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton decimal = new JRadioButton("Decimal");
        JRadioButton quaternary = new JRadioButton("Quaternary");
        radioGroup.add(decimal);
        radioGroup.add(quaternary);

        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        b0.setBounds(42, 100, 50, 50);
        b1.setBounds(92, 100, 50, 50);
        b2.setBounds(142,100,50,50);
        b3.setBounds(192, 100, 50, 50);
        bsum.setBounds(42,160,50,50);
        bsub.setBounds(92,160,50,50);
        bmul.setBounds(142,160,50,50);
        bdiv.setBounds(192,160,50,50);
        bsquare.setBounds(42,210,50,50);
        broot.setBounds(92,210,50,50);
        bback.setBounds(142,210,50,50);
        bequals.setBounds(192,210,50,50);
        outputField.setBounds(42,45, 200, 35);
        operationField.setBounds(42, 15, 200, 25);

        decimal.setBounds(50, 275, 100,20);
        quaternary.setBounds(50,300, 100,20);
        decimal.setSelected(true);

        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bsum);
        panel.add(bsub);
        panel.add(bmul);
        panel.add(bdiv);
        panel.add(bsquare);
        panel.add(broot);
        panel.add(bback);
        panel.add(bequals);
        panel.add(outputField);
        panel.add(operationField);

        panel.add(decimal);
        panel.add(quaternary);


        outputField.setText(controller.showInput());
        outputField.setHorizontalAlignment(SwingConstants.RIGHT);
        outputField.setFont(new Font("Serif", Font.PLAIN, 18));
        outputField.setBorder(blackBorder());

        operationField.setHorizontalAlignment(SwingConstants.LEFT);
        operationField.setFont(new Font("Sherif", Font.PLAIN, 12));
        operationField.setBorder(blackBorder());

    }

    static Border blackBorder() {
        return BorderFactory.createLineBorder(Color.BLACK);
    }
}

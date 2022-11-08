package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DashBoard extends JFrame {

    private JPanel contentPane;

    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    JComboBox c1,c2,c3,c4,c5,c6;
    JLabel qty1,qty2,qty3,qty4,qty5,qty6;
    JLabel price,price1,price2,price3,price4,price5,price6;
    String select;
    int total1,total2,total3,total4,total5,total6;
    JPanel panel;
    JButton b1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DashBoard frame = new DashBoard();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public DashBoard() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1128, 631);
        contentPane = new JPanel();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel TITLE = new JLabel("ROYAL CAFE");
        TITLE.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        TITLE.setForeground(Color.RED);
        TITLE.setBounds(497, 10, 185, 49);
        contentPane.add(TITLE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setBounds(25, 129, 190, 207);
        contentPane.add(panel1);
        panel1.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\burger resize.png"));
        lblNewLabel.setBounds(59, 10, 76, 70);
        panel1.add(lblNewLabel);

        JLabel l1 = new JLabel("Burger");
        l1.setFont(new Font("Verdana", Font.BOLD, 13));
        l1.setBounds(69, 82, 66, 17);
        panel1.add(l1);

        JLabel lblNewLabel_4_4 = new JLabel("100/-");
        lblNewLabel_4_4.setForeground(Color.RED);
        lblNewLabel_4_4.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_4.setBounds(69, 105, 66, 17);
        panel1.add(lblNewLabel_4_4);

        c1 = new JComboBox();
        c1.setToolTipText("QUANTITY");
        c1.addItem("1");
        c1.addItem("2");
        c1.addItem("3");
        c1.addItem("4");
        c1.addItem("5");
        c1.addItem("6");
        c1.addItem("7");
        c1.addItem("8");
        c1.addItem("9");
        c1.addItem("10");
        c1.addItem("11");


        c1.setBounds(69, 132, 40, 21);
        panel1.add(c1);

        cb1 = new JCheckBox("ORDER");
        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if(cb1.isSelected()) {
                    select =(String) c1.getSelectedItem();
                    total1 = Integer.parseInt(select)*100;
                    price1.setText(""+total1+"/-");
                    qty1.setText(select);

                }
                else {
                    price1.setText("0/-");
                }
            }
        });
        cb1.setBackground(Color.GREEN);
        cb1.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb1.setBounds(59, 180, 76, 21);
        panel1.add(cb1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(248, 129, 180, 207);
        contentPane.add(panel2);
        panel2.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\cold cofee resize.png"));
        lblNewLabel_1.setBounds(57, 14, 76, 70);
        panel2.add(lblNewLabel_1);

        JLabel l2 = new JLabel("Cold Coffee");
        l2.setFont(new Font("Verdana", Font.BOLD, 13));
        l2.setBounds(51, 89, 82, 13);
        panel2.add(l2);

        JLabel lblNewLabel_4_4_1 = new JLabel("40/-");
        lblNewLabel_4_4_1.setForeground(Color.RED);
        lblNewLabel_4_4_1.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_4_1.setBounds(67, 112, 66, 17);
        panel2.add(lblNewLabel_4_4_1);

        c2 = new JComboBox();
        c2.addItem("1");
        c2.addItem("2");
        c2.addItem("3");
        c2.addItem("4");
        c2.addItem("5");
        c2.addItem("6");
        c2.addItem("7");
        c2.addItem("8");
        c2.addItem("9");
        c2.addItem("10");
        c2.addItem("11");

        c2.setBounds(66, 137, 40, 21);
        panel2.add(c2);

        cb2 = new JCheckBox("ORDER");
        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb2.isSelected()) {
                    select =(String) c2.getSelectedItem();
                    total2 = Integer.parseInt(select)*40;
                    price2.setText(""+total2+"/-");
                    qty2.setText(select);
                }
                else {
                    price2.setText("0/-");
                }
            }
        });
        cb2.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb2.setBackground(Color.GREEN);
        cb2.setBounds(57, 180, 76, 21);
        panel2.add(cb2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(466, 129, 180, 207);
        contentPane.add(panel3);
        panel3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\veg roll resiz.png"));
        lblNewLabel_2.setBounds(58, 13, 76, 70);
        panel3.add(lblNewLabel_2);

        JLabel lblNewLabel_4_2 = new JLabel("Veg Roll");
        lblNewLabel_4_2.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_2.setBounds(68, 93, 66, 13);
        panel3.add(lblNewLabel_4_2);

        JLabel l3 = new JLabel("60/-");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Verdana", Font.BOLD, 13));
        l3.setBounds(68, 105, 66, 17);
        panel3.add(l3);

        c3 = new JComboBox();
        c3.addItem("1");
        c3.addItem("2");
        c3.addItem("3");
        c3.addItem("4");
        c3.addItem("5");
        c3.addItem("6");
        c3.addItem("7");
        c3.addItem("8");
        c3.addItem("9");
        c3.addItem("10");
        c3.addItem("11");

        c3.setBounds(78, 131, 40, 26);
        panel3.add(c3);

        cb3 = new JCheckBox("ORDER");
        cb3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb3.isSelected()) {
                    select =(String) c3.getSelectedItem();
                    total3 = Integer.parseInt(select)*60;
                    price3.setText(""+total3+"/-");
                    qty3.setText(select);
                }
                else {
                    price3.setText("0/-");
                }
            }
        });
        cb3.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb3.setBackground(Color.GREEN);
        cb3.setBounds(58, 180, 76, 21);
        panel3.add(cb3);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        panel4.setBounds(25, 365, 185, 202);
        contentPane.add(panel4);
        panel4.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\pizza resiz.png"));
        lblNewLabel_3.setBounds(56, 15, 76, 70);
        panel4.add(lblNewLabel_3);

        JLabel l4 = new JLabel("Pizza");
        l4.setFont(new Font("Verdana", Font.BOLD, 13));
        l4.setBounds(66, 90, 66, 13);
        panel4.add(l4);

        JLabel lblNewLabel_4_4_1_1_1 = new JLabel("100/-");
        lblNewLabel_4_4_1_1_1.setForeground(Color.RED);
        lblNewLabel_4_4_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_4_1_1_1.setBounds(66, 113, 66, 20);
        panel4.add(lblNewLabel_4_4_1_1_1);

        c4 = new JComboBox();
        c4.addItem("1");
        c4.addItem("2");
        c4.addItem("3");
        c4.addItem("4");
        c4.addItem("5");
        c4.addItem("6");
        c4.addItem("7");
        c4.addItem("8");
        c4.addItem("9");
        c4.addItem("10");
        c4.addItem("11");

        c4.setBounds(66, 144, 40, 25);
        panel4.add(c4);

        cb4 = new JCheckBox("ORDER");
        cb4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb4.isSelected()) {
                    select =(String) c4.getSelectedItem();
                    total4 = Integer.parseInt(select)*100;
                    price4.setText(""+total4+"/-");
                    qty4.setText(select);
                }
                else {
                    price4.setText("0/-");
                }
            }
        });
        cb4.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb4.setBackground(Color.GREEN);
        cb4.setBounds(56, 175, 76, 21);
        panel4.add(cb4);

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.WHITE);
        panel5.setBounds(248, 365, 180, 202);
        contentPane.add(panel5);
        panel5.setLayout(null);

        JLabel lblNewLabel_3_1 = new JLabel("");
        lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\sandwich resize.png"));
        lblNewLabel_3_1.setBounds(59, 15, 76, 70);
        panel5.add(lblNewLabel_3_1);

        JLabel l5 = new JLabel("Sandwich");
        l5.setFont(new Font("Verdana", Font.BOLD, 13));
        l5.setBounds(59, 91, 84, 13);
        panel5.add(l5);

        JLabel lblNewLabel_4_4_1_1_1_1 = new JLabel("60/-");
        lblNewLabel_4_4_1_1_1_1.setForeground(Color.RED);
        lblNewLabel_4_4_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_4_1_1_1_1.setBounds(69, 114, 66, 20);
        panel5.add(lblNewLabel_4_4_1_1_1_1);

        c5 = new JComboBox();
        c5.addItem("1");
        c5.addItem("2");
        c5.addItem("3");
        c5.addItem("4");
        c5.addItem("5");
        c5.addItem("6");
        c5.addItem("7");
        c5.addItem("8");
        c5.addItem("9");
        c5.addItem("10");
        c5.addItem("11");

        c5.setBounds(79, 144, 40, 25);
        panel5.add(c5);

        cb5 = new JCheckBox("ORDER");
        cb5.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb5.isSelected()) {
                    select =(String) c5.getSelectedItem();
                    total5 = Integer.parseInt(select)*60;
                    price5.setText(""+total5+"/-");
                    qty5.setText(select);
                }
                else {
                    price5.setText("0/-");
                }
            }
        });
        cb5.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb5.setBackground(Color.GREEN);
        cb5.setBounds(59, 175, 76, 21);
        panel5.add(cb5);

        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.WHITE);
        panel6.setBounds(466, 367, 180, 200);
        contentPane.add(panel6);

        panel6.setLayout(null);

        JLabel lblNewLabel_3_1_1 = new JLabel("");
        lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\Avishkar Kumbhar\\cafe management system\\src\\Images\\tea resize.png"));
        lblNewLabel_3_1_1.setBounds(54, 17, 76, 70);
        panel6.add(lblNewLabel_3_1_1);

        JLabel l6 = new JLabel("Tea");
        l6.setFont(new Font("Verdana", Font.BOLD, 13));
        l6.setBounds(64, 92, 66, 13);
        panel6.add(l6);

        JLabel lblNewLabel_4_4_1_1_1_2 = new JLabel("20/-");
        lblNewLabel_4_4_1_1_1_2.setForeground(Color.RED);
        lblNewLabel_4_4_1_1_1_2.setFont(new Font("Verdana", Font.BOLD, 13));
        lblNewLabel_4_4_1_1_1_2.setBounds(64, 115, 66, 20);
        panel6.add(lblNewLabel_4_4_1_1_1_2);

        c6 = new JComboBox();
        c6.addItem("1");
        c6.addItem("2");
        c6.addItem("3");
        c6.addItem("4");
        c6.addItem("5");
        c6.addItem("6");
        c6.addItem("7");
        c6.addItem("8");
        c6.addItem("9");
        c6.addItem("10");
        c6.addItem("11");

        c6.setBounds(74, 142, 40, 25);
        panel6.add(c6);

        cb6 = new JCheckBox("ORDER");
        cb6.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb6.isSelected()) {
                    select =(String) c6.getSelectedItem();
                    int total6 = Integer.parseInt(select)*20;
                    price6.setText(""+total6+"/-");
                    qty6.setText(select);
                }
                else {
                    price6.setText("0/-");
                }
            }
        });
        cb6.setFont(new Font("Tahoma", Font.BOLD, 13));
        cb6.setBackground(Color.GREEN);
        cb6.setBounds(54, 173, 76, 21);
        panel6.add(cb6);

        b1 = new JButton("RECIEPT");
        b1.setVisible(false);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                price.setText(""+(total1+total2+total3+total4+total5+total6)+"/-");
                panel.setVisible(true);
            }
        });
        b1.setBackground(Color.MAGENTA);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setBounds(238, 577, 128, 44);
        contentPane.add(b1);

        JButton btnExit = new JButton("EXIT");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null,"Are you want to close app?","Confirmation",JOptionPane.YES_NO_OPTION)==0){
                    DashBoard.this.dispose();
                }
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnExit.setBackground(Color.RED);
        btnExit.setBounds(1013, 10, 105, 36);
        contentPane.add(btnExit);

        panel = new JPanel();
        panel.setVisible(false);
        panel.setBackground(Color.WHITE);
        panel.setBounds(694, 108, 424, 479);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("====================================================");
        lblNewLabel_4.setFont(new Font("Vrinda", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_4.setBounds(12, 9, 404, 19);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_4_1 = new JLabel("====================================================");
        lblNewLabel_4_1.setFont(new Font("Vrinda", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_4_1.setBounds(10, 53, 404, 19);
        panel.add(lblNewLabel_4_1);

        JLabel lblNewLabel_4_1_1 = new JLabel("====================================================");
        lblNewLabel_4_1_1.setFont(new Font("Vrinda", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_4_1_1.setBounds(10, 381, 404, 19);
        panel.add(lblNewLabel_4_1_1);

        JLabel lblReciept = new JLabel("RECIEPT");
        lblReciept.setFont(new Font("Verdana", Font.BOLD, 15));
        lblReciept.setBounds(171, 30, 82, 21);
        panel.add(lblReciept);

        JLabel label1 = new JLabel("Burger");
        label1.setFont(new Font("Verdana", Font.BOLD, 13));
        label1.setBounds(20, 168, 118, 20);
        panel.add(label1);

        JLabel label2 = new JLabel("Cold Coffee");
        label2.setFont(new Font("Verdana", Font.BOLD, 13));
        label2.setBounds(21, 202, 124, 20);
        panel.add(label2);

        JLabel label3 = new JLabel("Veg Roll");
        label3.setFont(new Font("Verdana", Font.BOLD, 13));
        label3.setBounds(23, 242, 122, 20);
        panel.add(label3);

        JLabel label4 = new JLabel("Pizza");
        label4.setFont(new Font("Verdana", Font.BOLD, 13));
        label4.setBounds(22, 275, 122, 20);
        panel.add(label4);

        JLabel label5 = new JLabel("Sandwich");
        label5.setFont(new Font("Verdana", Font.BOLD, 13));
        label5.setBounds(24, 304, 115, 20);
        panel.add(label5);

        JLabel label6 = new JLabel("Tea");
        label6.setFont(new Font("Verdana", Font.BOLD, 13));
        label6.setBounds(23, 343, 118, 20);
        panel.add(label6);

        price1 = new JLabel("0/-");
        price1.setFont(new Font("Verdana", Font.BOLD, 13));
        price1.setBounds(289, 168, 133, 20);
        panel.add(price1);

        price2 = new JLabel("0/-");
        price2.setFont(new Font("Verdana", Font.BOLD, 13));
        price2.setBounds(289, 201, 133, 20);
        panel.add(price2);

        price3 = new JLabel("0/-");
        price3.setFont(new Font("Verdana", Font.BOLD, 13));
        price3.setBounds(289, 239, 133, 20);
        panel.add(price3);

        price4 = new JLabel("0/-");
        price4.setFont(new Font("Verdana", Font.BOLD, 13));
        price4.setBounds(289, 270, 133, 20);
        panel.add(price4);

        price5 = new JLabel("0/-");
        price5.setFont(new Font("Verdana", Font.BOLD, 13));
        price5.setBounds(289, 303, 133, 20);
        panel.add(price5);

        price6 = new JLabel("0/-");
        price6.setFont(new Font("Verdana", Font.BOLD, 13));
        price6.setBounds(289, 341, 133, 20);
        panel.add(price6);

        JLabel lblTotal = new JLabel("TOTAL");
        lblTotal.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTotal.setBounds(20, 399, 133, 20);
        panel.add(lblTotal);

        price = new JLabel("0/-");
        price.setFont(new Font("Verdana", Font.BOLD, 16));
        price.setBounds(289, 399, 133, 20);
        panel.add(price);

        JLabel lblItems = new JLabel("ITEMS");
        lblItems.setForeground(Color.RED);
        lblItems.setFont(new Font("Verdana", Font.BOLD, 16));
        lblItems.setBounds(22, 107, 133, 20);
        panel.add(lblItems);

        JLabel lblItems_1 = new JLabel("QTY");
        lblItems_1.setForeground(Color.RED);
        lblItems_1.setFont(new Font("Verdana", Font.BOLD, 16));
        lblItems_1.setBounds(163, 107, 105, 20);
        panel.add(lblItems_1);

        JLabel lblItems_1_1 = new JLabel("PRICE");
        lblItems_1_1.setForeground(Color.RED);
        lblItems_1_1.setFont(new Font("Verdana", Font.BOLD, 16));
        lblItems_1_1.setBounds(278, 107, 105, 20);
        panel.add(lblItems_1_1);

        qty1 = new JLabel("0");
        qty1.setFont(new Font("Verdana", Font.BOLD, 13));
        qty1.setBounds(174, 167, 85, 20);
        panel.add(qty1);

        qty2 = new JLabel("0");
        qty2.setFont(new Font("Verdana", Font.BOLD, 13));
        qty2.setBounds(174, 205, 85, 20);
        panel.add(qty2);

        qty3 = new JLabel("0");
        qty3.setFont(new Font("Verdana", Font.BOLD, 13));
        qty3.setBounds(174, 242, 85, 20);
        panel.add(qty3);

        qty4 = new JLabel("0");
        qty4.setFont(new Font("Verdana", Font.BOLD, 13));
        qty4.setBounds(174, 275, 85, 20);
        panel.add(qty4);

        qty5 = new JLabel("0");
        qty5.setFont(new Font("Verdana", Font.BOLD, 13));
        qty5.setBounds(174, 310, 85, 20);
        panel.add(qty5);

        qty6 = new JLabel("0");
        qty6.setFont(new Font("Verdana", Font.BOLD, 13));
        qty6.setBounds(174, 345, 85, 20);
        panel.add(qty6);

        JButton b1_1 = new JButton("ORDER ");
        b1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Ordered Successfull..");
                b1.setVisible(true);
                b1_1.setVisible(false);
            }
        });
        b1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1_1.setBackground(Color.GREEN);
        b1_1.setBounds(238, 581, 128, 36);
        contentPane.add(b1_1);
    }
}

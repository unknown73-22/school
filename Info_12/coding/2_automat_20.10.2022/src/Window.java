
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    public Window() {
        cntr = new Center();
        initialize();
    }

    private  Center cntr;

    JLabel label1 = new JLabel("insert new transition");
    JLabel label2 = new JLabel("initial condition");
    JLabel label3 = new JLabel("character");
    JLabel label4 = new JLabel("final condition");
    JLabel label5 = new JLabel("insert new final condition");
    JLabel label6 = new JLabel("test");
    JLabel label7 = new JLabel("final condition");
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JTextField textField5 = new JTextField();
    JButton button1 = new JButton("save");
    JButton button2 = new JButton("save");
    JButton button3 = new JButton("run");
    JButton button4 = new JButton("get transitions");
    JButton button5 = new JButton("get status");

    public void initialize() {
        JFrame window = new JFrame("create a maschine");
        window.setSize(800, 700);
        window.setLocation(90, 70);

        label1.setBounds(100, 20, 300, 30);
        window.add(label1);
        label2.setBounds(20, 100, 100, 30);
        window.add(label2);
        label3.setBounds(130, 100, 70, 30);
        window.add(label3);
        label4.setBounds(210, 100, 100, 30);
        window.add(label4);
        label5.setBounds(100, 140, 200, 30);
        window.add(label5);
        label6.setBounds(437, 140, 100, 30);
        window.add(label6);
        label7.setBounds(125, 220, 300, 30);
        window.add(label7);
        textField1.setBounds(50, 60, 50, 30);
        window.add(textField1);
        textField2.setBounds(130, 60, 50, 30);
        window.add(textField2);
        textField3.setBounds(210, 60, 50, 30);
        window.add(textField3);
        textField4.setBounds(140, 180, 50, 30);
        window.add(textField4);
        textField5.setBounds(425, 180, 50, 30);
        window.add(textField5);
        button1.setBounds(350, 60, 200, 30);
        window.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    cntr.button1Action();
                } catch (Exception exception) {
                    // TODO: handle exception

                }
            }
        });
        button2.setBounds(70, 260, 200, 30);
        window.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    cntr.button2Action();
                } catch (Exception exception) {
                    // TODO: handle exception

                }
            }
        });
        button3.setBounds(350, 220, 200, 30);
        window.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    cntr.button3Action();
                } catch (Exception exception) {
                    // TODO: handle exception

                }
            }
        });
        button4.setBounds(70, 350, 200, 30);
        window.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    cntr.button4Action();
                } catch (Exception exception) {
                    // TODO: handle exception

                }
            }
        });
        button5.setBounds(70, 400, 200, 30);
        window.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    cntr.button5Action();
                } catch (Exception exception) {
                    // TODO: handle exception

                }
            }
        });

        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setDefaultLookAndFeelDecorated(true);
        window.setVisible(true);
    }
}

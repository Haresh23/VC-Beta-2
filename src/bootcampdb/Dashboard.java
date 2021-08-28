package bootcampdb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

    private JPanel contentPane;
    private JPanel panel_1;


    public Dashboard(String email,String Desig) {
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 697, 484);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JPanel panel = new JPanel();
        panel.setBounds(-13, 0, 123, 460);
        panel.setBackground(Color.BLACK);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblsignout = new JLabel("");
        lblsignout.setIcon(new ImageIcon("C:\\Users\\HARESHVAR A R\\Downloads\\icons8-sign-out-48.png"));
        lblsignout.setBounds(49, 233, 45, 66);
        panel.add(lblsignout);
        lblsignout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(lblsignout,"Successfully Logged Out!!!");
                Login l=new Login();
                l.setVisible(true);
                l.setLocationRelativeTo(null);
                dispose();

            }
        });

        JLabel lblprofile = new JLabel("");
        lblprofile.setIcon(new ImageIcon("C:\\Users\\HARESHVAR A R\\Downloads\\icons8-male-user-64.png"));
        lblprofile.setBounds(38, 130, 58, 57);
        panel.add(lblprofile);
        lblprofile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                profile p=new profile(email,Desig);
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                dispose();

            }
        });


        JLabel lblopt = new JLabel("");
        lblopt.setBounds(618, 387, 102, 50);
        lblopt.setIcon(new ImageIcon("C:\\Users\\HARESHVAR A R\\Downloads\\icons8-plus-+-50.png"));
        contentPane.add(lblopt);

        //panel_1details("Onnum ila");


        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBackground(Color.BLACK);
        panel_1_1.setBounds(404, 134, 258, 172);
        panel_1_1.setVisible(false);
        contentPane.add(panel_1_1);

        lblopt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Desig.equals("Student")){
                    joinclass jc=new joinclass();
                    jc.setVisible(true);
                    jc.setLocationRelativeTo(null);
                }
                else{
                    createclass cc=new createclass(email,Desig);
                    cc.setVisible(true);
                    cc.setLocationRelativeTo(null);
                    dispose();
                }
            }
        });
        //panel_1details("*******");


    }
    public JPanel panel_1details(String cname){
        System.out.println(cname);
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(118, 134, 258, 172);
        panel_1.setVisible(true);
        contentPane.add(panel_1);
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setForeground(new Color(245, 255, 250));
        lblNewLabel.setBounds(41, 31, 169, 28);
        panel_1.add(lblNewLabel);

        lblNewLabel.setText(cname);

        return panel_1;

    }
}

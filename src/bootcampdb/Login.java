package  bootcampdb;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField jtf_loginemail;
    private JPasswordField jpf_loginpassword;
    private ButtonGroup bg= new ButtonGroup();
    private JRadioButton rbtnLStudent;
    private JRadioButton rbtnLTeacher;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
                    Login frame = new Login();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);

    }

    /**
     * Create the frame.
     */
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 865, 630);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 383, 602);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access camera and Microphone/imgs/WELCOME.png"));
        lblNewLabel.setBounds(0, 0, 383, 602);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(384, 0, 481, 602);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("VIRTUAL CLASSROOM");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(6, 52, 469, 41);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access camera and Microphone/imgs/icons8-email-60.png"));
        lblNewLabel_2.setBounds(26, 127, 60, 60);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Enter your E-Mail");
        lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(98, 127, 245, 60);
        panel_1.add(lblNewLabel_3);

        jtf_loginemail = new JTextField();
        jtf_loginemail.setBounds(98, 180, 245, 41);
        panel_1.add(jtf_loginemail);
        jtf_loginemail.setColumns(10);

        JLabel lblNewLabel_2_1 = new JLabel("");
        lblNewLabel_2_1.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access camera and Microphone/imgs/icons8-password-60.png"));
        lblNewLabel_2_1.setBounds(26, 253, 60, 60);
        panel_1.add(lblNewLabel_2_1);

        JLabel lblNewLabel_3_1 = new JLabel("Enter your Password");
        lblNewLabel_3_1.setForeground(Color.WHITE);
        lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        lblNewLabel_3_1.setBounds(98, 253, 245, 60);
        panel_1.add(lblNewLabel_3_1);

        JButton btn_LSignin = new JButton("Sign In");
        btn_LSignin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jtf_loginemail.getText().equals("") || jpf_loginpassword.getText().equals("") ) {
                    JOptionPane.showMessageDialog(jpf_loginpassword, "PLEASE ENTER USERNAME OR PASSWORD");
                }
                else if(rbtnLStudent.isSelected()==false && rbtnLTeacher.isSelected()==false){
                    // jRadioButton1.setBorder(BorderFactory.createLineBorder(Color.red));
                    //r2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(rbtnLStudent,"Invalid Designation");
                }
                else{
                    String Desig,userName,password;
                    userName=jtf_loginemail.getText();
                    password=jpf_loginpassword.getText();
                    if(rbtnLStudent.isSelected()==true){
                        Desig="Student";
                    }
                    else{
                        Desig="Teacher";
                    }
                    boolean log=false;
                    try {
                        log=new dbFunction(Desig).loginVerify(userName,password,Desig);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    if(log){
                        if(Desig.equals("Student")){
                            Dashboard d1=new Dashboard(jtf_loginemail.getText(),Desig);
                            d1.setVisible(true);
                            d1.setLocationRelativeTo(null);
                            dispose();
                        }
                        else{
                            Dashboard d1=new Dashboard(jtf_loginemail.getText(),Desig);
                            d1.setVisible(true);
                            d1.setLocationRelativeTo(null);
                            dispose();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(btn_LSignin,"INVALID DETAILS");
                    }
                }


            }
        });
        btn_LSignin.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access camera and Microphone/imgs/icons8-login-30.png"));
        btn_LSignin.setBackground(Color.WHITE);
        btn_LSignin.setForeground(Color.BLACK);
        btn_LSignin.setBounds(271, 421, 117, 41);
        panel_1.add(btn_LSignin);

        JLabel lblNewLabel_4 = new JLabel("Don't have an account? ");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setBackground(Color.WHITE);
        lblNewLabel_4.setBounds(98, 505, 149, 16);
        panel_1.add(lblNewLabel_4);

        JButton btnRegister = new JButton("Register");
        btnRegister.setIcon(new ImageIcon("/Users/harishsivaram/eclipse-workspace/Virtual Classroom Dev V2/src/Images/icons8-add-user-male-30.png"));
        btnRegister.setForeground(Color.BLACK);
        btnRegister.setBackground(Color.WHITE);
        btnRegister.setBounds(271, 489, 117, 41);
        panel_1.add(btnRegister);

        jpf_loginpassword = new JPasswordField();
        jpf_loginpassword.setBounds(98, 307, 245, 41);
        panel_1.add(jpf_loginpassword);

        JLabel lblNewLabel_3_2 = new JLabel("Select your Role");
        lblNewLabel_3_2.setForeground(Color.WHITE);
        lblNewLabel_3_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        lblNewLabel_3_2.setBounds(98, 360, 245, 60);
        panel_1.add(lblNewLabel_3_2);

        rbtnLStudent = new JRadioButton("Student");
        rbtnLStudent.setForeground(Color.BLACK);
        rbtnLStudent.setBounds(98, 411, 141, 23);
        panel_1.add(rbtnLStudent);

        rbtnLTeacher = new JRadioButton("Teacher");
        rbtnLTeacher.setForeground(Color.BLACK);
        rbtnLTeacher.setBounds(98, 446, 141, 23);
        panel_1.add(rbtnLTeacher);

        bg.add(rbtnLStudent);
        bg.add(rbtnLTeacher);


        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Registration  rg = new Registration();
                rg.setVisible(true);
                rg.setLocationRelativeTo(null);
                dispose();

            }
        });
    }
}

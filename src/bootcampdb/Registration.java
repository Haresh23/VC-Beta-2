package bootcampdb;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Registration extends JFrame {

    private JPanel contentPane;
    private JTextField jtf_email;
    private JPasswordField jpf_password;
    private JPasswordField jpf_cpassword;
    private JTextField jtf_name;
    private JTextField jtf_regno;
    private JTextField jtf_phoneno;
    private JRadioButton rbtnTeacher;
    private JRadioButton rbtnStudent;
    private ButtonGroup bg= new ButtonGroup();

    /**
     * Launch the application.
     * @return
     */
    public static Registration regForm() {
        Registration frame = new Registration();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        return frame;

    }

    /**
     * Create the frame.
     */
    public Registration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 629, 975);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(6, 6, 617, 86);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-add-user-group-woman-man-74.png"));
        lblNewLabel.setBounds(6, 6, 74, 74);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("REGISTER HERE");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(139, 6, 330, 74);
        panel.add(lblNewLabel_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(6, 104, 617, 684);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Fill your Details");
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(6, 6, 605, 43);
        panel_1.add(lblNewLabel_2);

        JLabel L_email = new JLabel("  Enter your E-Mail ");
        L_email.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-email-32.png"));
        L_email.setBounds(50, 84, 185, 32);
        panel_1.add(L_email);

        jtf_email = new JTextField();
        jtf_email.setBounds(385, 87, 185, 29);
        panel_1.add(jtf_email);
        jtf_email.setColumns(10);

        JLabel L_password = new JLabel("  Enter your Password");
        L_password.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-password-32.png"));
        L_password.setBounds(50, 128, 185, 32);
        panel_1.add(L_password);

        jpf_password = new JPasswordField();
        jpf_password.setBounds(385, 131, 185, 29);
        panel_1.add(jpf_password);

        JLabel L_cpassword = new JLabel("  Confirm your Password");
        L_cpassword.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-password-32.png"));
        L_cpassword.setBounds(50, 172, 200, 32);
        panel_1.add(L_cpassword);

        jpf_cpassword = new JPasswordField();
        jpf_cpassword.setBounds(385, 175, 185, 29);
        panel_1.add(jpf_cpassword);

        JLabel l_enterName = new JLabel("  Enter your Name");
        l_enterName.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-user-32.png"));
        l_enterName.setBounds(50, 216, 185, 32);
        panel_1.add(l_enterName);

        jtf_name = new JTextField();
        jtf_name.setColumns(10);
        jtf_name.setBounds(385, 219, 185, 29);
        panel_1.add(jtf_name);

        JLabel l_dob = new JLabel("  Date of Birth");
        l_dob.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-age-32.png"));
        l_dob.setBounds(50, 260, 185, 32);
        panel_1.add(l_dob);
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl date = new JDatePickerImpl(datePanel, new Udate());
        date.setBounds(385,264,185,32);
        date.setVisible(true);
        panel_1.add(date);

        JLabel L_regno = new JLabel("  Enter your Reg No");
        L_regno.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-id-card-32.png"));
        L_regno.setBounds(50, 304, 185, 32);
        panel_1.add(L_regno);

        jtf_regno = new JTextField();
        jtf_regno.setColumns(10);
        jtf_regno.setBounds(385, 307, 185, 29);
        panel_1.add(jtf_regno);

        JLabel L_phoneno = new JLabel("  Enter your Phone No");
        L_phoneno.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-iphone-32.png"));
        L_phoneno.setBounds(50, 348, 185, 32);
        panel_1.add(L_phoneno);

        jtf_phoneno = new JTextField();
        jtf_phoneno.setColumns(10);
        jtf_phoneno.setBounds(385, 351, 185, 29);
        panel_1.add(jtf_phoneno);

        JLabel L_Department = new JLabel("  Select your Department");
        L_Department.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-department-32.png"));
        L_Department.setBounds(50, 392, 200, 32);
        panel_1.add(L_Department);

        JComboBox jcb_department = new JComboBox();
        jcb_department.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "IT ", "MECH", "CSBS", "M.TECH"}));
        jcb_department.setBounds(385, 396, 185, 27);
        panel_1.add(jcb_department);

        JLabel L_Year = new JLabel("  Select your Year");
        L_Year.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-new-year-calendar-32.png"));
        L_Year.setBounds(50, 436, 200, 32);
        panel_1.add(L_Year);

        JComboBox jcb_year = new JComboBox();
        jcb_year.setModel(new DefaultComboBoxModel(new String[] {"Select", "I Year", "II Year", "III Year", "IV Year"}));
        jcb_year.setBounds(385, 440, 117, 27);
        panel_1.add(jcb_year);
        //Registration Validation

        JButton btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String Department=(String)jcb_department.getSelectedItem();
                String Year=(String)jcb_year.getSelectedItem();
                String dob=date.getJFormattedTextField().getText().toString();

                String Desig="";
                if(rbtnStudent.isSelected()==true){
                    Desig="Student";
                }
                if(rbtnTeacher.isSelected()==true){
                    Desig="Teacher";
                }
                System.out.println(Desig);

                if(!new emailvaidation().validator(jtf_email.getText())){
                    // jTextField1.getText().equals("")


                    JOptionPane.showMessageDialog(jtf_email, "Invalid Email");

                    //t_namme.setForeground(Color.red);
                    //t_namme.setBorder(BorderFactory.createLineBorder(Color.red));
                    //JOptionPane.showMessageDialog(t_namme,"Invalid name");
                }

                else if(!new passvalidation().validator(jpf_password.getText())){
                    //jTextField2.setForeground(Color.red);
                    //t_phone.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jpf_password,"Please enter a Password");
                }
                else if(!new passvalidation().validator(jpf_cpassword.getText())){
                    //jTextField5.setForeground(Color.red);
                    //t_pass.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jpf_cpassword,"Invalid password ");
                }

                else if(!new validation().validator(jtf_name.getText())){
                    JOptionPane.showMessageDialog(jtf_name,"Please enter your name ");
                }

                else if(dob.equals("")){
                    JOptionPane.showMessageDialog(date,"Enter date");

                }
                else if(!new dobvalidation().validator(dob)){
                    JOptionPane.showMessageDialog(date,"Invalid Date");
                }

                else if(!new idvalidation().idvalidator(jtf_regno.getText())){
                    //                 jtf_regno.setForeground(Color.RED);
                    // jTextField3.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jtf_regno,"Invalid Reg.no");
                }

                else if(!new phonevalidation().validator(jtf_phoneno.getText())){
                    //jTextField2.setForeground(Color.red);
                    //t_phone.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jtf_phoneno,"Invalid phone number");
                }



                else if(Department.equals("Select")){
                    //Course.setForeground(Color.red);
                    //c_state.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jcb_department,"Please select the Department");
                }
                else if(Year.equals("Select")){
                    // t_city.setForeground(Color.red);
                    //t_city.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(jcb_year,"Select a Year");
                }




                else if(rbtnStudent.isSelected()==false && rbtnTeacher.isSelected()==false){
                    // jRadioButton1.setBorder(BorderFactory.createLineBorder(Color.red));
                    //r2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(rbtnStudent,"Invalid Designation");
                }

                else{
                    reg_details rd=new reg_details();
                    rd.setName(jtf_name.getText());
                    rd.setPhone(jtf_phoneno.getText());
                    rd.setReg_no(jtf_regno.getText());
                    rd.setDepartment((String) jcb_department.getSelectedItem());
                    rd.setYear(jcb_year.getSelectedItem().toString());
                    rd.setEmail(jtf_email.getText());
                    rd.setPassword(jpf_password.getText());
                    rd.setDesignation(Desig);
                    rd.setDOB(dob);
                    boolean rd1=false;
                    if(Desig.equals("Student")){
                        rd1=new dbFunction(Desig).insertTable(rd, Desig) ;                   }
                    else{
                        rd1=new dbFunction(Desig).insertTableTeacher(rd, Desig);
                    }
                    if(rd1){
                        JOptionPane.showMessageDialog(btnRegister,"SUCCESSFULLY REGISTERED AS "+Desig.toUpperCase());
                    }
                    else{
                        JOptionPane.showMessageDialog(btnRegister,"REGISTRATION FAILED");
                    }
                }


            }
        });





        btnRegister.setBackground(Color.WHITE);
        btnRegister.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-add-user-group-woman-man-30-2.png"));
        btnRegister.setBounds(244, 532, 117, 43);
        panel_1.add(btnRegister);

        JButton btnCancel = new JButton("  Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);

            }
        });
        btnCancel.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-cancel-30.png"));
        btnCancel.setBounds(244, 583, 117, 43);
        panel_1.add(btnCancel);




        JLabel lblNewLabel_4 = new JLabel("Already an User ?");
        lblNewLabel_4.setBounds(50, 650, 185, 16);
        panel_1.add(lblNewLabel_4);

        JButton btnLogin = new JButton("Login");
        btnLogin.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-login-30.png"));
        btnLogin.setBounds(244, 638, 117, 43);
        panel_1.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login frame=new Login();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                dispose();
            }
        });

        JLabel L_Role = new JLabel("  Select your Role");
        L_Role.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-director-32.png"));
        L_Role.setBounds(50, 480, 200, 32);
        panel_1.add(L_Role);



        rbtnStudent = new JRadioButton("Student");
        rbtnStudent.setBounds(371, 484, 92, 23);
        panel_1.add(rbtnStudent);

        rbtnTeacher = new JRadioButton("Teacher");
        rbtnTeacher.setBounds(478, 484, 92, 23);
        panel_1.add(rbtnTeacher);

        bg.add(rbtnStudent);
        bg.add(rbtnTeacher);





    }
}

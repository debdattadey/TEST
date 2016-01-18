
 
 import java.awt.EventQueue;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JPasswordField;
 import javax.swing.JTextField;
 
 
 public class Login extends JFrame{
 
   
    public JPasswordField passwordField;
    public JTextField textField;
    public JButton blogin;
    public JButton btnNewUser;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }
 
    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setLayout(null);
 
      setSize(350,300); 
 
      passwordField = new JPasswordField();
      passwordField.setBounds(90, 114, 105, 22);
      add(passwordField);
 
      textField = new JTextField();
      textField.setBounds(90, 79, 105, 22);
      add(textField);
      textField.setColumns(10);
 
      JLabel lblUsername = new JLabel("Username");
      lblUsername.setBounds(220, 82, 76, 16);
      add(lblUsername);
 
      JLabel lblPassword = new JLabel("Password");
      lblPassword.setBounds(220, 117, 66, 16);
      add(lblPassword);
 
      JButton blogin = new JButton("Login");
      blogin.setBounds(144, 158, 97, 25);
      blogin.addActionListener(new ActionListener() { 
          public void actionPerformed(ActionEvent ae){
             actionlogin();
          }
      });
 
      add(blogin);
 
     
    }
 
  public void actionlogin(){
 
    
         Scanner scan=null;
 
         try {
           
             scan = new Scanner(new File("E:/Login.txt"));
         } catch (Exception e) {
             // TODO Autogenerated catch block
             e.printStackTrace();
         }
 
         String inpUser;
         inpUser = textField.getText();
 
         String inpPass;
         inpPass = passwordField.getText();// gets input from user
 
         String user="";
         if(scan.hasNextLine()) //added to check if there is another line to read
            user = scan.nextLine();            
 
         String pass="";
         if(scan.hasNextLine())
            pass = scan.nextLine(); // looks at selected file in scan
 
             if (inpUser.equals(user)&& inpPass.equals(pass)){
                 System.out.print("login sucessfull");
             }else {
                 JOptionPane.showMessageDialog(null,"Wrong!Username:Password");
             }
    }       
 
 } 

package GUI;

import javax.swing.*;


public class AdministratorPage extends JPanel{



 private JPanel p1;
 private JLabel GARITS_Label;
 private JLabel employeeNameL;
 private JLabel welcomeL;
 private JButton logoutButton;
 private JButton changePasswordButton;
 private JPanel p2;
 private JButton usersButton;
 private JLabel createUserL;
 private JLabel firstNameL;
 private JLabel lastNameL;
 private JLabel jobTitleL;
 private JTextField firstNameF;
 private JTextField lastNameF;
 private JTextField jobTitleF;
 private JLabel emailL;
 private JTextField emailF;
 private JLabel usernameL;
 private JTextField usernameF;
 private JLabel passwordL;
 private JPasswordField passwordF;
 private JButton createButton;
 private JList usersList;
 private JButton showButton;
 private JLabel UsersListL;
 private JComboBox usersComboBox;
 private JLabel alterUserDetailsL;
 private JButton alterButton;
 private JScrollBar scrollBar1;
 private JLabel firstNameL2;
 private JTextField firstNameF2;
 private JTextField lastNameF2;
 private JTextField jobTitleF2;
 private JTextField emailF2;
 private JTextField usernameF2;
 private JPasswordField PasswordF2;
 private JLabel lastNameL2;
 private JLabel jobTitleL2;
 private JLabel emailL2;
 private JLabel usernameL2;
 private JLabel passwordL2;
 private JLabel deleteUserL;
 private JList usersList2;
 private JComboBox userComboBox2;
 private JButton deleteButton;
 //private p2Contents = new JPanel;
 private JPanel p3;
 private JButton databaseButton;
 private JLabel createBackupL;
 private JButton createButton2;
 private JLabel restoreBackupL;
 private JList backupList;
 private JButton restoreButton;

 public AdministratorPage() {
      JScrollBar scrollBar1 = new JScrollBar();
     //sidebar
      JPanel p1 = new JPanel();
      JLabel welcome = new JLabel("Welcome");
      JLabel employeeName = new JLabel();
      JLabel GARITS_Label = new JLabel("GARITS");
      JButton logoutButton = new JButton();
      JButton changePasswordButton = new JButton();

     //first dropdown menu
      JPanel p2 = new JPanel();
      JButton usersDropdownButton = new JButton();
      JTextField firstNameF = new JTextField("First Name");
      JTextField lastNameF = new JTextField("Last Name");
      JTextField jobTitleF = new JTextField("Job Title");
      JTextField emailF = new JTextField("Email");
      JTextField usernameF = new JTextField("Username");
      JPasswordField passwordF = new JPasswordField("Password");
      JButton createButton = new JButton();
      JList usersList = new JList();
      JButton showButton = new JButton();
      JComboBox usersComboBox = new JComboBox();
      JButton alterButton = new JButton();
      JTextField usernameF2 = new JTextField("Username");
      JTextField emailF2 = new JTextField("Email");
      JTextField jobTitleF2 = new JTextField("Job Title");
      JTextField lastNameF2 = new JTextField("Last Name");
      JTextField firstNameF2 = new JTextField("First Name");
      JPasswordField PasswordF2 = new JPasswordField("Password");
      JList usersList2 = new JList();
      JComboBox userComboBox2 = new JComboBox();
      JButton deleteButton = new JButton();
      JLabel createUserL = new JLabel("Create User");
      JLabel firstNameL = new JLabel("First Name");
      JLabel lastNameL = new JLabel("Last Name");
      JLabel jobTitleL = new JLabel("Job Title");
      JLabel emailL = new JLabel("Email");
      JLabel usernameL = new JLabel("Username");
      JLabel passwordL = new JLabel("Password");
      JLabel UsersListL = new JLabel("List of Users");
      JLabel alterUserDetailsL = new JLabel("Alter User Details");
      JLabel firstNameL2 = new JLabel("First Name");
      JLabel lastNameL2 = new JLabel("Last Name");
      JLabel jobTitleL2 = new JLabel("Job Title");
      JLabel emailL2 = new JLabel("Email");
      JLabel usernameL2 = new JLabel("Username");
      JLabel passwordL2 = new JLabel("Password");
      JLabel deleteUserL = new JLabel("Delete User");
      revalidate();

    //  p2.add(p2Contents);


     // second dropdown menu
      JPanel p3 = new JPanel();
      JButton databaseDropdownButton = new JButton();
      JLabel createBackupL = new JLabel("Create Backup");
      JButton createButton2 = new JButton();
      JLabel restoreBackupL = new JLabel("Restore Backup");
      JList backupList = new JList();
      JButton restoreButton = new JButton();
      revalidate();


    }
}

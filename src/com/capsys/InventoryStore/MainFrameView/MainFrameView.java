package com.capsys.InventoryStore.MainFrameView;
import com.capsys.InventoryStore.Utility.MainFrameValidation;
import com.capsys.Inventory.pojo.AddNewProductDetails;
import com.capsys.Inventory.pojo.DeleteProductDetails;
import com.capsys.Inventory.pojo.ManageProductQuantity;
import com.capsys.Inventory.pojo.ModifyProductDetails;
import com.capsys.Inventory.pojo.ProductReporting;
import com.capsys.InventoryStore.Sql.MainFrameSql;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
*@author Pragya Saxena
* @version 
* 
* Window for application to make entry of Inventory
**/
public class MainFrameView extends javax.swing.JFrame 
{
    public int posX;
    public int posY;   
    boolean flag=true;
    int available_stock=0;
    AddNewProductDetails addProduct=new AddNewProductDetails();
    DeleteProductDetails deleteProduct=new DeleteProductDetails();
    ModifyProductDetails modifyProduct=new ModifyProductDetails();
    ManageProductQuantity manageProductQuantity=new ManageProductQuantity();
    ProductReporting productReporting=new ProductReporting();
    MainFrameSql mainFrameSql=new MainFrameSql();
    
    
    public MainFrameView() 
    {
        this.setLocation(700, 150);
        initComponents();
    }
    
    
    public void switchPanel(JPanel panel)
    {
      layeredPane.removeAll();
      layeredPane.add(panel);
      layeredPane.repaint();
      layeredPane.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionPane = new javax.swing.JOptionPane();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        DefaultPanel = new javax.swing.JPanel();
        layeredPane = new javax.swing.JLayeredPane();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        usernameTextField = new javax.swing.JTextField();
        inventoryStoreLabel = new javax.swing.JLabel();
        passwordImageLabel = new javax.swing.JLabel();
        usernameImageLabel = new javax.swing.JLabel();
        authorizationLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        forgotPasswordLabel = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        manipulateProductDetailsButton = new javax.swing.JButton();
        manageProductQuantityButton = new javax.swing.JButton();
        productReportingButton = new javax.swing.JButton();
        welcomeWindowLabel = new javax.swing.JLabel();
        productDetailsPanel = new javax.swing.JPanel();
        addNewProductDetailsButton = new javax.swing.JButton();
        deleteProductDetailsButton = new javax.swing.JButton();
        modifyProductDetailsButton = new javax.swing.JButton();
        manipulateProductDetailsLabel = new javax.swing.JLabel();
        backProductDetailsButton = new javax.swing.JButton();
        productQuantityPanel = new javax.swing.JPanel();
        productIdQuantityLabel = new javax.swing.JLabel();
        productQuantityLabel = new javax.swing.JLabel();
        productIdQuantityTextField = new javax.swing.JTextField();
        productQuantityTextField = new javax.swing.JTextField();
        addQuantityButton = new javax.swing.JButton();
        removeQuantityButton = new javax.swing.JButton();
        manageProductQuantityLabel = new javax.swing.JLabel();
        backProductQuantityButton = new javax.swing.JButton();
        displayMessageProductQuantityLabel = new javax.swing.JLabel();
        productReportingPanel = new javax.swing.JPanel();
        monthlyReportButton = new javax.swing.JButton();
        reportDateBasedButton = new javax.swing.JButton();
        overallReportButton = new javax.swing.JButton();
        productReportingLabel = new javax.swing.JLabel();
        backProductReportingLabel = new javax.swing.JButton();
        addProductPanel = new javax.swing.JPanel();
        addNewProductButton = new javax.swing.JButton();
        productIdAddNewProductLabel = new javax.swing.JLabel();
        costPerUnitAddNewProductLabel = new javax.swing.JLabel();
        quantityAddNewProductLabel = new javax.swing.JLabel();
        productIdAddNewProductTextField = new javax.swing.JTextField();
        productNameAddNewProductTextField = new javax.swing.JTextField();
        quantityAddNewProductTextField = new javax.swing.JTextField();
        costPerUnitAddNewProductTextField = new javax.swing.JTextField();
        productNameAddNewProductLabel = new javax.swing.JLabel();
        addNewProductLabel = new javax.swing.JLabel();
        backAddNewProductButton = new javax.swing.JButton();
        deletelProductPanel = new javax.swing.JPanel();
        productIdDeleteProductLabel = new javax.swing.JLabel();
        productIdDeleteProductTextField = new javax.swing.JTextField();
        deleteProductButton = new javax.swing.JButton();
        deleteProductLabel = new javax.swing.JLabel();
        backDeleteProductButton = new javax.swing.JButton();
        modifyProductPanel = new javax.swing.JPanel();
        productIdModifyProductLabel = new javax.swing.JLabel();
        productNameModifyProductLabel = new javax.swing.JLabel();
        costPerUnitModifyProductLabel = new javax.swing.JLabel();
        productIdModifyProductTextField = new javax.swing.JTextField();
        productNameModifyProductTextField = new javax.swing.JTextField();
        costPerUnitModifyProductTextField = new javax.swing.JTextField();
        modifyProductButton = new javax.swing.JButton();
        modifyProductLabel = new javax.swing.JLabel();
        displayMessageModifyProductLabel = new javax.swing.JLabel();
        backModifyProductButton = new javax.swing.JButton();
        overallReportPanel = new javax.swing.JPanel();
        productIdOverallReportLabel = new javax.swing.JLabel();
        productIdOverallReportTextField = new javax.swing.JTextField();
        generateOverallReportButton = new javax.swing.JButton();
        overallReportLabel = new javax.swing.JLabel();
        backOverallReportButton = new javax.swing.JButton();
        monthlyReportPanel = new javax.swing.JPanel();
        generateMonthlyReportButton = new javax.swing.JButton();
        productIdMonthlylReportLabel = new javax.swing.JLabel();
        productIdMonthlyReportTextField = new javax.swing.JTextField();
        monthlyReportLabel = new javax.swing.JLabel();
        backMonthyReportButton = new javax.swing.JButton();
        dateBasedReportPanel = new javax.swing.JPanel();
        generateReportDateBasedButton = new javax.swing.JButton();
        productIdReportDateBasedTextField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        productIdReportDateBasedLabel = new javax.swing.JLabel();
        reportDateBasedLabel = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        backReportDateBasedButton = new javax.swing.JButton();
        reportTablePanel = new javax.swing.JPanel();
        reportTableScrollPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        reportTabelLabel = new javax.swing.JLabel();
        displayMessageReportTableLabel = new javax.swing.JLabel();
        backReportTableButton = new javax.swing.JButton();
        exitDefaultPanelLabel = new javax.swing.JLabel();
        homeDefaultPanelLabel = new javax.swing.JLabel();
        minimizeDefaultPanelLabel = new javax.swing.JLabel();

        optionPane.setBackground(new java.awt.Color(35, 144, 173));
        optionPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        optionPane.setForeground(new java.awt.Color(255, 255, 255));
        optionPane.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        DefaultPanel.setBackground(new java.awt.Color(35, 144, 173));

        layeredPane.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(35, 144, 173));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        loginButton.setText("Sign In");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordTextField.setBackground(new java.awt.Color(35, 144, 173));
        passwordTextField.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        passwordTextField.setText("Enter Password");
        passwordTextField.setToolTipText("Enter Password");
        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });

        usernameTextField.setBackground(new java.awt.Color(35, 144, 173));
        usernameTextField.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        usernameTextField.setText("Enter Username");
        usernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });

        inventoryStoreLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        inventoryStoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        inventoryStoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryStoreLabel.setText("Inventory Store");

        passwordImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\password_32px.png")); // NOI18N

        usernameImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\administrator_male_26px.png")); // NOI18N

        authorizationLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        authorizationLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorizationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorizationLabel.setText("Authorization");

        loginLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("Login");

        passwordLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        forgotPasswordLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        forgotPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPasswordLabel.setText("FORGOT PASSWORD?");
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authorizationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventoryStoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(loginLabel)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(forgotPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addComponent(inventoryStoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(authorizationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordLabel)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        layeredPane.add(loginPanel, "card2");

        welcomePanel.setBackground(new java.awt.Color(35, 144, 173));

        manipulateProductDetailsButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        manipulateProductDetailsButton.setText("Manipulate Product Details");
        manipulateProductDetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manipulateProductDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        manipulateProductDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manipulateProductDetailsButtonActionPerformed(evt);
            }
        });

        manageProductQuantityButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        manageProductQuantityButton.setText("Manage Product Quantity");
        manageProductQuantityButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageProductQuantityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        manageProductQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductQuantityButtonActionPerformed(evt);
            }
        });

        productReportingButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        productReportingButton.setText("Product Reporting");
        productReportingButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        productReportingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        productReportingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productReportingButtonActionPerformed(evt);
            }
        });

        welcomeWindowLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        welcomeWindowLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeWindowLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeWindowLabel.setText("<html>&emsp;&ensp;&ensp;Welcome to the Inventory Store&ensp;</br>Please choose appropriate operation from&ensp;&ensp;below</html>");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addComponent(welcomeWindowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productReportingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manipulateProductDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageProductQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(welcomeWindowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(manipulateProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(manageProductQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(productReportingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        layeredPane.add(welcomePanel, "card3");

        productDetailsPanel.setBackground(new java.awt.Color(35, 144, 173));

        addNewProductDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        addNewProductDetailsButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        addNewProductDetailsButton.setText("Add New Product");
        addNewProductDetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addNewProductDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewProductDetailsButtonActionPerformed(evt);
            }
        });

        deleteProductDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteProductDetailsButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        deleteProductDetailsButton.setText("Delete  Existing Product");
        deleteProductDetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteProductDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductDetailsButtonActionPerformed(evt);
            }
        });

        modifyProductDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        modifyProductDetailsButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        modifyProductDetailsButton.setText("Modify Existing Product");
        modifyProductDetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modifyProductDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyProductDetailsButtonActionPerformed(evt);
            }
        });

        manipulateProductDetailsLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        manipulateProductDetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        manipulateProductDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manipulateProductDetailsLabel.setText("<html>&emsp;&ensp;&ensp;Welcome to the Manipulate Product Details Window<br>Please choose appropriate operation from below</html>");

        backProductDetailsButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backProductDetailsButton.setText("Back");
        backProductDetailsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backProductDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backProductDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productDetailsPanelLayout = new javax.swing.GroupLayout(productDetailsPanel);
        productDetailsPanel.setLayout(productDetailsPanelLayout);
        productDetailsPanelLayout.setHorizontalGroup(
            productDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manipulateProductDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(productDetailsPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(productDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backProductDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteProductDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyProductDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productDetailsPanelLayout.setVerticalGroup(
            productDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productDetailsPanelLayout.createSequentialGroup()
                .addComponent(manipulateProductDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(deleteProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(modifyProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(backProductDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        layeredPane.add(productDetailsPanel, "card4");

        productQuantityPanel.setBackground(new java.awt.Color(35, 144, 173));

        productIdQuantityLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdQuantityLabel.setText("Product ID");

        productQuantityLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        productQuantityLabel.setText("Quantity");

        productIdQuantityTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdQuantityTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        productIdQuantityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productIdQuantityTextFieldFocusLost(evt);
            }
        });

        productQuantityTextField.setBackground(new java.awt.Color(35, 144, 173));
        productQuantityTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        addQuantityButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        addQuantityButton.setText("Add");
        addQuantityButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityButtonActionPerformed(evt);
            }
        });

        removeQuantityButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        removeQuantityButton.setText("Remove");
        removeQuantityButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeQuantityButtonActionPerformed(evt);
            }
        });

        manageProductQuantityLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        manageProductQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageProductQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageProductQuantityLabel.setText("Manage Product Quantity");

        backProductQuantityButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        backProductQuantityButton.setText("Back");
        backProductQuantityButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backProductQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backProductQuantityButtonActionPerformed(evt);
            }
        });

        displayMessageProductQuantityLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        displayMessageProductQuantityLabel.setForeground(new java.awt.Color(100, 7, 7));

        javax.swing.GroupLayout productQuantityPanelLayout = new javax.swing.GroupLayout(productQuantityPanel);
        productQuantityPanel.setLayout(productQuantityPanelLayout);
        productQuantityPanelLayout.setHorizontalGroup(
            productQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productQuantityPanelLayout.createSequentialGroup()
                .addComponent(manageProductQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(productQuantityPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(productQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backProductQuantityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productQuantityTextField)
                    .addComponent(productIdQuantityTextField)
                    .addGroup(productQuantityPanelLayout.createSequentialGroup()
                        .addComponent(addQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(removeQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productIdQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayMessageProductQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productQuantityPanelLayout.setVerticalGroup(
            productQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productQuantityPanelLayout.createSequentialGroup()
                .addComponent(manageProductQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(productIdQuantityLabel)
                .addGap(10, 10, 10)
                .addComponent(productIdQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(displayMessageProductQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productQuantityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(productQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuantityButton)
                    .addComponent(removeQuantityButton))
                .addGap(43, 43, 43)
                .addComponent(backProductQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        layeredPane.add(productQuantityPanel, "card5");

        productReportingPanel.setBackground(new java.awt.Color(35, 144, 173));

        monthlyReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        monthlyReportButton.setText("Monthly Report");
        monthlyReportButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monthlyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyReportButtonActionPerformed(evt);
            }
        });

        reportDateBasedButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        reportDateBasedButton.setText("Report Date Based");
        reportDateBasedButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reportDateBasedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportDateBasedButtonActionPerformed(evt);
            }
        });

        overallReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        overallReportButton.setText("Overall Report");
        overallReportButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        overallReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallReportButtonActionPerformed(evt);
            }
        });

        productReportingLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        productReportingLabel.setForeground(new java.awt.Color(255, 255, 255));
        productReportingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productReportingLabel.setText("<html>&emsp;&ensp;&ensp;Welcome to the Product Reporting Window<br>Please choose appropriate operation from below</html>");

        backProductReportingLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backProductReportingLabel.setText("Back");
        backProductReportingLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backProductReportingLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backProductReportingLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productReportingPanelLayout = new javax.swing.GroupLayout(productReportingPanel);
        productReportingPanel.setLayout(productReportingPanelLayout);
        productReportingPanelLayout.setHorizontalGroup(
            productReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productReportingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(productReportingPanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(productReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reportDateBasedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overallReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backProductReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productReportingPanelLayout.setVerticalGroup(
            productReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productReportingPanelLayout.createSequentialGroup()
                .addComponent(productReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(overallReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(monthlyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(reportDateBasedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(backProductReportingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        layeredPane.add(productReportingPanel, "card6");

        addProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        addNewProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        addNewProductButton.setText("Add");
        addNewProductButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewProductButtonActionPerformed(evt);
            }
        });

        productIdAddNewProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdAddNewProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdAddNewProductLabel.setText("Product Id");

        costPerUnitAddNewProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        costPerUnitAddNewProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        costPerUnitAddNewProductLabel.setText("Cost Per Unit");

        quantityAddNewProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        quantityAddNewProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantityAddNewProductLabel.setText("Quantity");

        productIdAddNewProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdAddNewProductTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        productIdAddNewProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        productNameAddNewProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        productNameAddNewProductTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        productNameAddNewProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        productNameAddNewProductTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameAddNewProductTextFieldFocusLost(evt);
            }
        });

        quantityAddNewProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        quantityAddNewProductTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        quantityAddNewProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        quantityAddNewProductTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityAddNewProductTextFieldFocusLost(evt);
            }
        });

        costPerUnitAddNewProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        costPerUnitAddNewProductTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        costPerUnitAddNewProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        productNameAddNewProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productNameAddNewProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        productNameAddNewProductLabel.setText("Product Name");

        addNewProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        addNewProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        addNewProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addNewProductLabel.setText("Add New Product");

        backAddNewProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backAddNewProductButton.setText("Back");
        backAddNewProductButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backAddNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAddNewProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addProductPanelLayout = new javax.swing.GroupLayout(addProductPanel);
        addProductPanel.setLayout(addProductPanelLayout);
        addProductPanelLayout.setHorizontalGroup(
            addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProductPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costPerUnitAddNewProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productIdAddNewProductTextField)
                    .addGroup(addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(quantityAddNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addProductPanelLayout.createSequentialGroup()
                                .addComponent(backAddNewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addNewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quantityAddNewProductTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(productNameAddNewProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(costPerUnitAddNewProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productNameAddNewProductTextField)
                    .addComponent(productIdAddNewProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(addNewProductLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addProductPanelLayout.setVerticalGroup(
            addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProductPanelLayout.createSequentialGroup()
                .addComponent(addNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(productIdAddNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(productIdAddNewProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(productNameAddNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(productNameAddNewProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(costPerUnitAddNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(costPerUnitAddNewProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(quantityAddNewProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(quantityAddNewProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(addProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backAddNewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layeredPane.add(addProductPanel, "card7");

        deletelProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        productIdDeleteProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdDeleteProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdDeleteProductLabel.setText("Product Id");

        productIdDeleteProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdDeleteProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        productIdDeleteProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdDeleteProductTextFieldActionPerformed(evt);
            }
        });

        deleteProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        deleteProductButton.setText("Delete Product");
        deleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductButtonActionPerformed(evt);
            }
        });

        deleteProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        deleteProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteProductLabel.setText("<html>Please enter the product ID in the<br>below fieldto delete details of that product</html>");

        backDeleteProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backDeleteProductButton.setText("Back");
        backDeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backDeleteProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletelProductPanelLayout = new javax.swing.GroupLayout(deletelProductPanel);
        deletelProductPanel.setLayout(deletelProductPanelLayout);
        deletelProductPanelLayout.setHorizontalGroup(
            deletelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletelProductPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deletelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productIdDeleteProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(productIdDeleteProductTextField)
                    .addGroup(deletelProductPanelLayout.createSequentialGroup()
                        .addComponent(backDeleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteProductButton)))
                .addGap(41, 41, 41))
        );
        deletelProductPanelLayout.setVerticalGroup(
            deletelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletelProductPanelLayout.createSequentialGroup()
                .addComponent(deleteProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productIdDeleteProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(productIdDeleteProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(deletelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backDeleteProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        layeredPane.add(deletelProductPanel, "card8");

        modifyProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        productIdModifyProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdModifyProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdModifyProductLabel.setText("Product Id");

        productNameModifyProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productNameModifyProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        productNameModifyProductLabel.setText("Product Name");

        costPerUnitModifyProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        costPerUnitModifyProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        costPerUnitModifyProductLabel.setText("Cost Per Unit");

        productIdModifyProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdModifyProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        productIdModifyProductTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productIdModifyProductTextFieldFocusLost(evt);
            }
        });

        productNameModifyProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        productNameModifyProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        productNameModifyProductTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameModifyProductTextFieldFocusLost(evt);
            }
        });

        costPerUnitModifyProductTextField.setBackground(new java.awt.Color(35, 144, 173));
        costPerUnitModifyProductTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        costPerUnitModifyProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerUnitModifyProductTextFieldActionPerformed(evt);
            }
        });

        modifyProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        modifyProductButton.setText("Modify Product");
        modifyProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyProductButtonActionPerformed(evt);
            }
        });

        modifyProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        modifyProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        modifyProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyProductLabel.setText("Modify Product");

        displayMessageModifyProductLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        displayMessageModifyProductLabel.setForeground(new java.awt.Color(255, 255, 255));

        backModifyProductButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backModifyProductButton.setText("Back");
        backModifyProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backModifyProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyProductPanelLayout = new javax.swing.GroupLayout(modifyProductPanel);
        modifyProductPanel.setLayout(modifyProductPanelLayout);
        modifyProductPanelLayout.setHorizontalGroup(
            modifyProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifyProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(modifyProductPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(modifyProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productNameModifyProductLabel)
                    .addComponent(productIdModifyProductLabel)
                    .addComponent(costPerUnitModifyProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(costPerUnitModifyProductTextField)
                    .addComponent(productNameModifyProductTextField)
                    .addComponent(productIdModifyProductTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(displayMessageModifyProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyProductPanelLayout.createSequentialGroup()
                        .addComponent(backModifyProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modifyProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifyProductPanelLayout.setVerticalGroup(
            modifyProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyProductPanelLayout.createSequentialGroup()
                .addComponent(modifyProductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productIdModifyProductLabel)
                .addGap(10, 10, 10)
                .addComponent(productIdModifyProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayMessageModifyProductLabel)
                .addGap(9, 9, 9)
                .addComponent(productNameModifyProductLabel)
                .addGap(10, 10, 10)
                .addComponent(productNameModifyProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(costPerUnitModifyProductLabel)
                .addGap(10, 10, 10)
                .addComponent(costPerUnitModifyProductTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(modifyProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backModifyProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        layeredPane.add(modifyProductPanel, "card9");

        overallReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        productIdOverallReportLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdOverallReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdOverallReportLabel.setText("Product Id");

        productIdOverallReportTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdOverallReportTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        generateOverallReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateOverallReportButton.setText("Generate Report");
        generateOverallReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateOverallReportButtonActionPerformed(evt);
            }
        });

        overallReportLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        overallReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        overallReportLabel.setText("<html>Please enter the product ID in the<br>below field to generate report of all sales and purchase details happened from starting</html>");

        backOverallReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backOverallReportButton.setText("Back");
        backOverallReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backOverallReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout overallReportPanelLayout = new javax.swing.GroupLayout(overallReportPanel);
        overallReportPanel.setLayout(overallReportPanelLayout);
        overallReportPanelLayout.setHorizontalGroup(
            overallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overallReportPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(overallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productIdOverallReportTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productIdOverallReportLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addGroup(overallReportPanelLayout.createSequentialGroup()
                        .addComponent(backOverallReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateOverallReportButton)))
                .addGap(45, 45, 45))
            .addComponent(overallReportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        overallReportPanelLayout.setVerticalGroup(
            overallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overallReportPanelLayout.createSequentialGroup()
                .addComponent(overallReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(productIdOverallReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productIdOverallReportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(overallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generateOverallReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backOverallReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        layeredPane.add(overallReportPanel, "card10");

        monthlyReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        generateMonthlyReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateMonthlyReportButton.setText("Generate Report");
        generateMonthlyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMonthlyReportButtonActionPerformed(evt);
            }
        });

        productIdMonthlylReportLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdMonthlylReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdMonthlylReportLabel.setText("Product Id");

        productIdMonthlyReportTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdMonthlyReportTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        productIdMonthlyReportTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        monthlyReportLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        monthlyReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        monthlyReportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthlyReportLabel.setText("<html>Please enter the product ID in the<br>below field to know monthly sale and purchase for that product</html>");

        backMonthyReportButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backMonthyReportButton.setText("Back");
        backMonthyReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMonthyReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout monthlyReportPanelLayout = new javax.swing.GroupLayout(monthlyReportPanel);
        monthlyReportPanel.setLayout(monthlyReportPanelLayout);
        monthlyReportPanelLayout.setHorizontalGroup(
            monthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthlyReportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monthlyReportPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(monthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productIdMonthlylReportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productIdMonthlyReportTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monthlyReportPanelLayout.createSequentialGroup()
                        .addComponent(backMonthyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateMonthlyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        monthlyReportPanelLayout.setVerticalGroup(
            monthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthlyReportPanelLayout.createSequentialGroup()
                .addComponent(monthlyReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(productIdMonthlylReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(productIdMonthlyReportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(monthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateMonthlyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backMonthyReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        layeredPane.add(monthlyReportPanel, "card11");

        dateBasedReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        generateReportDateBasedButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateReportDateBasedButton.setText("Generate Report");
        generateReportDateBasedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportDateBasedButtonActionPerformed(evt);
            }
        });

        productIdReportDateBasedTextField.setBackground(new java.awt.Color(35, 144, 173));
        productIdReportDateBasedTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        endDateLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        endDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        endDateLabel.setText("End Date");

        startDateLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        startDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        startDateLabel.setText("Start Date");

        productIdReportDateBasedLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productIdReportDateBasedLabel.setForeground(new java.awt.Color(255, 255, 255));
        productIdReportDateBasedLabel.setText("Product Id");

        reportDateBasedLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        reportDateBasedLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportDateBasedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportDateBasedLabel.setText("<html>Please enter the product ID in the<br>Product ID field and select dates to generate the report</html>");

        startDateChooser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        startDateChooser.setDateFormatString("dd-MM-yyyy");
        startDateChooser.setMaxSelectableDate(new java.util.Date());
        ((JTextField)(startDateChooser.getComponent(1))).setBackground(new Color(35,144,173));

        endDateChooser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        endDateChooser.setMaxSelectableDate(new java.util.Date());
        ((JTextField)(endDateChooser.getComponent(1))).setBackground(new Color(35,144,173));

        backReportDateBasedButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backReportDateBasedButton.setText("Back");
        backReportDateBasedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backReportDateBasedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateBasedReportPanelLayout = new javax.swing.GroupLayout(dateBasedReportPanel);
        dateBasedReportPanel.setLayout(dateBasedReportPanelLayout);
        dateBasedReportPanelLayout.setHorizontalGroup(
            dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateBasedReportPanelLayout.createSequentialGroup()
                .addComponent(reportDateBasedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(dateBasedReportPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(productIdReportDateBasedLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productIdReportDateBasedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(endDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(dateBasedReportPanelLayout.createSequentialGroup()
                                .addComponent(backReportDateBasedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generateReportDateBasedButton))
                            .addComponent(endDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(startDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dateBasedReportPanelLayout.setVerticalGroup(
            dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateBasedReportPanelLayout.createSequentialGroup()
                .addComponent(reportDateBasedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(productIdReportDateBasedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(productIdReportDateBasedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(dateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReportDateBasedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backReportDateBasedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        layeredPane.add(dateBasedReportPanel, "card12");

        reportTablePanel.setBackground(new java.awt.Color(35, 144, 173));

        reportTable.setBackground(new java.awt.Color(35, 144, 173));
        reportTable.setForeground(new java.awt.Color(255, 255, 255));
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product_ID", "Product_Name", "Cost", "Quantity", "Purchase_Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.setEditingColumn(0);
        reportTable.setEditingRow(0);
        reportTableScrollPane.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setResizable(false);
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
            reportTable.getColumnModel().getColumn(4).setResizable(false);
        }

        reportTabelLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        reportTabelLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportTabelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportTabelLabel.setText("Report Table");

        displayMessageReportTableLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N

        backReportTableButton.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        backReportTableButton.setText("Back");
        backReportTableButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backReportTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backReportTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportTablePanelLayout = new javax.swing.GroupLayout(reportTablePanel);
        reportTablePanel.setLayout(reportTablePanelLayout);
        reportTablePanelLayout.setHorizontalGroup(
            reportTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportTablePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(reportTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backReportTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayMessageReportTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(reportTablePanelLayout.createSequentialGroup()
                .addComponent(reportTabelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        reportTablePanelLayout.setVerticalGroup(
            reportTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(reportTabelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(reportTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(displayMessageReportTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(backReportTableButton)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        layeredPane.add(reportTablePanel, "card13");

        exitDefaultPanelLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\cancel_30px.png")); // NOI18N
        exitDefaultPanelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitDefaultPanelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitDefaultPanelLabelMouseClicked(evt);
            }
        });

        homeDefaultPanelLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\home_32px.png")); // NOI18N
        homeDefaultPanelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeDefaultPanelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeDefaultPanelLabelMouseClicked(evt);
            }
        });

        minimizeDefaultPanelLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\minimize_window_24px.png")); // NOI18N
        minimizeDefaultPanelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeDefaultPanelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeDefaultPanelLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DefaultPanelLayout = new javax.swing.GroupLayout(DefaultPanel);
        DefaultPanel.setLayout(DefaultPanelLayout);
        DefaultPanelLayout.setHorizontalGroup(
            DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layeredPane)
                    .addGroup(DefaultPanelLayout.createSequentialGroup()
                        .addComponent(homeDefaultPanelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeDefaultPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitDefaultPanelLabel)
                        .addContainerGap())))
        );
        DefaultPanelLayout.setVerticalGroup(
            DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DefaultPanelLayout.createSequentialGroup()
                .addGroup(DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeDefaultPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitDefaultPanelLabel)
                    .addComponent(minimizeDefaultPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DefaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DefaultPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(new Color(203,0,54));
        loginButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(new Color(203,0,54));
    }//GEN-LAST:event_loginButtonMouseExited

    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained
        if(passwordTextField.getToolTipText().equals(passwordTextField.getText()))
        {
            passwordTextField.setEchoChar('*');
            passwordTextField.setText("");
        }
    }//GEN-LAST:event_passwordTextFieldFocusGained

    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        if(usernameTextField.getText().equals("Enter Username"))
        { usernameTextField.setText(""); }
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void manipulateProductDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manipulateProductDetailsButtonActionPerformed
       switchPanel(productDetailsPanel);
    }//GEN-LAST:event_manipulateProductDetailsButtonActionPerformed

    private void manageProductQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductQuantityButtonActionPerformed
       switchPanel(productQuantityPanel);
    }//GEN-LAST:event_manageProductQuantityButtonActionPerformed

    private void productReportingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productReportingButtonActionPerformed
       switchPanel(productReportingPanel);
    }//GEN-LAST:event_productReportingButtonActionPerformed

    private void addNewProductDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewProductDetailsButtonActionPerformed
       switchPanel(addProductPanel);
    }//GEN-LAST:event_addNewProductDetailsButtonActionPerformed

    private void deleteProductDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductDetailsButtonActionPerformed
       switchPanel(deletelProductPanel);
    }//GEN-LAST:event_deleteProductDetailsButtonActionPerformed

    private void modifyProductDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyProductDetailsButtonActionPerformed
       switchPanel(modifyProductPanel);
    }//GEN-LAST:event_modifyProductDetailsButtonActionPerformed

    private void monthlyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyReportButtonActionPerformed
       switchPanel(monthlyReportPanel);
    }//GEN-LAST:event_monthlyReportButtonActionPerformed

    private void reportDateBasedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportDateBasedButtonActionPerformed
       switchPanel(dateBasedReportPanel);
    }//GEN-LAST:event_reportDateBasedButtonActionPerformed

    private void overallReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallReportButtonActionPerformed
       switchPanel(overallReportPanel);
    }//GEN-LAST:event_overallReportButtonActionPerformed

    private void addNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewProductButtonActionPerformed
       addProduct.setProductIdAddProduct(Long.parseLong(productIdAddNewProductTextField.getText()));
       addProduct.setProductNameAddProduct(productNameAddNewProductTextField.getText());
       addProduct.setCostPerUnitAddProduct(Float.parseFloat(costPerUnitAddNewProductTextField.getText()));
       addProduct.setQuantityOfProductAddProduct(Integer.parseInt(quantityAddNewProductTextField.getText()));
       if((mainFrameSql.insertAddNewProductDetails())>0)
       {
           MainFrameValidation.promptSuccessMessage(addProductPanel,"Product Added Successfully");
       }
    }//GEN-LAST:event_addNewProductButtonActionPerformed

    private void generateMonthlyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMonthlyReportButtonActionPerformed
        productReporting.setProductIdProductReporting(Long.parseLong(productIdMonthlyReportTextField.getText()));
        if(mainFrameSql.selectMonthlyReport(reportTable)>0)
        {
            switchPanel(reportTablePanel);
        }
        else
        {
            MainFrameValidation.promptSuccessMessage(monthlyReportPanel, "No report exist for the product id in the database");
        }  
        switchPanel(reportTablePanel);
    }//GEN-LAST:event_generateMonthlyReportButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if("admin".equals(usernameTextField.getText())&& "pass".equals(passwordTextField.getText()))
        {switchPanel(welcomePanel);}
        else
        {JOptionPane.showMessageDialog(loginPanel,"Username and password mismatch");}  
    }//GEN-LAST:event_loginButtonActionPerformed

    private void generateOverallReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateOverallReportButtonActionPerformed
        productReporting.setProductIdProductReporting(Long.parseLong(productIdOverallReportTextField.getText()));
        if(mainFrameSql.selectOverallReport(reportTable)>0)
        {
            switchPanel(reportTablePanel);
        }
        else
        {
            MainFrameValidation.promptSuccessMessage(overallReportPanel, "No report exist for the product id in the database");
        }
    }//GEN-LAST:event_generateOverallReportButtonActionPerformed

    private void deleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductButtonActionPerformed
        deleteProduct.setProductIdDeleteProduct(Long.parseLong(productIdDeleteProductTextField.getText()));
        if((mainFrameSql.deleteProductDetails())>0)
        {
            MainFrameValidation.promptSuccessMessage(deletelProductPanel, "Product Deleted Successfully");
        }
    }//GEN-LAST:event_deleteProductButtonActionPerformed

    private void modifyProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyProductButtonActionPerformed
        modifyProduct.setProductIdModifyDetails(Long.parseLong(productIdModifyProductTextField.getText()));
        modifyProduct.setProductNameModifyDetails(productNameModifyProductTextField.getText());
        modifyProduct.setCostPerUnitModifyDetails(Float.parseFloat(costPerUnitModifyProductTextField.getText()));
        if((mainFrameSql.modifyProductDetails())>0)
        {
            MainFrameValidation.promptSuccessMessage(modifyProductPanel, "Product Updated Successfully");
        }
    }//GEN-LAST:event_modifyProductButtonActionPerformed

    private void homeDefaultPanelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeDefaultPanelLabelMouseClicked
        switchPanel(welcomePanel);
        
    }//GEN-LAST:event_homeDefaultPanelLabelMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_formMouseDragged

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        if(usernameTextField.getText().isEmpty())
        { usernameTextField.setText("Enter Username"); }
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
        if(passwordTextField.getText().isEmpty())
        {   passwordTextField.setEchoChar((char)0);
            passwordTextField.setText("Enter Password");   
        }
    }//GEN-LAST:event_passwordTextFieldFocusLost

    private void exitDefaultPanelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitDefaultPanelLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitDefaultPanelLabelMouseClicked

    private void backProductQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backProductQuantityButtonActionPerformed
        productIdQuantityTextField.setText("");
        productQuantityTextField.setText("");
        
        switchPanel(welcomePanel);
    }//GEN-LAST:event_backProductQuantityButtonActionPerformed

    private void generateReportDateBasedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportDateBasedButtonActionPerformed
        productReporting.setProductIdProductReporting(Long.parseLong(productIdReportDateBasedTextField.getText()));
        productReporting.setStartDateProductReporting(new java.sql.Date(startDateChooser.getDate().getTime()));
        productReporting.setEndDateProductReporting(new java.sql.Date(endDateChooser.getDate().getTime()));
        if(mainFrameSql.selectDateBasedReport(reportTable)>0)
        {
            switchPanel(reportTablePanel);
        }
        
    }//GEN-LAST:event_generateReportDateBasedButtonActionPerformed

    private void addQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityButtonActionPerformed
        manageProductQuantity.setProductIdManageQuantity(Long.parseLong(productIdQuantityTextField.getText()));
        manageProductQuantity.setQuantityManageProduct(Integer.parseInt(productQuantityTextField.getText()));
        if((mainFrameSql.insertAddQuantityDetails())>0)
        {
            MainFrameValidation.promptSuccessMessage(productQuantityPanel, "Quantity Added Successfully");
        }
    }//GEN-LAST:event_addQuantityButtonActionPerformed

    private void productIdQuantityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdQuantityTextFieldFocusLost
        MainFrameValidation val=new MainFrameValidation();
        if(mainFrameSql.selectExistedProductId(Long.parseLong(productIdQuantityTextField.getText()))==false)
        {
            displayMessageProductQuantityLabel.setText("Product_Id not exist");
            addQuantityButton.setEnabled(false);
        }
        else
        {
            displayMessageProductQuantityLabel.setText(" ");
            addQuantityButton.setEnabled(true);   
        }
        
    }//GEN-LAST:event_productIdQuantityTextFieldFocusLost

    private void removeQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeQuantityButtonActionPerformed
        manageProductQuantity.setProductIdManageQuantity(Long.parseLong(productIdQuantityTextField.getText()));
        manageProductQuantity.setQuantityManageProduct(Integer.parseInt(productQuantityTextField.getText()));
        if((mainFrameSql.insertRemoveQuantityDetails())>0)
        {
            MainFrameValidation.promptSuccessMessage(productQuantityPanel, "Quantity Removed Successfully");
        }
    }//GEN-LAST:event_removeQuantityButtonActionPerformed

    private void quantityAddNewProductTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityAddNewProductTextFieldFocusLost
        if(Integer.parseInt(quantityAddNewProductTextField.getText())<0)
        {
        JOptionPane.showMessageDialog(addProductPanel,"Quantity can not be negative");
        }
          
    }//GEN-LAST:event_quantityAddNewProductTextFieldFocusLost

    private void minimizeDefaultPanelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeDefaultPanelLabelMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeDefaultPanelLabelMouseClicked

    private void forgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseClicked
        JOptionPane.showMessageDialog(loginPanel,"Contact the administrator");
    }//GEN-LAST:event_forgotPasswordLabelMouseClicked

    private void productIdDeleteProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdDeleteProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdDeleteProductTextFieldActionPerformed

    private void backReportDateBasedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backReportDateBasedButtonActionPerformed
        switchPanel(productReportingPanel);
    }//GEN-LAST:event_backReportDateBasedButtonActionPerformed

    private void backProductReportingLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backProductReportingLabelActionPerformed
        switchPanel(welcomePanel);
    }//GEN-LAST:event_backProductReportingLabelActionPerformed

    private void costPerUnitModifyProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerUnitModifyProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerUnitModifyProductTextFieldActionPerformed

    private void productIdModifyProductTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdModifyProductTextFieldFocusLost
        if(mainFrameSql.selectExistedProductId(Long.parseLong(productIdModifyProductTextField.getText()))==false)
        {
           displayMessageModifyProductLabel.setText("Product ID does not exist");
           productIdModifyProductTextField.setText("");
           modifyProductButton.setEnabled(false);
        }
        else
        {
            displayMessageModifyProductLabel.setText("");
            modifyProductButton.setEnabled(true);
        }
    }//GEN-LAST:event_productIdModifyProductTextFieldFocusLost

    private void backProductDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backProductDetailsButtonActionPerformed
        switchPanel(welcomePanel);
    }//GEN-LAST:event_backProductDetailsButtonActionPerformed

    private void backAddNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAddNewProductButtonActionPerformed
        switchPanel(productDetailsPanel);
        
    }//GEN-LAST:event_backAddNewProductButtonActionPerformed

    private void productNameModifyProductTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameModifyProductTextFieldFocusLost
        if(productNameModifyProductTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(modifyProductPanel, "One or field is empty");
            modifyProductButton.setEnabled(false);
        }
        else
        {
            modifyProductButton.setEnabled(true);
        }
    }//GEN-LAST:event_productNameModifyProductTextFieldFocusLost

    private void productNameAddNewProductTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameAddNewProductTextFieldFocusLost
        if(productNameAddNewProductTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(addProductPanel, "One or field is empty");
            addNewProductButton.setEnabled(false);
        }
        else
        {
            addNewProductButton.setEnabled(true);
        }
     
    }//GEN-LAST:event_productNameAddNewProductTextFieldFocusLost

    private void backDeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDeleteProductButtonActionPerformed
        switchPanel(productDetailsPanel);
    }//GEN-LAST:event_backDeleteProductButtonActionPerformed

    private void backModifyProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backModifyProductButtonActionPerformed
        switchPanel(productDetailsPanel);
    }//GEN-LAST:event_backModifyProductButtonActionPerformed

    private void backOverallReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backOverallReportButtonActionPerformed
        switchPanel(productReportingPanel);
    }//GEN-LAST:event_backOverallReportButtonActionPerformed

    private void backMonthyReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMonthyReportButtonActionPerformed
        switchPanel(productReportingPanel);
    }//GEN-LAST:event_backMonthyReportButtonActionPerformed

    private void backReportTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backReportTableButtonActionPerformed
        switchPanel(productReportingPanel);
    }//GEN-LAST:event_backReportTableButtonActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new MainFrameView().setVisible(true);
            }
        });       
    }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DefaultPanel;
    private javax.swing.JButton addNewProductButton;
    private javax.swing.JButton addNewProductDetailsButton;
    private javax.swing.JLabel addNewProductLabel;
    private javax.swing.JPanel addProductPanel;
    private javax.swing.JButton addQuantityButton;
    private javax.swing.JLabel authorizationLabel;
    private javax.swing.JButton backAddNewProductButton;
    private javax.swing.JButton backDeleteProductButton;
    private javax.swing.JButton backModifyProductButton;
    private javax.swing.JButton backMonthyReportButton;
    private javax.swing.JButton backOverallReportButton;
    private javax.swing.JButton backProductDetailsButton;
    private javax.swing.JButton backProductQuantityButton;
    private javax.swing.JButton backProductReportingLabel;
    private javax.swing.JButton backReportDateBasedButton;
    private javax.swing.JButton backReportTableButton;
    private javax.swing.JLabel costPerUnitAddNewProductLabel;
    private javax.swing.JTextField costPerUnitAddNewProductTextField;
    private javax.swing.JLabel costPerUnitModifyProductLabel;
    private javax.swing.JTextField costPerUnitModifyProductTextField;
    private javax.swing.JPanel dateBasedReportPanel;
    private javax.swing.JButton deleteProductButton;
    private javax.swing.JButton deleteProductDetailsButton;
    private javax.swing.JLabel deleteProductLabel;
    private javax.swing.JPanel deletelProductPanel;
    private javax.swing.JLabel displayMessageModifyProductLabel;
    private javax.swing.JLabel displayMessageProductQuantityLabel;
    private javax.swing.JLabel displayMessageReportTableLabel;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel exitDefaultPanelLabel;
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JButton generateMonthlyReportButton;
    private javax.swing.JButton generateOverallReportButton;
    private javax.swing.JButton generateReportDateBasedButton;
    private javax.swing.JLabel homeDefaultPanelLabel;
    private javax.swing.JLabel inventoryStoreLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton manageProductQuantityButton;
    private javax.swing.JLabel manageProductQuantityLabel;
    private javax.swing.JButton manipulateProductDetailsButton;
    private javax.swing.JLabel manipulateProductDetailsLabel;
    private javax.swing.JLabel minimizeDefaultPanelLabel;
    private javax.swing.JButton modifyProductButton;
    private javax.swing.JButton modifyProductDetailsButton;
    private javax.swing.JLabel modifyProductLabel;
    private javax.swing.JPanel modifyProductPanel;
    private javax.swing.JButton monthlyReportButton;
    private javax.swing.JLabel monthlyReportLabel;
    private javax.swing.JPanel monthlyReportPanel;
    private javax.swing.JOptionPane optionPane;
    private javax.swing.JButton overallReportButton;
    private javax.swing.JLabel overallReportLabel;
    private javax.swing.JPanel overallReportPanel;
    private javax.swing.JLabel passwordImageLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPanel productDetailsPanel;
    private javax.swing.JLabel productIdAddNewProductLabel;
    private javax.swing.JTextField productIdAddNewProductTextField;
    private javax.swing.JLabel productIdDeleteProductLabel;
    private javax.swing.JTextField productIdDeleteProductTextField;
    private javax.swing.JLabel productIdModifyProductLabel;
    private javax.swing.JTextField productIdModifyProductTextField;
    private javax.swing.JTextField productIdMonthlyReportTextField;
    private javax.swing.JLabel productIdMonthlylReportLabel;
    private javax.swing.JLabel productIdOverallReportLabel;
    private javax.swing.JTextField productIdOverallReportTextField;
    private javax.swing.JLabel productIdQuantityLabel;
    private javax.swing.JTextField productIdQuantityTextField;
    private javax.swing.JLabel productIdReportDateBasedLabel;
    private javax.swing.JTextField productIdReportDateBasedTextField;
    private javax.swing.JLabel productNameAddNewProductLabel;
    private javax.swing.JTextField productNameAddNewProductTextField;
    private javax.swing.JLabel productNameModifyProductLabel;
    private javax.swing.JTextField productNameModifyProductTextField;
    private javax.swing.JLabel productQuantityLabel;
    private javax.swing.JPanel productQuantityPanel;
    private javax.swing.JTextField productQuantityTextField;
    private javax.swing.JButton productReportingButton;
    private javax.swing.JLabel productReportingLabel;
    private javax.swing.JPanel productReportingPanel;
    private javax.swing.JLabel quantityAddNewProductLabel;
    private javax.swing.JTextField quantityAddNewProductTextField;
    private javax.swing.JButton removeQuantityButton;
    private javax.swing.JButton reportDateBasedButton;
    private javax.swing.JLabel reportDateBasedLabel;
    private javax.swing.JLabel reportTabelLabel;
    private javax.swing.JTable reportTable;
    private javax.swing.JPanel reportTablePanel;
    private javax.swing.JScrollPane reportTableScrollPane;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JLabel usernameImageLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JPanel welcomePanel;
    private javax.swing.JLabel welcomeWindowLabel;
    // End of variables declaration//GEN-END:variables
}

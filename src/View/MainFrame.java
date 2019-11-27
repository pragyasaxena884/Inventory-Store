package View;


import Controller.DBSum;
import UtilityPackage.*;
import com.capsys.Inventory.pojo.ProductDetails;
import java.awt.Color;
import static java.lang.Math.abs;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
*@author Pragya Saxena
* @version 
* 
* Window for application to make entry of Inventory
**/
public class MainFrame extends javax.swing.JFrame 
{
    public int posX;
    public int posY;   
    boolean flag=true;
    public MainFrame() 
    {
        this.setLocation(700, 150);
        initComponents();
    }
    int available_stock=0;
    
    public void switchPanel(JPanel panel)
    {
      layeredPane.removeAll();
      layeredPane.add(panel);
      layeredPane.repaint();
      layeredPane.revalidate();
    }
      private static java.sql.Date getCurrentDate() 
    {
        java.util.Date today=new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionPane = new javax.swing.JOptionPane();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        DefaultPanel = new javax.swing.JPanel();
        layeredPane = new javax.swing.JLayeredPane();
        loginPanel = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        inventory_store = new javax.swing.JLabel();
        pass_image = new javax.swing.JLabel();
        user_image = new javax.swing.JLabel();
        authorization = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        forgot_password = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        manipulateProduct = new javax.swing.JButton();
        manageQuantity = new javax.swing.JButton();
        productReporting = new javax.swing.JButton();
        welcome_window = new javax.swing.JLabel();
        ProductDetailsPanel = new javax.swing.JPanel();
        addProduct = new javax.swing.JButton();
        delProduct = new javax.swing.JButton();
        modProduct = new javax.swing.JButton();
        manipulate_product = new javax.swing.JLabel();
        back_button3 = new javax.swing.JButton();
        ProductQuantityPanel = new javax.swing.JPanel();
        productId_label = new javax.swing.JLabel();
        quantity_label = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        quantity1 = new javax.swing.JTextField();
        addQuantity = new javax.swing.JButton();
        removeQuantity = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        back_button1 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        ProductReportingPanel = new javax.swing.JPanel();
        monthly_report = new javax.swing.JButton();
        report_date_based = new javax.swing.JButton();
        overall_report = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        back_button2 = new javax.swing.JButton();
        AddProductPanel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        cpu = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        product_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        quant = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        DelProductPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        p_id4 = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ModProductPanel = new javax.swing.JPanel();
        id4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cpu1 = new javax.swing.JLabel();
        p_id5 = new javax.swing.JTextField();
        p_name = new javax.swing.JTextField();
        cost1 = new javax.swing.JTextField();
        modify = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        OverallReportPanel = new javax.swing.JPanel();
        id2 = new javax.swing.JLabel();
        p_id1 = new javax.swing.JTextField();
        generateReport1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        MonthlyReportPanel = new javax.swing.JPanel();
        generateReport2 = new javax.swing.JButton();
        id3 = new javax.swing.JLabel();
        p_id2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        DateBasedReportPanel = new javax.swing.JPanel();
        generateReport3 = new javax.swing.JButton();
        p_id6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        reportPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        login.setText("Sign In");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(35, 144, 173));
        password.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        password.setText("Enter Password");
        password.setToolTipText("Enter Password");
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        username.setBackground(new java.awt.Color(35, 144, 173));
        username.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        username.setText("Enter Username");
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        inventory_store.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        inventory_store.setForeground(new java.awt.Color(255, 255, 255));
        inventory_store.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventory_store.setText("Inventory Store");

        pass_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\password_32px.png")); // NOI18N

        user_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\administrator_male_26px.png")); // NOI18N

        authorization.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        authorization.setForeground(new java.awt.Color(255, 255, 255));
        authorization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorization.setText("Authorization");

        login_label.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("Login");

        pass_label.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        pass_label.setForeground(new java.awt.Color(255, 255, 255));
        pass_label.setText("Password");

        forgot_password.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        forgot_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot_password.setText("FORGOT PASSWORD?");
        forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authorization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventory_store, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass_label)
                    .addComponent(login_label)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user_image, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(forgot_password, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addComponent(inventory_store, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(authorization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(login_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(pass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgot_password)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        layeredPane.add(loginPanel, "card2");

        welcomePanel.setBackground(new java.awt.Color(35, 144, 173));

        manipulateProduct.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        manipulateProduct.setText("Manipulate Product Details");
        manipulateProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manipulateProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        manipulateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manipulateProductActionPerformed(evt);
            }
        });

        manageQuantity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        manageQuantity.setText("Manage Product Quantity");
        manageQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        manageQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageQuantityActionPerformed(evt);
            }
        });

        productReporting.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        productReporting.setText("Product Reporting");
        productReporting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        productReporting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        productReporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productReportingActionPerformed(evt);
            }
        });

        welcome_window.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        welcome_window.setForeground(new java.awt.Color(255, 255, 255));
        welcome_window.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_window.setText("Welcome Window");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome_window, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productReporting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manipulateProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(welcome_window, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(manipulateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(manageQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(productReporting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        layeredPane.add(welcomePanel, "card3");

        ProductDetailsPanel.setBackground(new java.awt.Color(35, 144, 173));

        addProduct.setBackground(new java.awt.Color(255, 255, 255));
        addProduct.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        addProduct.setText("Add New Product");
        addProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        delProduct.setBackground(new java.awt.Color(255, 255, 255));
        delProduct.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        delProduct.setText("Delete  Existing Product");
        delProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delProductActionPerformed(evt);
            }
        });

        modProduct.setBackground(new java.awt.Color(255, 255, 255));
        modProduct.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        modProduct.setText("Modify Existing Product");
        modProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modProductActionPerformed(evt);
            }
        });

        manipulate_product.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        manipulate_product.setForeground(new java.awt.Color(255, 255, 255));
        manipulate_product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manipulate_product.setText("Manipulate Product Details");

        back_button3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        back_button3.setText("Back");
        back_button3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductDetailsPanelLayout = new javax.swing.GroupLayout(ProductDetailsPanel);
        ProductDetailsPanel.setLayout(ProductDetailsPanelLayout);
        ProductDetailsPanelLayout.setHorizontalGroup(
            ProductDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manipulate_product, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(ProductDetailsPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(ProductDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProductDetailsPanelLayout.setVerticalGroup(
            ProductDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductDetailsPanelLayout.createSequentialGroup()
                .addComponent(manipulate_product, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(delProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(modProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(back_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        layeredPane.add(ProductDetailsPanel, "card4");

        ProductQuantityPanel.setBackground(new java.awt.Color(35, 144, 173));

        productId_label.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        productId_label.setForeground(new java.awt.Color(255, 255, 255));
        productId_label.setText("Product ID");

        quantity_label.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        quantity_label.setForeground(new java.awt.Color(255, 255, 255));
        quantity_label.setText("Quantity");

        p_id.setBackground(new java.awt.Color(35, 144, 173));
        p_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        p_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                p_idFocusLost(evt);
            }
        });

        quantity1.setBackground(new java.awt.Color(35, 144, 173));
        quantity1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        addQuantity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        addQuantity.setText("Add");
        addQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityActionPerformed(evt);
            }
        });

        removeQuantity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        removeQuantity.setText("Remove");
        removeQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeQuantityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Manage Product Quantity");

        back_button1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        back_button1.setText("Back");
        back_button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button1ActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        message.setForeground(new java.awt.Color(100, 7, 7));

        javax.swing.GroupLayout ProductQuantityPanelLayout = new javax.swing.GroupLayout(ProductQuantityPanel);
        ProductQuantityPanel.setLayout(ProductQuantityPanelLayout);
        ProductQuantityPanelLayout.setHorizontalGroup(
            ProductQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(ProductQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantity1)
                    .addComponent(p_id)
                    .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                        .addComponent(addQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(removeQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productId_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantity_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ProductQuantityPanelLayout.setVerticalGroup(
            ProductQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ProductQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductQuantityPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(productId_label)
                        .addGap(10, 10, 10)
                        .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(quantity_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(ProductQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuantity)
                    .addComponent(removeQuantity))
                .addGap(43, 43, 43)
                .addComponent(back_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        layeredPane.add(ProductQuantityPanel, "card5");

        ProductReportingPanel.setBackground(new java.awt.Color(35, 144, 173));

        monthly_report.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        monthly_report.setText("Monthly Report");
        monthly_report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monthly_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthly_reportActionPerformed(evt);
            }
        });

        report_date_based.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        report_date_based.setText("Report Date Based");
        report_date_based.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        report_date_based.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_date_basedActionPerformed(evt);
            }
        });

        overall_report.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        overall_report.setText("Overall Report");
        overall_report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        overall_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overall_reportActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Product Reporting");

        back_button2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        back_button2.setText("Back");
        back_button2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductReportingPanelLayout = new javax.swing.GroupLayout(ProductReportingPanel);
        ProductReportingPanel.setLayout(ProductReportingPanelLayout);
        ProductReportingPanelLayout.setHorizontalGroup(
            ProductReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProductReportingPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(ProductReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(report_date_based, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthly_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overall_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        ProductReportingPanelLayout.setVerticalGroup(
            ProductReportingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductReportingPanelLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(overall_report, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(monthly_report, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(report_date_based, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(back_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        layeredPane.add(ProductReportingPanel, "card6");

        AddProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        add.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Product Id");

        cpu.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        cpu.setForeground(new java.awt.Color(255, 255, 255));
        cpu.setText("Cost Per Unit");

        quantity.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setText("Quantity");

        product_id.setBackground(new java.awt.Color(35, 144, 173));
        product_id.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        product_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        product_name.setBackground(new java.awt.Color(35, 144, 173));
        product_name.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        product_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        product_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                product_nameFocusLost(evt);
            }
        });

        quant.setBackground(new java.awt.Color(35, 144, 173));
        quant.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        quant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        quant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantFocusLost(evt);
            }
        });

        cost.setBackground(new java.awt.Color(35, 144, 173));
        cost.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cost.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        name.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Product Name");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Add New Product");

        jButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddProductPanelLayout = new javax.swing.GroupLayout(AddProductPanel);
        AddProductPanel.setLayout(AddProductPanelLayout);
        AddProductPanelLayout.setHorizontalGroup(
            AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_id)
                    .addGroup(AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddProductPanelLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                        .addComponent(cpu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(product_name, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddProductPanelLayout.setVerticalGroup(
            AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProductPanelLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(AddProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        layeredPane.add(AddProductPanel, "card7");

        DelProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Id");

        p_id4.setBackground(new java.awt.Color(35, 144, 173));
        p_id4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        p_id4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_id4ActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        delete.setText("Delete Product");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Delete Product");

        jButton3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DelProductPanelLayout = new javax.swing.GroupLayout(DelProductPanel);
        DelProductPanel.setLayout(DelProductPanelLayout);
        DelProductPanelLayout.setHorizontalGroup(
            DelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DelProductPanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(DelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(p_id4)
                    .addGroup(DelProductPanelLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete)))
                .addGap(43, 43, 43))
        );
        DelProductPanelLayout.setVerticalGroup(
            DelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelProductPanelLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(DelProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        layeredPane.add(DelProductPanel, "card8");

        ModProductPanel.setBackground(new java.awt.Color(35, 144, 173));

        id4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        id4.setForeground(new java.awt.Color(255, 255, 255));
        id4.setText("Product Id");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name");

        cpu1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        cpu1.setForeground(new java.awt.Color(255, 255, 255));
        cpu1.setText("Cost Per Unit");

        p_id5.setBackground(new java.awt.Color(35, 144, 173));
        p_id5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        p_id5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                p_id5FocusLost(evt);
            }
        });

        p_name.setBackground(new java.awt.Color(35, 144, 173));
        p_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        p_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                p_nameFocusLost(evt);
            }
        });

        cost1.setBackground(new java.awt.Color(35, 144, 173));
        cost1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost1ActionPerformed(evt);
            }
        });

        modify.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        modify.setText("Modify Product");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Modify Product");

        message3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        message3.setForeground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModProductPanelLayout = new javax.swing.GroupLayout(ModProductPanel);
        ModProductPanel.setLayout(ModProductPanelLayout);
        ModProductPanelLayout.setHorizontalGroup(
            ModProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(ModProductPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(ModProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(id4)
                    .addComponent(cpu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cost1)
                    .addComponent(p_name)
                    .addComponent(p_id5, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(message3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModProductPanelLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModProductPanelLayout.setVerticalGroup(
            ModProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModProductPanelLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id4)
                .addGap(10, 10, 10)
                .addComponent(p_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cpu1)
                .addGap(10, 10, 10)
                .addComponent(cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(ModProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        layeredPane.add(ModProductPanel, "card9");

        OverallReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        id2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        id2.setForeground(new java.awt.Color(255, 255, 255));
        id2.setText("Product Id");

        p_id1.setBackground(new java.awt.Color(35, 144, 173));
        p_id1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        generateReport1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateReport1.setText("Generate Report");
        generateReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReport1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Overall Report");

        jButton5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OverallReportPanelLayout = new javax.swing.GroupLayout(OverallReportPanel);
        OverallReportPanel.setLayout(OverallReportPanelLayout);
        OverallReportPanelLayout.setHorizontalGroup(
            OverallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverallReportPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(OverallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_id1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(OverallReportPanelLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateReport1)))
                .addGap(45, 45, 45))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OverallReportPanelLayout.setVerticalGroup(
            OverallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverallReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(OverallReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generateReport1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        layeredPane.add(OverallReportPanel, "card10");

        MonthlyReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        generateReport2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateReport2.setText("Generate Report");
        generateReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReport2ActionPerformed(evt);
            }
        });

        id3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        id3.setForeground(new java.awt.Color(255, 255, 255));
        id3.setText("Product Id");

        p_id2.setBackground(new java.awt.Color(35, 144, 173));
        p_id2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        p_id2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Monthly Report");

        jButton6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MonthlyReportPanelLayout = new javax.swing.GroupLayout(MonthlyReportPanel);
        MonthlyReportPanel.setLayout(MonthlyReportPanelLayout);
        MonthlyReportPanelLayout.setHorizontalGroup(
            MonthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonthlyReportPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(MonthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p_id2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MonthlyReportPanelLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        MonthlyReportPanelLayout.setVerticalGroup(
            MonthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonthlyReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(p_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(MonthlyReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        layeredPane.add(MonthlyReportPanel, "card11");

        DateBasedReportPanel.setBackground(new java.awt.Color(35, 144, 173));

        generateReport3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        generateReport3.setText("Generate Report");
        generateReport3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReport3ActionPerformed(evt);
            }
        });

        p_id6.setBackground(new java.awt.Color(35, 144, 173));
        p_id6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("End Date");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Start Date");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product Id");

        jLabel18.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Report Date Based");

        startDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        startDate.setDateFormatString("dd-MM-yyyy");
        startDate.setMaxSelectableDate(new java.util.Date());
        ((JTextField)(startDate.getComponent(1))).setBackground(new Color(35,144,173));

        endDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        endDate.setMaxSelectableDate(new java.util.Date());
        ((JTextField)(endDate.getComponent(1))).setBackground(new Color(35,144,173));

        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DateBasedReportPanelLayout = new javax.swing.GroupLayout(DateBasedReportPanel);
        DateBasedReportPanel.setLayout(DateBasedReportPanelLayout);
        DateBasedReportPanelLayout.setHorizontalGroup(
            DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DateBasedReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(DateBasedReportPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_id6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(DateBasedReportPanelLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generateReport3))
                            .addComponent(endDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DateBasedReportPanelLayout.setVerticalGroup(
            DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DateBasedReportPanelLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p_id6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(DateBasedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReport3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );

        layeredPane.add(DateBasedReportPanel, "card12");

        reportPanel.setBackground(new java.awt.Color(35, 144, 173));

        table.setBackground(new java.awt.Color(35, 144, 173));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setEditingColumn(0);
        table.setEditingRow(0);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Report Table");

        message1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton7.setText("Back");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton7)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        layeredPane.add(reportPanel, "card13");

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\cancel_30px.png")); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\home_32px.png")); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pragya\\Desktop\\icons\\minimize_window_24px.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DefaultPanelLayout = new javax.swing.GroupLayout(DefaultPanel);
        DefaultPanel.setLayout(DefaultPanelLayout);
        DefaultPanelLayout.setHorizontalGroup(
            DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DefaultPanelLayout.createSequentialGroup()
                        .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DefaultPanelLayout.createSequentialGroup()
                        .addComponent(home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)))
                .addContainerGap())
        );
        DefaultPanelLayout.setVerticalGroup(
            DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DefaultPanelLayout.createSequentialGroup()
                .addGroup(DefaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new Color(203,0,54));
        login.setForeground(Color.WHITE);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(Color.WHITE);
        login.setForeground(new Color(203,0,54));
    }//GEN-LAST:event_loginMouseExited

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getToolTipText().equals(password.getText()))
        {
            password.setEchoChar('*');
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(username.getText().equals("Enter Username"))
        { username.setText(""); }
    }//GEN-LAST:event_usernameFocusGained

    private void manipulateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manipulateProductActionPerformed
       switchPanel(ProductDetailsPanel);
    }//GEN-LAST:event_manipulateProductActionPerformed

    private void manageQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageQuantityActionPerformed
       switchPanel(ProductQuantityPanel);
    }//GEN-LAST:event_manageQuantityActionPerformed

    private void productReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productReportingActionPerformed
       switchPanel(ProductReportingPanel);
    }//GEN-LAST:event_productReportingActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
       switchPanel(AddProductPanel);
    }//GEN-LAST:event_addProductActionPerformed

    private void delProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delProductActionPerformed
       switchPanel(DelProductPanel);
    }//GEN-LAST:event_delProductActionPerformed

    private void modProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modProductActionPerformed
       switchPanel(ModProductPanel);
    }//GEN-LAST:event_modProductActionPerformed

    private void monthly_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthly_reportActionPerformed
       switchPanel(MonthlyReportPanel);
    }//GEN-LAST:event_monthly_reportActionPerformed

    private void report_date_basedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_date_basedActionPerformed
       switchPanel(DateBasedReportPanel);
    }//GEN-LAST:event_report_date_basedActionPerformed

    private void overall_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overall_reportActionPerformed
       switchPanel(OverallReportPanel);
    }//GEN-LAST:event_overall_reportActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        DBAccess db=new DBAccess();
        Connection con=db.getCon();
        Validation validateProductDetails=new Validation();
        int rs=0,rs1;
        try{
            PreparedStatement preparedStat=con.prepareCall("insert into product_details values(?,?,?,?)");
            PreparedStatement preparedStat1=con.prepareCall("insert into quantity values(?,?,?)");
            
               
            if(validateProductDetails.checkLen(Long.parseLong(product_id.getText()))==true)
            {
            preparedStat.setString(1, product_id.getText());
            if(!Validation.isEmptyString(product_name.getText()))
            {
                Validation.promptValidationMsg(loginPanel, "Product Name Empty");
            }
            
            preparedStat.setString(2, product_name.getText());

            preparedStat.setString(3, cost.getText());
            
            preparedStat.setDate(4,getCurrentDate());
           
            preparedStat1.setInt(1, Integer.parseInt(quant.getText()));
            
            preparedStat1.setInt(2, Integer.parseInt(product_id.getText()));
            
            preparedStat1.setDate(3, getCurrentDate());
            rs=preparedStat.executeUpdate();
            rs1=preparedStat1.executeUpdate();
            
            int a=JOptionPane.showConfirmDialog(AddProductPanel,"Product Added "+"\n"+"Do you want to add more products?");
            
                switch (a) 
                {
                    case JOptionPane.YES_OPTION:
                        product_id.setText("");
                        product_name.setText("");
                        cost.setText("");
                        quant.setText("");
                        break;
                    case JOptionPane.NO_OPTION:
                        switchPanel(ProductDetailsPanel);
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        break;
                    default:
                        JOptionPane.showMessageDialog(AddProductPanel,"Enter 10-digit product ID");
                        break;
                }
                product_id.setText("");
                product_name.setText("");
                cost.setText("");
                quant.setText("");
            }
            else
            {
               JOptionPane.showMessageDialog(AddProductPanel,"Enter 10-digit product ID"); 
            }
        
       
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(AddProductPanel,"One or more fields are empty");
        }
        catch(SQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(AddProductPanel,"ID already exists: Try Again");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(AddProductPanel,"Unknown Error Occurred");
        }

    }//GEN-LAST:event_addActionPerformed

    private void generateReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReport2ActionPerformed
        Connection con=new DBAccess().getCon();
      
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID", "Quantity" , "Purchase Date"}, 0);
        
        try{
            
            if(new Validation().existID(Long.parseLong(p_id2.getText()))==true)
            {
            PreparedStatement preparedStat=con.prepareCall("select * from quantity where p_id=? AND purchse_date BETWEEN ? and ?");
            preparedStat.setLong(1,Long.parseLong(p_id2.getText()));
            java.sql.Date d=java.sql.Date.valueOf(new DBSum().get_month());
            preparedStat.setDate(2, d);
            preparedStat.setDate(3, getCurrentDate());
            
            ResultSet rs=preparedStat.executeQuery();
            while(rs.next())
            {
                String p_id=rs.getString("p_id");
                int q=rs.getInt("quantity_remove");
                Date date=rs.getDate("purchse_date");
                model.addRow(new Object[]{p_id,q,date});
            }
                table.setModel(model);
                System.out.println("Table:"+table.getRowCount());
                
                
                
                int sum=new DBSum().sum_quantity(Long.parseLong(p_id2.getText()));
                message1.setText("Available Stock: " + sum );
           }
            else
            {
                JOptionPane.showMessageDialog(MonthlyReportPanel, "Id does not exist");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        switchPanel(reportPanel);
    }//GEN-LAST:event_generateReport2ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if("admin".equals(username.getText())&& "pass".equals(password.getText()))
        {switchPanel(welcomePanel);}
        else
        {JOptionPane.showMessageDialog(loginPanel,"Username and password mismatch");}  
    }//GEN-LAST:event_loginActionPerformed

    private void generateReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReport1ActionPerformed
        Connection con=new DBAccess().getCon();
        Validation v=new Validation();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID","Quantity","Purchase Date"}, 0);
     
        try{
            if(new Validation().existID(Long.parseLong(p_id1.getText()))==true)
            {
            PreparedStatement preparedStat=con.prepareCall("select * from quantity where p_id=?");
            preparedStat.setLong(1,Long.parseLong(p_id1.getText()));
            ResultSet rs=preparedStat.executeQuery();
            while(rs.next())
            {
                String p_id=rs.getString("p_id");
                int q=rs.getInt("quantity_remove");
                Date date=rs.getDate("purchse_date");
                model.addRow(new Object[]{p_id,q,date});
            }
            table.setModel(model);
            int sum=new DBSum().sum_quantity(Long.parseLong(p_id1.getText()));
            message1.setText("Available Stock: " + sum );
           }
            else 
            {
              JOptionPane.showMessageDialog(OverallReportPanel,"ID does not exist");  
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        if(v.selectQuantity().isEmpty()){
            
        }else{
            for (Iterator<ProductDetails> it = v.selectQuantity().iterator(); it.hasNext();) {
                ProductDetails productDetailsObj= it.next();
                model.addRow(new Object[]{productDetailsObj.getProductId(),});
            }
        }
        switchPanel(reportPanel);
    }//GEN-LAST:event_generateReport1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DBAccess db=new DBAccess();
        Connection con=db.getCon();
        Validation v=new Validation();
        try{
            long n=Long.parseLong(p_id4.getText());
            PreparedStatement ps=con.prepareCall("delete from product_details where product_id =?");
            if(v.existID(Long.parseLong(p_id4.getText()))==true)
            {
            ps.setLong(1, n);
            int rs=ps.executeUpdate();
            JOptionPane.showMessageDialog(DelProductPanel,"Product deleted");
            } 
            else{JOptionPane.showMessageDialog(DelProductPanel,"Product id does not exist");}
            }
        
        catch(Exception e)
        {JOptionPane.showMessageDialog(DelProductPanel,"Unknown Error Occurred");}
    }//GEN-LAST:event_deleteActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        DBAccess db=new DBAccess();
        Connection con=db.getCon();
        try
        {
            
            long n=Long.parseLong(p_id5.getText());
            String str=p_name.getText();
            float c=Float.parseFloat(cost1.getText());
             
            PreparedStatement ps=con.prepareCall("update product_details set product_name=?,cost=? where product_id=?");
            ps.setLong(3, n);
            ps.setString(1, str);
            ps.setFloat(2, c);
            
            int rs=ps.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(ModProductPanel,"Product Updated");
                p_id5.setText("");
                p_name.setText("");
                cost1.setText("");
            }
            else
            {JOptionPane.showMessageDialog(ModProductPanel,"Product not updated");}
            
            }

       
        catch(java.lang.NumberFormatException e)
        {
            JOptionPane.showMessageDialog(ModProductPanel,"One or more fields are empty");
        }
        catch(Exception e)
        {System.out.println(e);}
    }//GEN-LAST:event_modifyActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        switchPanel(welcomePanel);
        
    }//GEN-LAST:event_homeMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_formMouseDragged

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(username.getText().isEmpty())
        { username.setText("Enter Username"); }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().isEmpty())
        {   password.setEchoChar((char)0);
            password.setText("Enter Password");   
        }
    }//GEN-LAST:event_passwordFocusLost

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void back_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button1ActionPerformed
        p_id.setText("");
        quantity1.setText("");
        
        switchPanel(welcomePanel);
    }//GEN-LAST:event_back_button1ActionPerformed

    private void generateReport3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReport3ActionPerformed
        Connection con=new DBAccess().getCon();
        DBSum cf=new DBSum();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product ID", "Quantity", "Purchase Date"}, 0);
        try{   
            PreparedStatement preparedStat=con.prepareStatement("select * from quantity where purchse_date BETWEEN ? and ? AND p_id=?");
            preparedStat.setDate(1, new java.sql.Date(startDate.getDate().getTime()));
            preparedStat.setDate(2, new java.sql.Date(endDate.getDate().getTime()));
            preparedStat.setInt(3,Integer.parseInt(p_id6.getText()));
            ResultSet rs=preparedStat.executeQuery();
   
            while(rs.next())
            {
                String p_id=rs.getString("p_id");
                int q=rs.getInt("quantity_remove");
                Date date=rs.getDate("purchse_date");
                model.addRow(new Object[]{p_id,q,date});
                
            }
            table.setModel(model);
            if(table.getRowCount()!=0)
            {int sum=cf.sum_quantity(Long.parseLong(p_id6.getText()));
            message1.setText("Available Stock: " + sum );}
         }
        
        catch(Exception e)
        {System.out.println(e);}
        switchPanel(reportPanel);
    }//GEN-LAST:event_generateReport3ActionPerformed

    private void addQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityActionPerformed
        Connection con=new DBAccess().getCon();
        int rs=0;
        try{   
            PreparedStatement preparedStat=con.prepareStatement("insert into quantity values(?,?,?)");
            
            if(Integer.parseInt(quantity1.getText())>0)
            {
            preparedStat.setInt(1,Integer.parseInt(quantity1.getText()));
            preparedStat.setLong(2,Long.parseLong(p_id.getText()));
            preparedStat.setDate(3,getCurrentDate());
            rs=preparedStat.executeUpdate();
            }
            else
            {
            JOptionPane.showMessageDialog(ProductQuantityPanel,"Quantity can not be negative");
            }
            
            
            if(rs>0)
            {
                JOptionPane.showMessageDialog(ProductQuantityPanel,"Quantity Updated");
            }
            
            
       }
        
        catch(Exception e)
        {System.out.println(e);}
    }//GEN-LAST:event_addQuantityActionPerformed

    private void p_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p_idFocusLost
        Validation val=new Validation();
        if(val.existID(Long.parseLong(p_id.getText()))==false)
        {
            message.setText("Product_Id not exist");
            addQuantity.setEnabled(false);
        }
        else
        {
            message.setText(" ");
            addQuantity.setEnabled(true);   
        }
        
    }//GEN-LAST:event_p_idFocusLost

    private void removeQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeQuantityActionPerformed
       Connection con=new DBAccess().getCon();
       int i=1; int sum=0;
     
        try{   
            PreparedStatement preparedStat=con.prepareStatement("select quantity_remove from quantity");
            PreparedStatement preparedStat1=con.prepareStatement("insert into quantity values(?,?,?)");
            ResultSet rs=preparedStat.executeQuery();
            
            while(rs.next())
            {
            sum+=rs.getInt(i);}i++;   
            System.out.println(sum);
            int n= -1*abs(Integer.parseInt(quantity1.getText()));
            
            if(n<=sum)
            {
            available_stock=sum-n;
            preparedStat1.setInt(1,n);
            preparedStat1.setLong(2, Long.parseLong(p_id.getText()));
            preparedStat1.setDate(3, getCurrentDate());
            int result_set=preparedStat1.executeUpdate();
            System.out.println(available_stock);
            }
            else
            {
            JOptionPane.showMessageDialog(ProductQuantityPanel,"Not enough Quantity");
            }
          
           
            
            
            
       }
        
        catch(Exception e)
        {System.out.println(e);}
    }//GEN-LAST:event_removeQuantityActionPerformed

    private void quantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantFocusLost
        if(Integer.parseInt(quant.getText())<0)
        {
        JOptionPane.showMessageDialog(AddProductPanel,"Quantity can not be negative");
        }
          
    }//GEN-LAST:event_quantFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void forgot_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_passwordMouseClicked
        JOptionPane.showMessageDialog(loginPanel,"Contact the administrator");
    }//GEN-LAST:event_forgot_passwordMouseClicked

    private void p_id4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_id4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_id4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switchPanel(ProductReportingPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void back_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button2ActionPerformed
        switchPanel(welcomePanel);
    }//GEN-LAST:event_back_button2ActionPerformed

    private void cost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost1ActionPerformed

    private void p_id5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p_id5FocusLost
        if(new Validation().existID(Long.parseLong(p_id5.getText()))==false)
        {
           message3.setText("Product ID does not exist");
           p_id5.setText("");
           modify.setEnabled(false);
        }
        else
        {
            message3.setText("");
            modify.setEnabled(true);
        }
    }//GEN-LAST:event_p_id5FocusLost

    private void back_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button3ActionPerformed
        switchPanel(welcomePanel);
    }//GEN-LAST:event_back_button3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switchPanel(ProductDetailsPanel);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p_nameFocusLost
        if(p_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(ModProductPanel, "One or field is empty");
            modify.setEnabled(false);
        }
        else
        {
            modify.setEnabled(true);
        }
    }//GEN-LAST:event_p_nameFocusLost

    private void product_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_product_nameFocusLost
        if(product_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(AddProductPanel, "One or field is empty");
            add.setEnabled(false);
        }
        else
        {
            add.setEnabled(true);
        }
     
    }//GEN-LAST:event_product_nameFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switchPanel(ProductDetailsPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switchPanel(ProductDetailsPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        switchPanel(ProductReportingPanel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        switchPanel(ProductReportingPanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        switchPanel(ProductReportingPanel);
    }//GEN-LAST:event_jButton7ActionPerformed
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });       
    }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddProductPanel;
    private javax.swing.JPanel DateBasedReportPanel;
    private javax.swing.JPanel DefaultPanel;
    private javax.swing.JPanel DelProductPanel;
    private javax.swing.JPanel ModProductPanel;
    private javax.swing.JPanel MonthlyReportPanel;
    private javax.swing.JPanel OverallReportPanel;
    private javax.swing.JPanel ProductDetailsPanel;
    private javax.swing.JPanel ProductQuantityPanel;
    private javax.swing.JPanel ProductReportingPanel;
    private javax.swing.JButton add;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton addQuantity;
    private javax.swing.JLabel authorization;
    private javax.swing.JButton back_button1;
    private javax.swing.JButton back_button2;
    private javax.swing.JButton back_button3;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField cost1;
    private javax.swing.JLabel cpu;
    private javax.swing.JLabel cpu1;
    private javax.swing.JButton delProduct;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel forgot_password;
    private javax.swing.JButton generateReport1;
    private javax.swing.JButton generateReport2;
    private javax.swing.JButton generateReport3;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel inventory_store;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel login_label;
    private javax.swing.JButton manageQuantity;
    private javax.swing.JButton manipulateProduct;
    private javax.swing.JLabel manipulate_product;
    private javax.swing.JLabel message;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message3;
    private javax.swing.JButton modProduct;
    private javax.swing.JButton modify;
    private javax.swing.JButton monthly_report;
    private javax.swing.JLabel name;
    private javax.swing.JOptionPane optionPane;
    private javax.swing.JButton overall_report;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_id1;
    private javax.swing.JTextField p_id2;
    private javax.swing.JTextField p_id4;
    private javax.swing.JTextField p_id5;
    private javax.swing.JTextField p_id6;
    private javax.swing.JTextField p_name;
    private javax.swing.JLabel pass_image;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel productId_label;
    private javax.swing.JButton productReporting;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_name;
    private javax.swing.JTextField quant;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantity1;
    private javax.swing.JLabel quantity_label;
    private javax.swing.JButton removeQuantity;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton report_date_based;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JTable table;
    private javax.swing.JLabel user_image;
    private javax.swing.JTextField username;
    private javax.swing.JPanel welcomePanel;
    private javax.swing.JLabel welcome_window;
    // End of variables declaration//GEN-END:variables
}

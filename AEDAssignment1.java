
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ecs
 */
public class AEDAssignment1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AEDAssignment1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel Name = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        javax.swing.JLabel Age = new javax.swing.JLabel();
        TFEID = new javax.swing.JTextField();
        javax.swing.JLabel EID = new javax.swing.JLabel();
        javax.swing.JLabel Gender = new javax.swing.JLabel();
        javax.swing.JLabel Level = new javax.swing.JLabel();
        javax.swing.JLabel Start_date = new javax.swing.JLabel();
        javax.swing.JLabel Pos_title = new javax.swing.JLabel();
        javax.swing.JLabel Team_info = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel Cell = new javax.swing.JLabel();
        javax.swing.JLabel Email = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        TFcell = new javax.swing.JTextField();
        TFpostitle = new javax.swing.JTextField();
        TFteaminfo = new javax.swing.JTextField();
        TFlevel = new javax.swing.JTextField();
        TFage = new javax.swing.JTextField();
        TFgender = new javax.swing.JTextField();
        TFstartdate = new javax.swing.JTextField();
        javax.swing.JButton Submit = new javax.swing.JButton();
        javax.swing.JButton Clear = new javax.swing.JButton();
        javax.swing.JLabel Photo = new javax.swing.JLabel();
        TFphoto = new javax.swing.JTextField();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        javax.swing.JButton Delete = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        TFsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(795, 489));
        setPreferredSize(new java.awt.Dimension(998, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE DATABASE:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 974, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 0, 14)), " New Data:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Unicode MS", 1, 18), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jPanel2.setOpaque(false);

        Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Name.setText("Name:");

        TFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnameActionPerformed(evt);
            }
        });

        Age.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Age.setText("Age:");

        TFEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEIDActionPerformed(evt);
            }
        });

        EID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EID.setText("Employee ID: ");

        Gender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Gender.setText("Gender:");

        Level.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Level.setText("Level:");

        Start_date.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Start_date.setText("Start Date:");

        Pos_title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Pos_title.setText("Position Title:");

        Team_info.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Team_info.setText("Team Info.: ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Contact:");

        Cell.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cell.setText("Cell Phone:");

        Email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Email.setText("Email ID:");

        TFemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFemailActionPerformed(evt);
            }
        });

        TFcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcellActionPerformed(evt);
            }
        });

        TFpostitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpostitleActionPerformed(evt);
            }
        });

        TFteaminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFteaminfoActionPerformed(evt);
            }
        });

        TFlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFlevelActionPerformed(evt);
            }
        });

        TFage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFageActionPerformed(evt);
            }
        });

        TFgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFgenderActionPerformed(evt);
            }
        });

        TFstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFstartdateActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Submit.setText("Submit Data");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Clear.setText("Clear Data");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Photo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Photo.setText("Profile Photo:");

        TFphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFphotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Team_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Start_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Pos_title, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFname)
                    .addComponent(TFEID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFteaminfo)
                    .addComponent(TFlevel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFpostitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFgender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TFstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TFcell, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Cell, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFphoto)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Team_info, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos_title, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TFcell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFphoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Clear))
                .addGap(105, 105, 105))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 974, 470));

        Table.setAutoCreateRowSorter(true);
        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone", "Email ID", "Profile Photo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setDropMode(javax.swing.DropMode.ON);
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 536, 1370, 410));

        Delete.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Delete.setText("Delete Data");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        Delete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DeleteKeyReleased(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 119, 30));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        search.setText("Search:");
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        TFsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsearchActionPerformed(evt);
            }
        });
        TFsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFsearchKeyReleased(evt);
            }
        });
        jPanel1.add(TFsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 502, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnameActionPerformed

    private void TFEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEIDActionPerformed

    private void TFemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFemailActionPerformed

    private void TFcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcellActionPerformed

    private void TFpostitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpostitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpostitleActionPerformed

    private void TFteaminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFteaminfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFteaminfoActionPerformed

    private void TFlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFlevelActionPerformed

    private void TFageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFageActionPerformed

    private void TFgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFgenderActionPerformed

    private void TFstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFstartdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFstartdateActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String Name = TFname.getText();
        String EID = TFEID.getText();
        String Age = TFage.getText();
        String Gender = TFgender.getText();
        String Start_Date = TFstartdate.getText();
        String Level = TFlevel.getText();
        String Team_info = TFteaminfo.getText();
        String Pos_title = TFpostitle.getText();
        String Cell = TFcell.getText();
        String Email = TFemail.getText();
        
        if (Name.isEmpty() || EID.isEmpty() || Age.isEmpty() || Gender.isEmpty() || Start_Date.isEmpty() || Level.isEmpty() || Team_info.isEmpty() || Pos_title.isEmpty() || Cell.isEmpty() || Email.isEmpty())
        {
           JOptionPane.showMessageDialog(this,
                                         "Please Enter Data In All Fields",
                                         "Try Again",
                                         JOptionPane.ERROR_MESSAGE);
        } else
        { 
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.addRow(new Object[]{Name, EID, Age, Gender, Start_Date, Level, Team_info, Pos_title, Cell, Email });
            
            TFname.setText("");
            TFEID.setText("");
            TFage.setText("");
            TFgender.setText("");
            TFstartdate.setText("");
            TFlevel.setText("");
            TFteaminfo.setText("");
            TFpostitle.setText(""); 
            TFcell.setText("");
            TFemail.setText("");
        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
            TFname.setText("");
            TFEID.setText("");
            TFage.setText("");
            TFgender.setText("");
            TFstartdate.setText("");
            TFlevel.setText("");
            TFteaminfo.setText("");
            TFpostitle.setText(""); 
            TFcell.setText("");
            TFemail.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
           int row = Table.getSelectedRow();
           
           if(row <0)
           {
               JOptionPane.showMessageDialog(this,
                                              "Please Select a Row.",
                                              "Select Row",
                                              JOptionPane.ERROR_MESSAGE);
           } else
           {
               DefaultTableModel model = (DefaultTableModel) Table.getModel();
               model.removeRow(row);
           }
    }//GEN-LAST:event_DeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        // saving obj in a file
        try
        {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            //serialization of obj
            output.writeObject(tableData);
            
            output.close();
            file.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         try
        {
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            //deserialization of obj
            Vector<Vector> tableData = (Vector<Vector>)input.readObject();
            
            input.close();
            file.close();
            
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            for (int i = 0; i<tableData.size(); i++)
            {
                Vector row = tableData.get(i);
                model.addRow(new Object[]{row.get(0), row.get(1), 
                             row.get(2), row.get(3), row.get(4),
                             row.get(5), row.get(6), row.get(6), 
                             row.get(7), row.get(8), row.get(9)});
            }   
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void TFphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFphotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFphotoActionPerformed

    private void TFsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsearchActionPerformed
       
    }//GEN-LAST:event_TFsearchActionPerformed

    private void TFsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFsearchKeyReleased
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(TFsearch.getText().trim()));
        
    }//GEN-LAST:event_TFsearchKeyReleased

    private void DeleteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteKeyReleased
        int row = Table.getSelectedRow();
           
           if(row <0)
           {
               JOptionPane.showMessageDialog(this,
                                              "Please Select a Row.",
                                              "Select Row",
                                              JOptionPane.ERROR_MESSAGE);
           } else
           {
               DefaultTableModel model = (DefaultTableModel) Table.getModel();
               model.removeRow(row);
           }
    }//GEN-LAST:event_DeleteKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFEID;
    private javax.swing.JTextField TFage;
    private javax.swing.JTextField TFcell;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFgender;
    private javax.swing.JTextField TFlevel;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFphoto;
    private javax.swing.JTextField TFpostitle;
    private javax.swing.JTextField TFsearch;
    private javax.swing.JTextField TFstartdate;
    private javax.swing.JTextField TFteaminfo;
    private javax.swing.JTable Table;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables

    private void searchTableContents(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

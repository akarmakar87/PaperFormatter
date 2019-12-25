/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperformatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


//import org.apache.poi.*;

/**
 *
 * @author karmakar_896187
 */
public class MainWindowFormatter extends javax.swing.JFrame {

    /**
     * Creates new form MainWindowFormatter
     */
    
    String essay; 
    String bibliography; 
    
    String name;
    String className;
    String teacher;
    String date;

    TreeSet<Quotes> quotes;
    TreeSet<Source> sources;

    
    public MainWindowFormatter() {
        initComponents();
        
        essay = "";
        bibliography = "";
        name = "";
        className = "";
        teacher = "";
        date = "";       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tabbedPane = new javax.swing.JTabbedPane();
        pane_files = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor_essayText = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        editor_bibText = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        button_bibFile = new java.awt.Button();
        button_essayFile = new java.awt.Button();
        label_essayFile = new java.awt.Label();
        label_bibFile = new java.awt.Label();
        pane_simulator = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_sources = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        editor_sourcesText = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        radio_APA = new javax.swing.JRadioButton();
        radio_MLA = new javax.swing.JRadioButton();
        pane_simulator1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        editor_finalText = new javax.swing.JEditorPane();
        button_saveAs = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        radio_PDF = new javax.swing.JRadioButton();
        radio_wordDoc = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        text_studentName = new javax.swing.JTextField();
        text_class = new javax.swing.JTextField();
        text_period = new javax.swing.JTextField();
        text_teacher = new javax.swing.JTextField();
        text_date = new javax.swing.JTextField();
        button_generateFinal = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("OR      Paste Text:");

        editor_essayText.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                editor_essayTextComponentAdded(evt);
            }
        });
        editor_essayText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editor_essayTextFocusGained(evt);
            }
        });
        editor_essayText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                editor_essayTextPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(editor_essayText);

        jScrollPane2.setViewportView(editor_bibText);

        jLabel5.setText("OR      Paste Text:");

        button_bibFile.setLabel("Upload References (Word Document): ");
        button_bibFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bibFileActionPerformed(evt);
            }
        });

        button_essayFile.setLabel("Upload Paper (Word Document): ");
        button_essayFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_essayFileActionPerformed(evt);
            }
        });

        label_essayFile.setText("label1");

        label_bibFile.setText("label2");

        javax.swing.GroupLayout pane_filesLayout = new javax.swing.GroupLayout(pane_files);
        pane_files.setLayout(pane_filesLayout);
        pane_filesLayout.setHorizontalGroup(
            pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_filesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_filesLayout.createSequentialGroup()
                        .addComponent(button_essayFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_filesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(80, 80, 80))
                            .addGroup(pane_filesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_essayFile, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pane_filesLayout.createSequentialGroup()
                        .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane_filesLayout.createSequentialGroup()
                        .addComponent(button_bibFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_bibFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 297, Short.MAX_VALUE))
        );
        pane_filesLayout.setVerticalGroup(
            pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_filesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_bibFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane_filesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_essayFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pane_filesLayout.createSequentialGroup()
                                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_bibFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_essayFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pane_filesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(58, 58, 58))
        );

        label_essayFile.getAccessibleContext().setAccessibleName("file name");

        tabbedPane.addTab("Files", pane_files);

        table_sources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Quote"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_sources);

        jScrollPane4.setViewportView(editor_sourcesText);

        jLabel9.setText("In-text Citations:");

        radio_APA.setLabel("APA");
        radio_APA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_APAActionPerformed(evt);
            }
        });

        radio_MLA.setText("MLA");
        radio_MLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_MLAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_simulatorLayout = new javax.swing.GroupLayout(pane_simulator);
        pane_simulator.setLayout(pane_simulatorLayout);
        pane_simulatorLayout.setHorizontalGroup(
            pane_simulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_simulatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pane_simulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_simulatorLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(radio_APA)
                        .addGap(18, 18, 18)
                        .addComponent(radio_MLA)
                        .addContainerGap(734, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)))
        );
        pane_simulatorLayout.setVerticalGroup(
            pane_simulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_simulatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_simulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane_simulatorLayout.createSequentialGroup()
                        .addGroup(pane_simulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(radio_APA)
                            .addComponent(radio_MLA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Sources", pane_simulator);

        jScrollPane6.setViewportView(editor_finalText);

        button_saveAs.setText("Save As");
        button_saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveAsActionPerformed(evt);
            }
        });

        button_save.setText("Save");
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        radio_PDF.setText("PDF");
        radio_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_PDFActionPerformed(evt);
            }
        });

        radio_wordDoc.setText("Word Document");
        radio_wordDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_wordDocActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter Heading Information:");

        jLabel12.setText("Student Name:");

        jLabel13.setText("Class:");

        jLabel14.setText("Period:");

        jLabel15.setText("Teacher:");

        jLabel16.setText("Date:");

        text_studentName.setText("jTextField1");

        text_class.setText("jTextField2");
        text_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_classActionPerformed(evt);
            }
        });

        text_period.setText("jTextField2");

        text_teacher.setText("jTextField2");

        text_date.setText("jTextField2");

        button_generateFinal.setText("Generate Final Paper");
        button_generateFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_generateFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_simulator1Layout = new javax.swing.GroupLayout(pane_simulator1);
        pane_simulator1.setLayout(pane_simulator1Layout);
        pane_simulator1Layout.setHorizontalGroup(
            pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_simulator1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_simulator1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_simulator1Layout.createSequentialGroup()
                                .addComponent(button_saveAs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radio_wordDoc)
                            .addComponent(radio_PDF))
                        .addGap(55, 55, 55)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(pane_simulator1Layout.createSequentialGroup()
                                .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)))
                    .addComponent(button_generateFinal))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        pane_simulator1Layout.setVerticalGroup(
            pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_simulator1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_generateFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane_simulator1Layout.createSequentialGroup()
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_saveAs)
                            .addComponent(button_save))
                        .addGap(32, 32, 32)
                        .addComponent(radio_wordDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_PDF))
                    .addGroup(pane_simulator1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_period, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_simulator1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pane_simulator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(386, 386, 386))
        );

        tabbedPane.addTab("Format", pane_simulator1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_MLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_MLAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_MLAActionPerformed

    private void radio_APAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_APAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_APAActionPerformed

    private void button_essayFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_essayFileActionPerformed
        
        /*if(editor_essayText.getText() != null){
            essay =  new Scanner(editor_essayText.getText());
        }*/
        
        
            // TODO add your handling code here:
            
            File f;
            JFileChooser jfc = new JFileChooser();
            
            if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                f = jfc.getSelectedFile();
            else
                return;
            
            label_essayFile.setText(f.getName());
                 
            loadFileText(f,true);
    }//GEN-LAST:event_button_essayFileActionPerformed

    private void button_bibFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bibFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_bibFileActionPerformed

    private void radio_wordDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_wordDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_wordDocActionPerformed

    private void radio_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_PDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_PDFActionPerformed

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saveActionPerformed

    private void button_saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saveAsActionPerformed

    private void text_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_classActionPerformed

    private void button_generateFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_generateFinalActionPerformed

    private void editor_essayTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_editor_essayTextPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editor_essayTextPropertyChange

    private void editor_essayTextComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_editor_essayTextComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editor_essayTextComponentAdded

    private void editor_essayTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editor_essayTextFocusGained
        // TODO add your handling code here:
        System.out.println("something changed");
    }//GEN-LAST:event_editor_essayTextFocusGained

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
            java.util.logging.Logger.getLogger(MainWindowFormatter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindowFormatter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindowFormatter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindowFormatter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindowFormatter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Button button_bibFile;
    private java.awt.Button button_essayFile;
    private javax.swing.JButton button_generateFinal;
    private javax.swing.JButton button_save;
    private javax.swing.JButton button_saveAs;
    private javax.swing.JEditorPane editor_bibText;
    private javax.swing.JEditorPane editor_essayText;
    private javax.swing.JEditorPane editor_finalText;
    private javax.swing.JEditorPane editor_sourcesText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label_bibFile;
    private java.awt.Label label_essayFile;
    private javax.swing.JPanel pane_files;
    private javax.swing.JPanel pane_simulator;
    private javax.swing.JPanel pane_simulator1;
    private javax.swing.JRadioButton radio_APA;
    private javax.swing.JRadioButton radio_MLA;
    private javax.swing.JRadioButton radio_PDF;
    private javax.swing.JRadioButton radio_wordDoc;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_sources;
    private javax.swing.JTextField text_class;
    private javax.swing.JTextField text_date;
    private javax.swing.JTextField text_period;
    private javax.swing.JTextField text_studentName;
    private javax.swing.JTextField text_teacher;
    // End of variables declaration//GEN-END:variables

    private void loadFileText(File f, boolean e) {
        try {
            XWPFDocument docx = new XWPFDocument(new FileInputStream(f));
            XWPFWordExtractor we = new XWPFWordExtractor(docx);
            we.
        } catch (IOException ex) {
            Logger.getLogger(MainWindowFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

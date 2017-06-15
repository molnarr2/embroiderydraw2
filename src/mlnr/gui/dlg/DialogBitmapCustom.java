/*
 * DialogBitmapCustom.java
 *
 * Created on December 1, 2006, 1:51 PM
 */

package mlnr.gui.dlg;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import mlnr.gui.BitmapSettings;

/**
 *
 * @author  Robert Molnar II
 */
public class DialogBitmapCustom extends javax.swing.JDialog {
    private ButtonGroup bgDefaultOutput = new ButtonGroup();
    private boolean ok = false;
    
    /** Creates new form DialogBitmapCustom */
    public DialogBitmapCustom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        bgDefaultOutput.add(jRadioButtonDefaultBMP);
        bgDefaultOutput.add(jRadioButtonDefaultEMF);
        bgDefaultOutput.add(jRadioButtonDefaultJPG);
        jRadioButtonDefaultBMP.setSelected(true);
        
        jComboBoxNumberOfColors.removeAllItems();
        jComboBoxNumberOfColors.addItem("Black-White");        
        jComboBoxNumberOfColors.addItem("256 Colors");
        jComboBoxNumberOfColors.addItem("Millions of Colors");
        jComboBoxNumberOfColors.setSelectedIndex(2);
        
        jComboBoxPenSize.removeAllItems();
        jComboBoxPenSize.addItem("Auto");
        jComboBoxPenSize.addItem("1");
        jComboBoxPenSize.addItem("2");
        jComboBoxPenSize.addItem("3");
        jComboBoxPenSize.addItem("4");
        jComboBoxPenSize.addItem("5");
        jComboBoxPenSize.addItem("6");
        jComboBoxPenSize.addItem("7");
        jComboBoxPenSize.addItem("8");
        jComboBoxPenSize.addItem("9");
        jComboBoxPenSize.addItem("10");
        jComboBoxPenSize.addItem("11");
        jComboBoxPenSize.addItem("12");
        jComboBoxPenSize.addItem("13");
        jComboBoxPenSize.addItem("14");
        jComboBoxPenSize.addItem("15");
        jComboBoxPenSize.setSelectedIndex(0);
        
        // Allow numbers only.
        jFormattedTextFieldDPI.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter()));
        jFormattedTextFieldDPI.setValue(new Integer(150));
     
        setLocation(DialogUtil.centerDialog(parent.getBounds(), getBounds()));
    }
    
    /** This will set this dialog box with the data in the BitmapSetting
     * @param bitSet is the BitmapSettings.
     */
    public void setBitmapSettings(BitmapSettings bitSet) {
        jTextFieldName.setText(bitSet.getName());
        
        jCheckBoxSmoothLines.setSelected(bitSet.isAntiAliasing());            
//        jCheckBoxFillColorOnly.setSelected(bitSet.isFillColorOnly());
        jFormattedTextFieldDPI.setValue(bitSet.getDpi());
        jComboBoxNumberOfColors.setSelectedIndex(bitSet.getColorMode());
        jComboBoxPenSize.setSelectedIndex(bitSet.getPenSize());
        
        if (bitSet.getDefaultBitmap() == BitmapSettings.DEFAULTBITMAP_BMP)
            jRadioButtonDefaultBMP.setSelected(true);
        else if (bitSet.getDefaultBitmap() == BitmapSettings.DEFAULTBITMAP_JPG)
            jRadioButtonDefaultJPG.setSelected(true);
        else if (bitSet.getDefaultBitmap() == BitmapSettings.DEFAULTBITMAP_EMF)
            jRadioButtonDefaultEMF.setSelected(true);
        else
            throw new IllegalArgumentException("Unknown bitmap default settings [" + bitSet.getDefaultBitmap() + "]");
        
        if (bitSet.isLocked()) {
            jTextFieldName.setEnabled(false);
//            jCheckBoxFillColorOnly.setEnabled(false);
            jCheckBoxSmoothLines.setEnabled(false);
            jFormattedTextFieldDPI.setEnabled(false);
            jComboBoxNumberOfColors.setEnabled(false);
            jComboBoxPenSize.setEnabled(false);
            jButtonSave.setEnabled(false);
            jRadioButtonDefaultBMP.setEnabled(false);
            jRadioButtonDefaultEMF.setEnabled(false);
            jRadioButtonDefaultJPG.setEnabled(false);
        }
    }
    
    /** Creates a new BitmapSettings.
     * @return a new BitmapSettings for the data entered in the dialog box.
     */
    public BitmapSettings getBitmapSettings() {
        int defaultBitmap = BitmapSettings.DEFAULTBITMAP_BMP;
        if (jRadioButtonDefaultJPG.isSelected())
            defaultBitmap = BitmapSettings.DEFAULTBITMAP_JPG;
        else if (jRadioButtonDefaultEMF.isSelected())
            defaultBitmap = BitmapSettings.DEFAULTBITMAP_EMF;
        return new BitmapSettings(jTextFieldName.getText(), Integer.parseInt(jFormattedTextFieldDPI.getValue().toString()), false, 
                jComboBoxNumberOfColors.getSelectedIndex(), jComboBoxPenSize.getSelectedIndex(), jCheckBoxSmoothLines.isSelected(), defaultBitmap, false);
    }
    
    public boolean isOk() {
        return ok;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonDefaultBMP = new javax.swing.JRadioButton();
        jRadioButtonDefaultJPG = new javax.swing.JRadioButton();
        jRadioButtonDefaultEMF = new javax.swing.JRadioButton();
        jComboBoxPenSize = new javax.swing.JComboBox();
        jComboBoxNumberOfColors = new javax.swing.JComboBox();
        jTextFieldName = new javax.swing.JTextField();
        jFormattedTextFieldDPI = new javax.swing.JFormattedTextField();
        jCheckBoxSmoothLines = new javax.swing.JCheckBox();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bitmap Settings");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bitmap Settings"));

        jLabel1.setText("Name Of This Setting:");

        jLabel2.setText("Smooth Lines/Curves:");

        jLabel3.setText("Number Of Colors:");

        jLabel4.setText("Pen Size In Pixels:");

        jLabel5.setText("Dots Per Inch:");

        jLabel6.setText("Default Selected:");

        jRadioButtonDefaultBMP.setText("BMP");
        jRadioButtonDefaultBMP.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonDefaultBMP.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jRadioButtonDefaultJPG.setText("JPG");
        jRadioButtonDefaultJPG.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonDefaultJPG.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jRadioButtonDefaultEMF.setText("EMF");
        jRadioButtonDefaultEMF.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonDefaultEMF.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jComboBoxPenSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxNumberOfColors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldName.setText("Untitled");

        jFormattedTextFieldDPI.setText("jFormattedTextField1");

        jCheckBoxSmoothLines.setText("Smooth Lines/Curves");
        jCheckBoxSmoothLines.setToolTipText("This will smooth out the lines and curves.");
        jCheckBoxSmoothLines.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBoxSmoothLines.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jLabel6))
                .add(14, 14, 14)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jRadioButtonDefaultBMP)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioButtonDefaultJPG)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioButtonDefaultEMF))
                    .add(jCheckBoxSmoothLines)
                    .add(jComboBoxPenSize, 0, 183, Short.MAX_VALUE)
                    .add(jComboBoxNumberOfColors, 0, 183, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jTextFieldName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jFormattedTextFieldDPI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextFieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jCheckBoxSmoothLines))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBoxNumberOfColors, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jComboBoxPenSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jFormattedTextFieldDPI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jRadioButtonDefaultBMP)
                    .add(jRadioButtonDefaultJPG)
                    .add(jRadioButtonDefaultEMF))
                .addContainerGap())
        );

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jButtonCancel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonSave)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSave)
                    .add(jButtonCancel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
// TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
// TODO add your handling code here:
        if (jComboBoxNumberOfColors.getSelectedIndex() == BitmapSettings.COLORMODE_8BIT && jCheckBoxSmoothLines.isSelected()) {
            new JOptionPane().showMessageDialog(this, "256 Color cannot have Smooth on. Please turn it off or chose Millions of Colors or Black-White Color.");
            return;
        }
        
        String name = jTextFieldName.getText();
        if (name.equals("")) {
            JOptionPane message = new JOptionPane();
            message.showMessageDialog(this, "Please enter in a name for this bitmap setting.");
            return;
        } else if (name.indexOf('|') != -1) {
            JOptionPane message = new JOptionPane();
            message.showMessageDialog(this, "Name cannot contain the '|' symbol. Please remove it from the name or change the name.");
            return;
        }
        
        ok = true;
        setVisible(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogBitmapCustom(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JCheckBox jCheckBoxSmoothLines;
    private javax.swing.JComboBox jComboBoxNumberOfColors;
    private javax.swing.JComboBox jComboBoxPenSize;
    private javax.swing.JFormattedTextField jFormattedTextFieldDPI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDefaultBMP;
    private javax.swing.JRadioButton jRadioButtonDefaultEMF;
    private javax.swing.JRadioButton jRadioButtonDefaultJPG;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
    
}
/*
 * ResizePanel.java
 *
 * Created on August 24, 2005, 7:28 PM
 */

package mlnr.gui.tool.opt;

import javax.swing.*;
import mlnr.gui.tool.ToolResize;
import mlnr.gui.tool.dlg.DialogResizeSelection;
import mlnr.type.*;

/**
 *
 * @author  Robert Molnar II
 */
public class ResizePanel extends javax.swing.JPanel {
    JFrame frame;
    ButtonGroup buttonGroup = new ButtonGroup();
    ToolResize tResize;
        
    /** Creates new form ResizePanel */
    public ResizePanel(JFrame frame) {
        initComponents();
        this.frame = frame;
        
        buttonGroup.add(jRadioButtonAnyDirection);
        buttonGroup.add(jRadioButtonVertical);
        buttonGroup.add(jRadioButtonHorizontal);
        buttonGroup.add(jRadioButtonUniform);
        
        // Default is to resize in any direction.
        jRadioButtonAnyDirection.setSelected(true);
    }
    
    public boolean isResizeAnyDirection() {
        return jRadioButtonAnyDirection.isSelected();
    }
    
    public boolean isResizeHorizontal() {
        return jRadioButtonHorizontal.isSelected();
    }
    
    public boolean isResizeVertical() {
        return jRadioButtonVertical.isSelected();
    }
    
    public boolean isResizeUniform() {
        return jRadioButtonUniform.isSelected();
    }
    
    public void setResizeTool(ToolResize tResize) {
        this.tResize = tResize;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonResize = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonResetPointToCenter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonAnyDirection = new javax.swing.JRadioButton();
        jRadioButtonHorizontal = new javax.swing.JRadioButton();
        jRadioButtonVertical = new javax.swing.JRadioButton();
        jRadioButtonUniform = new javax.swing.JRadioButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resize Options"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resize Operations"));

        jButtonResize.setText("Resize by Width & Height");
        jButtonResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResizeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jButtonResize)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jButtonResize)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resize Options"));

        jLabel2.setText("Use Right Click To Set Mirror Point");

        jButtonResetPointToCenter.setText("Reset Point To Center");
        jButtonResetPointToCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetPointToCenterActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2)
            .add(jButtonResetPointToCenter)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonResetPointToCenter)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resize Methods"));

        jRadioButtonAnyDirection.setText("Any Direction");

        jRadioButtonHorizontal.setText("Horizontal Only");

        jRadioButtonVertical.setText("VerticalOnly");

        jRadioButtonUniform.setText("Uniform (X=Y)");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButtonAnyDirection)
                    .add(jRadioButtonHorizontal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .add(jRadioButtonVertical, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .add(jRadioButtonUniform))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jRadioButtonAnyDirection)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonHorizontal)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonVertical)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonUniform)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
            .add(jPanel5, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(11, 11, 11)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetPointToCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetPointToCenterActionPerformed
// TODO add your handling code here:
        tResize.resetPointToCenter();
    }//GEN-LAST:event_jButtonResetPointToCenterActionPerformed

    private void jButtonResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResizeActionPerformed
        // Current size of the selected vertices.
        FPointType fptSize = tResize.getCurrentSelectedSize();        
        DialogResizeSelection dialog = new DialogResizeSelection(frame, true);
        dialog.setCurrentSize(fptSize.x, fptSize.y);
        dialog.setVisible(true);
        
        if (dialog.isResize()) {
            float newWidth = dialog.getWidthInMeasurements();
            float newHeight = dialog.getHeightInMeasurements();
            tResize.setCurrentSelectedSize(newWidth, newHeight);
        }
        
    }//GEN-LAST:event_jButtonResizeActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResetPointToCenter;
    private javax.swing.JButton jButtonResize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonAnyDirection;
    private javax.swing.JRadioButton jRadioButtonHorizontal;
    private javax.swing.JRadioButton jRadioButtonUniform;
    private javax.swing.JRadioButton jRadioButtonVertical;
    // End of variables declaration//GEN-END:variables
    
}

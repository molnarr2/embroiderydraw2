/*
 * InternalPatternPanel.java
 *
 * Created on November 16, 2006, 1:41 PM
 */

package mlnr.gui.tool.opt;

import javax.swing.ButtonGroup;

/**
 *
 * @author  Robert Molnar II
 */
public class InternalPatternPanel extends javax.swing.JPanel {
    
    // <editor-fold defaultstate="collapsed" desc=" Constructor ">
    
    /** Creates new form InternalPatternPanel */
    public InternalPatternPanel() {
        initComponents();
        
        // Group the radio buttons.
        javax.swing.ButtonGroup bg = new javax.swing.ButtonGroup();
        bg.add(jRadioButtonResizeCenter);
        bg.add(jRadioButtonResizeUpperLeft);
        
        // Center and no rotate.
        jRadioButtonResizeCenter.setSelected(true);
        jCheckBoxNoRotate.setSelected(true);
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Set Methods ">
    
    /** This will set the border title.
     * @param title is the new border title.
     */
    public void setBorderTitle(String title) {
        setBorder(javax.swing.BorderFactory.createTitledBorder(title));
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Query Methods ">
    
    public boolean isAspectRatioChecked() {
        return jCheckBoxAspectRatio.isSelected();
    }
    
    public boolean isNoRotateChecked() {
        return jCheckBoxNoRotate.isSelected();
    }
    
    public boolean isOriginalSizeChecked() {
        return jCheckBoxOriginalSize.isSelected();
    }
    
    public boolean isCenterChecked() {
        return jRadioButtonResizeCenter.isSelected();
    }
    
    // </editor-fold>
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jCheckBoxAspectRatio = new javax.swing.JCheckBox();
        jCheckBoxOriginalSize = new javax.swing.JCheckBox();
        jCheckBoxNoRotate = new javax.swing.JCheckBox();
        jRadioButtonResizeCenter = new javax.swing.JRadioButton();
        jRadioButtonResizeUpperLeft = new javax.swing.JRadioButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Pattern Options"));
        jCheckBoxAspectRatio.setText("Use Aspect Ratio For Size (X=Y)");
        jCheckBoxAspectRatio.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBoxAspectRatio.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBoxOriginalSize.setText("Use Original Size");
        jCheckBoxOriginalSize.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBoxOriginalSize.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jCheckBoxNoRotate.setText("No Rotate");
        jCheckBoxNoRotate.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBoxNoRotate.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jRadioButtonResizeCenter.setText("Center");
        jRadioButtonResizeCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonResizeCenter.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jRadioButtonResizeUpperLeft.setText("Upper-Left");
        jRadioButtonResizeUpperLeft.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButtonResizeUpperLeft.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jCheckBoxAspectRatio)
            .add(layout.createSequentialGroup()
                .add(jCheckBoxOriginalSize)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBoxNoRotate))
            .add(layout.createSequentialGroup()
                .add(jRadioButtonResizeCenter)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonResizeUpperLeft))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jCheckBoxAspectRatio)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCheckBoxOriginalSize)
                    .add(jCheckBoxNoRotate))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButtonResizeCenter)
                    .add(jRadioButtonResizeUpperLeft))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAspectRatio;
    private javax.swing.JCheckBox jCheckBoxNoRotate;
    private javax.swing.JCheckBox jCheckBoxOriginalSize;
    private javax.swing.JRadioButton jRadioButtonResizeCenter;
    private javax.swing.JRadioButton jRadioButtonResizeUpperLeft;
    // End of variables declaration//GEN-END:variables
    
}

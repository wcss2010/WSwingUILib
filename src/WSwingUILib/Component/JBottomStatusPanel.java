/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSwingUILib.Component;

import WSwingUILib.Component.Base.JImagePanel;

/**
 *
 * @author xyuser
 */
public class JBottomStatusPanel extends JImagePanel {

    /**
     * Creates new form JBottomStatusPanel
     */
    public JBottomStatusPanel()
    {
        initComponents();
        this.setImageIconFromResource("/WSwingUILib/UIImage/statusbar.png", false);
        this.plIco.setImageIconFromResource("/WSwingUILib/UIImage/machine.png", false);
    }

    /**
     * 设置状态信息
     * @param text 
     */
    public void setStatusText(String text)
    {
        this.lblStateInfo.setText(text);
    }
    
    /**
     * 设置版本信息
     * @param text 
     */
    public void setVersionText(String text)
    {
       this.lblVersionInfo.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plIco = new WSwingUILib.Component.Base.JImagePanel();
        lblStateInfo = new javax.swing.JLabel();
        lblVersionInfo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout plIcoLayout = new javax.swing.GroupLayout(plIco);
        plIco.setLayout(plIcoLayout);
        plIcoLayout.setHorizontalGroup(
            plIcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        plIcoLayout.setVerticalGroup(
            plIcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        lblStateInfo.setFont(new java.awt.Font("文泉驿微米黑", 0, 24)); // NOI18N
        lblStateInfo.setForeground(new java.awt.Color(51, 153, 255));
        lblStateInfo.setText("jLabel1");

        lblVersionInfo.setFont(new java.awt.Font("文泉驿微米黑", 0, 24)); // NOI18N
        lblVersionInfo.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(plIco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblStateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblVersionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStateInfo)
            .addComponent(lblVersionInfo)
            .addComponent(plIco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblStateInfo;
    private javax.swing.JLabel lblVersionInfo;
    private WSwingUILib.Component.Base.JImagePanel plIco;
    // End of variables declaration//GEN-END:variables
}

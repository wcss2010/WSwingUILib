/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSwingUILib.Component.Base;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 * 绘图面板
 * @author xyuser
 */
public class JImagePanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    public URL backgroundImageUrl;
    public ImageIcon backgroundImageObj;

    /**
     * Creates new form JImagePanel
     */
    public JImagePanel() {
        initComponents();
    }

    public JImagePanel(URL resourceUrlObj) {
        initComponents();
        backgroundImageUrl = resourceUrlObj;
        backgroundImageObj = new ImageIcon(backgroundImageUrl);
    }

    public JImagePanel(String resourceUrl) {
        initComponents();
        this.setImageIconFromResource(resourceUrl,false);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.clearRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(this.getBackground());
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        if (backgroundImageObj != null) {
            g2d.drawImage(backgroundImageObj.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        } else {
            super.paintComponent(g);
        }
    }
    
    /**
     * 立即绘制
     */
    public void nowPaint()
    {        
        this.paintImmediately(0, 0, this.getWidth(), this.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * 设置图片从资源中
     * @param resourceUrl
     * @param needRepaint 
     */
    public void setImageIconFromResource(String resourceUrl,Boolean needRepaint)
    {
        backgroundImageUrl = JImagePanel.class.getResource(resourceUrl);
        backgroundImageObj = new ImageIcon(backgroundImageUrl);
        if (needRepaint)
        {
           this.repaint();
        }
    }
    
    /**
     * 从资源中加载图片加载
     * @param resourceUrl
     * @return 
     */
    public static ImageIcon getImageIconObjFromResource(String resourceUrl)
    {
        URL url = JImagePanel.class.getResource(resourceUrl);
        return new ImageIcon(url);
    }
    
    /**
     * 设置图片从对象中
     * @param image
     * @param needRepaint 
     */
    public void setImageIcon(ImageIcon image,Boolean needRepaint)
    {      
        backgroundImageObj = image;
        if (needRepaint)
        {
           this.repaint();
        }
    }
}
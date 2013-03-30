/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSwingUILib.Frame;

import WSwingUILib.Component.Base.JImagePanel;
import WSwingUILib.Component.JMiddleContentPanel;
import WSwingUILib.Component.JTabButton;
import WSwingUILib.Test.TestPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * UI模板窗体 ("/WSwingUILib/UIImage/appico.png")
 *
 * @author xyuser
 */
public class JTemplateFrame extends javax.swing.JFrame {

    private int xx, yy;
    private boolean isDraging = false;
    public String closeMsgBoxCaption = "提 示";
    public String closeMsgBoxContent = "真的要退出吗？点击'是'退出。";
    public JTabButton[] sysTabList = null;
    public JMiddleContentPanel currentShowPanel = null;

    /**
     * 所有的UI界面使用 文泉驿微米黑 字体
     */
    public static void useDefaultFontConfig()
    {
        updateUIFontConfig("文泉驿微米黑",12);
    }
    
    /**
     * 更新界面中字体设置
     * @param fontName
     * @param fontSize 
     */
    public static void updateUIFontConfig(String fontName, int fontSize) {

        java.util.Enumeration enums = UIManager.getDefaults().keys();
        String str;
        while (enums.hasMoreElements()) {
            if ((str = enums.nextElement().toString()).contains("font")) { //只要与字体相关
                UIManager.put(str, new Font(fontName, 0, fontSize));
            }
        }
    }

    /**
     * Creates new form JTemplateFrame
     */
    public JTemplateFrame() {
        initComponents();
        sysTabList = new JTabButton[]{tab1, tab2, tab3, tab4, tab5, tab6};
        hideAllTabButton();
        this.setLocationRelativeTo(null);
        this.setAppIcoFromResource("/WSwingUILib/UIImage/appico.png");
        this.setSoftName("此处是软件名称");
        this.setSoftInfo("此处是软件说明");
        this.setStatusText("状态");
        this.setVersionText("版本");
        
//        this.setActiveTabButton(0,"1" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
//        this.setActiveTabButton(1,"2" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
//        this.setActiveTabButton(2,"3" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
//        this.setActiveTabButton(3,"4" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
//        this.setActiveTabButton(4,"5" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
//        this.setActiveTabButton(5,"6" , JImagePanel.getImageIconObjFromResource("/WSwingUILib/UIImage/devicestate.png"),new TestPanel());
    }

    /**
     * 从资源路径中设置程序图标
     *
     * @param text
     */
    public void setAppIcoFromResource(String text) {
        this.plAppIco.setImageIconFromResource(text, true);
    }

    /**
     * 从图片对象中设置程序图标
     *
     * @param image
     */
    public void setAppIcoFromImageObj(ImageIcon image) {
        this.plAppIco.setImageIcon(image, true);
    }

    /**
     * 显示状态文本
     *
     * @param string
     */
    public void setStatusText(String string) {
        this.status.setStatusText(string);
    }

    /**
     * 显示版本文本
     *
     * @param string
     */
    public void setVersionText(String string) {
        this.status.setVersionText(string);
    }

    /**
     * 设置软件名
     *
     * @param text
     */
    public void setSoftName(String text) {
        this.lblAppName.setText(text);
    }

    /**
     * 设置软件说明
     *
     * @param text
     */
    public void setSoftInfo(String text) {
        this.lblAppInfo.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTotal = new WSwingUILib.Component.JTopContentPanel();
        plTopContent = new WSwingUILib.Component.JTopContentPanel();
        plAppIco = new WSwingUILib.Component.Base.JImagePanel();
        lblAppName = new javax.swing.JLabel();
        lblAppInfo = new javax.swing.JLabel();
        btnMin = new WSwingUILib.Component.Base.JImageButton("/WSwingUILib/UIImage/min.png","/WSwingUILib/UIImage/minfocus.png","/WSwingUILib/UIImage/minfocus.png","",true,true);
        btnClose = new WSwingUILib.Component.Base.JImageButton("/WSwingUILib/UIImage/close.png","/WSwingUILib/UIImage/closefocus.png","/WSwingUILib/UIImage/closefocus.png","",true,true);
        tab1 = new WSwingUILib.Component.JTabButton();
        tab2 = new WSwingUILib.Component.JTabButton();
        tab3 = new WSwingUILib.Component.JTabButton();
        tab4 = new WSwingUILib.Component.JTabButton();
        tab5 = new WSwingUILib.Component.JTabButton();
        tab6 = new WSwingUILib.Component.JTabButton();
        plTotalContent = new WSwingUILib.Component.JMiddleContentPanel();
        plMiddleContent = new WSwingUILib.Component.JMiddleContentPanel();
        status = new WSwingUILib.Component.JBottomStatusPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        plTopContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plTopContentMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plTopContentMousePressed(evt);
            }
        });
        plTopContent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                plTopContentMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout plAppIcoLayout = new javax.swing.GroupLayout(plAppIco);
        plAppIco.setLayout(plAppIcoLayout);
        plAppIcoLayout.setHorizontalGroup(
            plAppIcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        plAppIcoLayout.setVerticalGroup(
            plAppIcoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        lblAppName.setFont(new java.awt.Font("文泉驿微米黑", 0, 24)); // NOI18N
        lblAppName.setForeground(new java.awt.Color(255, 255, 255));
        lblAppName.setText("jLabel1");

        lblAppInfo.setFont(new java.awt.Font("文泉驿微米黑", 0, 18)); // NOI18N
        lblAppInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblAppInfo.setText("jLabel1");

        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnMinLayout = new javax.swing.GroupLayout(btnMin);
        btnMin.setLayout(btnMinLayout);
        btnMinLayout.setHorizontalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        btnMinLayout.setVerticalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
        });

        tab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab5MouseClicked(evt);
            }
        });

        tab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout plTopContentLayout = new javax.swing.GroupLayout(plTopContent);
        plTopContent.setLayout(plTopContentLayout);
        plTopContentLayout.setHorizontalGroup(
            plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTopContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTopContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTopContentLayout.createSequentialGroup()
                        .addComponent(plAppIco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(plTopContentLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblAppInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        plTopContentLayout.setVerticalGroup(
            plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTopContentLayout.createSequentialGroup()
                .addGroup(plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plTopContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plTopContentLayout.createSequentialGroup()
                        .addComponent(lblAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAppInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plAppIco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plMiddleContent.setLayout(null);

        javax.swing.GroupLayout plTotalContentLayout = new javax.swing.GroupLayout(plTotalContent);
        plTotalContent.setLayout(plTotalContentLayout);
        plTotalContentLayout.setHorizontalGroup(
            plTotalContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plMiddleContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plTotalContentLayout.setVerticalGroup(
            plTotalContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTotalContentLayout.createSequentialGroup()
                .addComponent(plMiddleContent, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout plTotalLayout = new javax.swing.GroupLayout(plTotal);
        plTotal.setLayout(plTotalLayout);
        plTotalLayout.setHorizontalGroup(
            plTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTopContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plTotalContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plTotalLayout.setVerticalGroup(
            plTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTotalLayout.createSequentialGroup()
                .addComponent(plTopContent, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plTotalContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plTopContentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plTopContentMousePressed
        // TODO add your handling code here:
        isDraging = true;
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_plTopContentMousePressed

    private void plTopContentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plTopContentMouseReleased
        // TODO add your handling code here:
        isDraging = false;
    }//GEN-LAST:event_plTopContentMouseReleased

    private void plTopContentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plTopContentMouseDragged
        // TODO add your handling code here:
        if (isDraging) {
            int left = getLocation().x;
            int top = getLocation().y;
            setLocation(left + evt.getX() - xx, top + evt.getY() - yy);
        }
    }//GEN-LAST:event_plTopContentMouseDragged

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, closeMsgBoxContent, closeMsgBoxCaption, JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    /**
     * 隐藏所有标签按钮
     */
    public void hideAllTabButton() {
        for (JTabButton jtb : sysTabList) {
            jtb.setVisible(false);
        }
    }

    /**
     * 激活标签按钮
     *
     * @param index
     * @param name
     * @param image
     * @param content
     */
    public void setActiveTabButton(int index, String name, ImageIcon image, JMiddleContentPanel content) {
        if (index >= 0 && index <= 5) {
            if (image != null && content != null) {
                sysTabList[index].setVisible(true);
                sysTabList[index].setTabText(name);
                sysTabList[index].setTabImage(image);
                sysTabList[index].content = content;
            }
        }
    }

    /**
     * 显示内容面板(必须从JMiddleContentPanel继承)
     *
     * @param content
     */
    public void showContentPanel(JMiddleContentPanel contents) 
    {
        this.plMiddleContent.removeAll();
        contents.setLocation(0, 0);
        contents.setSize(this.plMiddleContent.getWidth(), this.plMiddleContent.getHeight());
        
        if (currentShowPanel != null)
        {
            currentShowPanel.close();
        }
        
        currentShowPanel = contents;
        this.plMiddleContent.add(currentShowPanel);
        this.plMiddleContent.validate();//重构内容面板
        this.plMiddleContent.repaint();//重绘内容面板
        currentShowPanel.load();
    }

    /**
     * 清理按下状态
     */
    public void clearPressStatus() {
        for (JTabButton jtb : sysTabList) {
            jtb.processReleaseButton();
        }
    }

    /**
     * 选择标签页
     *
     * @param tabIndex
     */
    public void selectTabPage(int tabIndex) {
        clearPressStatus();
        if (tabIndex >= 0 && tabIndex <= 5) {
            sysTabList[tabIndex].processPressButton();
            showContentPanel(sysTabList[tabIndex].content);
        }
    }

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        // TODO add your handling code here:
        selectTabPage(0);
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        // TODO add your handling code here:
        selectTabPage(1);
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        selectTabPage(2);
    }//GEN-LAST:event_tab3MouseClicked

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        // TODO add your handling code here:
        selectTabPage(3);
    }//GEN-LAST:event_tab4MouseClicked

    private void tab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseClicked
        // TODO add your handling code here:
        selectTabPage(4);
    }//GEN-LAST:event_tab5MouseClicked

    private void tab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseClicked
        // TODO add your handling code here:
        selectTabPage(5);
    }//GEN-LAST:event_tab6MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private WSwingUILib.Component.Base.JImageButton btnClose;
    private WSwingUILib.Component.Base.JImageButton btnMin;
    private javax.swing.JLabel lblAppInfo;
    private javax.swing.JLabel lblAppName;
    private WSwingUILib.Component.Base.JImagePanel plAppIco;
    private WSwingUILib.Component.JMiddleContentPanel plMiddleContent;
    private WSwingUILib.Component.JTopContentPanel plTopContent;
    private WSwingUILib.Component.JTopContentPanel plTotal;
    private WSwingUILib.Component.JMiddleContentPanel plTotalContent;
    private WSwingUILib.Component.JBottomStatusPanel status;
    private WSwingUILib.Component.JTabButton tab1;
    private WSwingUILib.Component.JTabButton tab2;
    private WSwingUILib.Component.JTabButton tab3;
    private WSwingUILib.Component.JTabButton tab4;
    private WSwingUILib.Component.JTabButton tab5;
    private WSwingUILib.Component.JTabButton tab6;
    // End of variables declaration//GEN-END:variables
}
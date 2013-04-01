/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSwingUILib.Component;

import WSwingUILib.Component.Base.JImagePanel;
import WSwingUILib.Frame.JTemplateFrame;

/**
 *
 * @author xyuser
 */
public class JMiddleContentPanel extends JImagePanel
{
    public JMiddleContentPanel()
    {
        this.setImageIconFromResource("/WSwingUILib/UIImage/contentbar.png", false);
    }    

    /**
     * 主面板
     */
    private JTemplateFrame mainPanel;
    
    /**
     * 载入内容
     */
    public void load()
    {
        
    }
    
    /**
     * 关闭
     */
    public void close()
    {
        
    }

    /**
     * @return the mainPanel
     */
    public JTemplateFrame getMainPanel() {
        return mainPanel;
    }

    /**
     * @param mainPanel the mainPanel to set
     */
    public void setMainPanel(JTemplateFrame mainPanel) {
        this.mainPanel = mainPanel;
    }
}

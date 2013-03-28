/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WSwingUILib.Component;

import WSwingUILib.Component.Base.JImageButton;
import java.awt.Color;

/**
 * 加了图形背景的按钮
 * @author wcss
 */
public class JUIButton extends JImageButton 
{
    public JUIButton()
    {
        this.initImageButton("/WSwingUILib/UIImage/btnfocus.png", "/WSwingUILib/UIImage/btnnofocus.png", "/WSwingUILib/UIImage/btnfocus.png");
        this.enabledSwitchOverImage = true;
        this.enabledSwitchPressImage = true;
        this.setBackground(Color.white);
        this.setForeground(Color.white);
    }
}

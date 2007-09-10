package org.ranjith.swing;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.plaf.ComponentUI;

//import com.sun.java.swing.SwingUtilities2;

public class RoundButton extends JButton {
    public RoundButton() {
        super();
        buildUI();
    }
    public RoundButton(String text) {
        super(text);
        buildUI();
    }
    private void buildUI(){
        //No border/no box
        setBorderPainted(false);
        getUI().uninstallUI(this);
        ComponentUI ui = RoundButtonUI.createUI(this);
        setUI(ui);
        
        setForeground(Color.WHITE);
        //putClientProperty(SwingUtilities2.AA_TEXT_PROPERTY_KEY, new Boolean(true));
    }
}

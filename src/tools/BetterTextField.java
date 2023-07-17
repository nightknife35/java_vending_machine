
package tools;

import javax.swing.*;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BetterTextField extends JTextField{
    String placeholder_text;
    boolean unlocked = true;
    Highlighter defaultHighlighter = getHighlighter();
    public BetterTextField(String _placeholder_text) {

        placeholder_text = _placeholder_text;

        this.setBackground(new Color(0xFF9B4D67, true));
        this.setForeground(Color.GRAY);
        this.setText(placeholder_text);

        this.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

                if(unlocked) {
                    if (BetterTextField.this.getText().equals(placeholder_text)) {
// it seems like    if (getText().equals(placeholder_text)){    also works, but I think its more clear like this
                        BetterTextField.this.setText("");
                        BetterTextField.this.setForeground(Color.BLACK);
                    }
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

                if(unlocked) {
                    if (BetterTextField.this.getText().isEmpty()) {

                        BetterTextField.this.setForeground(Color.GRAY);
                        BetterTextField.this.setText(placeholder_text);
                    }
                }
            }
        });

    }

    public void Lock () {

        unlocked = false;
        this.setText(placeholder_text);
        this.setBackground(new Color(0xFF625B5B, true));
        this.setCaretColor(new Color(0xFF625B5B, true));
        this.setEditable(false);
        setHighlighter(null);

    }
    public void Lock (String dimension) {

        unlocked = false;
        this.setText(dimension);
        this.setBackground(new Color(0xFF625B5B, true));
        this.setCaretColor(new Color(0xFF625B5B, true));
        this.setEditable(false);
        setHighlighter(null);

    }

    public void Unlock () {

        unlocked = true;
        this.setText(placeholder_text);
        this.setBackground(new Color(0xFF9B4D67, true));
        this.setCaretColor(Color.WHITE);
        this.setEditable(true);
        setHighlighter(defaultHighlighter);
    }

    public void Hide (String placeholder_text) {this.setVisible(false);}
    public void Unhide (String placeholder_text) {this.setVisible(true);}


}

package tools;

import resources.variable;
import javax.swing.*;

public class MakeTheFrame extends JFrame{

    public MakeTheFrame(String window_name){

        //making the frame
        this.setTitle(window_name);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(variable.frame_background_color);
        this.setSize(variable.WINDOW_WIDTH, variable.WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        //----------------------------------------------------------
        ImageIcon image = new ImageIcon("images/vending machine icon.png");
        this.setIconImage(image.getImage());
        //----------------------------------------------------------
        this.setLayout(null);
    }
}

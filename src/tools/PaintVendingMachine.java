package tools;

import resources.Shelve;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintVendingMachine extends JPanel {

    int height = (int) Shelve.getMachine_height();
    int width = (int) Shelve.getMachine_width();

    int shelve_number = Shelve.getNumber_of_shelves();
    ArrayList<Shelve> shelves = Shelve.getA();
    public PaintVendingMachine(){}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set background color
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, 1000, 1000);

        // Draw vending machine frame
        g2d.setColor(Color.PINK);
        g2d.fillRect(0, 0, 3*width, 3*height);

        //Draw display screen
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(10, 10, 3*width -10, 3*height -10);


        //Draw shelve lines
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        for(Shelve i : shelves){
            g2d.drawLine(110,300,390,300);
        }


        //Draw product glass
        g2d.setColor(new Color(0, 0, 0, 100));
        g2d.fillRect(110, 10, 280, 480);

    }

}

package tools;


import javax.swing.*;
import java.awt.*;

public class CoinPanel extends JPanel{

    Image coin_slit;
    int coin_slit_x;
    int coin_slit_y;

    public CoinPanel(String name[], String icon_path[], int x[], int y[], Image _coin_slit , int _coin_slit_x ,int _coin_slit_y) {

        setLayout(null);
        setSize(2100, 1000);

        coin_slit = _coin_slit;
        coin_slit_x = _coin_slit_x;
        coin_slit_y = _coin_slit_y;

        for (int i = 0; i < icon_path.length; i++) {

            JLabel coin_img = new JLabel();
            coin_img.setName(name[i]);
            ImageIcon coin_icon = new ImageIcon(icon_path[i]);
            coin_img.setIcon(coin_icon);
            coin_img.setBounds(x[i], y[i], coin_icon.getIconWidth(), coin_icon.getIconHeight());
            this.add(coin_img);

            // not exactly sure how it works
            AddMouseMotionListeners a = new AddMouseMotionListeners(name[i],coin_img, x[i], y[i], coin_slit, _coin_slit_x, _coin_slit_y);
            this.addMouseListener(a);
            this.addMouseMotionListener(a);
        }
        repaint();

    }
    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.drawImage(coin_slit,coin_slit_x,coin_slit_y,null);

    }

}

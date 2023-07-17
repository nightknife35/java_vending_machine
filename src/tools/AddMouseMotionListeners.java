
package tools;

import resources.MachineMoney;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

public class AddMouseMotionListeners implements MouseListener, MouseMotionListener {
    String coin_name;
    JLabel coin_icon;
    int x;
    int y;
    Image coin_slit;

    //----------------------------
    Ellipse2D bounds;
    Rectangle coin_slit_area;
    boolean enable = false;
    Point click_location;

    public AddMouseMotionListeners(String _coin_name, JLabel label, int _x, int _y, Image _coin_slit, int _coin_slit_x, int _coin_slit_y){

        coin_icon = label;
        x = _x;
        y = _y;
        coin_name = _coin_name;
        coin_slit = _coin_slit;
        coin_slit_area = new Rectangle(_coin_slit_x, _coin_slit_y, coin_slit.getWidth(null), coin_slit.getHeight(null));
    }


    @Override
    public void mousePressed (MouseEvent e) {
        click_location = e.getPoint();
        bounds = new Ellipse2D.Double(coin_icon.getX() , coin_icon.getY() , coin_icon.getWidth(), coin_icon.getWidth());
        //the shape is drawn by providing the 2 diameters u would need to draw an oval and the X and Y of the corner od the hole construct
/*
                               (X,Y)o------|
                                    |    ( |)
                                    |  (   |  )
                                    |(     |    )
                                    -------+------ diameter 1
                                    |(     |     )
                                    | (    |    )
                                    |   (  |   )
                                    |    ( |)
                                         diameter 2
 */
        if (bounds.contains(click_location) ) {
            enable = true;
        }
    }


    @Override
    public void mouseDragged(MouseEvent e){
        click_location = e.getPoint();

        if (enable) {
            coin_icon.setLocation((int)(click_location.getX()-coin_icon.getWidth()/2),(int)(click_location.getY()-coin_icon.getHeight()/2));
        }
    }


    @Override
    public void mouseReleased (MouseEvent e){

        if(coin_slit_area.contains ( e.getPoint() ) && ((coin_icon.getX() != x) || (coin_icon.getY() != y) ) ){

            MachineMoney.addMoney(coin_icon.getName());
        }
        coin_icon.setBounds(x,y,coin_icon.getWidth(),coin_icon.getHeight());
        enable = false;
    }





    @Override
    public void mouseEntered (MouseEvent e){}
    @Override
    public void mouseExited (MouseEvent e){}
    @Override
    public void mouseMoved (MouseEvent e){}
    @Override
    public void mouseClicked(MouseEvent e) {}


}

package guis;

import javax.swing.*;
import java.awt.*;
import resources.*;
import tools.*;

public class MoneyInitialization{

    public MoneyInitialization() {

        variable.next_from_gui_3.setBounds(0,0,50,50);
        variable.next_from_gui_3.addActionListener(new EverythingListener());
        variable.frame_from_gui_3.add(variable.next_from_gui_3);


        String[] coin_names = {"1","2","5","10","20","50","100","200"};
        String[] icon_path = {"images/coins & coin_slit/1.png","images/coins & coin_slit/2.png","images/coins & coin_slit/5.png","images/coins & coin_slit/10.png","images/coins & coin_slit/20.png","images/coins & coin_slit/50.png","images/coins & coin_slit/100.png","images/coins & coin_slit/200.png"};
        int[] coin_starting_coordinate_x = {0,125,250,375,500,625,750,875};
        int[] coin_starting_coordinate_y = {700,700,700,700,700,700,700,700};

        Image coin_slit = new ImageIcon("images/coins & coin_slit/coin_slit.png").getImage();
        int coin_slit_x = 1000;
        int coin_slit_y = 300;

        CoinPanel coin_panel = new CoinPanel(coin_names,icon_path,coin_starting_coordinate_x,coin_starting_coordinate_y,coin_slit,coin_slit_x,coin_slit_y);

        variable.frame_from_gui_3.add(coin_panel);



        variable.frame_from_gui_3.setVisible(true);
    }

}


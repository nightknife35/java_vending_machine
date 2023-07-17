package guis;

import javax.swing.*;
import java.awt.*;
import resources.variable;
import tools.*;
public class GUI {


    public GUI() {

        Initialize();
        AddAllItems();


        String[] coin_names = {"1","2","5","10","20","50","100","200"};
        String[] icon_path = {"images/coins & coin_slit/1.png","images/coins & coin_slit/2.png","images/coins & coin_slit/5.png","images/coins & coin_slit/10.png","images/coins & coin_slit/20.png","images/coins & coin_slit/50.png","images/coins & coin_slit/100.png","images/coins & coin_slit/200.png"};
        int[] coin_starting_coordinate_x = {0,125,250,375,500,625,750,875};
        int[] coin_starting_coordinate_y = {700,700,700,700,700,700,700,700};

        Image coin_slit = new ImageIcon("images/coins & coin_slit/coin_slit.png").getImage();
        int coin_slit_x = 1000;
        int coin_slit_y = 300;

        CoinPanel coin_panel = new CoinPanel(coin_names,icon_path,coin_starting_coordinate_x,coin_starting_coordinate_y,coin_slit,coin_slit_x,coin_slit_y);

        variable.frame_from_gui_4.add(coin_panel);

    }


    public void Initialize(){

        variable.b1.setBounds(1200,230,50,50);
        variable.b2.setBounds(1260,230,50,50);
        variable.b3.setBounds(1320,230,50,50);
        variable.b4.setBounds(1200,290,50,50);
        variable.b5.setBounds(1260,290,50,50);
        variable.b6.setBounds(1320,290,50,50);
        variable.b7.setBounds(1200,350,50,50);
        variable.b8.setBounds(1260,350,50,50);
        variable.b9.setBounds(1320,350,50,50);
        variable.b_ok.setBounds(1200,410,50,50);
        variable.b0.setBounds(1260,410,50,50);
        variable.b_cancel.setBounds(1320,410,50,50);
        variable.a.setBounds(1200,470,170,50);
        variable.b.setBounds(1200,530,170,50);
    }
    public void AddAllItems(){

        variable.frame_from_gui_4.add(variable.b0);
        variable.frame_from_gui_4.add(variable.b1);
        variable.frame_from_gui_4.add(variable.b2);
        variable.frame_from_gui_4.add(variable.b3);
        variable.frame_from_gui_4.add(variable.b4);
        variable.frame_from_gui_4.add(variable.b5);
        variable.frame_from_gui_4.add(variable.b6);
        variable.frame_from_gui_4.add(variable.b7);
        variable.frame_from_gui_4.add(variable.b8);
        variable.frame_from_gui_4.add(variable.b9);
        variable.frame_from_gui_4.add(variable.b_cancel);
        variable.frame_from_gui_4.add(variable.b_ok);
        variable.frame_from_gui_4.add(variable.a);
        variable.frame_from_gui_4.add(variable.b);

        variable.frame_from_gui_4.setVisible(true);

    }
}

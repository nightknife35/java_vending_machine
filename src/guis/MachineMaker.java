package guis;

import resources.*;
import tools.*;

public class MachineMaker {

    public MachineMaker() {

        Initialize();
        AddListeners();

        //utility changes
        variable.next_page_button__into_page_2.setEnabled(false);
        variable.height_of_each_shelve_TextField.Lock();
        variable.slots_of_each_shelve_TextField.Lock();


        AddAllItems();
    }


    public void Initialize(){

        //telling components where they are going to go
        variable.welcoming_label.setBounds(700,100,700,150);
        variable.instruction_label.setBounds(700,250,50,150);
        variable.next_page_button__into_page_2.setBounds(1200,600,50,50);
        variable.lock_in_machine_dimensions_button.setBounds(100,650,150,50);
        variable.vending_machine_depth_TextField.setBounds(50,500,300,50);
        variable.vending_machine_width_TextField.setBounds(50,550,300,50);
        variable.shelve_number_TextField.setBounds(50,600,300,50);
        variable.height_of_each_shelve_TextField.setBounds(400,550,600,50);
        variable.slots_of_each_shelve_TextField.setBounds(400,600,600,50);
    }
    public void AddAllItems(){

        //placement of components
        variable.machine_maker_frame.add(variable.welcoming_label);
        variable.machine_maker_frame.add(variable.instruction_label);
        variable.machine_maker_frame.add(variable.next_page_button__into_page_2);
        variable.machine_maker_frame.add(variable.lock_in_machine_dimensions_button);
        variable.machine_maker_frame.add(variable.vending_machine_depth_TextField);
        variable.machine_maker_frame.add(variable.vending_machine_width_TextField);
        variable.machine_maker_frame.add(variable.shelve_number_TextField);
        variable.machine_maker_frame.add(variable.height_of_each_shelve_TextField);
        variable.machine_maker_frame.add(variable.slots_of_each_shelve_TextField);

        //making everything visible
        variable.machine_maker_frame.setVisible(true);
    }
    public void AddListeners(){

        //telling the buttons they will do something when pressed
        variable.next_page_button__into_page_2.addActionListener(new EverythingListener());
        variable.lock_in_machine_dimensions_button.addActionListener(new EverythingListener());

    }


}


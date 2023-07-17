package tools;

import guis.GUI;
import guis.MoneyInitialization;
import guis.ProductMaker;
import resources.MachineMoney;
import resources.Shelve;
import resources.variable;
import javax.swing.*;
import java.awt.event.*;

public class EverythingListener implements ActionListener, MouseListener, MouseMotionListener/*Focus Listeners of BetterTextField?*/ {


        String id;

        public EverythingListener(String _id) {
                id = _id;
        }

        public EverythingListener() {
        }


        @Override
        public void actionPerformed(ActionEvent e) {
//----------------------------1-----------------------------------------------------------

                if (e.getSource() == variable.lock_in_machine_dimensions_button) {

                        try {
                                variable.vending_machine_depth = Float.parseFloat(variable.vending_machine_depth_TextField.getText());
                                variable.vending_machine_width = Float.parseFloat(variable.vending_machine_width_TextField.getText());
                                variable.vending_machine_shelve_number = Integer.parseInt(variable.shelve_number_TextField.getText());

                                if (variable.vending_machine_depth <= 100 && variable.vending_machine_width <= 100) {

                                        variable.height_of_each_shelve_TextField.Unlock();
                                        variable.slots_of_each_shelve_TextField.Unlock();

                                        variable.vending_machine_width_TextField.Lock(variable.vending_machine_width_TextField.getText());
                                        variable.vending_machine_depth_TextField.Lock(variable.vending_machine_depth_TextField.getText());
                                        variable.shelve_number_TextField.Lock(variable.shelve_number_TextField.getText());

                                        variable.lock_in_machine_dimensions_button.setEnabled(false);

                                        variable.next_page_button__into_page_2.setEnabled(true);

                                } else {
                                        variable.instruction_label.setText("invalid input");
                                        int a = 10 / 0;
                                }

                        } catch (Exception ee) {
                                variable.instruction_label.setText("U a phony");
                                variable.vending_machine_width_TextField.setText("enter the width of the machine");
                                variable.vending_machine_depth_TextField.setText("enter the depth of the machine");
                                variable.shelve_number_TextField.setText("enter number of shelves");

                                //different catch statement to catch different errors to print different messages
                        }
                }

                if (e.getSource() == variable.next_page_button__into_page_2) {

                        try {
                                variable.shelve_height = Float.parseFloat(variable.height_of_each_shelve_TextField.getText());
                                variable.shelve_number_of_slots = Float.parseFloat(variable.slots_of_each_shelve_TextField.getText());

                                variable.height_of_each_shelve_TextField.setText("enter height of shelve number x");
                                variable.slots_of_each_shelve_TextField.setText("enter slots for shelve number x");


                                variable.combined_shelve_height += variable.shelve_height;
                                if (variable.combined_shelve_height <= 150) {

                                        Shelve shelve = new Shelve(variable.shelve_height, variable.shelve_number_of_slots);
                                        variable.Shelves.add(shelve);
                                        variable.i++;
                                } else {
                                        variable.combined_shelve_height -= variable.shelve_height;
                                        variable.instruction_label.setText("U have:" + (150 - variable.combined_shelve_height) + " space left. lets remake the shelves");
                                        variable.Shelves.clear();
                                        variable.i = 0;
                                        int a = 10 / 0;
                                }

                        } catch (Exception ee) {
                                variable.instruction_label.setText("U a phony");
                                variable.height_of_each_shelve_TextField.setText("enter height of shelve number x");
                                variable.slots_of_each_shelve_TextField.setText("enter slots for shelve number x");
                        }

                        if (variable.i == variable.vending_machine_shelve_number) {

                                Shelve.setMachine_width(variable.vending_machine_width);
                                Shelve.setMachine_depth(variable.vending_machine_depth);
                                Shelve.setMachine_height(variable.combined_shelve_height);
                                Shelve.setA(variable.Shelves);
                                Shelve.setNumber_of_shelves(variable.vending_machine_shelve_number);
                                new ProductMaker();
                                variable.machine_maker_frame.dispose();
                        }
                }

//----------------------------2-----------------------------------------------------------
                if (e.getSource() == variable.nextPage) {

                        new MoneyInitialization();
                        variable.product_maker_frame.dispose();

                }

                if (e.getSource() == variable.submitProduct) {


                        if (/*all ok*/ true) {
                                variable.ProductNameTextField.Lock();

                                variable.expirationDateTextField_Day.Lock();
                                variable.hitBoxTextField_Depth.Lock();
                                variable.priceTextField.Lock();
                                variable.quantityTextField.Lock();
                                variable.descriptionTextField.Lock(variable.descriptionTextField.getText());
                        }

                }

                if (e.getSource() == variable.iconSelector) {

                        if (variable.dropDownMenuPanelShown) {

                                variable.dropDownMenuPanel.setVisible(false);
                                variable.dropDownMenuPanelShown = false;
                        } else {
                                variable.dropDownMenuPanel.setVisible(true);
                                variable.dropDownMenuPanelShown = true;
                        }
                }

//----------------------------3-----------------------------------------------------------

                if(e.getSource() == variable.next_from_gui_3){

                        System.out.println("-----------------------------------------------------------------------");
                        MachineMoney.printAll();
                        new GUI();
                        variable.frame_from_gui_3.dispose();
                }

//----------------------------4-----------------------------------------------------------


        }


        @Override
        public void mouseClicked(MouseEvent e) {

                if (id == "123") {
                        // Get the index of the item under the mouse pointer
                        int index = variable.iconList.locationToIndex(e.getPoint());

                        if (index >= 0) {
                                // Get the selected icon item from the list model
                                ProductMaker.IconItem selectedIconItem = variable.listModel.getElementAt(index);

                                // Set the preview label with the associated image
                                ImageIcon imageIcon = new ImageIcon(selectedIconItem.getImagePath());
                                variable.previewLabel.setIcon(imageIcon);
                        } else {
                                // Reset the preview label when not hovering over an item
                                variable.previewLabel.setIcon(null);
                        }
                        variable.enabled = false;
                }


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

                if (id == "321") {
                        if (variable.enabled) {

                                // Get the index of the item under the mouse pointer
                                int index = variable.iconList.locationToIndex(e.getPoint());

                                if (index >= 0) {
                                        // Get the selected icon item from the list model
                                        ProductMaker.IconItem selectedIconItem = variable.listModel.getElementAt(index);

                                        // Set the preview label with the associated image
                                        ImageIcon imageIcon = new ImageIcon(selectedIconItem.getImagePath());
                                        variable.previewLabel.setIcon(imageIcon);
                                } else {
                                        // Reset the preview label when not hovering over an item
                                        variable.previewLabel.setIcon(null);
                                }
                        }

                }

        }
}

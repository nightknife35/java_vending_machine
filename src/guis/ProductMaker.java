package guis;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.io.File;
import resources.variable;
import tools.*;

public class ProductMaker extends JFrame implements DocumentListener {

     public ProductMaker() {


        Initialize();

         variable.previewPanel.setBackground(Color.BLUE);
         variable.vendingMachinePreview.setBackground(Color.BLACK);
         variable.dropDownMenuPanel.setBackground(Color.PINK);


         PaintVendingMachine a = new PaintVendingMachine();
         a.setSize(1000,1000);
         variable.vendingMachinePreview.setLayout(null);
         variable.vendingMachinePreview.add(a,BorderLayout.CENTER);

        //repaint();

        //also in the initialization there is maybe game


        AddIconItemsOnTheDropdownMenu();
        AddListeners();
        AddAllItems();
    }


    public void Initialize(){

        int border_offset = 5;
        int y_separation = 9;
        int x_separation = 10;
        int text_field_height = 50;
        int text_field_width = 250;
        int starting_y_position = variable.WINDOW_HEIGHT-border_offset-6*text_field_height-5*y_separation-40;
        int quantity_field_reduction = 50;
        int radio_buttons_height = 30;
        int radio_buttons_width = 50;
        int radio_buttons_separation = 2;
        int triplets_width = text_field_width/3;
        int next_page_width = 65;
        int dropdown_panel_height = 200;
        int searchable_text_field_height = 30;
        int bringing_up_the_vending_machine_preview = 100;


        variable.label_from_gui_2.setBounds(0,0,variable.WINDOW_WIDTH,variable.WINDOW_HEIGHT-starting_y_position);
        variable.ProductNameTextField.setBounds(border_offset,starting_y_position,text_field_width,text_field_height);
        variable.iconSelector.setBounds(border_offset,starting_y_position + y_separation + text_field_height,text_field_width,text_field_height);
        variable.dropDownMenuPanel.setBounds(border_offset,starting_y_position + y_separation + 2*text_field_height,text_field_width,dropdown_panel_height);
        variable.searchField.setPreferredSize(new Dimension(text_field_width,searchable_text_field_height));
        variable.scrollPane.setPreferredSize(new Dimension(text_field_width,dropdown_panel_height-searchable_text_field_height));
        variable.dropDownMenuPanel.add(variable.searchField,BorderLayout.NORTH);
        variable.dropDownMenuPanel.add(variable.scrollPane,BorderLayout.SOUTH);
        variable.priceTextField.setBounds(border_offset,starting_y_position + 2*y_separation + 2*text_field_height,text_field_width,text_field_height);
        variable.expirationDateTextField_Day.setBounds(border_offset + text_field_width + x_separation,starting_y_position,triplets_width,text_field_height);
        variable.expirationDateTextField_Month.setBounds(border_offset + text_field_width + x_separation + triplets_width,starting_y_position,triplets_width,text_field_height);
        variable.expirationDateTextField_Year.setBounds(border_offset + text_field_width + x_separation + 2*triplets_width,starting_y_position,triplets_width,text_field_height);
        variable.quantityTextField.setBounds(border_offset + text_field_width + x_separation,starting_y_position + y_separation + text_field_height,text_field_width- quantity_field_reduction- x_separation,text_field_height);
        variable.g.setBounds(border_offset + 2*text_field_width + x_separation- quantity_field_reduction,starting_y_position + y_separation + text_field_height+text_field_height/2-radio_buttons_height-radio_buttons_separation,radio_buttons_width,radio_buttons_height);
        variable.ml.setBounds(border_offset + 2*text_field_width + x_separation- quantity_field_reduction,starting_y_position + y_separation + text_field_height+text_field_height/2+radio_buttons_separation,radio_buttons_width,radio_buttons_height);
        variable.hitBoxTextField_Width.setBounds(border_offset + text_field_width + x_separation,starting_y_position + 2*y_separation + 2*text_field_height,triplets_width,text_field_height);
        variable.hitBoxTextField_Depth.setBounds(border_offset + text_field_width + x_separation + triplets_width,starting_y_position + 2*y_separation + 2*text_field_height,triplets_width,text_field_height);
        variable.hitBoxTextField_Height.setBounds(border_offset + text_field_width + x_separation + 2*triplets_width,starting_y_position + 2*y_separation + 2*text_field_height,triplets_width,text_field_height);
        variable.previewPanel.setBounds(border_offset + 2*text_field_width + 2*x_separation,starting_y_position,3*text_field_height + 2*y_separation,3*text_field_height + 2*y_separation);
        variable.submitProduct.setBounds(border_offset + 2*text_field_width + 3*x_separation + 3*text_field_height + 2*y_separation,starting_y_position,text_field_width-3*text_field_height - 2*y_separation,3*text_field_height + 2*y_separation);
        variable.descriptionTextField.setBounds(border_offset,starting_y_position + 3*y_separation + 3*text_field_height,2*text_field_width + x_separation,3*text_field_height+2*y_separation);
        variable.code1.setBounds(border_offset + 2*text_field_width + 2*x_separation,starting_y_position + 3*y_separation + 3*text_field_height,text_field_width + x_separation,text_field_height);
        variable.code2.setBounds(border_offset + 2*text_field_width + 2*x_separation,starting_y_position + 4*y_separation + 4*text_field_height,text_field_width + x_separation,text_field_height);
        variable.amountOfSaidItem.setBounds(border_offset + 2*text_field_width + 2*x_separation,starting_y_position + 5*y_separation + 5*text_field_height ,text_field_width + x_separation,text_field_height);
        variable.vendingMachinePreview.setBounds(border_offset + 4*x_separation + 3*text_field_width,starting_y_position -bringing_up_the_vending_machine_preview,variable.WINDOW_WIDTH - 2*border_offset - 6*x_separation - 3*text_field_width -next_page_width,6*text_field_height + 5*y_separation+bringing_up_the_vending_machine_preview);
        variable.nextPage.setBounds(variable.WINDOW_WIDTH - next_page_width - x_separation -2*border_offset,starting_y_position,next_page_width,6*text_field_height + 5*y_separation);
    }
    public void AddAllItems(){

        variable.product_maker_frame.add(variable.label_from_gui_2);
        variable.product_maker_frame.add(variable.ProductNameTextField);
        variable.product_maker_frame.add(variable.iconSelector);
        variable.product_maker_frame.add(variable.dropDownMenuPanel);
        variable.product_maker_frame.add(variable.priceTextField);
        variable.product_maker_frame.add(variable.expirationDateTextField_Day);
        variable.product_maker_frame.add(variable.expirationDateTextField_Month);
        variable.product_maker_frame.add(variable.expirationDateTextField_Year);
        variable.product_maker_frame.add(variable.quantityTextField);
        variable.radioButtonGroup.add(variable.g);
        variable.radioButtonGroup.add(variable.ml);
        variable.product_maker_frame.add(variable.g);
        variable.product_maker_frame.add(variable.ml);
        variable.product_maker_frame.add(variable.hitBoxTextField_Width);
        variable.product_maker_frame.add(variable.hitBoxTextField_Depth);
        variable.product_maker_frame.add(variable.hitBoxTextField_Height);
        variable.product_maker_frame.add(variable.previewPanel);
        variable.product_maker_frame.add(variable.descriptionTextField);
        variable.product_maker_frame.add(variable.code1);
        variable.product_maker_frame.add(variable.code2);
        variable.product_maker_frame.add(variable.amountOfSaidItem);
        variable.product_maker_frame.add(variable.submitProduct);
        variable.product_maker_frame.add(variable.vendingMachinePreview);
        variable.product_maker_frame.add(variable.nextPage);

        variable.product_maker_frame.setVisible(true);
    }
    public void AddListeners(){

        variable.iconSelector.addActionListener(new EverythingListener("123"));
        variable.nextPage.addActionListener(new EverythingListener("123"));
        variable.submitProduct.addActionListener(new EverythingListener("123"));
        variable.iconList.addMouseMotionListener(new EverythingListener("321"));
        variable.iconList.addMouseListener(new EverythingListener("321"));
        variable.searchField.getDocument().addDocumentListener(this);
    }
    public void AddIconItemsOnTheDropdownMenu(){

        File directory = new File("images/products");
        //File array of all the files in the directory
        File[] files = directory.listFiles();

        for (File i : files) {

            String string_of_path = i.getPath();
            String name_of_path;
            name_of_path = string_of_path.substring(0, string_of_path.length() - 4).substring(16);
            variable.allIconItems.add(new ProductMaker.IconItem(name_of_path, string_of_path));
        }

        for (ProductMaker.IconItem i : variable.allIconItems) {variable.listModel.addElement(i);}
        variable.iconList.setModel(variable.listModel);
        variable.scrollPane.setViewportView(variable.iconList);
        variable.previewPanel.add(variable.previewLabel);
        variable.dropDownMenuPanel.setVisible(false);
    }

//--------------------------------------------------------------------------------
    public class IconItem {
        private String name;
        private String imagePath;

        public IconItem(String name, String imagePath) {
            this.name = name;
            this.imagePath = imagePath;
        }

        public String getName() {
            return name;
        }

        public String getImagePath() {
            return imagePath;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public void filterItems() {
        Document document = variable.searchField.getDocument();
        String searchQuery;
        try {
            searchQuery = document.getText(0, document.getLength());
        } catch (Exception ex) {
            searchQuery = "";
        }

        variable.listModel.clear();
        for (ProductMaker.IconItem iconItem : variable.allIconItems) {
            if (iconItem.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                variable.listModel.addElement(iconItem);
            }
        }
    }
    @Override
    public void insertUpdate(DocumentEvent e) {filterItems();}
    @Override
    public void removeUpdate(DocumentEvent e) {filterItems();}
    @Override
    public void changedUpdate(DocumentEvent e) {filterItems();}
}

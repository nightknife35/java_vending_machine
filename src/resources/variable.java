package resources;

import guis.ProductMaker;
import tools.MakeTheFrame;
import tools.BetterTextField;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class variable {
    //I decided its more comfortable to use variable as name convection
    //    //Other candidates included v,V,var,Var,Variable(s) and many more

    //also I was considering not doing it this way cuz of "EnCaPtUlAtIoN"
    //But after a little research I found out that there is a thing called
    //reflexion and I now don't believe in Modifiers and just put public everywhere

    //---------------------------------------MakeTheFrame---------------------------------------------------------------
    public static final int WINDOW_HEIGHT = 800;
    public static final int WINDOW_WIDTH = 1400;
    public static final Color frame_background_color = new Color(0xffffff);
    public static final Color BetterTextField_background_color = new Color(0xFF9B4D67, true);
    //---------------------------------------BetterTextField------------------------------------------------------------
    /*
    public static String placeholder_text;
    public static boolean unlocked = true;
    public static Highlighter defaultHighlighter;
     */
    //---------------------------------------MachineMaker---------------------------------------------------------------

    //they are not variables (int float ect. they are classes/objects. Give the ThisKindaName)
    public static MakeTheFrame machine_maker_frame = new MakeTheFrame("Making the Machine itself");
    public static JLabel welcoming_label = new JLabel("Lets make a vending machine");
    public static JLabel instruction_label = new JLabel("first enter in width, height and shelve number");
    public static JButton lock_in_machine_dimensions_button = new JButton("Set Dimensions");
    public static JButton next_page_button__into_page_2 = new JButton("-->");
    public static BetterTextField vending_machine_depth_TextField = new BetterTextField("enter the depth of the machine");
    public static BetterTextField vending_machine_width_TextField = new BetterTextField("enter the width of the machine");
    public static BetterTextField shelve_number_TextField = new BetterTextField("enter number of shelves");
    public static BetterTextField height_of_each_shelve_TextField = new BetterTextField("enter height of shelve number x");
    public static BetterTextField slots_of_each_shelve_TextField = new BetterTextField("enter slots for shelve number x");
    public static float vending_machine_depth;
    public static float vending_machine_width;
    public static int vending_machine_shelve_number;
    public static float shelve_height;
    public static float shelve_number_of_slots;
    public static float combined_shelve_height=0;
    public static ArrayList<Shelve> Shelves = new ArrayList<>();
    public static int i =0;
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static MakeTheFrame product_maker_frame = new MakeTheFrame("Lets make them products");
    public static BetterTextField ProductNameTextField = new BetterTextField("name");
    public static JButton iconSelector = new JButton("select icon");
    public static BetterTextField priceTextField = new BetterTextField("price");
    public static BetterTextField expirationDateTextField_Day = new BetterTextField("expiration_date d");
    public static BetterTextField expirationDateTextField_Month = new BetterTextField("expiration_date m");
    public static BetterTextField expirationDateTextField_Year = new BetterTextField("expiration_date y");
    public static BetterTextField quantityTextField = new BetterTextField("quantity");
    public static ButtonGroup radioButtonGroup = new ButtonGroup();
    public static JRadioButton g = new JRadioButton("g");
    public static JRadioButton ml = new JRadioButton("ml");
    public static BetterTextField hitBoxTextField_Width = new BetterTextField("dimensions w");
    public static BetterTextField hitBoxTextField_Depth = new BetterTextField("dimensions d");
    public static BetterTextField hitBoxTextField_Height = new BetterTextField("dimensions h");
    public static BetterTextField descriptionTextField = new BetterTextField("description");
    public static BetterTextField code1 = new BetterTextField("code1");
    public static BetterTextField code2 = new BetterTextField("code2");
    public static BetterTextField amountOfSaidItem = new BetterTextField("amountOfSaidItem");
    public static JPanel vendingMachinePreview = new JPanel();

    //-------------------------------------------------
    public static JLabel label_from_gui_2 = new JLabel("Now lets make some products");
    public static JButton submitProduct = new JButton("submit");
    public static JButton nextPage = new JButton("-->");

    //-------------------------------------------------

    public static JScrollPane scrollPane = new JScrollPane();
    public static DefaultListModel<ProductMaker.IconItem> listModel = new DefaultListModel<>();
    public static JList<ProductMaker.IconItem> iconList = new JList<>(listModel);
    public static JPanel previewPanel = new JPanel();
    public static JLabel previewLabel = new JLabel();
    public static JTextField searchField = new JTextField();
    public static ArrayList<ProductMaker.IconItem> allIconItems = new ArrayList<>();
    public static JPanel dropDownMenuPanel = new JPanel();
    public static boolean enabled = true;
    public static boolean dropDownMenuPanelShown = false;
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static JButton next_from_gui_3 = new JButton();
    public static MakeTheFrame frame_from_gui_3 = new MakeTheFrame("name 3");
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------

    public static MakeTheFrame frame_from_gui_4 = new MakeTheFrame("name 4");
    public static JButton b0 = new JButton();
    public static JButton b1 = new JButton();
    public static JButton b2 = new JButton();
    public static JButton b3 = new JButton();
    public static JButton b4 = new JButton();
    public static JButton b5 = new JButton();
    public static JButton b6 = new JButton();
    public static JButton b7 = new JButton();
    public static JButton b8 = new JButton();
    public static JButton b9 = new JButton();
    public static JButton b_cancel = new JButton();
    public static JButton b_ok = new JButton();
    //----------------------------------

    public static BetterTextField a = new BetterTextField("enter: 11-99");
    public static BetterTextField b = new BetterTextField("remaining price");
}

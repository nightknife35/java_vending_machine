package resources;

import java.util.ArrayList;

public class Shelve {

    static float machine_width=150;
    static float machine_depth=150;
    static float machine_height=100;
    static int number_of_shelves=1;
    static ArrayList<Shelve> a = new ArrayList<>();


    float shelve_height;
    float slots;
    int unique_identifier;

    public Shelve(float _shelve_height, float _slots) {
        shelve_height = _shelve_height;
        slots = _slots;
    }


//---------------------------------------------------------------------------------------------------------
    public float getShelveHeight() {return shelve_height;}
    public float getSlots() {return slots;}
    public int getUniqueIdentifier() {return unique_identifier;}
//---------------------------------------------------------------------------------------------------------
    public void setShelveHeight(float shelve_height) {this.shelve_height = shelve_height;}
    public void setSlots(float slots) {this.slots = slots;}
    public void setUniqueIdentifier(int unique_identifier) {this.unique_identifier = unique_identifier;}
//---------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------
static public void setMachine_width(float _machine_width) {
    machine_width = _machine_width;
}
    static public void setMachine_depth(float _machine_depth) {machine_depth = _machine_depth;}
    static public void setMachine_height(float _machine_height) {
        machine_height = _machine_height;
    }
    static public void setA(ArrayList<Shelve> _a) {
        a = _a;
    }
    static public void setNumber_of_shelves(int number_of_shelves) {Shelve.number_of_shelves = number_of_shelves;}

    //---------------------------------------------------------------------------------------------------------
    static public float getMachine_width() {
        return machine_width;
    }
    static public float getMachine_depth() {
        return machine_depth;
    }
    static public float getMachine_height() {
        return machine_height;
    }
    static public ArrayList<Shelve> getA() {
        return a;
    }
    static public int getNumber_of_shelves() {return number_of_shelves;}
//---------------------------------------------------------------------------------------------------------

}
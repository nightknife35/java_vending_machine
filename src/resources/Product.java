package resources;

import java.util.Date;

// all the information will be here (or on something smaller). Everything else just holds the numbers which will be passed here
// do packages next
public class Product {

    enum Quantity{

        Grams,
        Ml
    }

    String name;
    String brand;
    String description;
    float price;
    Quantity quantity;
    Date expriration_date;
    float height;
    float width;
    float depth;




    Product(String _name,String _brand,String _description,float _price,Quantity _quantity,Date _expriration_date,float _height,float _width,float _depth){

        name = _name;
        brand = _brand;
        description = _description;
        price = _price;
        quantity = _quantity;
        expriration_date = _expriration_date;
        height = _height;
        width = _width;
        depth = _depth;

    }

}

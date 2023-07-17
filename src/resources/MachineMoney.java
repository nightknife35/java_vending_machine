package resources;

public class MachineMoney {

    static int[] amount_of_each_coin = {0,0,0,0,0,0,0,0};
    static String[] coin_names = {"1","2","5","10","20","50","100","200"};
    static int index;

    public static void addMoney(String name){

        for (int i = 0; i < coin_names.length; i++) {

            index = i;
            if(name == coin_names[i]){break;}
        }
        amount_of_each_coin[index] +=1;
    }

    public static void readMoney(){}

    public static void printAll(){

        for (int i = 0; i < amount_of_each_coin.length; i++) {

            System.out.println(amount_of_each_coin[i]);
        }
    }


}

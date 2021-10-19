package grocery_sorte;
//import java.util.Scanner;

public class Store implements Platform {
    //Maximum amount of items in the Store
    final int MAX_SIZE = 500;

    String[] items;//contains all the items offered within the store
    int[] aisles;//the nodes of the entrnce and exits of the aisles

    String storeName;
    public Store() {
        
        items = new String[67];//size of the items list array with in the store
        items[0] = "Apples";  items[1] = "Oranges";      items[2] = "Grapes";
        items[3] = "Bananas"; items[4] = "Strawberries"; items[5] = "Pears";
        items[6] = "Mangos";  items[7] = "Watermelon";   items[8] = "Pineapples";
        items[9] = "Blueberries"; //10 1
        items[10] = "Blackberries"; items[11] = "Peaches";  items[12] = "Avacado";
        items[13] = "Lemons";       items[14] = "Cherries"; items[15] = "Cantaloupe";
        items[16] = "Limes";
        /**************************end of fruits************************************/          
                                    items[17] = "Potatoes"; items[18] = "Carrots";
        items[19] = "Tomatoes"; //10 2
        items[20] = "Cabbage";      items[21] = "Onion";   items[22] = "Aaparagus";
        items[23] = "Califlower";   items[24] = "Lettuce"; items[25] = "Green Beans";
        items[26] = "Bell Peppers"; items[27] = "Celery";  items[28] = "Spinach";
        items[29] = "Garlic"; //10 3
        items[30] = "Corn";           items[31] = "Cucumbers";   items[32] = "Broccoli";
        /**************************end of vegitables**********************************************/ 
        items[33] = "Canned Beans";   items[34] = "Canned Corn"; items[35] = "Canned Green Beans";
        items[36] = "Canned Peaches"; items[37] = "Cereal";      items[38] = "Oatmeal";
        items[39] = "Flour"; //10 4
        items[40] = "Sugar";      items[41] = "Backing Soda"; items[42] = "Sauce";
        items[43] = "Condiments"; items[44] = "Noodles";
        /*************************end of canned/boxed foods***********************/ 
                                                              items[45] = "Beef";
        items[46] = "Fish";       items[47] = "Chicken";      items[48] = "Turkey";
        /*************************end of meats***************************************/
        items[49] = "Milk"; //10 5
        items[50] = "Cheese";   items[51] = "Yogurt";       items[52] = "Sour Cream";
        items[53] = "Butter";   items[54] = "Cream Cheese";
        /*************************end of dairy***************************************/ 
                                                            items[55] = "Chips";
        items[56] = "Crackers"; items[57] = "Peanut Nuts";  items[58] = "Popcorn";
        /*************************end of snacks*************************************/
        items[59] = "Chocolate"; //10 6
        items[60] = "Cake";        items[61] = "Ice Cream";   items[62] = "Cookies";
        /*************************end of deserts***********************************************/
        items[63] = "White Bread"; items[64] = "Wheat Bread"; items[65] = "Whole Grain Bread";
        items[66] = "Baguette";
        /*************************end of breads*************************************************/ 
        //7 7

        aisles = new int[59];//nodes located around the map, see map for details
        
    }//end of Store constructor with no parameters

    // public Items findItem(){
    //     return;
    // }

    public String[] getAllItems() {
        return this.items;
    }//end of getAllItems() method
}//end of Store class

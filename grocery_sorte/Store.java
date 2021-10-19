package grocery_sorte;
import java.util.Scanner;

public class Store implements Platform {
    //Maximum amount of items in the Store
    final int MAX_SIZE = 67;
    //Maximum amount of nodes in the Store
    final int MAX_NODES = 59;

    String[] list;//contains a list of all the items offered within the store
    int[] aisles;//the nodes of the entrnce and exits of the aisles
    Items[] items;//the list of items locations in the store
    Items[] item1;

    String storeName;
    public Store() {
        
        list = new String[MAX_SIZE];//size of the list list array with in the store
        list[0] = "Apples";  list[1] = "Oranges";      list[2] = "Grapes";
        list[3] = "Bananas"; list[4] = "Strawberries"; list[5] = "Pears";
        list[6] = "Mangos";  list[7] = "Watermelon";   list[8] = "Pineapples";
        list[9] = "Blueberries"; //10 1
        list[10] = "Blackberries"; list[11] = "Peaches";  list[12] = "Avacado";
        list[13] = "Lemons";       list[14] = "Cherries"; list[15] = "Cantaloupe";
        list[16] = "Limes";
        /**************************end of fruits************************************/          
                                    list[17] = "Potatoes"; list[18] = "Carrots";
        list[19] = "Tomatoes"; //10 2
        list[20] = "Cabbage";      list[21] = "Onion";   list[22] = "Aaparagus";
        list[23] = "Califlower";   list[24] = "Lettuce"; list[25] = "Green Beans";
        list[26] = "Bell Peppers"; list[27] = "Celery";  list[28] = "Spinach";
        list[29] = "Garlic"; //10 3
        list[30] = "Corn";           list[31] = "Cucumbers";   list[32] = "Broccoli";
        /**************************end of vegitables**********************************************/ 
        list[33] = "Canned Beans";   list[34] = "Canned Corn"; list[35] = "Canned Green Beans";
        list[36] = "Canned Peaches"; list[37] = "Cereal";      list[38] = "Oatmeal";
        list[39] = "Flour"; //10 4
        list[40] = "Sugar";      list[41] = "Backing Soda"; list[42] = "Sauce";
        list[43] = "Condiments"; list[44] = "Noodles";
        /*************************end of canned/boxed foods***********************/ 
                                                            list[45] = "Beef";
        list[46] = "Fish";       list[47] = "Chicken";      list[48] = "Turkey";
        /*************************end of meats***************************************/
        list[49] = "Milk"; //10 5
        list[50] = "Cheese";   list[51] = "Yogurt";       list[52] = "Sour Cream";
        list[53] = "Butter";   list[54] = "Cream Cheese";
        /*************************end of dairy***************************************/ 
                                                          list[55] = "Chips";
        list[56] = "Crackers"; list[57] = "Peanut Nuts";  list[58] = "Popcorn";
        /*************************end of snacks*************************************/
        list[59] = "Chocolate"; //10 6
        list[60] = "Cake";        list[61] = "Ice Cream";   list[62] = "Cookies";
        /*************************end of deserts***********************************************/
        list[63] = "White Bread"; list[64] = "Wheat Bread"; list[65] = "Whole Grain Bread";
        list[66] = "Baguette";
        /*************************end of breads*************************************************/ 
        //7 7

        aisles = new int[MAX_NODES];//nodes located around the map, see map for details

        items = new Items[MAX_SIZE];
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        items[0] = new Items(list[0], 51, 54, "Produce"); items[1] = new Items(list[1], 51, 54, "Produce");
        items[2] = new Items(list[2], 51, 54, "Produce"); items[3] = new Items(list[3], 51, 54, "Produce");
        items[4] = new Items(list[4], 51, 54, "Produce"); items[5] = new Items(list[5], 51, 54, "Produce");
        items[6] = new Items(list[6], 51, 54, "Produce"); items[7] = new Items(list[7], 51, 54, "Produce");
        items[8] = new Items(list[8], 51, 54, "Produce"); items[9] = new Items(list[9], 51, 54, "Produce");
        items[10] = new Items(list[10], 51, 54, "Produce"); items[11] = new Items(list[11], 51, 54, "Produce");
        items[12] = new Items(list[12], 51, 54, "Produce"); items[13] = new Items(list[13], 51, 54, "Produce");
        items[14] = new Items(list[14], 51, 54, "Produce"); items[15] = new Items(list[15], 51, 54, "Produce");
        items[16] = new Items(list[16], 51, 54, "Produce"); items[17] = new Items(list[17], 51, 54, "Produce");
        items[18] = new Items(list[18], 51, 54, "Produce"); items[19] = new Items(list[19], 51, 54, "Produce");
        items[20] = new Items(list[20], 51, 54, "Produce"); items[21] = new Items(list[21], 51, 54, "Produce");
        items[22] = new Items(list[22], 51, 54, "Produce"); items[23] = new Items(list[23], 51, 54, "Produce");
        items[24] = new Items(list[24], 51, 54, "Produce"); items[25] = new Items(list[25], 51, 54, "Produce");
        items[26] = new Items(list[26], 51, 54, "Produce"); items[27] = new Items(list[27], 51, 54, "Produce");
        items[28] = new Items(list[28], 51, 54, "Produce"); items[29] = new Items(list[29], 51, 54, "Produce");
        items[30] = new Items(list[30], 51, 54, "Produce"); items[31] = new Items(list[31], 51, 54, "Produce");
        items[32] = new Items(list[32], 51, 54, "Produce"); 
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                              items[33] = new Items(list[33], 8, 21, "Groceries");
        items[34] = new Items(list[34], 8, 21, "Groceries");  items[35] = new Items(list[35], 20, 25, "Groceries");
        items[36] = new Items(list[36], 20, 25, "Groceries"); items[37] = new Items(list[37], 20, 25, "Groceries");
        items[38] = new Items(list[38], 24, 26, "Groceries"); items[39] = new Items(list[39], 24, 26, "Groceries");
        items[40] = new Items(list[40], 30, 31, "Groceries"); items[41] = new Items(list[41], 29, 30, "Groceries");
        items[42] = new Items(list[42], 33, 34, "Groceries"); items[43] = new Items(list[43], 34, 35, "Groceries");
        items[44] = new Items(list[44], 37, 38, "Groceries");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                         items[45] = new Items(list[45], 26, 27, "Meat");
        items[46] = new Items(list[46], 28, 29, "Meat"); items[47] = new Items(list[47], 32, 33, "Meat");
        items[48] = new Items(list[48], 36, 37, "Meat");
        /////////////////////////////////////////////////////////////////////////////////////////////////////
                                                          items[49] = new Items(list[49], 21, 22, "Dairy");
        items[50] = new Items(list[50], 21, 22, "Dairy"); items[51] = new Items(list[51], 21, 22, "Dairy");
        items[52] = new Items(list[52], 21, 22, "Dairy"); items[53] = new Items(list[53], 21, 22, "Dairy");
        items[54] = new Items(list[54], 21, 22, "Dairy");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                              items[55] = new Items(list[55], 38, 39, "Groceries");
        items[56] = new Items(list[56], 38, 39, "Groceries"); items[57] = new Items(list[57], 38, 39, "Groceries");
        items[58] = new Items(list[58], 38, 39, "Groceries");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                            items[59] = new Items(list[59], 11, 12, "Bakerey");
        items[60] = new Items(list[60], 11, 12, "Bakerey"); items[61] = new Items(list[61], 13, 14, "Bakerey");
        items[62] = new Items(list[62], 13, 14, "Bakerey");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                            items[63] = new Items(list[63], 15, 16, "Bakerey");
        items[64] = new Items(list[64], 15, 16, "Bakerey"); items[65] = new Items(list[65], 15, 16, "Bakerey");
        items[66] = new Items(list[66], 15, 16, "Bakerey");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////

    }//end of Store constructor with no parameters

    public void sort(Items[] arr, int amount)
    {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        Items[] output = new Items[n];
 
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[n];
        for (int i = 0; i < n; ++i) {
            count[i] = 0;
        }
 
        // store count of each character
        for (int i = 0; i < n; ++i) {
            count[i] = arr[i].getEnterNode();
            //++count[arr[i]];

            //System.out.println(arr[i]);
        }
 
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= n-1; ++i) {
            count[i] += count[i - 1];
        }

        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[i] - 1] = arr[i];
            //System.out.println(output[i]);

            --count[i];

            //System.out.println(arr[i]);
        }
 
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i) {
            item1[i] = output[i];

            System.out.println(arr[i]);
        }
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }//end of sort() method with 1 parameter
    
    public void path(){
        Scanner in = new Scanner(System.in);
        int amount = 0;
        System.out.println();
        System.out.println("How many types of items are you looking for?\n\nThe items offered are:\n");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("Please type exactly how many items as an integer > 0:");
        amount = in.nextInt();
        String[] cart = new String[amount];

        System.out.println("\nWhat items do you want to add to the list?\nPlease type exactly how the item is spelled:");

        boolean check = false;
        int count = 0;
        String read = "";
        while(count < amount){
            read = in.nextLine();
            for(int i = 0; i < list.length; i++){
                if(read.equals(list[i]) && !check){
                    check = true;
                }
            }
            if(check) {
                cart[count] = read;
                count++;
            }else {
                System.out.println("That is not a item offered.\nPlease type exactly how the item is spelled from the list:");
            }            
        }

        Items[] arr = new Items[amount];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < items.length; j++) {
                if(cart[i].equals(items[j].getName())){
                    arr[i] = items[j];
                }
            }
        }
        item1 = new Items[amount];
        sort(arr, amount);

        //Now to check for the time
        count = 0;
        for (int i = 0; i < item1.length; i++) {
            item1[i].details();
            count++;
            if((count % 2) == 0) count++;
        }
        count += 5;//Add 5 mins for checkout

        System.out.println("It will take an approximate" + count + "minutes to complete this trip");
        in.close();
    }

    public String[] getList() {
        return this.list;
    }//end of getAllList() method
}//end of Store class

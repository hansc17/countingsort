package grocery_sorte;


// Java implementation of Counting Sort
public class CountingSort {
    public Items[] sort(Items[] arr, int amount)
    {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        Items[] output = new Items[n];
 
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[amount];
        for (int i = 0; i < amount; ++i) {
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
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i].getEnterNode()] - 1] = arr[i];
            //System.out.println(output[i]);

            --count[arr[i].getEnterNode()];

            //System.out.println(arr[i]);
        }
 
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];

            System.out.println(arr[i]);
        }
        return arr;
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }//end of sort() method with 1 parameter


 
    /*******************************************************************************
     * Do not uncommet this, the Driver method got moved inside StoreDriver.java
     * ****************************************************************************
     */
    // // Driver method
    // public static void main(String args[])
    // {
    //     CountingSort ob = new CountingSort();
    //     char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
    //                    'r', 'g', 'e', 'e', 'k', 's' };
 
    //     ob.sort(arr);
 
    //     System.out.print("Sorted character array is ");
    //     for (int i = 0; i < arr.length; ++i)
    //         System.out.print(arr[i]);
    // }
    /******************************************************************************/



}//end of CountingSort class

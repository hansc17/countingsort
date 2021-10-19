package grocery_sorte;

public class StoreDriver {
    // Driver method
    public static void main(String args[]) {
        
        //////////////////////////////////////////////////////
        CountingSort ob = new CountingSort();
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                       'r', 'g', 'e', 'e', 'k', 's' };
 
        ob.sort(arr);
 
        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }//end of main method
}//end of StoreDriver class

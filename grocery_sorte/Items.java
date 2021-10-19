package grocery_sorte;

public class Items {
    String name; //name of item
    String section; //the section name
    int enterNode; //where to enter
    int exitNode; //where to exit

    public Items(String name, int enterNode, int exitNode, String section) {
        this.name = name;
        this.enterNode = enterNode;
        this.exitNode = exitNode;
        this.section = section;
    }//end of Items constructor with 2 parameters
    
    public void Details(){
        System.out.println("\nItem: " +this.name);
        System.out.println("Located between node: " + this.enterNode + " and " + this.exitNode);
        System.out.println("Section: " + this.section);
    }//end of Details() method


}//end of Items class

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

    public void setEnterNode(int n) {
        this.enterNode = n;
    }//end of setEnterNode()

    public void setExitNode(int n) {
        this.exitNode = n;
    }//end of setExitNode()

    public String getName() {
        return this.name;
    }//end of getEnterNode()

    public int getEnterNode() {
        return this.enterNode;
    }//end of getEnterNode()

    public int getExitNode() {
        return this.exitNode;
    }//end of getExitNode()
    
    public void details(){
        System.out.println("\nItem: " +this.name);
        System.out.println("Located between node: " + this.enterNode + " and " + this.exitNode);
        System.out.println("Section: " + this.section + "\n");
    }//end of details() method

}//end of Items class

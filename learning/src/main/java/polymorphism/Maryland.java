package polymorphism;

/**
 * Created by jainvk on 12/26/16.
 */


public class Maryland extends State {
    Maryland() { /* null constructor */ }
    public void printMe() { System.out.println("Read it."); }
    public static void main(String[ ] args) {
        Region east = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();
        md.printMe(); //read it
        east.printMe();  // ship it
        ((Place) obj).printMe();  //buy it
        obj = md;
        ((Maryland) obj).printMe(); // read it
        obj = usa;
        ((Place) obj).printMe(); // box it
        usa = md;
        ((Place) usa).printMe(); // read it

        boolean b = false;
        if(b == true) {
            boolean temp = true;
            System.out.println(temp);
        }
    }
}
class State extends Region {
    State() { /* null constructor */ }
    public void printMe() { System.out.println("Ship it."); }
}
class Region extends Place {
    Region() { /* null constructor */ }
    public void printMe() { System.out.println("Box it."); }
}
class Place extends Object {
    Place() { /* null constructor */ }
    public void printMe() { System.out.println("Buy it."); }
}


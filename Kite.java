package items;

import actions.ExtraActions;
import items.Items;

public class Kite extends Items implements ExtraActions {

    public Kite(String name){
        super(name);
    }

    public void buzz(){
        System.out.print("гудели");
    }

    public void buzz(String characteristic){
        System.out.print(characteristic + " гудели");
    }

    @Override
    public String toString() {
        return name;
    }
}

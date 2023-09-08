package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuItem> THE_BURGER_JOINT = new ArrayList<>();


        MenuItem burger = new MenuItem(10, "plain ole burger", "The boring burger", false);
        THE_BURGER_JOINT.add(burger);
        MenuItem sandwich = new MenuItem(11, "", "The boring sandwhich", true);
        sandwich.setDescription("A good ole sandwich with only cheddar cheese and salami");
        THE_BURGER_JOINT.add(sandwich);

        Menu TheBurgerJoint = new Menu(new Date(), THE_BURGER_JOINT);

        System.out.println("Should have two items:");
        TheBurgerJoint.PrintItems();
        System.out.println("Remove the burger:");
        TheBurgerJoint.removeItem(burger);
        TheBurgerJoint.PrintItems();
        System.out.println("Add it back:");
        TheBurgerJoint.addItem(burger);
        TheBurgerJoint.PrintItems();
    }
}

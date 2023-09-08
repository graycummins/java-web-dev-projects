package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }


    public void setLastUpdated(Date lastUpdated) {

        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {

        this.items = items;
    }

    public Date getLastUpdated() {

        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {

        return items;
    }

    public ArrayList<MenuItem> PrintItems() {
        for (MenuItem MenuItem : items){
            MenuItem.getName();
        }
        return items;
    }
    public void removeItem(MenuItem e) {
        for (MenuItem item : items) {
            this.items.remove(e);
        }
    }
    public ArrayList<MenuItem> addItem(MenuItem e) {
        this.items.add(e);

        return items;
    }

}

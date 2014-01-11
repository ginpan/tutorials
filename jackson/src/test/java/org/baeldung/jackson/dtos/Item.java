package org.baeldung.jackson.dtos;

public class Item {
    public final int id;
    public final String itemNr;
    public final User owner;

    public Item(final int id, final String itemNr, final User owner) {
        this.id = id;
        this.itemNr = itemNr;
        this.owner = owner;
    }

    // API

    public int getId() {
        return id;
    }

    public String getItemNr() {
        return itemNr;
    }

    public User getOwner() {
        return owner;
    }

}
package com.su.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bogdan on 17.09.16.
 */
public class Lot {
    private Item item;
    private User owner;
    private BigDecimal startPrice;
    private Date datePlaced;
    private User buyer;
    private BigDecimal currentPrice;

    public Lot() {
    }

    public Lot(Item item, User owner, BigDecimal startPrice, Date datePlaced, User buyer, BigDecimal currentPrice) {
        this.item = item;
        this.owner = owner;
        this.startPrice = startPrice;
        this.datePlaced = datePlaced;
        this.buyer = buyer;
        this.currentPrice = currentPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public Date getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lot lot = (Lot) o;

        if (item != null ? !item.equals(lot.item) : lot.item != null) return false;
        if (owner != null ? !owner.equals(lot.owner) : lot.owner != null) return false;
        if (startPrice != null ? !startPrice.equals(lot.startPrice) : lot.startPrice != null) return false;
        if (datePlaced != null ? !datePlaced.equals(lot.datePlaced) : lot.datePlaced != null) return false;
        if (buyer != null ? !buyer.equals(lot.buyer) : lot.buyer != null) return false;
        return currentPrice != null ? currentPrice.equals(lot.currentPrice) : lot.currentPrice == null;

    }

    @Override
    public int hashCode() {
        int result = item != null ? item.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (startPrice != null ? startPrice.hashCode() : 0);
        result = 31 * result + (datePlaced != null ? datePlaced.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (currentPrice != null ? currentPrice.hashCode() : 0);
        return result;
    }
}
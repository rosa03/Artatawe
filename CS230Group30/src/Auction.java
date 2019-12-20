package src;

import java.sql.Timestamp;
/**
 * Class creates new auction.
 */
public class Auction{
    private User seller;
    private Artwork artwork;
    private int currentNoOfBids;
    private int newPrice;
    private int ID;
    private boolean isComplete;
    private Timestamp timestamp;
    private BidCollection bids;

    public Auction(User seller,Artwork artwork){
        isComplete = false;
        timestamp = new Timestamp(System.currentTimeMillis());
        this.artwork = artwork;
        this.seller = seller;
        bids = new BidCollection();

    }

    public BidCollection getBids() {
        return bids;
    }

    public User getSeller() {
        return seller;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public int getCurrentNoOfBids() {
        return currentNoOfBids;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public int getID() {
        return ID;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void setCurrentNoOfBids(int currentNoOfBids) {
        this.currentNoOfBids = currentNoOfBids;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
    //public isCompleted()

    public  boolean isCompleted(){
        if(bids.getBids().size() >= artwork.maxNoOfBids){
            isComplete = true;
        }
        return isComplete;
    }

}
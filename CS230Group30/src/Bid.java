package src;

import java.sql.Timestamp;

public class Bid {
    private User bidder;
    private Auction auction;
    private int value;
    private Timestamp timestamp;


    public Bid(Auction auction,int value,User bidder){
        timestamp = new Timestamp(System.currentTimeMillis());
        this.auction = auction;
        this.value = value;
        this.bidder = bidder;
    }

    public User getBidder(){
        return this.bidder;
    }

    public int getValue() {
        return value;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setValue(int value) {
        this.value = value;
    }



    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "The bidder is: "+this.auction.getSeller().getFirstName()+" the value of the bid: "+this.value;
    }
}

package src;

import java.util.ArrayList;

/**
 * This class represents the collection of bid histories associated with a user.
 * @author Argyro Gounari
 * @version 1.0
 */
//TODO For this to work in the bid class we should add the artwork that the bid is associated with
//otherwise we should add an arraylist with artworks here
//TODO Also in auction we need to add the bid collecction associated with it
public class BidHistories {

    protected ArrayList<Bid> bidsPlaced = new ArrayList<Bid>();

    /**
     * Create a collection with bids placed by the user.
     * @param bidsPlaced the bids the user has placed.
     */
    public void allBidsPlaced(ArrayList<Bid> bidsPlaced) {
        this.bidsPlaced = bidsPlaced;
    }

    /**
     * Add a new bid.
     * @param newBid The new bid.
     */
    public void addBidsPlaced(Bid newBid) {
        bidsPlaced.add(newBid);
    }

    /**
     * Get the bids placed.
     * @return The bids.
     */
    /*
    public String getBidsPlaced(){

        String theString = "";

        if (bidsPlaced.isEmpty()){
            return theString;
        }

        ArrayList<src.Bid> newBidsPlaced = chronological(bidsPlaced);

        for (src.Bid bid : newBidsPlaced) {
            theString = theString + bid.getTimestamp() + " " + bid.getArtwork() + " " + bid.getValue() + "\n";
        }

    }

    /**
     * Get the bids placed on auction.
     * @return The bids.
     */
    /*
    public String getBidsPlaced(src.Auction theAuction){

        String theString = "";

        ArrayList<src.Bid> newBidsPlaced = chronological(Arrays.asList(theAuction.getBids().getBidCollection()));

        for (src.Bid bid : newBidsPlaced) {
            theString = theString + bid.getTimestamp() + " " + bid.getBidder().getUsername() + " " + bid.getValue() + "\n";
        }

    }
*/
    /**
     * Get the chronologically sorted list.
     * @return The list.
     */
    private ArrayList<Bid> chronological(ArrayList<Bid> newBidsPlaced) {

        int n = this.bidsPlaced.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++){
                k = i + 1;
                if (this.bidsPlaced.get(i).getTimestamp().before(this.bidsPlaced.get(k).getTimestamp())) {
                    swapBids(i,k,newBidsPlaced);
                }
            }
        }
        return newBidsPlaced;
    }

    /**
     * Swap two bids.
     * @param i The place of the bid.
     * @param j The place of the other bid.
     * @param newBidList The list where the swapping takes  place.
     */
    private void swapBids(int i, int j, ArrayList<Bid> newBidList) {
        Bid temp = newBidList.get(i);
        newBidList.set(i, newBidList.get(j));
        newBidList.set(j, temp);
    }


}

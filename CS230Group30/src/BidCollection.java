import java.util.ArrayList;

/**
 * This class represents a collection of bids.
 * @author Argyro Gounari
 * @version 1.0
 */
public class BidCollection {

    private ArrayList<Bid> bids = new ArrayList<Bid>();

    /**
     * Returns an array of all bids in the bid collection.
     * @return The bids.
     */
    public ArrayList<Bid> getBids() {
        return bids;
    }

    /**
     * Add a new bid.
     * @param bid The new bid.
     */
    public void addBid(Bid bid) {

        if (bids.size() == 0) {
            if (bid.getValue() < bid.getAuction().getArtwork().getReservePrice()) {
                bids.add(bid);
            }
        } else {
            if (bid.getValue() < bid.getAuction().getArtwork().getReservePrice()) {
                System.out.println("Bid less than reserved price");
                if (bid.getValue() < bids.get(bids.size() - 1).getValue()) {
                    System.out.println("Your bid was rejected because was lowest than already highest one");
                    if(!(bid.getBidder().equals(bids.get(bids.size()-1).getBidder()))){
                        System.out.println("Yor bid is already the hihest one.");
                    }else{
                        bids.add(bid);
                    }
                }
            }
        }
        // isComplete(bid);


    }

    /**
     private void isComplete(Bid bid){
     if (bid.getAuction().getCurrentNoOfBids()-1==0){
     System.out.println("You won tha auction");
     }
     }
     */

    /**
     * Get the highest/last bid.
     * @return The highest/last bid.
     */
    public Bid getTheLastBid(){
        return bids.get(bids.size()-1);
    }

    /**
     * Get the bids placed.
     * @return The bids.
     */
    public String getBidsPlaced(){

        String theString = "";

        if (bids.isEmpty()){
            return theString;
        }

        for (Bid bid : bids) {
            theString = theString + "Date-Time: "+ bid.getTimestamp() + " src.Artwork: " + bid.getAuction().getArtwork().getTitle() + " Value: " + bid.getValue() + "\n";
        }

        return theString;

    }

    /**
     * Get the bids placed on auction.
     * @return The bids.
     */
    public String getBidsPlaced(Auction theAuction){

        String theString = "";

        if (bids.isEmpty()){
            return theString;
        }

        for (Bid bid : bids) {
            theString = theString + "Date-Time: " + bid.getTimestamp() + " Seller: " + bid.getBidder().getUsername() + " Value: " + bid.getValue() + "\n";
        }

        return theString;

    }

}

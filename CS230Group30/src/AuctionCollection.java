package src;

import java.util.*;
import java.io.Serializable;

/**
 * This class represents a collection of auctions.
 * @author Rosa Salih
 * @version 1.0
 */
public class AuctionCollection implements Serializable {
    private static ArrayList<Auction> auctionList = new ArrayList<Auction>();

    /**
     * Adds an auction to an array list of auctions.
     * @param newAuction
     */
    public static void addAuc(Auction newAuction){
        auctionList.add(newAuction);
    }

    public static Auction getAuction(Auction auction) {
        Auction toReturn = null;
        for (Auction a : auctionList) {
            if (a.equals(auction)) {
                toReturn = a;
            }
        }
        return toReturn;
    }

    /**
     * Returns an array list of all the auctions in the auction collection.
     * @return auctionList
     */
    public static ArrayList<Auction> getAuctionList() {
        return auctionList;
    }

    /**
     * Returns auctions of the selected user that have successfully been auctioned.
     * @param user
     * @return toReturn
     */
    public static ArrayList<String> completedAuctions(User user){
        String output;
        ArrayList<String> toReturn = new ArrayList<String>();
        for (Auction a : auctionList) {
            if(a.getSeller().equals(user)&&a.isCompleted()==true){
                output = a.getArtwork().title+ a.getBids().getTheLastBid().getAuction().getSeller().getUsername()+a.getBids().getTheLastBid().getValue();
                toReturn.add(output);
            }
            }
            return toReturn;
    }
}
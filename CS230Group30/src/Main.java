package src;

public class Main  {

    public static void main(String[] args) {


        Sculpture s1 = new Sculpture("Title","Something ","path",2.3,2.8,4.4," ","",2022,3233,2);
        User u1 = new User ("user1","name1","lastname1",7657346,"","");
        User u2 = new User ("user2","name2","lastname2",76527346,"","");
        Auction A1 = new Auction(u1,s1);
        AuctionCollection.addAuc(A1);
        Bid b1 = new Bid(A1,30,u1);
        Bid b2 = new Bid(A1,45,u2);
        Bid b3 = new Bid(A1,47,u1);


        A1.getBids().addBid(b1);
        A1.getBids().addBid(b2);
        System.out.println(A1.isCompleted());

        System.out.println(A1.getBids().getTheLastBid());



    }

}
package src;

import java.sql.Timestamp;

public class Artwork {
    String title;
    String description;
    String photo;
    double width;
    double height;
    String creatorName;
    int creationYear;
    int reservePrice;
    int maxNoOfBids;
    Timestamp dateTime;

    public Artwork(String newTitle, String newDesc, String newPhoto, double newWidth, double newHeight, String newCreator, int newYear, int newReserve, int newMax) {
        this.title = newTitle;
        this.description = newDesc;
        this.photo = newPhoto;
        this.width = newWidth;
        this.height = newHeight;
        this.creatorName = newCreator;
        this.creationYear = newYear;
        this.reservePrice = newReserve;
        this.maxNoOfBids = newMax;
        this.dateTime = new Timestamp(System.currentTimeMillis());
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPhoto() {
        return this.photo;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public int getCreationYear() {
        return this.creationYear;
    }

    public int getReservePrice() {
        return this.reservePrice;
    }

    public int getMaxNoOfBids() {
        return this.maxNoOfBids;
    }

    public Timestamp getDateTime() {
        return this.dateTime;
    }
}

package src;

import java.sql.Timestamp;

public class Painting extends Artwork{

    Painting(String newTitle, String newDesc, String newPhoto, double newWidth, double newHeight, String newCreator, int newYear, int newReserve, int newMax) {
        super(newTitle, newDesc,newPhoto,newWidth,newHeight,newCreator,newYear,newReserve,newMax);
        this.dateTime = new Timestamp(System.currentTimeMillis());
    }
    public double[] getDimensions() {
        double[] dimensions = new double[1];
        dimensions[0] = this.getWidth();
        dimensions[1] = this.getHeight();
        return dimensions;
    }
}
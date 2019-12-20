package src;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Sculpture extends Artwork{
    double depth;
    String material;
    ArrayList additionalPhotos; //Changed from String[] to ArrayList

    Sculpture(String newTitle, String newDesc, String newPhoto, double newWidth, double newHeight, double newDepth, String newMat, String newCreator, int newYear, int newReserve, int newMax) {
        super(newTitle, newDesc,newPhoto,newWidth,newHeight,newCreator,newYear,newReserve,newMax);
        this.depth = newDepth;
        this.material = newMat;
        this.additionalPhotos = new ArrayList();
        this.dateTime = new Timestamp(System.currentTimeMillis());
    }
    public double[] getDimensions() {
        double[] dimensions = new double[2];
        dimensions[0] = this.getWidth();
        dimensions[1] = this.getHeight();
        dimensions[2] = this.getDepth();
        return dimensions;
    }

    public double getDepth() {
        return this.depth;
    }

    public String getMaterial() {
        return this.material;
    }
    public void addAdditionalPhoto(String newAddPhoto) {
        this.additionalPhotos.add(newAddPhoto);
    }


}
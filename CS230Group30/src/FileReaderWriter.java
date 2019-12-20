package src;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */

import java.io.*;
        
public class FileReaderWriter {
    public static void Save(UserCollection masterUserList, AuctionCollection masterAuctionList) {
        try {
            File save = new File("save.txt");
            FileOutputStream fileStream = new FileOutputStream(save);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            Save newSave = new Save(masterUserList, masterAuctionList);
            
            objectStream.writeObject(newSave);
        } catch (Exception e){}
    }
    
    private static Save getSave(){
        try {
            FileInputStream fileStream = new FileInputStream("save.txt");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            Save save = (Save) objectStream.readObject();
            return save;
        } catch (Exception e) {}
        return null;
    }
    
    public static UserCollection getMasterUserList(){
        Save save = getSave();
        UserCollection masterUserList = save.returnUsers();
        return masterUserList;
    }
    
    public static AuctionCollection getMasterAuctionList(){
        Save save = getSave();
        AuctionCollection masterAuctionList = save.returnAuctions();
        return masterAuctionList;
    }
}


class Save implements Serializable{
    private UserCollection masterUserList;
    private AuctionCollection masterAuctionList;
    
    public Save(UserCollection masterUserList, AuctionCollection masterAuctionList) {
        this.masterUserList = masterUserList;
        this.masterAuctionList = masterAuctionList;
    }
    
    public UserCollection returnUsers() {
        return masterUserList;
    }
    
    public AuctionCollection returnAuctions() {
        return masterAuctionList;
    }
}
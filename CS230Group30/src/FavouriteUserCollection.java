package src;

public class FavouriteUserCollection extends UserCollection{
    
    public void removeUser(User oldUser) {
        int i = 0;
        User[] newUserList = new User[(userList.length-1)];
        for(User user : userList) {
            if(user!=oldUser) {
                newUserList[i] = user;
            }
            i++;
        }
        userList = newUserList;
    }
    
    public void removeUser(int oldUserLoc) {
        int i = 0;
        User[] newUserList = new User[(userList.length-1)];
        for(User user : userList) {
            if(i!=oldUserLoc) {
                newUserList[i] = user;
            }
            i++;
        }
        userList = newUserList;
    }
    
    public void clearUsers() {
        userList = new User[0];
    }
}

package src;

public class UserCollection {
    protected User[] userList = new User[0];
    
    public void addUser(User newUser) {
        int i = 0;
        User[] newUserList = new User[(userList.length+1)];
        for(User user : userList) {
            newUserList[i] = user;
            i++;
        }
        newUserList[i] = newUser;
        userList = newUserList;
    }
    
    public User returnUser(int userLoc) {
        return userList[userLoc];
    }
    
    public UserCollection returnUsers(int startLoc, int endLoc) {
        UserCollection newUserCollection = new UserCollection();
        for(int i = startLoc; i<endLoc; i++){
            newUserCollection.addUser(userList[i]);
        }
        return newUserCollection;
    }
    
    public int returnlength() {
        return userList.length;
    }
    
    public int returnPos(User user) {
        boolean found = false;
        int i = 0;
        for(User checkUser : userList) {
            if(user == checkUser) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean searchName(String username) {
        boolean found = false;
        for (User checkUser : userList) {
            if (username == checkUser.getUsername()) {
                found = true;
            }
        }
        return found;
    }
}

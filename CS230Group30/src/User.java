package src;

/**
 src.User Class
 */
public class User {
    private String username;
    private String firstName;
    private String lastName;
    private int phoneNo;
    private String address;
    private String profileImage;



    public User(String username, String firstName, String lastName, int phoneNo, String address, String profleImage){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.profileImage = profleImage;
    }

    public String getAddress() { return address; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public int getPhoneNo() { return phoneNo; }

    public String getProfileImage() { return profileImage; }

    public String getUsername() { return username; }

    //public src.UserCollection getFavourite() { return favourite; }

    public void setAddress(String address) { this.address = address; }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }


    public void setProfileImage(String profileImage) { this.profileImage = profileImage; }

    public void setUsername(String username) { this.username = username; }



    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }


}
ackage com.geeksforgeeks.jdbl9.restapi;

public class User {
    private int userID;
    private int age;
    private String name;
    private String place;

    public User(int userID, int age, String name, String place) {
        this.userID = userID;
        this.age = age;
        this.name = name;
        this.place = place;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

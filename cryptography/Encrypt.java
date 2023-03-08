import java.util.*;


public class Encrypt {
    private ArrayList<Integer> bucket; // this will hold the list of integers
    private String userKey;
    private String encryptedKey;

    // create constructors
    public Encrypt() {

public class Encrypt{
    private ArrayList<Integer> bucket; //this will hold the list of integers
    private String userKey;
    private String encryptedKey;

    //create constructors
    public Encrypt(){

        this("");

    }


    public Encrypt(String userKey) {
        this.userKey = userKey;
    }

    // getters and setters

    // userKey getter
    public String getUserKey() {
        return this.userKey;
    }

    // user key setter
    private void setUserKey(String userKey) {
        // set the user key in here
        this.userKey = userKey;
    }

    // create encryption method
    public void encrypt(String userKey) {
        // this is where the algorithm is applied
        if (isValid(userKey)) {
            // create the bucket list
        }

        // validate the user key
    }

    // validate user key
    private boolean isValid(String userKey) {
        if (userKey.matches("[0-9]+") && userKey.length() == 4) {
            // create bucket list
            this.setUserKey(userKey);
            return true;
        } else
            return false;
    }

    // create bucket list
    private void createList() {
        int number = 0;

        for (int index = 0; index < this.userKey.length(); index++) {
            number = Character.getNumericValue(this.userKey.charAt(index));
            this.bucket.add(number);
            // I added a comment
            }
    public Encrypt(String userKey){
        this.userKey = userKey;
    }

    //getters and setters

    //userKey getter
    public String getUserKey(){
        return this.userKey;
    }

    //user key setter
    private void setUserKey(String userKey){
        //set the user key in here
        this.userKey = userKey;
    }

    //create encryption method
    public void encrypt(String userKey){
        //this is where the algorithm is applied
        if(isValid(userKey)){
            //create the bucket list
        }

        //validate the user key
    }

    //validate user key
    private boolean isValid(String userKey){
        if(userKey.matches("[0-9]+") && userKey.length()==4){
            //create bucket list
            this.setUserKey(userKey);
            return true;
        }
        else
            return false;
    }

    //create bucket list
    private void createList(){
        int number =0;

        for(int index = 0; index<this.userKey.length();index++){
            number = Character.getNumericValue(this.userKey.charAt(index));
            this.bucket.add(number);
        }

    }


}
public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(){
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name=name;
        this.address=address;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo buddyInfo= new BuddyInfo();
        buddyInfo.setName("Homer");
        buddyInfo.setAddress("Springfield");
        buddyInfo.setPhoneNumber(123);
        System.out.println("Hello "+ buddyInfo.getName()+ "!");
        System.out.println("Your number is " + buddyInfo.getPhoneNumber());
        System.out.println("Your address is " + buddyInfo.getAddress());

    }
}


// I am making changes in the github codde
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddy;

    public AddressBook(){
        this.buddy = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo abuddy){
        if(buddy != null){
            this.buddy.add(abuddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddy.size()) {
            return buddy.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book ");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }

}

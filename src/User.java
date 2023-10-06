import java.util.ArrayList;

public class User {
    public static int total = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddres;
    private Address deliveryAddress;
    private Role role;
    private ArrayList <Card> cards;

    private Manager manager;

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddres() {
        return billingAddres;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Role getRole() {
        return role;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Manager getManager() {
        return manager;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setBillingAddres(Address billingAddres) {
        this.billingAddres = billingAddres;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public User (String firstName, String lastName, String email, RoleType roleType) {
        total++;
        this.id = total;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.email = email;
        this.role = new Role(roleType);
        this.cards = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddres=" + billingAddres +
                ", deliveryAddress=" + deliveryAddress +
                ", role=" + role +
                ", cards=" + cards +
                ", manager=" + manager +
                '}';
    }

    public String printUserInfo() {
        return "User: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddres=" + billingAddres +
                ", deliveryAddress=" + deliveryAddress +
                ", role=" + role;
    }
}



public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String firstName, String lastName, String email, RoleType roleType, String position) {
        super(firstName, lastName, email, roleType);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String printUserInfo(){
        String userInfo = super.printUserInfo();
        userInfo = userInfo  + '\'' +
                ", position =" + position  + '\'' +
                ", responsibilityDistrict=" + responsibilityDistrict  + '\'' +
                ", workPhoneNumber =" + workPhoneNumber;
        return userInfo;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" +  + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", billingAddres=" + getBillingAddres() +
                ", deliveryAddress=" + getDeliveryAddress() +
                ", role=" + getRole() +
                ", cards=" + getCards() +
                ", manager=" + getManager() + '\'' +
                ", position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }
}

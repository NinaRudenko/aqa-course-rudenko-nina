public class Address {
   private int id;
   private String country;
   private String city;
   private String street;
   private String building;
   private int room;
   private String zipCode;

   public Address(String country, String city, String street, String building, int room, String zipCode) {
      this.country = country;
      this.city = city;
      this.street = street;
      this.building = building;
      this.room = room;
      this.zipCode = zipCode;
   }
}

public class Card {
   public static int total = 0;
   private int id;
   private String number;
   private String expireDate;
   private String cvv;
   private String cardType;

   public Card(String number, String expireDate, String cvv, String cardType) {
      this.number = number;
      this.expireDate = expireDate;
      this.cvv = cvv;
      this.cardType = cardType;
   }
}

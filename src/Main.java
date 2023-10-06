public class Main {

        public static void main(String[] args){
            User user = new User("qaz","wsx","test@test.com",RoleType.MainCustomer);
            String userinfo = user.printUserInfo();
            System.out.println("TEST " + userinfo);

        }

}

package lombokexperiments;

import lombokexperiments.dto.User;
import lombokexperiments.dto.UserLombok;
import lombokexperiments.dto.UserWith;

public class MainLombok {
    public static void main(String[] args) {
        User user = new User("aaa", "sfrew");
        System.out.println("user: " + user.getName());

        UserWith userWith = new UserWith();
        userWith.withName("bbb");
        userWith.withPassword("rtyu");
        System.out.println(userWith.getPassword() + " user with");

        UserWith userWith1 = new UserWith()
                .withName("ghyt")
                .withPassword("topypwrt"); //chain

        System.out.println("userWith1 " + userWith1.getName());

        UserWith userWith2 = new UserWith().withPassword("gte");

        //-------------Lombok-----------------

        UserLombok userLombok = UserLombok.builder().name("ajfnv").password("rewyy").build();
        System.out.println("user lombok " + userLombok.getName());
    }
}

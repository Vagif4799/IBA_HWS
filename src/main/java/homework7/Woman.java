package homework7;

public class Woman extends Human {

    @Override
    public void welcomeTheFavorite() {
        System.out.printf("You are so cut that I wanna live only with you %s \n", getFamily().getPet().getNickname());
    }


    public void goForTravel (String country) {
        System.out.printf("I have been to London and ever will forget it, now wanna see %s \n", country);
    }

}

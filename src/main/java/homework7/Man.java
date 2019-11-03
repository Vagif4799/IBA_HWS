package homework7;

public class Man extends Human {

    @Override
    public void welcomeTheFavorite() {
        System.out.printf("I love you, but you are annoying %s when you play in front of TV\n", getFamily().getPet().getNickname());
    }

    public void tellAboutCar (String car) {
        System.out.printf("I drive %s, but BMW M5 is my dream one. \n", car);
    }

}

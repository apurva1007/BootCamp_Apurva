/**
 * Created by ruplaga on 7/26/2017.
 */
public class MovieService {

    public static void buy(User user, double price) throws PriceInvalidException, PriceOutOfRangeException, AgeInvalidException, AgeOutOfRangeException, RatingOutOfRangeException {
        if (price <= 0) {
            throw new PriceInvalidException("Price cannot be less than or equal to zero");
        }

        if (price < 2000) {
            throw new PriceOutOfRangeException("Price is less than 2000");
        }

        if (user.getAge() <= 0) {
            throw new AgeInvalidException("Age cannot be less than or equal to zero");
        }

        if(user.getAge() < 10) {
            throw new AgeOutOfRangeException("Your age should be atleast 10");
        }

        if(user.getAge() < 20) {
            throw new AgeOutOfRangeException("Your age should be atleast 20");
        }

        System.out.println("All good. Go and watch movie");

    }

    public static void watch(User user) throws RatingOutOfRangeException {
        if (user.getRating() < 3) {
            throw new RatingOutOfRangeException("Your rating is less than 3");
        }

        System.out.println("Movie watched!!");
    }
}

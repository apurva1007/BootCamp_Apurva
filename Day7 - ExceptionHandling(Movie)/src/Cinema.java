/**
 * Created by ruplaga on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(11, "Raj", 0, 7);

        try {

            MovieService.buy(user, 3000.89);
            MovieService.watch(user);

        } catch(PriceInvalidException e) {

            System.out.println(e.getMessage());

        } catch (AgeOutOfRangeException e) {

            System.out.println(e.getMessage());

        } catch (PriceOutOfRangeException e) {

            System.out.println(e.getMessage());

        } catch (RatingOutOfRangeException e) {

            System.out.println(e.getMessage());

        } catch (AgeInvalidException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}

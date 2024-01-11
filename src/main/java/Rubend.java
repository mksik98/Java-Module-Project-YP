public class Rubend {
    private static final String RUB = "рубль";
    private static final String RUBL = "рубля";
    private static final String RUBLS = "рублей";

    public static String formatter(double priceForOne) {
        int format = (int) Math.floor(priceForOne);
        int endNumber10 = format % 10;
        int endNumber100 = format % 100;
        String ending ;
        while (true) {


            if (endNumber10 == 1 && endNumber100 != 11) {
                ending = RUB;
                break;

            } else if ((endNumber10 >= 2 && endNumber10 <= 4) && (endNumber100 < 10 || endNumber100 >= 20))  {
                ending = RUBL;
                break;
            }
            else {
                ending = RUBLS;
                break;
            }

        }
        return ending;
    }
}
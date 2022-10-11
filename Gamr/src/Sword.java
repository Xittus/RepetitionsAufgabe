    import java.util.Random;

    public class Sword  implements Wapon{

        Random random = new Random();

        @Override
        public int use(int ap) {
            return ap * random.nextInt(10) * 2;
        }

    }


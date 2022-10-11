
    import java.util.Random;

    public class Pistol implements Wapon{

        Random random = new Random();

        @Override
        public int use(int ap) {
            return random.nextInt(10) * ap * 5;
        }


    }


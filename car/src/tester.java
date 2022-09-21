public class tester {
    public static void main(String[] args) {
        UsedCar uc = new UsedCar("Mercedes",102103012d,1000000);
        CrashedCar cc = new CrashedCar("BMW", 01000000d, 100);
        System.out.println(uc.getPrice());
        System.out.println(cc.getPrice());

    }

}

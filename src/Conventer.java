public class Conventer {

    public static void main(String[] args) {
    LenghtUnit lenghtUnit = new LenghtUnit();
    lenghtUnit.showMToCn(50.9);
    lenghtUnit.showMToMm(20.5);
    lenghtUnit.showCnToM(15.3);
    lenghtUnit.showMmToM(1000.6);

    TimeUnit timeUnit = new TimeUnit();
    timeUnit.showHToMin(2);
    timeUnit.showMinToSec(60);
    timeUnit.showSecToMls(2);
    }

}

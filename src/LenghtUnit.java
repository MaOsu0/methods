public class LenghtUnit {
    double metersToCentimeters(double a){
        double mToCn = a * 100;
        return mToCn;
    }

    void showMToCn (double x){
        double result = metersToCentimeters(x);
        System.out.println(x + " metrów to " + result + "cm");
    }

    double metersToMilimeters(double a){
        double mToMm = a * 1000;
        return mToMm;
    }

    void showMToMm(double x){
        double resultMToMm = metersToMilimeters(x);
        System.out.println(x + " m to " + resultMToMm + "mm");
    }

    double centimeterToMeter(double a){
        double cmToM = a / 100;
        return cmToM;
    }
    void showCnToM(double x){
        double resultCnToM = centimeterToMeter(x);
     System.out.println(x + " centymetrów to " + resultCnToM + "m");
    }

    double milimetersToMeters(double a){
        double mmToM = a / 1000;
        return mmToM;
    }
    void showMmToM(double x){
        double resultsMmToM = milimetersToMeters(x);
        System.out.println(x + " milimetrów to " + resultsMmToM + "m");
    }

}

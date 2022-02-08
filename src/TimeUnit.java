public class TimeUnit {
//    int hourToMinutes(int a){
//        int hToMin = a * 60;
//        return hToMin;
//    }
//    void showhtomin(int x){
//        int secToMin = hourToMinutes(x);
//        System.out.println(x + "godzin to " + secToMin + "sec");
//    }

    void showHToMin(int x){
        int resultHToMin = x * 60;
        System.out.println(x + " godzin to " + resultHToMin + "min");
    }

//    int minutesToSeconds(int a){
//        int minToSec = a * 60;
//        return minToSec;
//    }
//    void showMinToSec(int x){
//        int minToSec = minutesToSeconds(x);
//        System.out.println(x + " minut to " + "sekund");
//    }

    void showMinToSec(int x){
        int minToSec = x * 60;
        System.out.println(x + "minut to " + minToSec + "sec");
    }

//    int secondsToMilisecods(int a){
//        int secToMls = a * 1000;
//        return secToMls;
//    }
//
//    void showSecToMls(int x){
//        int secToMls = secondsToMilisecods(x);
//        System.out.println(x + " sekund to " + secToMls + "mls");
//    }
    void showSecToMls(int x){
        int secToMls = x * 1000;
        System.out.println(x + " sekund to " + secToMls + "mls");
    }


}

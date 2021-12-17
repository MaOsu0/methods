public class Calc {

    // typ_zwracany (jeśli void to w klamrach pustka) nazwaMetody(opcjonalne_parametry) {}

    int addTwoNumbers(int a, int b){
        int sum = a + b; // można usunąć tą linię i zapisać od razu:      retun a+ b;
        return sum;
    }

    void addAndPrint (int x, int y){
        int sum = addTwoNumbers(x, y);
        System.out.println(sum);
    }

    int odejmowanieDwochLiczb(int a, int b){
        int odejmowanie = a -b;
        return odejmowanie;
    }
}

package lesson6_OverLoadingMethods.homeTask;

public class HomeTask6 {

    void sum(int a1, int b1, int c1, int g1, int e1) {
        int resultZero = a1;
        System.out.println(a1);
        int resultOne = a1 + b1;
        System.out.println(resultOne);
        int result2 = b1 + c1;
        System.out.println(result2);
        int result3 = c1 + g1;
        System.out.println(result3);
        int result4 = c1 + e1;
        System.out.println(result4);
    }

}


class HomeTaskTest6 {
    public static void main(String[] args) {
        HomeTask6 h = new HomeTask6();
        h.sum(0,1,1,2,3);


    }
}

package lesson6_OverLoadingMethods.homeTask;

public class  HomeTask6 {

    void sum(int a1, int b1, int c1, int g1, int e1) {
        int resultZero = a1;
        System.out.println(resultZero);
        int resultOne = a1 + b1;
        System.out.println(resultOne);
        int result2 = b1 + c1;
        System.out.println(result2);
        int result3 = c1 + g1;
        System.out.println(result3);
        int result4 = c1 + e1;
        System.out.println(result4);
    }

    int sum() {
        int result = 0;
        System.out.println("Sum all numbers " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Sum all numbers " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Sum all numbers " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Sum all numbers " + result3);
        return result3;
    }

}


class HomeTaskTest6 {
    public static void main(String[] args) {
        HomeTask6 h = new HomeTask6();
        h.sum(0,1,1,2,3);
        HomeTask6 h1 = new HomeTask6();
         h1.sum();
         h1.sum(1);
         h1.sum(1,1);
         h1.sum(1,1,1);
         h1.sum(1,2,1);


    }
}

package regExExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        /**
         * Метод который заменяет все 4-значные числа на 2021
         */
    String s = "sfsfsfsfs 2223 adasdad 1222 2333211656 2222";

    String res = s.replaceAll("\\d{4}", "2021");
        System.out.println("Результат " + res);
        System.out.println("-----------------------------");
        /**
         * метод который сравнивает строку "k" и условие в скобках compile
         */
        String k = "1234";
        Pattern p = Pattern.compile("\\d\\d\\d\\d");//укзали 4 цифры
        Matcher m = p.matcher(k);
        System.out.println("Результат " + m.matches());
        /**
         * метод который сравнивает электронную почту
         */
        String email = "alex@mail.ru";
        Pattern p1 = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher m1 = p1.matcher(email);
        System.out.println("Результат " + m1.matches());
    }
}

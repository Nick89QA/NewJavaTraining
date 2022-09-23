package lesson_13_Switch;

public class Employee {
    public static void main(String[] args) {
        switch ("Saturday"){
            case "Monday":
                System.out.println("Rabota до 16:00");
                break;
            case "Tuesday":
                System.out.println("Rabota до 17:00");
                break;
            case "Wednesday":
                System.out.println("Rabota до 18:00");
                break;
            case "Thursday":
                System.out.println("Rabota до 19:00");
                break;
            case "Friday":
                System.out.println("Rabota до 20:00");
                break;
            case "Saturday":
                System.out.println("Rabota до 21:00");
                break;
            case "Sunday":
                System.out.println("Rabota до 22:00");
            default:
                System.out.println("Не работаем");



        }
    }

}

public class Main {
    public static void main(String[] args) {

        int currentBalans = 100;
        int depositAmount = 5000;
        int bonus = (depositAmount > 1000) ? depositAmount / 100 : 0;
        currentBalans = currentBalans + depositAmount + bonus;

        System.out.println("Текущий баланс - " + currentBalans + " рублей");

        System.out.println("Количество бонусов - " + bonus + " рублей");

    }
}

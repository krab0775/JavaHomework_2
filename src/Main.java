// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int ticket = 74764; // Цена билета
        int mile = 20; // Кол-во рублей за одну милю

        int bonus;
        if (ticket >= mile) {
            bonus = (ticket / mile);
            System.out.println(bonus +" бонусов начислено");
        } else {
            System.out.println("Бонусов не начислено");
        }

    }
}
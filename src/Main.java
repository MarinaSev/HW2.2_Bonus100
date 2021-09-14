public class Main {
    public static void main(String[] args) {
        int basicAccount = 100;
        int addSum = 1050;
        int rubForBonus = 100;
        int bonus;
        int total;
        if (addSum > 1000) {
            bonus = addSum / rubForBonus;
            total = basicAccount + addSum + bonus;
            System.out.println("Сумма на вашем счёте: " + total + " руб.");
            System.out.println("Бонусных рублей начислено: " + bonus);
        } else {
            total = basicAccount + addSum;
            System.out.println("Сумма на вашем счёте: " + total + " руб.");
            System.out.println("Бонусы не начисляются");
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
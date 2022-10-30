public class Main {
    //public static void print(String text) {System.out.println(text);}
    public static void main(String[] args) {
        changeYear(2022); //Задача 1
        changeYear(1980); //Задача 1
        System.out.println(isVariousOS(0, 2014)); // Задача 2
        //deliveryDays(115);
    }

    //Задача 1
    public static void changeYear(int year) {
        System.out.println("Задача № 1");

        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static String isVariousOS(int clientOS, int clientDiviceYear) {
        System.out.println("Задача № 2");

        if ((clientOS == 0) && (clientDiviceYear < 2015)) {
            return "Установите облегченную версию мобильного приложения для iOS по ссылке";
        } else if ((clientOS == 1) && (clientDiviceYear < 2015)) {
            return "Установите облегченную версию мобильного приложения для Android по ссылке";
        } else {
            switch (clientOS) {
                case 0:
                    return "Установите версию мобильного приложения для iOS по ссылке";
                case 1:
                    return "Установите версию мобильного приложения для Android по ссылке";
            }
        }
        return null;
    }


}



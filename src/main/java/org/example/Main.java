package org.example;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        System.out.println("Выберите порядковый номер студента: ");
        String text = """
                1. Мицик Матвей Антонович
                2. Воронова Юлия Павловна
                3. Кузьмин Вячеслав Александрович
                4. Пашков Дмитрий Сергеевич
                5. Орлова Мария Васильевна
                6. Сусликов Иван Михайлович
                """;
        System.out.println(text);
        Scanner console = new Scanner(System.in);
        String ch1 = "1";
        int x = 0;
        String[] phones = new String[0];
        System.out.println("Для завершения вывода информации введите - stop");
        while (true) {
            try {
                ch1 = console.nextLine();
                if (ch1.equals("stop")) {
                    System.out.println("Завершение работы...");
                    break;
                }
                x = Integer.parseInt(ch1);
                System.out.println(getPhonePhones(phones, x - 1));

            } catch (Exception e) {
                System.out.println("Неверный формат данных!" + e.getMessage());
            }
        }
    }

    static String getPhoneNumber(String[] phones, int i) {
        return (phones[i]);
    }
    static String getPhonePhones(String[] phones, int i) {
        if (phones == null) {
            phones = new String[6];
            phones[0] = "+7910-875-37-24";
            phones[1] = "+7910-357-29-54";
            phones[2] = "+7910-987-65-43";
            phones[3] = "+7915-967-65-41";
            phones[4] = "+7910-900-65-90";
            phones[5] = "+7910-777-65-65";
        }
        return (phones[i]);
    }
}
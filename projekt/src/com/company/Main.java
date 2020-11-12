package com.company;

import java.util.Scanner;

public class Main {

    public int strenght = 1;
    public int HP = 100;
    public String mind = "Состояние стабильно";
    public int patrons = 0;
    public String golod = "Вы сыты";
    public String invent = "На данный момент в рюкзаке пусто";


    public static void main(String[] args) throws InterruptedException {


        Thread.sleep(5000);
        System.out.println("...[Загрузка]");
        Thread.sleep(3000);
        System.out.println("Приветствую тебя, дорогой игрок, вначале выбери собственный пол! ");
        Thread.sleep(1000);
        System.out.println("Подсказка, для того что бы произвести выбор, просто введи цифру которую видишь на экране ");
        System.out.println("К примеру: ");
        Thread.sleep(1000);
        System.out.println("1. Уйти 2. Напасть ");
        Thread.sleep(1000);
        System.out.println("Требуется написать просто ");
        Thread.sleep(1000);
        System.out.println("2 ");
        Thread.sleep(1000);
        start();
        System.out.println("Желаете выбрать имя сейчас? Это всегда можно будет сделать, написав \"настройки\" ");
        System.out.println("Базовое имя будет выбрано взависимости от пола");
        System.out.println("Или Алексей, или Екатерина.");
        System.out.println("1. Желаю. 2. Нет");
        Scanner c = new Scanner(System.in);
        int ded = c.nextInt();
        if (ded == 1){
            Scanner name = new Scanner(System.in);
            String na = name.nextLine();
            System.out.println("Очень красивое имя, "+na);
            star();
        }
        if (ded == 2)
        {
            star();
        }



    }
    public static void star(){
        System.out.println("..[Запуск] ");
        System.out.println("Хабаровск, 2046 год ");
        System.out.println("Местоположение: Ваш бункер. ");
        String geolg = "Хабаровск, ваш бункер";
        System.out.println("(В дальнейшем информацию можно узнать прописав \"статус\" ) ");
        System.out.println("Разделы со временем будут обновляться) ");
        System.out.println("Вы закинули руки за голову, смотря на деревянный потолок.");
        System.out.println("Но самом деле это была крепкая полка");
        System.out.println("Просто на данный момент это- единственное что вам видно.");
        System.out.println("Вентилятор с тихим шумом работал, фильтруя воздух и это единственное что нарушало тишину. ");
        System.out.println("Хотя... ");
        System.out.println("Кажется вам что то послышалось. ");
        System.out.println("Это странно, в конце концов в бункере глубина добротная, 5 метров минимум. ");
        System.out.println("Стоит ли пойти проверить? ");
        System.out.println("");
        System.out.println("Желаете ознакомиться с прологом? ");
        System.out.println("(Настоятельно рекомендуем для большего ознакомления с сюжетом) ");
        System.out.println("1. Да. 2. Нет");

    }
    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Попробуй!");
        System.out.println("Введи число!");
        int num = in.nextInt();
        if (num == 2) {
            System.out.println("Молодец, круто! Дальше!");
            System.out.println("Итак, вернемся к вашему гендеру");
            System.out.println("Попробуй свои новые знания на практике");
            System.out.println("Вы 1. Мужчина. 2. Женщина");
            System.out.println("(На самом деле пол меняет очень мало чего, действие идет от первого лица.)");
            System.out.println("Но взависимости от пола меняется хар-ка");
            Scanner heh = new Scanner(System.in);
            System.out.println("Попробуй!");
            System.out.println("Введите пол:");
            int lol = heh.nextInt();
            if(lol == 1){
                String genderr = "Male";
                System.out.println("Прибавлено два очка силы!");
                  int strenght = 3;
                  int lov = 1;
            }

            if(lol == 2){
                String gender = "Woman";
                int lov = 3;
                System.out.println("Прибавлено два очка ловкости!");
                int strenght = 1;

            }
            System.out.println("Поздравляю, вы успешно выбрали пол!");





        }

        else {
            System.out.println("Ох, нет- нет!");
            System.out.println("Нужно написать 2 просто цифрой, не добавляя никаких символов! Просто цифра!");
            System.out.println("Попробуй еще раз!");
            start();}
        in.close();




    }
}

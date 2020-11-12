package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void stat(){
     int strenght = 3;
     int HP = 100;
     String mind = "Состояние стабильно";
     int patrons = 0;
     String golod = "Вы сыты";
     String invent = "На данный момент в рюкзаке пусто";
    String mest = "Ваше местоположение: Хабаровск, подвал";
        System.out.println("Ваша сила: "+strenght);
        System.out.println("Вы абсолютно здоровы");
        System.out.println(mind);
        System.out.println("У вас нет продажных патронов");
        System.out.println(golod);
        System.out.println(invent);
        System.out.println(mest);
    }

     public static void nastr(){
        System.out.println("Смена имени");
        System.out.println("Введите имя:");
        Scanner nam = new Scanner(System.in);
        String mn = nam.nextLine();
        System.out.println("Вы успешно сменили имя, "+mn);
     }

     public static void dostij(){
        System.out.println("Достижения: 'Пролог' - согласитесь прочитать пролог !");
     }

    public static void nodostij(){
        System.out.println("Достижения: 'Ленивец' - не согласитесь прочитать пролог и закончите игру!");
    }


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

        Scanner blya = new Scanner(System.in);
        String k = blya.nextLine();
        if(k.equals("1")) {
            System.out.println("Шел 2046 год. Холодная война переросла в атомную и в конце концов многие люди погибли вначале при взрыве бомбы ");
            System.out.println("А остальные и от ядерной зимы, которая наступила вследствии\n" +
                    "Не сказать что многие выжили, но кто смог, те постарались приспособиться по максимуму ");
            System.out.println("Чудо, что вы не погибли. Кто знает, как сложилась бы ваша судьба, не вскопай ваш отец бункер еще в 85, стоило почуять беду\n" +
                    "Вышел он добротным, хоть и не очень большим. ");
            System.out.println("Спальник вы организовали на очень большой полке, на которой раньше ютились банки с соленьями ");
            System.out.println("Сейчас тут в основном вода и еда, которую удалось достать. С питанием был дефецит, для этого нужно было выбираться на поверхность ");
            System.out.println("Помимо ужасной жары и нехватки воздуха вас там еще и ожидали мутанты, да и другие люди ");
            System.out.println("Район пустынный, так что на случайных прохожих не надейтесь, это бандиты которые вытуривают людей с их жилища ");
            System.out.println("В отличии от вас, у них есть машины. Зато у вас есть хороший вентилятор и темпорегулятор. ");
            System.out.println("Вы могли бы сказать что до сих пор помните день сброса бомбы, но вас тогда еще не было на свете ");
            System.out.println("Чудо, что вы вообще появились и нормально выросли, настоящее чудо, но удивляться вскоре стало некому. ");
            System.out.println("Для вас такая жизнь - обыденность. Светлой памяти о былых деньках вам взять неоткуда. ");
            System.out.println("Конечно, можно было бы дойти до убежищ с гражданскими, но в последнее время туда принимают только военных.");
            System.out.println("Остается лишь жить в собственной комнатке без социума. ");
            System.out.println(" Поздравляем, Достижение 'Пролог'");
            System.out.println("Посмотреть достижение можно введя после 'достиж'");
            System.out.println("Вы остановились на мысли, что вам показался каким-то странным и посторонним шум. ");
            System.out.println("Стоит ли пойти проверить? ");
            System.out.println("1. Да, стоит. 2. Прислушаться. 3. Забить");
            System.out.println("Спасибо за тест игры!");
            System.out.println("Теперь вы можете проверить функции: статы, настройки, достиж ");
            cyc();


        }
        if (k.equals("2"))
        {
            System.out.println("Пф ну и досвидос бета версия окончена");
            System.out.println("Можете ввести достиж и посмотреть на свои заслуги лох");
            System.out.println("Так же проверить функции: статы, настройки");
            cyc();
        }

        if (k.equals("настройки")){ nastr();}
        if (k.equals("статы")) {stat();};



    }

    private static void cyc() {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        if (b.equals("настройки")) {
            nastr();
            cyc();
        }
        if (b.equals("статы")) {
            stat();
            cyc();
        }
        if (b.equals("достиж")) {
            dostij();
            cyc();
        }
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
            System.out.println("Желаете выбрать имя сейчас? Это всегда можно будет сделать, написав \"настройки\" ");
            System.out.println("Базовое имя будет выбрано взависимости от пола");
            System.out.println("Или Алексей, или Екатерина.");
            System.out.println("1. Желаю. 2. Нет");
            Scanner c = new Scanner(System.in);
            String ded = c.nextLine();
            if (ded.equals("1")){
                Scanner name = new Scanner(System.in);
                String na = name.nextLine();
                System.out.println("Очень красивое имя, "+na);
                star();
            }
            if (ded.equals("2"))
            {
                star();
            }





        }

        else {
            System.out.println("Ох, нет- нет!");
            System.out.println("Нужно написать 2 просто цифрой, не добавляя никаких символов! Просто цифра!");
            System.out.println("Попробуй еще раз!");
            start();}
        in.close();




    }
}

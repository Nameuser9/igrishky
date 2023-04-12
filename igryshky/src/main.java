import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Scanner;

public class main {
    public static toys[] shop2 = new toys[]{new toys(0, "Юла", 10, 10), new toys(1, "Плюшевый медведь", 10, 50),
            new toys(2, "Радиоуправляемая машинка", 10, 30), new toys(3, "Игрушечный пистолет", 10, 5)
            , new toys(4, "ничего", 0, 5)};
    public static void main(String[] args) throws IOException {
        ArrayList<toys> shop = new ArrayList<>();


        spin_the_drum_alt(shop2);

        System.out.println("сыграем ещё раз?(напиши да или нет)");
        Scanner in = new Scanner(System.in);
        String answer = in.next();
        if (answer == "да"){
            spin_the_drum_alt(shop2);
        }


    }

//    public static ArrayList add_toy(ArrayList<toys> shop){
//
//        int a = new Random().nextInt(0,5);
//        switch (a){
//            case (1):
//                if (shop.contains(new toys(1,"Юла",1, 10))){
//
//            }
//
//                shop.add(new toys(1,"Юла",1, 10));
//                break;
//            case (2):
//                shop.add(new toys(2, "Плюшевый медведь",1,50));
//                break;
//            case (3):
//                shop.add(new toys(3, "Радиоуправляемая машинка",1,30));
//                break;
//            case (4):
//                shop.add(new toys(4, "Игрушечный пистолет",1,5));
//                break;
//        }
//        return shop;
//    }
//    public static void shuffling_toys(ArrayList<toys> shop){
//        Collections.shuffle(shop);
//    }
//    public static void spin_the_drum(ArrayList<toys> shop){
//        String prize = shop.remove(1).toString();
//       FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter("gifts to the kids.txt", true);
//            fileWriter.append(prize);
//            fileWriter.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        shuffling_toys(shop);
//    }



    public static toys[] add_toy_alt(toys [] shop2){

        int a = new Random().nextInt(-1,4);
        switch (a){
            case (0):
                shop2[0].quantity +=10;

                break;
            case (1):
                shop2[1].quantity +=10;
                break;
            case (2):
                shop2[2].quantity +=10;
                break;
            case (3):
                shop2[3].quantity +=10;
                break;
        }
        return shop2;
    }

    public static String spin_the_drum_alt(toys[] shop2) throws IOException {
        FileWriter fileWriter;
        int a = generator_alt(shop2);



        {
            if (a ==0) {
                if (shop2[0].quantity == 0) {
                    a = 4;
                }
                shop2[0].quantity += -1;
            }

            if (a ==1)
                shop2[1].quantity += -1;

            if (a ==2)
                shop2[2].quantity += -1;

            if (a ==3)
                shop2[3].quantity += -1;

            if (a ==4){

                }

        try {
            fileWriter = new FileWriter("gift_for_a_kid.txt",true);
            fileWriter.write(" вы выиграли " +shop2[a].getName());
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        }return (" вы выиграли " +shop2[a].getName());}

    public static int generator_alt(toys[] shop2) {
       int num = 0;
       int aa = 0;//не нужная переменная, заплатка поскольку нет времени
       for(int i=0;i<1;i++) {
           num = (new Random().nextInt(0,101));
           if (num < 11) {
               aa = 0;
           }
           if ((num > 10) && (num < 61)) {
               aa = 1;
           }
           if ((num > 60) && (num <= 91)) {
               aa = 2;
           }
           if ((num >= 90) && (num <= 96)) {
               aa = 3;
           }
           if ((num >= 96))   {
               aa = 4;
           }
       }
//        System.out.println(num);
//        System.out.println(aa);
        return aa;
    }


}
//    public static int generator(toys[] shop2) {
//
//        int[] number = new int[]{shop2[0].id,shop2[1].id,shop2[2].id,shop2[3].id,shop2[4].id}; // Числа
//        int[] chance = new int[]{shop2[0].ves,shop2[1].ves,shop2[2].ves,shop2[3].ves,shop2[4].ves}; // Количество
//
//        int count = IntStream.of(chance).sum(); // Считаем количество элементов воображаемого массива
//
//        // Вывод вероятностей:
//        for (int i = 0; i < chance.length; i++) {
//            System.out.println("Вероятность числа \"" + number[i] + "\":  \t" + (chance[i] * 100d / count) + "%");
//        }int i=0;
//
//        // Генерация случайного числа
//        Random random = new Random();
//        for (int randomNumsCount = 0; randomNumsCount < 5; randomNumsCount++) {
//
//            int index = random.nextInt(count); // Выбираем случайный индекс из воображаемого массива
//
//
//            if (i<=chance.length){ // Ищем элемент, которому принадлежит этот индекс
//                index -= chance[i];
//                i++;
//                if (index <-2) {
//                    if (i < 5) {
//                        System.out.println("Случайное число: " + number[i]);
//                        break;
//                    }
//                    else i--;
//                }
//
//            }
//
//        }return i;
//    }


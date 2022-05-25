package homework2;

import java.io.PrintStream;

public class Home2 {
    public static void main(String[] args) {
        String city = "Sevastopol";
                int population = 894000;
                        float unemployment = 9.4524F;

        System.out.printf("%s - город, %d - население, %.2f - процент безработных\n", city,population,unemployment);

        char section = 75;
        short seat = (short) 456;
        short cost = (short) 25687;
        System.out.printf("%c - секция на трибуне, %d - место, %d - стоимость билета\n",section, seat, cost);

        String name = "Elizaveta";
        byte age = 17;
        short growth = (short) 175;
        System.out.printf("%s - имя, %d - возраст, %d - рост\n", name, age, growth);

        char letter1 = 65;
        short nubmer1 = 844;
        int weiht = 3894635;
        System.out.printf("%c%d%c%c - номер машины, %d - вес автомобиля\n", letter1, nubmer1, letter1, letter1, weiht);

        String nameCompany = "Apple";
        long income = 7466123445L;
        float share = (float) 32.4569;
        System.out.printf("%s - название компании, %d - годовой доход, %.2f - доля на рынке\n", nameCompany, income, share);

char factor = 43;
byte blood = 3;
float proportion = 34.846f;

        System.out.printf("%c - резус фактор, %d - группа крови, %.1f - доля людей с этой группой крови\n",factor,blood,proportion);

        String university = "SevGU";
int students = 896445;
float unhappy = 13.78f;
        System.out.printf("%s - название университета , %d - число студентов , %.1f - доля отчисленных\n", university,students,unhappy );

   char ratingf1 = '7';
        char ratingf2 = '5';
   int copy = 78879321;
   float rating = 5.458f;
        System.out.printf("%c,%c - рейтинг фильма, %d - копий продано, %.1f - рейтинг\n", ratingf1,ratingf2, copy,rating);

String nameB = "Sun";
long product = 78946513253456l;
float sale = 100f;
        System.out.printf("%s - название бренда, %d - произведено товара, %.2f - процент продаж\n",nameB, product,sale );

char categoryP = 66;
short cod = (short) 45631564;
float buyers = 86.986f;
        System.out.printf("%c - категория товара, %d - штрих код, %f - процент покупателей старше 30",categoryP,cod,buyers );


    }
}

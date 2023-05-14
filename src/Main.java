public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println(" Задание 2");
        int temperature = 4;
        if (temperature <= 5) {

            System.out.println(" На улице " + temperature + " градусов , нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature + " градусов , можно идти без шапки ");
        }

        System.out.println(" Задание 3");

        int speed = 4;
        if (speed >= 60) {

            System.out.println(" Если скорость " + speed + " , то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + speed + " , то можно ездить спокойно ");
        }

        System.out.println(" Задание 4");

        int age1 = 6;
        if (age1 < 2) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора спать");
        }
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        if (age1 > 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то его место в университете");
        }
        if (age1 > 24 && age1 < 60) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        if (age1 >= 60) {
            System.out.println("Если возраст человека равен " + age1 + ",  то он может отдохнуть");
        }
        System.out.println(" Задание 5");


        int age2 = 6;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он не может кататься на аттракционе");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься без сопровождения взрослого");
        }

        System.out.println(" Задание 6");

        int passenger = 95;
        if (passenger < 102) {
            System.out.println("Есть еще места");


        int totalPlace = 102 - passenger;
        System.out.println("Осталось еще " +totalPlace+ " свободных мест");

        int sidPlace = 60;
        System.out.println("Всего сидячих мест " + sidPlace);
        int place = 102-60;
        System.out.println("Всего стоячих мест " +place);
    } else {
            System.out.println("Вагон полность забит");
        }

            System.out.println(" Задание 7");

            int one = 1;
            int two = 5;
            int three = 3;
            if (one > two && one > three) {
                System.out.println(one);
            }
            if (two > one && two > three) {
                System.out.println(two);

        } else {
                System.out.println(three);
            }



        }
        }


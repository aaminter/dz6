public class main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 6: условные переменные");
        System.out.println();
        System.out.println("Задание 1:");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задание 2:");
        byte temper = 6;
        if (temper < 5) {
            System.out.println("На улице " + temper + " градусов, нужно одеть шапку");
        } else {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        }
        System.out.println();
        System.out.println("Задание 3:");
        byte speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задание 4:");
        byte peopleAge = 55;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в детский сад");
        }
        if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу");
        }
        if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить на работу");
        }
        System.out.println();
        System.out.println("Задание 5:");
        byte childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе");
        }
        if (childAge >= 5 && peopleAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        System.out.println("Задание 6:");
        byte wagonСapacity = 120;
        byte seatPosition = 60;
        byte seat = 121;
        if (seat <= seatPosition && seat <= wagonСapacity) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (seat > seatPosition && seat <= wagonСapacity) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (seat > wagonСapacity) {
        System.out.println("Мест в вагоне нет");
        }
        System.out.println();
        System.out.println("Задание 7:");
        int one = 2;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число больше второго и третьего");
    }
        if (two > one && two > three) {
            System.out.println("Второе число больше первого и третьего");
        }
        else  {
        System.out.println("Третье число больше первого и второго");
    }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        System.out.println();
        int age = 38;
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        int agePerson = 7;
        if (agePerson >= 7 && agePerson <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (agePerson >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (agePerson >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        int totalPlace = 95;
        int sitPlace = 40;
        int stayPlace = totalPlace - sitPlace;
        if (totalPlace >= 102) {
            System.out.println("Вагон полностью забит");
        }
        if (sitPlace <= 60) {
            System.out.println("В вагоне" + " " + sitPlace + " " + "сидячих мест и " + " " + stayPlace + " " + "стоячих мест");
        }
        if (sitPlace > 60 && totalPlace <= 102) {
            System.out.println("В вагоне все сидячие места заняты и осталось" + " " + stayPlace + " " + "стоячих мест");
        }

        System.out.println();
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        System.out.println();

        int Age = 19;
        if (Age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        int AgePerson = 19;
        if (AgePerson >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else if (AgePerson > 18) {
            System.out.println("Человек уже закончил школу и может поступать в университет");
        } else if (AgePerson >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        int totalPlaceWagon = 50;
        int sitPlaceWagon = 40;
        int stayPlaceWagon = totalPlaceWagon - sitPlaceWagon;
        if (totalPlaceWagon >= 102) {
            System.out.println("Вагон полностью забит");
        } else if (sitPlaceWagon <= 60) {
            System.out.println("В вагоне" + " " + sitPlaceWagon + " " + "сидячих мест и " + " " + stayPlaceWagon + " " + "стоячих мест");
        } else if (sitPlaceWagon > 60 && totalPlaceWagon <= 102) {
            System.out.println("В вагоне все сидячие места заняты и осталось" + " " + stayPlaceWagon + " " + "стоячих мест");
        }
        System.out.println();
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        System.out.println();

        int ageMan = 4;
        if (ageMan > 24) {
            System.out.println("Человеку пора устроиться на работу");
        } else if (ageMan > 7 && ageMan < 18) {
            System.out.println("Ребенку нужно ходить в школу");
        } else if (ageMan > 18 && ageMan < 24) {
            System.out.println("Человеку нужно поступить в универстите");
        } else if (ageMan >= 2 && ageMan < 6) {
            System.out.println("Ребенок должен ходить в детский сад");
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        int ageChild = 8;
        if (ageChild > 14) {
            System.out.println("Ребенок может кататься на аттракционах без сопровождения взрослых");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Ребенок может кататься на аттракционах только в сопровождении взрослых");
        } else if (ageChild < 5) {
            System.out.println("Ребенок не может кататься на аттракционах");
        }

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();



    }

}




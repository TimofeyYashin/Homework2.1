public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);}
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog  =  dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3(){
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4(){
        System.out.println("Задача 4");
        var friend = 19;
        var friend1 = friend + 2;
        var friend2 = friend1 / 3;
        System.out.println(friend);
        System.out.println(friend1);
        System.out.println(friend2);
    }
    public static void task5(){
        System.out.println("Задача 5");
        var frog = 3.5;
        frog = frog * 10;
        frog = frog / 3.5;
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(frog);
        System.out.println(frog);
        System.out.println(frog);
    }
    public static void task6(){
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг!");
        System.out.println("Разница между весами двух бойцов " + weightDifference + " кг!");
    }
    public static void task7(){
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var way1 = boxerWeight2 - boxerWeight1;
        var way2 = boxerWeight2 % boxerWeight1;
        System.out.println("Вычитание из большего веса меньшего " + way1);
        System.out.println("С помощью функции остаток от деления " + way2);
    }
    public static void task8(){
        System.out.println("Задача 8");
        var totalTime = 640;
        var employee1 = 8;
        var employeesTotal = totalTime / employee1;
        System.out.println("Всего работников в компании - " + employeesTotal + " человек.");
        var sotr = employeesTotal + 94;
        var time = totalTime / sotr;
        System.out.println( "Если в компании работает " + sotr + " человека, то всего " + time + " часа работы может быть поделено между сотрудниками.");
    }
}


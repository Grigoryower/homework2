public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6i7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var doc = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(doc);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var doc = 8.0;
        System.out.println(doc);
        doc = doc + 4 ;
        System.out.println(doc);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var doc = 8.0;
        System.out.println(doc);
        doc = doc - 3.5;
        System.out.println(doc);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);}
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);}
        public static void task5 () {
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);}
    public static void task6i7 () {
        System.out.println("Задача 6 и 7");
    var boxerOne=78.2;
    var boxerTwo=82.7;
    var totalWeight = boxerOne + boxerTwo;
    System.out.println("Общий вес 2 боксеров" + totalWeight + "кг");
    var weightDifference = boxerOne - boxerTwo;
    System.out.println("Разница в весе"+ weightDifference + "кг");
    var overLoad =(boxerOne - boxerTwo) % totalWeight;
    System.out.println("Разница в весе" + overLoad +"кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalTime = 640;
        var timeOfOneOmployee = 8;
        var totalEmployees = totalTime / timeOfOneOmployee ;
        System.out.println("Всего работников в компании "  +  totalEmployees  + " человек.");
        var additionalEmployees= 94;
        var allEmployees = totalEmployees + additionalEmployees ;
        var openingHours = allEmployees * timeOfOneOmployee ;
        System.out.println("Если в компании работает " + allEmployees + " человек, то всего" + openingHours + " часов работы может быть поделено между сотрудниками");
    }






}
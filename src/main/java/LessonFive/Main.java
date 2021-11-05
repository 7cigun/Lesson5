package LessonFive;

public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Andrey Bogatov", "Director", "akhitrov@gmail.com", "89033332233", 500000, 41);
        emplArray[1] = new Employee("Alexey Petrov", "Engeneer", "apetrov@gmail.com", "89033332222", 70000, 25);
        emplArray[2] = new Employee("Mariya Stroinaya", "Secretary", "mstroinaya@gmail.com", "89032222233", 500000, 25);
        emplArray[3] = new Employee("Irina Lvova", "Accountant", "ilvova@gmail.com", "8902222222", 2000000, 45);
        emplArray[4] = new Employee("Artyom Tarasov", "Courier", "atarasov@gmail.com", "89033333333", 400000, 41);


        for (int i = 0; i < 5; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].printInfo();
                System.out.println();
            }
        }
    }
}

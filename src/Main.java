import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        Fio one = new Fio("Артём", "Артёмов", "Артёмович");
        Fio two = new Fio("Богдан", "Богданов", "Богданович");
        Fio three = new Fio("Василий", "Васильев", "Васильевичь");
        Fio four = new Fio("Григорий", "Григорьев", "Григорьевичь");
        Fio five = new Fio("Денис", "Денисов", "Денисовичь");
        Fio six = new Fio("Егор", "Егоров", "Егорович");
        Fio seven = new Fio("Евгений", "Евгеньев", "Евгеневичь");
        Fio eight = new Fio("Игорь", "Игорев", "Игоревич");
        Fio nine = new Fio("Роман", "Романов", "Романович");
        Fio ten = new Fio("Леонид", "Леонидов", "Леонидович");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee(one, 1, 18000, new TestGrowSize().getNumberCreation());
        employees[1] = new Employee(two, 2, 15000, new TestGrowSize().getNumberCreation());
        employees[2] = new Employee(three, 3, 15000, new TestGrowSize().getNumberCreation());
        employees[3] = new Employee(four, 4, 15000, new TestGrowSize().getNumberCreation());
        employees[4] = new Employee(five, 5, 15000, new TestGrowSize().getNumberCreation());
        employees[5] = new Employee(six, 1, 15000, new TestGrowSize().getNumberCreation());
        employees[6] = new Employee(seven, 2, 14000, new TestGrowSize().getNumberCreation());
        employees[7] = new Employee(eight, 3, 15000, new TestGrowSize().getNumberCreation());
        employees[8] = new Employee(nine, 4, 15000, new TestGrowSize().getNumberCreation());
        employees[9] = new Employee(ten, 5, 15000, new TestGrowSize().getNumberCreation());
        System.out.println(Arrays.toString(employees));
        System.out.println("Общие затраты на зарплату: " + findSalaryCosts(employees));
        System.out.println("Максимальная зарплата: " + findMaxSalary(employees));
        System.out.println("Минимальная зарплата: "+findMinSalary(employees));
        System.out.println("Среднее значение зарплат: "+findMeanValue(employees));
    }

    public static int findSalaryCosts(Employee[] employees) {
        int[] myArray = {employees[0].getSalary(), employees[1].getSalary(), employees[2].getSalary(), employees[3].getSalary(), employees[4].getSalary(), employees[5].getSalary(), employees[6].getSalary(), employees[7].getSalary(), employees[8].getSalary(), employees[9].getSalary()};
        int sum = 0;
        for (int j : myArray) {
            sum = sum + j;
        }
        return sum;
    }

    public static int findMaxSalary(Employee[] employees) {
        int[] arr = {employees[0].getSalary(), employees[1].getSalary(), employees[2].getSalary(), employees[3].getSalary(), employees[4].getSalary(), employees[5].getSalary(), employees[6].getSalary(), employees[7].getSalary(), employees[8].getSalary(), employees[9].getSalary()};

        int max = 18000;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }
        return max;
    }
    public static int findMinSalary(Employee[] employees) {
        int[] arr = {employees[0].getSalary(), employees[1].getSalary(), employees[2].getSalary(), employees[3].getSalary(), employees[4].getSalary(), employees[5].getSalary(), employees[6].getSalary(), employees[7].getSalary(), employees[8].getSalary(), employees[9].getSalary()};

        int min = 14000;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }

        }
        return min;
    }
    public static float findMeanValue(Employee[] employees) {
        int[] arr = {employees[0].getSalary(), employees[1].getSalary(), employees[2].getSalary(), employees[3].getSalary(), employees[4].getSalary(), employees[5].getSalary(), employees[6].getSalary(), employees[7].getSalary(), employees[8].getSalary(), employees[9].getSalary()};
        float a = 0;
        for (int j : arr) {
            a = a + j;
        }
        a = a/arr.length;
        return a;

    }
    }



















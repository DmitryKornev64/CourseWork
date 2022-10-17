public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan Ivanovich ", 5, 32500);
        employees[1] = new Employee("Budko Alexey Sergeevich ", 2, 21300);
        employees[2] = new Employee("Arkhipov Maxim Gennadievich ", 3, 45455);
        employees[3] = new Employee("Stepanov Ilya Borisovich ", 2, 8500);
        employees[4] = new Employee("Sushkova Maria Stepanovna ", 1, 16350);
        employees[5] = new Employee("Borisova Ekaterina Sergeevna ", 1, 40060);
        employees[6] = new Employee("Stalin Joseph Vissarionovich ", 5, 30080);
        employees[7] = new Employee("Suvorova Alevtina Alexandrovna ", 4, 35366);
        employees[8] = new Employee("Blade Viktor Stalonovich ", 3, 25500);
        employees[9] = new Employee("Stalin Joseph Vissarionovich ", 5, 30080);


        /*для проверки*/
        printAllEmployeesInfo();
        getMinSalary();
        getMaxSalary();
        printSum();
        getAvgSalary();
        printEmployeesNames();

    }

    /*список со всеми сотрудниками со всеми данными в консоль toString()*/
    public static void printAllEmployeesInfo() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i].toString());
        }
    }

    /*сумма зп*/
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Cумма зп " + sum);
    }
    /*поиск сотрулника с минимальной зп*/
    public static int getMinSalary() {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if ( employees[i] != null && employees[i].getSalary() < min) {
                System.out.println("Сотрудник с минимальной зп " + min);
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    /*поиск сотрудника с максимальной зп*/
    public static int getMaxSalary() {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                System.out.println("Сотрудник с максимальной зп " + max);
            }
        }
        return max;
    }

    /*среднее значение зп*/
    public static int getSumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null)
                sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    public static void getAvgSalary() {
        System.out.println("Среднее значение зп " + getSumSalary()/employees.length);
    }

    /*фио всех сотрудников в консоль*/
    public static void printEmployeesNames() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null)
                System.out.println(employees[i].getName());
        }
    }
}

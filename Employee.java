/*
Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных,
и давать надбавку к зарплате в 1% за каждого подчиненного.

Класс Director должен вести себя как Manager, но давать надбавку к зарплате в 3%
за каждого подчиненного.

 */


public class Employee {
    private String name;
    private int ages;
    private char sex;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, int ages, double salary){
        this(name, salary);
        this.ages = ages;
        this.sex = ' ';
    }

    public Employee(String name, char sex, double salary){
        this(name, salary);
        this.ages = 0;
        this.sex = sex;
    }

    public Employee(String name, int ages, char sex, double salary){
        this(name, ages, salary);
        this.sex = sex;
    }


    public String getName() {
        return name;
    }



    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salary;
    }

    public double getSalary(Month[] monthArray) {
        double salaryPerMonth = 0;
        for (Month month : monthArray){
            salaryPerMonth += salary * month.getWorkDays();
        }
        return salaryPerMonth;
    }
}


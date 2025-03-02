/*
Класс Director должен вести себя как Manager,
но давать надбавку к зарплате в 3% за каждого подчиненного.
 */

public class Director extends Manager{
    public Director(String name, double salary, int numberOfSubordinates) {
        super(name, salary, numberOfSubordinates);
    }

    public Director(String name, int ages, double salary, int numberOfSubordinates) {
        super(name, ages, salary, numberOfSubordinates);
    }

    public Director(String name, char sex, double salary, int numberOfSubordinates) {
        super(name, sex, salary, numberOfSubordinates);
    }

    public Director(String name, int ages, char sex, double salary, int numberOfSubordinates) {
        super(name, ages, sex, salary, numberOfSubordinates);
    }

    public double getSalary(Month[] monthArray) {
        double salaryPerMonth = 0;
        for (Month month : monthArray){
            salaryPerMonth += getSalaryPerDay() * month.getWorkDays();
        }
        return (salaryPerMonth + salaryPerMonth * getNumberOfSubordinates() * 3 / 100);
    }
}

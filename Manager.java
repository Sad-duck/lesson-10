
/*
Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных,
и давать надбавку к зарплате в 1% за каждого подчиненного.
 */


public class Manager extends Employee{

    private int numberOfSubordinates;
    private int coeff = 1;

    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int ages, double salary, int numberOfSubordinates) {
        super(name, ages, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, char sex, double salary, int numberOfSubordinates) {
        super(name, sex, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int ages, char sex, double salary, int numberOfSubordinates) {
        super(name, ages, sex, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    
    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }


    public double getSalary(Month[] monthArray) {
        return (super.getSalary(monthArray) * getPerks());
    }
    
    public double getPerks() {
        double perks = 1 + (numberOfSubordinates * coeff / 100.0);
        return perks;
    }
}

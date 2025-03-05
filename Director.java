

/*
Класс Director должен вести себя как Manager,
но давать надбавку к зарплате в 3% за каждого подчиненного.
 */

public class Director extends Manager{
    
    private static final int coeff = 3;
    
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
    
    public int getCoeff(){
        return coeff;
    }

    public double getSalary(Month[] monthArray) {
        return (super.getSalary(monthArray));
    }
    
    public double getPerks(){
        double perks = 1 + (super.getNumberOfSubordinates() * getCoeff() / 100.0);
        return perks;
    }
}

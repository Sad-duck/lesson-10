public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee("Jack", 35, 'w', 35.1);

        Employee kate = new Employee("Kate", 42);

        Employee mike = new Employee("Mike", 'm', 22.8 );

        Month[] kateWorkMonth = {MonthUtils.JANUARY, MonthUtils.FEBRUARY, MonthUtils.FEBRUARY,
                MonthUtils.MAY, MonthUtils.APRIL, MonthUtils.JUNE};
        Month[] jackWorkMonth = MonthUtils.yearMonth;
        Month[] mikeWorkMonth = {MonthUtils.JANUARY, MonthUtils.FEBRUARY};

//        jack.getInfoEmployee();
        System.out.println("Jack salary: " + jack.getSalary(jackWorkMonth));

//        kate.getInfoEmployee();
        System.out.println("Kate salary: " + kate.getSalary(kateWorkMonth));

//        mike.getInfoEmployee();
        System.out.println("Mike salary: " + mike.getSalary(mikeWorkMonth));

        Manager greg = new Manager("Greg", 37, 'm', 85.4, 3);

        Month[] gregWorkMonth = {MonthUtils.JANUARY, MonthUtils.FEBRUARY, MonthUtils.MARCH,
                MonthUtils.MAY, MonthUtils.APRIL, MonthUtils.JUNE};

//        greg.getInfoManager();
        System.out.println("Greg salary: " + greg.getSalary(gregWorkMonth));

        Director sam = new Director("Sam", 85.4, 3);
        Month[] samWorkMonth = gregWorkMonth;
        System.out.println("Sam salary: " + sam.getSalary(samWorkMonth));


    }
}
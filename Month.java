public class Month {
    private final String name;
    private final int calendDays;
    private int workDays;

    public Month(String name, int calendDays, int workDays){
        this.name = name;
        this.calendDays = calendDays;
        this.workDays = workDays;
    }

    public int getWorkDays(){
        return workDays;
    }

    public int getCalendDays() {
        return calendDays;
    }

    public String getName() {
        return name;
    }
}

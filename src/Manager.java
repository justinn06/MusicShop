public class Manager extends Employee{
    private boolean res;

    public Manager(String name, int age, int ID, boolean res) {
        super(name, age, ID);
        this.res = res;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public double calcWage(int hours){
        return hours*30;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Responsibility = " + res +
                '}';
    }

}

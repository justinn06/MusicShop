public class Employee {
    private String name;
    private int age;
    private int ID;

    public Employee(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public Employee(String name) {
        this.name = name;
    }

    public double calcWage(int hours){
        return hours*15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name = '" + name + '\'' +
                ", Age = " + age +
                ", ID = " + ID +
                '}';
    }

}

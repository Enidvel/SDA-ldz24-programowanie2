package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public abstract class Developer {
    protected String name;
    protected String company;
    protected String salary;

    protected abstract void makeCode();

    public Developer(String name, String company, String salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

}

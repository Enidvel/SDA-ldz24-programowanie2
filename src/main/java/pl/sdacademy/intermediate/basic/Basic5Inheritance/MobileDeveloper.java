package pl.sdacademy.intermediate.basic.Basic5Inheritance;

import javax.management.StringValueExp;

public class MobileDeveloper extends Developer {
    String mobileOS;

    public MobileDeveloper(String name, String company, String salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOS = mobileOs;
    }

    @Override
    protected void makeCode() {
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " PLN in " + mobileOS);
    }
}

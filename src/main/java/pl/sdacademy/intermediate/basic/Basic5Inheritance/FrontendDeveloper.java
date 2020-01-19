package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public class FrontendDeveloper extends Developer {
    String javaScriptFramework;

    public FrontendDeveloper(String name, String company, String salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    protected void makeCode() {
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " PLN in " + javaScriptFramework);
    }
}

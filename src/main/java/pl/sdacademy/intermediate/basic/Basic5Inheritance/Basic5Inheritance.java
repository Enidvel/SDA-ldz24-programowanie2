package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public class Basic5Inheritance {
    public static void main(String[] args) {

        Developer backendDeveloper = new BackendDeveloper("Piotr", "Ericsson", "0.5",
                "Java");

        Developer frontendDeveloper = new FrontendDeveloper("Adam", "SDA", "999.99",
                "Angular");

        Developer mobileDeveloper = new MobileDeveloper("Ania", "Google", "1000000",
                "Android");

        backendDeveloper.makeCode();
        frontendDeveloper.makeCode();
        mobileDeveloper.makeCode();
    }
}

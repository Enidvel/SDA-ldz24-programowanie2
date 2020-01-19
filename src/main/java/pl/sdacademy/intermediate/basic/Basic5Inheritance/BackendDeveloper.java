package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public class BackendDeveloper extends Developer{
    String backendLanguage;

    public BackendDeveloper(String name, String company, String salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    protected void makeCode() { //
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " PLN in " + backendLanguage);
    }
}
/*w klasach dziedziczących zaimplementuj metodę "makeCode()", która wypisze na konsolę wiadomość, zbudowaną na podstawie odpowiednich pól (w wiadomość wstaw zawartość name, company i salary oraz dodatkowego pola) np.:
"Piotr is coding for Ericsson for 0.5 PLN in Java"
"Adam is coding for SDA for 999.99 in Angular"
"Ania is coding for Google for 100000.0 in Android"

W metodzie main utwórz obiekty poszczególnych klas. 
Sprawdź, czy możesz utworzyć obiekt poprzez new Developer().
Sprawdź, czy możesz użyć referencji do klasy Developer.
*/
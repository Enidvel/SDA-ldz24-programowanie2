package pl.sdacademy.intermediate.basic.Basic6Polymorphism;
/*W klasie Basic6Polymorphism stwórz metodę moveNTimesFast(Vehicle vehicle, int times), która przyspieszy pojazd N razy
i zwróci prędkość pojazdu po wszystkich przyspieszeniach.

W metodzie main() stwórz 3 referencje do typu Vehicle i przypisz do każdej inną implementację.
Na każdej z referencji wykonaj metodę moveNTimesFast() i wypisz na konsolę ostateczną prędkość pojazdu.
Przetestuj dla kilku wartości N.*/
public class Basic6Polymorphism {

    public static void main(String[] args) {

        Vehicle motorbike = new Motorbike();
        Vehicle bicycle = new Bicycle();
        Vehicle rocket = new Rocket();

        System.out.println("Speed of a motorbike after accelerating n times: " + moveNTimesFast(motorbike, 4));
        System.out.println("Speed of a bicycle after accelerating n times: " + moveNTimesFast(bicycle, 3));
        System.out.println("Speed of a rocket after accelerating n times: " + moveNTimesFast(rocket, 6));
    }

    public static int moveNTimesFast(Vehicle vehicle, int times) {
        for (int i = 0; i < times; i++) {
            vehicle.accelerate();
        }
        return vehicle.getSpeed();
    }
}

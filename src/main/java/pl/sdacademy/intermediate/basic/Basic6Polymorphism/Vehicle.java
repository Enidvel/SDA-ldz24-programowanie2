package pl.sdacademy.intermediate.basic.Basic6Polymorphism;
/*W metodzie accelerate() każdej klasy zwiększaj aktualną prędkość o wartości: 30 - motocykl, 5 - rower, 10000 - rakieta.
Sprawdź, czy pojazd może przyspieszyć (czy kolejne przyspieszenie nie przekroczy maksymalnej prędkości).
Jeśli pojazd nie może przyspieszyć, nie zwiększaj prędkości, tylko wypisz informację na konsolę.
*/
public interface Vehicle {
    void accelerate();
    int getSpeed();

}

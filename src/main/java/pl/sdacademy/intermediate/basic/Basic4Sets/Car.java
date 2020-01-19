package pl.sdacademy.intermediate.basic.Basic4Sets;

import java.util.Objects;

public class Car {
    String marka;
    String model;
    String nrVIN; // unikalne!

    public Car(String marka, String model, String nrVIN) {
        this.marka = marka;
        this.model = model;
        this.nrVIN = nrVIN;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNrVIN() {
        return nrVIN;
    }

    public void setNrVIN(String nrVIN) {
        this.nrVIN = nrVIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nrVIN='" + nrVIN + '\'' +
                '}';
    }

    @Override // Alt + Insert (Generate -> eguals and hashCode -> wybierz tylko zmienną nrVIN, czyli porownanie
    // jest oparte o to co faktycznie świadczy o unikalności obiektu
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(nrVIN, car.nrVIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrVIN);
    }
}

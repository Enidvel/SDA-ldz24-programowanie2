package pl.sdacademy.intermediate.warmup.WarmUp1;

import java.time.LocalDate;

public class Person {
    String name;
    String surname;
    String placeOfBirth;
    int age;
    long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        int myYear = LocalDate.now().getYear() - age;
//        return name + " " + surname + " (ur. " + myYear + " r.)" + '\n' +
//                "m. ur.:" + placeOfBirth + '\n' +
//                "tel: " + phone;
        return String.format("%s %s (ur. %d r.)\nm. ur.: %s\ntel: %d", name, surname, myYear, placeOfBirth, phone);
    }
/* Adam Nowak (ur. 1989 r.)
    m. ur.: Łódź
    tel: 123456789 */
}

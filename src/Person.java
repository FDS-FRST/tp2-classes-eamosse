public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private Color color;
    private Address address;

    public Person(String name, String surname, Sex sex, Color color, Address address) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.color = color;
        this.address = address;
    }

    public Person(String name, String surname, Sex sex, Color color) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.color = color;
        this.address = null;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}

package exercise2;

public class Patient {

    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String gender;

    public Patient(String firstName, String lastName, int age, double height, double weight, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String  toString() {
        return "The Patient is " +  firstName + " " + lastName + " He is " + age + " years old and " + height + " meters tall. His weight is " + weight + " and his gender is " + gender;
    }
}

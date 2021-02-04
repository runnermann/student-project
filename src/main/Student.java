package main;

public class Student {

    String first;
    String last;
    int age;
    String cName;
    String major;
    double gpa;

    public Student() { /* no args constructor */}

    /**
     * Constructs a new student object.
     * @param first
     * @param last
     * @param age
     * @param cName
     * @param major
     * @param gpa
     * @return returns the Student.
     */
    public Student build(String first, String last, int age, String cName, String major, double gpa) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.cName = cName;
        this.major = major;
        this.gpa = gpa;
        return this;
    }

    // ***** GETTERS AND SETTERS ***** //

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}

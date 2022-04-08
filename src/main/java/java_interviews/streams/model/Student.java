package java_interviews.streams.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Student {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDay;
    private final Set<Course> courses;

    public Student(String firstName, String lastName, LocalDate birthDay, Set<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(birthDay, student.birthDay) &&
                Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDay, courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}

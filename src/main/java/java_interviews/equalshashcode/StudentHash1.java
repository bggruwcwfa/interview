package java_interviews.equalshashcode;

import java.time.LocalDate;
import java.util.Objects;

public class StudentHash1 {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;

    public StudentHash1(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentHash1 that = (StudentHash1) o;
        return Objects.equals(firstName, that.firstName) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

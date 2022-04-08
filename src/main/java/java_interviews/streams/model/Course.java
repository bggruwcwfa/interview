package java_interviews.streams.model;

import java.util.Objects;

public class Course {

    private final String name;
    private final String lecturer;

    public Course(String name, String lecturer) {
        this.name = name;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public String getLecturer() {
        return lecturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(lecturer, course.lecturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lecturer);
    }
}

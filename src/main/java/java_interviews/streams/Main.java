package java_interviews.streams;

import java_interviews.streams.model.Student;
import java_interviews.streams.repository.StudentRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> allStudents = StudentRepository.generate(100);
        System.out.println(allStudents.get(0));
    }
}

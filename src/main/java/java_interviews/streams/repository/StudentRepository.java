package java_interviews.streams.repository;

import java_interviews.streams.model.Course;
import java_interviews.streams.model.Student;
import java_interviews.streams.util.AgeRange;
import java_interviews.streams.util.Names;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentRepository {

    public static List<Student> generate(int howMany) {
        Random random = new Random();
        List<Course> all = CourseRepository.generateAll();
        AgeRange ageRange = new AgeRange(19, 25);
        return IntStream.range(0, howMany)
                .mapToObj(i -> new Student(
                        Names.randomFirstName(),
                        Names.randomLastName(),
                        ageRange.randomBirthDate(),
                        all.stream().filter(s -> random.nextBoolean())
                                .collect(Collectors.toSet())))
                .collect(Collectors.toList());
    }
}

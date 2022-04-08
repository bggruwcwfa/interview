package java_interviews.streams.repository;

import java_interviews.streams.model.Course;
import java_interviews.streams.util.Names;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseRepository {

    public static List<Course> generateAll() {
        return Stream.of(
                        new Course("Introduction to programming", Names.randomName()),
                        new Course("Operating Systems", Names.randomName()),
                        new Course("Databases", Names.randomName()),
                        new Course("Object oriented programming", Names.randomName()),
                        new Course("Functional programming", Names.randomName()),
                        new Course("Distributed programming", Names.randomName()),
                        new Course("Introduction to Java", Names.randomName()),
                        new Course("Introduction to Spring", Names.randomName()),
                        new Course("Advanced SpringBoot", Names.randomName())
                )
                .collect(Collectors.toList());
    }

}

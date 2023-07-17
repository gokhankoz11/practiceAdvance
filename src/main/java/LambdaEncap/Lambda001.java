package LambdaEncap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda001 {
    public static void main(String[] args) {


        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 155);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        boolean result1 = courseList.stream().allMatch(t -> t.getAvarageScore() > 91);
        System.out.println("result1 = " + result1);

        boolean result2 = courseList.stream().anyMatch(t -> t.getCourseName().contains("courseTurkishDay"));
        System.out.println("result2 = " + result2);

        boolean result3 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println("result3 = " + result3);

        String name1 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println("name1 = " + name1);
        List<Course> myList = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println("myList = " + myList);

        List<Course> myList4 = courseList.stream().sorted(Comparator.comparing(Course::getNumberofStudents).reversed()).collect(Collectors.toList());

        long ingBolSay = courseList.stream().filter(t -> t.getCourseName().contains("English")).count();
        List<Course> myList7 = courseList.stream().filter(t -> t.getNumberofStudents() < 140).collect(Collectors.toList());


    }
}
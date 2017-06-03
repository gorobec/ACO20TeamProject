package week1.day2;

public class TestUniversityAsStringMethod {
    public static void main(String[] args) {

        // make University
        University university = new University("Sons of anarchy", 4);

        // 1st group
        Student[] rockStars = new Student[3];
        rockStars[0] = new Student("Kurt", "Cobain", 27);
        rockStars[1] = new Student("James", "Hatfield", 50);
        rockStars[2] = new Student("Axl", "Rose", 55);
        Group rockStarsGroup = new Group(13, rockStars);

        // 2nd group
        Group nullGroup = null;

        // 3rd group
        Student[] movieStars = new Student[3];
        movieStars[0] = new Student("Al", "Pacino", 55);
        movieStars[1] = null;
        movieStars[2] = new Student("Jim", "Karry", 45);
        Group movieSrarsGroup = new Group(23, movieStars);

        // 4th group
        Student[] f1 = new Student[3];
        f1[0] = new Student("Robert", "Cubica", 36);
        f1[1] = new Student("Mark", "Webber", 34);
        f1[0] = new Student("Fernando", "Alonso", 35);
        Group f1Group = new Group(33, f1);

        // add groups to the university
        university.addGroup(rockStarsGroup);
        university.addGroup(nullGroup);
        university.addGroup(movieSrarsGroup);
        university.addGroup(f1Group);

        // asString()
        System.out.println(university.asString());
    }
}

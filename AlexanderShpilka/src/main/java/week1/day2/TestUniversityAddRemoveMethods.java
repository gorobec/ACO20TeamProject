package week1.day2;

public class TestUniversityAddRemoveMethods {
    public static void main(String[] args) {
        // make students
        Student[] rockStars = new Student[3];
        rockStars[0] = new Student("Kurt", "Cobain", 27);
        rockStars[1] = new Student("James", "Hatfield", 50);
        rockStars[2] = new Student("Axl", "Rose", 55);
        // make group
        Group rockStarsGroup = new Group(13, rockStars);
        // make University
        University musicUniversity = new University("MusicUniversity", 1);
        // add group to the University
        boolean expected = true;
        boolean actual = musicUniversity.addGroup(rockStarsGroup);
        System.out.printf("addGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);

        // make students
        Student[] movieStars = new Student[3];
        movieStars[0] = new Student("Al", "Pacino", 55);
        movieStars[1] = new Student("Robert", "DeNiro", 53);
        movieStars[2] = new Student("Jim", "Karry", 45);
        // make group
        Group movieSrarsGroup = new Group(23, movieStars);
        // add group to the same University (size only 1)
        expected = false;
        actual = musicUniversity.addGroup(movieSrarsGroup);
        System.out.printf("addGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);

        // remove group that was not previously added to the University
        Student[] fakeStudents = new Student[3];
        fakeStudents[0] = new Student("Fake1", "One", 10);
        fakeStudents[1] = new Student("Fake2", "Two", 20);
        fakeStudents[2] = new Student("Fake3", "Three", 30);
        Group fakeGroup = new Group(33, fakeStudents);
        expected = false;
        actual = musicUniversity.removeGroup(fakeGroup);
        System.out.printf("removeGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);

        // remove rockStarsGroup
        expected = true;
        actual = musicUniversity.removeGroup(rockStarsGroup);
        System.out.printf("removeGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);

        // remove rockStarsGroup one more time
        expected = false;
        actual = musicUniversity.removeGroup(rockStarsGroup);
        System.out.printf("removeGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);

        // trying to add null Group
        Group nullGroup = null;
        expected = false;
        actual = musicUniversity.addGroup(nullGroup);
        System.out.printf("addGroup() result - %b, expected - %b, actual - %b\n", expected==actual, expected, actual);
    }
}

public class Main {
    public static void main(String[] args) {

        Student Sam = new Student("sam", "636-02", 1, new int[] { 2, 2, 3, 4, 5 });
        Student Din = new Student("din", "436-01", 2, new int[] { 5, 5, 5, 4, 5 });
        Student Kris = new Student("kris", "706-02", 2, new int[] { 3, 4, 3, 4, 5 });
        Student Tom = new Student("tom", "401-02", 1, new int[] { 3, 3, 3, 3, 2 });
        Student Sandi = new Student("sandi", "602-04", 3, new int[] { 2, 5, 5, 2, 5 });
        Student Robbi = new Student("robbi", "332-01", 3, new int[] { 4, 3, 3, 4, 5 });

        Student[] studentsList = new Student[] {Sam, Din, Kris, Tom, Sandi, Robbi};

    }
}
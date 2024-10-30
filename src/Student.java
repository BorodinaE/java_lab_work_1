import java.util.Arrays;

public class Student {
    //String: name = имя, grup = группа; Int: course = курс, grades = оценки по предметам;
    //average_mark - средняя оценка по всем предметам ученика
    // grades массив с оценками по каким-то предметам (1 предмет 1 оценка)

    private String name;
    private String grup;
    private int course;
    private int[] grades;

    public Student(String name, String grup, int course, int[] grades) {
        this.name = name;
        this.grup = grup;
        this.course = course;
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    boolean CheckGrades(int[] grades){
        // если функция возвращает true значит студент переходит на следующий курс
        // если функция возвращает false то студент будет удалён из списка обучающихся

        float average_mark = ((Arrays.stream(grades).sum()) / (float)grades.length);

        if (average_mark >= 3) return true;
        else return false;
    }

    void printStudents(Student[] students, int course){
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student);
            }
        }
    }
}
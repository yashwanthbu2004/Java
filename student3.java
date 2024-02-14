class Students {
    int usn;
    String name, dept, college;
}

class Test extends Students {
    int[] marks = new int[6];
    float total, avg;
}

class Sports extends Test {
    String sname;
    String winner, runner;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Department: " + dept);
        System.out.println("College: " + college);

        System.out.println("Test Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Sports Name: " + sname);
        System.out.println("Winner: " + winner);
        System.out.println("Runner: " + runner);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class student3 {
    public static void main(String[] args) {
        Sports student = new Sports();
        student.name = "ybu";
        student.usn = 418;
        student.dept = "Computer Science";
        student.college = "RV university";
        student.marks = new int[]{80, 75, 85, 90, 78, 88};
        student.total = 496;
        student.avg = student.total / 6;
        student.sname = "Football";
        student.winner = "Team A";
        student.runner = "Team B";
        student.display();
    }
}
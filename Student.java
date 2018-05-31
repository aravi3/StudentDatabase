public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private int costOfCourse = 600;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter student first name: ");
        // this.firstName = in.nextLine();
        this.firstName = "Arvind";

        // System.out.print("Enter student last name: ");
        // this.lastName = in.nextLine();
        this.lastName = "Ravi";

        // System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        // this.gradeYear = in.nextInt();
        this.gradeYear = 4;
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }

    // Generate an ID

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
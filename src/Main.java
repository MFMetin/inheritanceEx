public class Main {

    public static void main(String[] args) {

        User user1 = new Student("1","Furkan","Metin",20,2);
        User user2 = new Instructor("2","Engin","Demirog",30,"Java");

        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        studentManager.selectCourse("Java");
        studentManager.add(user1);
        studentManager.delete(user1);
        studentManager.update(user1);

        instructorManager.addCourse("Java");
        instructorManager.add(user2);
        instructorManager.delete(user2);
        instructorManager.update(user2);

    }
}

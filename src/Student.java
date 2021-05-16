public class Student extends  User{
        private int grade;



        public Student(String id,String name,String surname,int age,int grade){
            super(id, name, surname, age);
            this.grade = grade;
        }


        public int getGrade() {
            return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

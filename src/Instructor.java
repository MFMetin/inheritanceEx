public class Instructor extends User{

    private String profession;


    public Instructor(String id,String name,String surname,int age,String profession){
        super(id, name, surname, age);
        this.profession = profession;

    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

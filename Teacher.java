public class Teacher extends Staff {

     String lessonNote;
     boolean hasChalk;

    public Teacher(String idCardColor, boolean parkingSpace) {
        super(idCardColor, parkingSpace);

    }

    public Teacher(String idCardColor, boolean parkingSpace, String lessonNote) {
        super(idCardColor, parkingSpace);
        this.lessonNote = lessonNote;
        this.hasChalk = true;
    }

    @Override
    public String getIdCardColor() {
        return "Purple";
    }

    @Override
    public String drives() {
        return "Teacher is driving";

    }

    @Override
    public boolean cleans() {
        return false;
    }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");;
    }
}

public class NonAcademic extends Staff{


    public NonAcademic(String idCardColor, boolean parkingSpace) {
        super(idCardColor, parkingSpace);
    }
    public NonAcademic(String idCardColor){
        this(idCardColor,false);
    }

    @Override
    public String drives() {
        return "Nonacademic staff cannot drive";
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("Non academic staff cannot drive");
    }

    @Override
    public boolean cleans() {
        return super.cleans();
    }
}

public class Principal extends Staff {
    public Principal(String idCardColor, boolean parkingSpace) {
        super(idCardColor,parkingSpace);
    }



    @Override
    public String getIdCardColor() {
        return "Black";
    }

    @Override
    public String drives() {
        return "The principal can drive";
    }

    @Override
    public void teach() {
        System.out.println("The principal can teach a subject");
    }

    @Override
    public boolean cleans() {
        return false;
    }
}

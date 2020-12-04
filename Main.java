/**
 * Assignment: Add three functions in the staff class and override it in all the methods and make
 * sure they do different things
 *
 * include aggregation also
 *
 * Composition is-a relationship: Inheritance
 *
 * has-a relationship(aggregation and composition)
 * Composition is when one depends on the other
 * Aggregation is when one can exist without the other:
 */

public class Main {
    public static void main(String[] args) {

        /**
         *  Association by composition
         */
        Engine engine1 = new Engine("HorsePower",400,false);
        Car car = new Car(engine1);
        System.out.println(car.engine.isRunning());
        car.engine.setRunning(true);

        System.out.println(car.engine.isRunning());
        car.engine.start();


        /**
         *  Association by aggregation
         */
        Actors chris = new Actors(5);

        Name name = new Name("Chris","Hemling","Shawn");
        chris.display(20_000,name);





        Staff tola = new Staff("Blue",true);
        String idCardColor = tola.getIdCardColor();
        //System.out.println(idCardColor);
        tola.setIdCardColor("Green");
        idCardColor = tola.getIdCardColor();
        //System.out.println(idCardColor);

        Principal principal = new Principal("Orange",true);
        principal.setIdCardColor("Yellow");
        //System.out.println(principal.getIdCardColor());

        Teacher teacher = new Teacher("Indigo",true);
        Teacher teacher1 = new Teacher("Purple",true,"English");

        NonAcademic nonAcademic = new NonAcademic("White",false);
        NonAcademic nonAcademic1 = new NonAcademic("Orange");

        //System.out.println(nonAcademic1.getIdCardColor());
        //System.out.println(nonAcademic1.isParkingSpace());

        String samson = "Samson";
        //System.out.println(samson.getClass().getName());

        //System.out.println(teacher1.drives());
        //System.out.println(teacher.cleans());


    }
}

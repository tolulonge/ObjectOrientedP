public class Actors {
   int awards;

    public Actors(int awards) {
        this.awards = awards;
    }

    public void display(int netWorth, Name n){
        System.out.println("FullName: "+n.lastName+" "+n.firstName+" "+n.middleName);
        System.out.println("Networth of "+n.firstName+" is $"+netWorth);

    }

}

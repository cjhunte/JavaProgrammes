package CarShowroom;
import java.util.Date;

public class car {//creates the class for car


        private String registration;//these define the attributes for car to later be changed via overloading
        private String make;
        private String model;
        private int engine;
        private String colour;
        private int manYear;
        private int price;
        private Date dateRegistered ;



    public car (String Newreg,String newmake,String newmodel, int newengine, String newcolour, int newmanYear, int newprice, Date newdateRegistered)
    {
        registration = Newreg;
        make = newmake;
        model = newmodel;
        engine = newengine;
        colour = newcolour;
        manYear = newmanYear;
        price = newprice;
        dateRegistered = newdateRegistered;

    }//this is our constructor method again to be used later

    protected void setColour(String colour) {
        this.colour = colour;
    }
    protected void setRegistration(String Newreg) {
        this.registration = Newreg;
    }
    protected void setDateRegistered(Date newdateRegistered) {
        this.dateRegistered = newdateRegistered;
    }

    protected void printCarInfo() {
        System.out.println("CAR DETAILS");
        System.out.println("The registration number is " + registration);
        System.out.println("The make of the car is " + make);
        System.out.println("The car is " + colour + " and was manufactured in " + manYear);
        System.out.println("===========");
    }//printCarInfo

    protected String getRegistration() {
        return registration;
    }

    protected String getMake() {
        return make;
    }
    protected String getModel() {
        return model;
    }
    protected int getEngine (){
        return engine;
    }
    protected String getColour (){
        return colour;
    }
    protected int getManYear (){
        return manYear;
    }
    protected int getPrice (){
        return price;
    }
    protected Date getDateRegistered (){
        return dateRegistered;
    }


}

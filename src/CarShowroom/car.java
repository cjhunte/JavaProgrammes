package CarShowroom;
import java.util.Date;
import java.util.Calendar;


public class car {//creates the class for car


        private String registration;//these define the attributes for car to later be changed via overloading
        private String make;
        private String model;
        private int engine;
        private String colour;
        private int manYear;
        private int price;
        private Date dateRegistered ;


         private static int noOfCars = 0;

         public int Caram;
        {
            noOfCars ++;

        }//Default Constructor


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




    ///////////////////////////////////getters

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

    ////////////////////////////////////////////////////////setters
    protected void setColour(String newcolour) {
        this.colour = newcolour;
    }
    protected void setRegistration(String Newreg) {
        this.registration = Newreg;
    }
    protected void setMake(String newmake) {
        this.make = newmake;
    }
    protected void setModel(String newmodel) {
        this.model = newmodel;
    }
    protected void setEngine(int newengine) {
        this.engine = newengine;
    }
    protected void setManYear(int newmanYear) {
        this.manYear = newmanYear;
    }
    public void setPrice(int newprice) {
        this.price = newprice;
    }

    protected int ageOfCar(int manYear)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age;
        if (manYear == 0)
        {
            age = -1;
        }
        else
        {
            age = year - manYear;
        }
        return age;
    }//ageOfCars determines how old the car is and returns that information.



    protected void printCarInfo()
    {
        System.out.println("CAR DETAILS");
        System.out.println("The registration number is " + registration);
        System.out.println("The make of the car is " + make);
        System.out.println("The model of the car is " + model);
        System.out.println("The engine capacity of the car is " + engine);
        System.out.println("The car is " + colour + " and was manufactured in " );
        System.out.println("The price is " + price + " and it was registered on "+ dateRegistered );
        System.out.println("===========");
    }//printCarInfo
    //Ex 1.14
    protected static int numberOfCars()
    {
        return noOfCars;
    }//numberOfCars


}

package CarShowroom;
import java.util.Date;
import java.util.Calendar;


public class car {//creates the class for car
        private String postcode;//these define the attributes for car to later be changed via overloading
        private String AddReslin;
        private String Town;
        private int Ptype;
        private String VendName;
        private int vCont;
        private int price;
        private Date dateRegistered ;


         private static int noOfCars = 0;

         public int Caram;
        {
            noOfCars ++;

        }//Default Constructor


    public car (String NewPost,String Newaddress,String NTown, int NewPtype, String Newvendname, int NewvCont, int newprice, Date newdateRegistered)
    {
        postcode = NewPost;
        AddReslin = Newaddress;
        Town = NTown;
        Ptype = NewPtype;
        VendName = Newvendname;
        vCont = NewvCont;
        price = newprice;
        dateRegistered = newdateRegistered;

    }//this is our constructor method again to be used later




    ///////////////////////////////////getters

    protected String getPostcode() {
        return postcode;
    }

    protected String getAddReslin() {
        return AddReslin;
    }
    protected String getTown() {
        return Town;
    }
    protected int getPtype(){
        return Ptype;
    }
    protected String getVendName(){
        return VendName;
    }
    protected int getvCont(){
        return vCont;
    }
    protected int getPrice (){
        return price;
    }
    protected Date getDateRegistered (){
        return dateRegistered;
    }

    ////////////////////////////////////////////////////////setters
    protected void setVendName(String newcolour) {
        this.VendName = newcolour;
    }
    protected void setPostcode(String Newreg) {
        this.postcode = Newreg;
    }
    protected void setAddReslin(String newmake) {
        this.AddReslin = newmake;
    }
    protected void setTown(String newmodel) {
        this.Town = newmodel;
    }
    protected void setPtype(int newengine) {
        this.Ptype = newengine;
    }
    protected void setvCont(int newmanYear) {
        this.vCont = newmanYear;
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
        System.out.println("The registration number is " + postcode);
        System.out.println("The make of the car is " + AddReslin);
        System.out.println("The model of the car is " + Town);
        System.out.println("The engine capacity of the car is " + Ptype);
        System.out.println("The car is " + VendName + " and was manufactured in " );
        System.out.println("The price is " + price + " and it was registered on "+ dateRegistered );
        System.out.println("===========");
    }//printCarInfo
    //Ex 1.14
    protected static int numberOfCars()
    {
        return noOfCars;
    }//numberOfCars


}

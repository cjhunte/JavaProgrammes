package EstateAgents;
import java.text.SimpleDateFormat;
import java.util.Date;


public class property//creates the class for car
{
        //these define the attributes for properties to later be changed via overloading
        private String postcode;
        private String AddReslin;
        private String Town;
        private int Ptype;
        private String VendName;
        private int vCont;
        private int price;
        private Date dateRegistered;





    public property(String NewPost, String Newaddress, String NTown, int NewPtype, String Newvendname, int NewvCont, int newprice)////this is a constructor for new values to be added
    {
        postcode = NewPost;   //each value takes on the form of the new value by replacing the new value with the newest updated value.
        AddReslin = Newaddress;
        Town = NTown;
        Ptype = NewPtype;
        VendName = Newvendname;
        vCont = NewvCont;
        price = newprice;


    }//this is our constructor method again to be used later




    ///////////////////////////////////getters
    ////////////////each of the getters gets us a value for what has previously been entered
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

    protected String getfulladd()
    {
        String fulladdress = (AddReslin + " " + Town + " " + postcode );
        return fulladdress;
    }

    ////////////////////////////////////////////////////////setters
    //////////////////////////////////////these are the setters that set the new values for the getters.
    protected void setVendName(String Newvendname) {
        this.VendName = Newvendname;
    }
    protected void setPostcode(String NewPost) {
        this.postcode = NewPost;
    }
    protected void setAddReslin(String Newaddress) {
        this.AddReslin = Newaddress;
    }
    protected void setTown(String NTown) {
        this.Town = NTown;
    }
    protected void setPtype(int NewPtype) {
        this.Ptype = NewPtype;
    }
    protected void setvCont(int NewvCont) {
        this.vCont = NewvCont;
    }
    public void setPrice(int newprice) {
        this.price = newprice;
    }





    protected void displaypropertydetails()////this prints and displays the information related to the properties in a well organised fashion.
    {

        String DateReg = new SimpleDateFormat("dd-MM-yyyy").format(dateRegistered);

        System.out.println("PROPERTY DETAILS");
        System.out.println("The postcode is " + postcode);
        System.out.println("The First line of address is " + AddReslin);
        System.out.println("The area of this property is " + Town);
        System.out.println("The property type is " + Ptype);
        System.out.println("The property is sold by " + VendName );
        System.out.println("The price is " + price + " and it was registered on "+ DateReg );
        System.out.println("===========");
    }//printCarInfo
    //Ex 1.14



}

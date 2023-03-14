package EstateAgents;
import java.text.SimpleDateFormat;
import java.util.Date;///these are import statements these are used to bring in libraries that we may require.

///// 60004087 \/ Connor hunter \\\\\\\
// property.java class
// this class takes the values of a property and changes them via overloading and overriding so that the new values may replace the old values entered
// *created 01/03/23*
////\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\

public class property//creates the class for car
{
        //these define the attributes for properties to later be changed via overloading
        private String postcode;///the values with string in-front of them are strings that can be alphanumerical in arrangement, but you cannot do math with a string.
        private String AddReslin;
        private String Town;
        private int Ptype;////this takes an integer or whole number value that can be used to determine numbers on a list for the property type.
        private String VendName;
        private int vCont;
        private int price;
        private Date dateRegistered;////this is our date registered value it allows us to set the date we acquired a property on.





    public property(String NewPost, String Newaddress, String NTown, int NewPtype, String Newvendname, int NewvCont, int newprice)/////in the brackets we are passing the information to be changed.
    ////this is a constructor for new values to be added
    {
        postcode = NewPost;   //each value takes on the form of the new value by replacing the new value with the newest updated value.
        AddReslin = Newaddress; ///this is our new address line which will update the address value to the last one entered.
        Town = NTown;//this is our new town which will update the town value to the last one entered.
        Ptype = NewPtype;//this is our new property type which will update the type to the last value entered.
        VendName = Newvendname;//this is our new vendor name  which will update the vendor value to the last one entered.
        vCont = NewvCont;//this is our new vendor contact which will update the contact value to the last one entered.
        price = newprice;//this is our new price which will update the price value to the last one entered.


    }//this is our constructor method again to be used later




    ///////////////////////////////////getters
    ////////////////each of the getters gets us a value for what has previously been entered
    protected String getPostcode() {
        return postcode;
    }////this is a getter it allows use to retrieve the postcode from the code.

    protected String getAddReslin() {
        return AddReslin;
    }////this is a getter it allows use to retrieve an object from the code.
    protected String getTown() {
        return Town;
    }////this is a getter it allows use to retrieve an object from the code.
    protected int getPtype(){
        return Ptype;
    }////this is a getter it allows use to retrieve an object from the code.
    protected String getVendName(){
        return VendName;
    }////this is a getter it allows use to retrieve an object from the code.
    protected int getvCont(){
        return vCont;
    }////this is a getter it allows use to retrieve an object from the code.
    protected int getPrice (){
        return price;
    }////this is a getter it allows use to retrieve an object from the code.
    protected Date getDateRegistered (){
        return dateRegistered;
    }////this is a getter it allows use to retrieve an object from the code.

    protected String getfulladd()
    {
        String fulladdress = (AddReslin + " " + Town + " " + postcode );
        return fulladdress;
    }////this is a getter it allows use to retrieve an object from the code. this one in particular concatenates 3 values together for the full address line.

    ////////////////////////////////////////////////////////setters
    //////////////////////////////////////these are the setters that set the new values for the getters.
    protected void setVendName(String Newvendname) {
        this.VendName = Newvendname;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    protected void setPostcode(String NewPost) {
        this.postcode = NewPost;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    protected void setAddReslin(String Newaddress) {
        this.AddReslin = Newaddress;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    protected void setTown(String NTown) {
        this.Town = NTown;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    protected void setPtype(int NewPtype) {
        this.Ptype = NewPtype;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    protected void setvCont(int NewvCont) {
        this.vCont = NewvCont;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value
    public void setPrice(int newprice) {
        this.price = newprice;
    }////this is a setter that sets a new value to replace and reuse the code used for a different value





    protected void displaypropertydetails()////this prints and displays the information related to the properties in a well organised fashion.
    {

        String DateReg = new SimpleDateFormat("dd-MM-yyyy").format(dateRegistered);///this line of code passes our date in as a string to be used for display to the user.

        System.out.println("PROPERTY DETAILS");
        System.out.println("The postcode is " + postcode);
        System.out.println("The First line of address is " + AddReslin);
        System.out.println("The area of this property is " + Town);
        System.out.println("The property type is " + Ptype);
        System.out.println("The property is sold by " + VendName );
        System.out.println("The price is " + price + " and it was registered on "+ DateReg );
        System.out.println("===========");
    }



}

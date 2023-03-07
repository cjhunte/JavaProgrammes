package EstateAgents;
import java.text.SimpleDateFormat;
import java.util.Date;


public class property
{//creates the class for car
        private String postcode;//these define the attributes for car to later be changed via overloading
        private String AddReslin;
        private String Town;
        private int Ptype;
        private String VendName;
        private int vCont;
        private int price;
        private String dateRegistered;





    public property(String NewPost, String Newaddress, String NTown, int NewPtype, String Newvendname, int NewvCont, int newprice)
    {
        postcode = NewPost;
        AddReslin = Newaddress;
        Town = NTown;
        Ptype = NewPtype;
        VendName = Newvendname;
        vCont = NewvCont;
        price = newprice;
        dateRegistered = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

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
    protected String getDateRegistered (){
        return dateRegistered;
    }

    protected String getfulladd(String addReslin,String postcode, String town)
    {
        String fulladdress = (addReslin + " " + town + " " + postcode );
        return fulladdress;
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





    protected void displaypropertydetails()
    {
        System.out.println("PROPERTY DETAILS");
        System.out.println("The postcode is " + postcode);
        System.out.println("The First line of address is " + AddReslin);
        System.out.println("The area of this property is " + Town);
        System.out.println("The property type is " + Ptype);
        System.out.println("The property is sold by " + VendName );
        System.out.println("The price is " + price + " and it was registered on "+ dateRegistered );
        System.out.println("===========");
    }//printCarInfo
    //Ex 1.14



}

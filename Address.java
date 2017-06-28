public class Address   //public keyword means class is available to other classes in this program
{
    // These are the attributes (variables that each instance is given a set of), private meaning accesible only within the declared class itself
    private String title;
    private String forename;
    private String surname;
    private String DOB;
    private String email;
    private String postcode;
    private String address;
    private String number;
    
    //This section is the constructor
    public Address(String title, String forename, String surname, String DOB, String email, 
    String postcode, String address, String number) 
    {        
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.DOB = DOB;
        this.email = email;
        this.postcode = postcode;
        this.address = address;
        this.number = number;
    }

    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.title + ", " + this.forename + ", " + this.surname + ", " + this.DOB + ", " 
        + this.email + ", " + this.postcode + ", " + this.address + ", " + this.number;
    }

    //methods - getters and setters, also known as accessor methods
    public String getTitle() { return title;}

    public String getForename() {return forename;}

    public String getSurname() {return surname;}
    
    public String getDOB() {return DOB;}
    
    public String getEmail() {return email;}
    
    public String getPostcode() {return postcode;}
    
    public String getAddress() {return address;}
    
    public String getNumber() {return number;}

    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself
    public void setTitle(int ranking) {this.title = title;}

    public void setForename(String forename){this.forename = forename;}

    public void setSurname(String surname){this.surname = surname;}
    
    public void setDOB(String DOB){this.DOB = DOB;}
    
    public void setEmail(String email){this.email = email;}
    
    public void setPostcode(String postcode){this.postcode = postcode;}
    
    public void setAddress(String address){this.address = address;}
    
    public void setNumber(String number){this.number = number;}
}

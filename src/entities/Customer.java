package entities;

public enum CompanySize{
    Small, Medium, Large
}
public class Customer {
    private Integer id;
    private String companyName;
    private CompanySize companySize;
    private Integer nrOfEmployes;
    private Long incomeFCustomer;
    private String location;

    public Integer getId() {
        return id;
    }

    public Customer(Integer id, String companyName, CompanySize companySize, Integer nrOfEmployes, Long incomeFCustomer, String location) {
        this.id = id;
        this.companyName = companyName;
        this.companySize = companySize;
        this.nrOfEmployes = nrOfEmployes;
        this.incomeFCustomer = incomeFCustomer;
        this.location = location;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanySize getCompanySize() {
        return companySize;
    }

    public void setCompanySize(CompanySize companySize) {
        this.companySize = companySize;
    }

    public Integer getNrOfEmployes() {
        return nrOfEmployes;
    }

    public void setNrOfEmployes(Integer nrOfEmployes) {
        this.nrOfEmployes = nrOfEmployes;
    }

    public Long getIncomeFCustomer() {
        return incomeFCustomer;
    }

    public void setIncomeFCustomer(Long incomeFCustomer) {
        this.incomeFCustomer = incomeFCustomer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

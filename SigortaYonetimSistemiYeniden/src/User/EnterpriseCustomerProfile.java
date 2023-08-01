package User;

import Insurance.Insurance;

public class EnterpriseCustomerProfile extends Account {

    private String companyName;

    public EnterpriseCustomerProfile(User  user , String companyName) {
        super(user);
        this.companyName=companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {

    }

    //Getter and Setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

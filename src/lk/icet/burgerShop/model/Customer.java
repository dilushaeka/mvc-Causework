package lk.icet.burgerShop.model;

public class Customer {
    private String custId;

    private String custName;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Customer() {
    }



    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                '}';
    }
}

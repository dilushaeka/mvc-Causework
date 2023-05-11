package lk.icet.burgerShop.model;

public class Order {
    private String oId;
    private String custId;
    private String custName;
    private int brgrQty;
    private String brgrStts;

    public Order(String text, String txtCustIdText, String txtCustNAmeText, String txtBrgrQtyText, String txtBilValueText) {
    }



    public Order(String oId, String custId, String custName, int brgrQty, String brgrStts) {
        this.oId = oId;
        this.custId = custId;
        this.custName = custName;
        this.brgrQty = brgrQty;
        this.brgrStts = brgrStts;
    }



    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

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

    public int getBrgrQty() {
        return brgrQty;
    }

    public void setBrgrQty(int brgrQty) {
        this.brgrQty = brgrQty;
    }

    public String getBrgrStts() {
        return brgrStts;
    }

    public void setBrgrStts(String brgrStts) {
        this.brgrStts = brgrStts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId='" + oId + '\'' +
                ", custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", brgrQty=" + brgrQty +
                ", brgrStts='" + brgrStts + '\'' +
                '}';
    }
}

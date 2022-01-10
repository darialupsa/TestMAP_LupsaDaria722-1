package aufg2;



import java.util.List;
import java.util.Objects;

public class Orders {
    private Integer orderNumber;
    private String adress;
    private List<Products> listOfProducts;

    public Orders(Integer orderNumber, String adress, List<Products> listOfProducts) {
        this.orderNumber = orderNumber;
        this.adress = adress;
        this.listOfProducts = listOfProducts;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<aufg2.Products> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Products> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNumber=" + orderNumber +
                ", adress='" + adress + '\'' +
                ", listOfProducts=" + listOfProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        aufg2.Orders orders = (aufg2.Orders) o;
        return Objects.equals(orderNumber, orders.orderNumber) && Objects.equals(adress, orders.adress) && Objects.equals(listOfProducts, orders.listOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, adress, listOfProducts);
    }
}

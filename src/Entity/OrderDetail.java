package Entity;

public class OrderDetail {
    private String id;
    private Order order;
    private Product product;
    private  double quantity;
    private Status status;

    public OrderDetail(){;}

    public OrderDetail(String id, Order order, Product product, double quantity, Status status) {

        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CharSequence getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", product=" + product +
                ", quantity=" + quantity +
                ", status=" + status +
                '}';
    }
}

package Entity;

public enum Status {
    PEN("Pending"),COM("Conpleted"),CAN("Canceled"),PAID("Paid");
    private String StatusLabel;
    Status(String statusLabel){
        this.StatusLabel = statusLabel;
    }
}

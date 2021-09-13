package sample;

public class CommProd implements Product{
    private String prodTitle;
    private String description;
    private int quantity;
    private double price;
    private String cat;
    private String Ad;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    enum category{Food, Clothes, Beverages, Medicines, Books, Toiletries, CleaningSupplies}

    public CommProd(String prodTitle, String description, int quantity, double price, String Ad) {
        this.prodTitle = prodTitle;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.Ad=Ad;
    }

    public String getProdTitle() {
        return prodTitle;
    }

    public void setProdTitle(String prodTitle) {
        this.prodTitle = prodTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

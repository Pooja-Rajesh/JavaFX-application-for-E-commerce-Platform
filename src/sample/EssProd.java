package sample;

enum category{Food, Clothes, Beverages, Medicines, Books, Toiletries, CleaningSupplies, Misc}
public class EssProd implements Product {
    private String prodTitle;
    private String description;
    private int quantity;
    private String cat;
    private String category;
    private String shipAdd;

    public EssProd(String prodTitle, String description, int quantity, String category, String shipAdd) {
        this.prodTitle = prodTitle;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.shipAdd = shipAdd;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getAd() {
        return shipAdd;
    }

    public void setAd(String ad) {
        shipAdd = ad;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShipAdd() {
        return shipAdd;
    }

    public void setShipAdd(String shipAdd) {
        this.shipAdd = shipAdd;
    }

    public double getPrice(){
        return 0.0;
    }

    public void setPrice(double price){
    }
}

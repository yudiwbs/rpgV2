public class Item {
    private String deskripsi;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void printItem() {
        //print deskripsi item
        System.out.println(deskripsi);
    }
}

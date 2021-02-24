public class Ruangan {
    private Item objItem;

    public Item getObjItem() {
        return objItem;
    }

    public void setObjItem(Item objItem) {
        this.objItem = objItem;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    private String deskripsi;

    public void printRuangan() {
        System.out.println(deskripsi);
        if (objItem==null) {
            System.out.println("Ruangan kosong, tidak memiliki item");
        } else {
            objItem.printItem();
        }
    }
}

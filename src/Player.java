public class Player {

    private Item objItem;  //item yang dimiliki player
    private Ruangan ruanganAktif;  //ruangan tempat player saat ini berada


    public Item getObjItem() {
        return objItem;
    }

    public void setObjItem(Item objItem) {
        this.objItem = objItem;
    }

    public Ruangan getRuanganAktif() {
        return ruanganAktif;
    }

    public void setRuanganAktif(Ruangan ruanganAktif) {
        this.ruanganAktif = ruanganAktif;
    }


    public void printItem() {
        //print item yang dimiliki user
        if (objItem==null) {
            System.out.println("Player belum memiliki item");
        } else {
            objItem.printItem();
        }
    }

    public void ambilItem() {
        //mengambil item dari ruangan ke player
        System.out.println("Player ambil item dari ruangan");
        Item objItem  = ruanganAktif.getObjItem(); //item ada di ruangan
        if (objItem==null) {
            System.out.println("Ruangan kosong, tidak ada yang bisa diambil");
        } else {
            setObjItem(objItem);  // player ambil item
            ruanganAktif.setObjItem(null); //kosongkan ruangan
        }
    }
}

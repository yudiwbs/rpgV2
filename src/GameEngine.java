import java.util.Scanner;

public class GameEngine {
    // user interface game
    boolean isStop = false;
    Scanner sc = new Scanner(System.in);
    Player objPlayer;

    public static void main(String[] args) {
        GameEngine objGameEngine;
        objGameEngine = new GameEngine();
        objGameEngine.mulai();
    }

    public GameEngine() {
        objPlayer = new Player();
        //item
        Item kunci;
        kunci = new Item();
        kunci.setDeskripsi("Kunci kecil yang agak berkarat");

        //ruangannya
        Ruangan objRuangan;
        objRuangan = new Ruangan();
        objRuangan.setDeskripsi("Ruangan kecil, dengan satu pintu dan jendela");
        objRuangan.setObjItem(kunci); //isi ruangan dengan kunci

        objPlayer.setRuanganAktif(objRuangan);  //set ruangan aktif player

    }

    private void aksi() {
        System.out.println();
        System.out.println("=================");
        System.out.println("1. Lihat item yang dimiliki player");
        System.out.println("2. Lihat ruangan dan isinya");
        System.out.println("3. Ambil item dari ruangan");
        System.out.println("4. Keluar");
        System.out.print("Pilihan anda?");

        int pil = sc.nextInt();
        if (pil==4) {
           isStop = true; //keluar
        } else if (pil==1) {
            objPlayer.printItem(); //
        } else if (pil==2) {
            objPlayer.getRuanganAktif().printRuangan();
        } else if (pil==3) {
            objPlayer.ambilItem();
        }

    }

    public void mulai() {
        while (!isStop) {
            aksi();
        }
    }
}

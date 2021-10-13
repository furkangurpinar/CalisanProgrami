public class Yonetici extends Calisan{
    private int sorumluKisiSayisi;
    public Yonetici(String ad, String soyAd, int id,int sorumluKisiSayisi) {
        super(ad, soyAd, id);
        this.sorumluKisiSayisi=sorumluKisiSayisi;

    }

    public int getSorumluKisiSayisi() {
        return sorumluKisiSayisi;
    }

    public void setSorumluKisiSayisi(int sorumluKisiSayisi) {
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    public void zamYap( int zamMiktari){
        System.out.println(getAd()+ " Çalışanların Maaşına   " + zamMiktari +"TL kadar zam yaptı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.print("Yöneticinin Sorumlu Olduğu Kişi Sayısı : "+sorumluKisiSayisi);
    }
}

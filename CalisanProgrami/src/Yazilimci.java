public class Yazilimci extends Calisan{
    private String diller;
    public Yazilimci(String ad, String soyAd, int id,String diller) {
        super(ad, soyAd, id);
        this.diller=diller;

    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+ " " + isletimSistemi + "yüklüyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının Bildiği Diller : "+diller);
    }
}

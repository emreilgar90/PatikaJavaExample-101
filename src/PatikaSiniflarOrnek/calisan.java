package PatikaSiniflarOrnek;

public class calisan {
	private String ad;
	private String soyad;
	private int maas;
	private int haftalikCalismaSaati;
	private int iseBaslangicYili;
	private double vergi;
	
	double vergi (int aylikMaas) {
		if(aylikMaas>1000) {
			vergi = 0.03;
		}else
			vergi = 0;
		
		return aylikMaas*vergi;
	
	
	}
	int bonus (int calismaSaatleri) {
		int bonus = 0;
		
		if(calismaSaatleri>40) {
			bonus = (calismaSaatleri-40)*30;
		}
	     return bonus;
	
	
	
	}
	int maasArtısı(int calismaYili) {
		int yil = 2021;
		int maasArtisi =0;
		
		if((yil-calismaYili)<10) {
			maasArtisi =(int) (this.maas*0.05);
		}
		else if ((yil-calismaYili)>9 && (yil-calismaYili)<20){
			maasArtisi = (int)(this.maas*0.10);
		}
		else 
			maasArtisi = (int)(this.maas*0.15);
		return maasArtisi;
	}
	@Override
	public String toString() {
		return "calisan [ad=" + ad + ", soyad=" + soyad + ", maas=" + maas + ", haftalikCalismaSaati="
				+ haftalikCalismaSaati + ", iseBaslangicYili=" + iseBaslangicYili + ", vergi=" + vergi + "]";
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public int getHaftalikCalismaSaati() {
		return haftalikCalismaSaati;
	}
	public void setHaftalikCalismaSaati(int haftalikCalismaSaati) {
		this.haftalikCalismaSaati = haftalikCalismaSaati;
	}
	public calisan(String ad, String soyad, int maas, int haftalikCalismaSaati, int iseBaslangicYili, double vergi) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
		this.haftalikCalismaSaati = haftalikCalismaSaati;
		this.iseBaslangicYili = iseBaslangicYili;
		this.vergi = vergi;
	}
	public int getIseBaslangicYili() {
		return iseBaslangicYili;
	}
	public void setIseBaslangicYili(int iseBaslangicYili) {
		this.iseBaslangicYili = iseBaslangicYili;
	}
	public double getVergi() {
		return vergi;
	}
	public void setVergi(double vergi) {
		this.vergi = vergi;
	}
  
 }

	

	
	



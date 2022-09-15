package PatikaSiniflarOrnek;

import maasHesaplama.main;

public class Test {
	public static void main(String[] args) {
		calisan kemal = new calisan("Kemal", "Unakıtan", 2000, 45, 1985,0);
		
		double vergi = kemal.vergi(kemal.getMaas());
        int bonus = kemal.bonus(kemal.getHaftalikCalismaSaati());
        int maasArtisi = kemal.maasArtısı(kemal.getIseBaslangicYili());
        System.out.println(kemal.toString());
        System.out.println("Vergi: " + vergi);
        System.out.println("Bonus: " + bonus);
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (kemal.getMaas() - vergi + bonus));
        System.out.println("Maas artisi: " + maasArtisi);
        System.out.println("Yeni maas: " + (kemal.getMaas() + maasArtisi));
		
		
	}
		

}

package tr.edu.medipol.yazilimaraclari.FinalProjesi;

import java.util.*;
public final class UrunDepo {
		private static final List<Urun> URUNLER = new ArrayList<>();
		static { 
			URUNLER.add(new Urun("Iphone","Apple") );
		
			URUNLER.add(new Urun("Galaxy S21","Samsung"));
		}
		
		public UrunDepo() {
			
		}
		
		public static List <Urun> urunleriGetir(){
			return URUNLER;
		}
		
		
		public static List<Urun> urunEkle(Urun urun){
			URUNLER.add(urun);
			return URUNLER;
			
		}
		
		public static List<Urun> urunSil(String numara){
			for(Urun o : URUNLER) {
				if(o.getNumara().equals(numara)) {
					URUNLER.remove(o);
				}
			}
			return URUNLER;
			
		}

}

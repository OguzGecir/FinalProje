package tr.edu.medipol.yazilimaraclari.FinalProjesi;

public class Urun {
		private String urunAdi;
		private String urunMarka;
		
		public Urun(String urunAdi, String urunMarka) {
			super();
			this.urunAdi = urunAdi;
			this.urunMarka = urunMarka;
		}

		public String getIsim() {
			return urunAdi;
		}

		public String getNumara() {
			return urunMarka;
		}

		
		
}

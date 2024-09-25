package phamthithuha_23680571;

import java.time.LocalDate;

public class giaoDichNha extends giaoDich {
		private String loaiNha;
		private String diaChi;
//getter and setter
		public String getLoaiNha() {
			return loaiNha;
		}
		public void setLoaiNha(String loaiNha) {
			this.loaiNha = loaiNha;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
@Override
	public double getThanhTien() {

		return 0;
		}
//ham tao
		public giaoDichNha(String ma, LocalDate ngayGD, double dienTich, double donGia, String loaiNha, String diaChi)
				throws IllegalAccessException {
			super(ma, ngayGD, dienTich, donGia);
			this.loaiNha = loaiNha;
			this.diaChi = diaChi;
		
		}
	@Override
	public String toString() {
		String s="";
		s+=s.formatted("|%10s|%10s|%10s|",getLoaiNha(),getDiaChi(),getThanhTien());
	return super.toString();
	}

		
	
		

}

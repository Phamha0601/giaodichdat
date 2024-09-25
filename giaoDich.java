package phamthithuha_23680571;

import java.time.LocalDate;

public abstract class giaoDich {
	public abstract double getThanhTien();
	protected String maGD;
	protected LocalDate ngayGD;
	protected double dienTich;
	protected double donGia;
//dong goi
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String ma) throws IllegalAccessException {
		if (maGD!=null) {
			this.maGD = ma;	
		} else {
			throw new IllegalAccessException("Loi ma");
		}
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
//ham tao
	public giaoDich() throws IllegalAccessException {
		this("",LocalDate.now(),0,0);	
	}
	public giaoDich(String ma, LocalDate ngayGD, double dienTich, double donGia) throws IllegalAccessException{
		if (ma!=null) {
			this.maGD = ma;	
		} else {
			throw new IllegalAccessException("Loi ma");
		}
		this.ngayGD = ngayGD;
		this.dienTich = dienTich;
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.formatted("|%10s|%10s|%10s|%10s|",getMaGD(),getNgayGD(),getDienTich(),getDonGia());
		return s;
	}
	

	
	

}

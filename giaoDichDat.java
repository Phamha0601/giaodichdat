package phamthithuha_23680571;

import java.time.LocalDate;

public class giaoDichDat extends giaoDich {
	private String loaiDat;
//getter and setter
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
//ham tao
@Override
public double getThanhTien() {
	if (getLoaiDat()=="A") {
		return getDienTich()*getDonGia()*1.5;
	} else {
		return getDienTich()*getDonGia();
	}
}

public giaoDichDat(String ma, LocalDate ngayGD, double dienTich, double donGia, String loaiDat)
		throws IllegalAccessException {
	super(ma, ngayGD, dienTich, donGia);
	this.loaiDat = loaiDat;
}
@Override
public String toString() {
	String s="";
	s+=s.formatted("|%10s|%10s|",getLoaiDat(),getThanhTien());
	return super.toString()+s;
}
}




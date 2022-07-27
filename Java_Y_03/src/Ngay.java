import java.util.Objects;

public class Ngay {
	private int ngay;
	private int thang;
	private int nam;
	
	public Ngay(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ngay other = (Ngay) obj;
		return nam == other.nam && ngay == other.ngay && thang == other.thang;
	}
	
}

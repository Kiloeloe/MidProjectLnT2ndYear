
public abstract class Karyawan {
	private String kode;
	private String nama;
	private String jabatan;
	private String gender;
	private double gaji;
	
	public Karyawan(String kode, String nama, String jabatan, String gender, double gaji) {
		this.kode = kode;
		this.nama = nama;
		this.jabatan = jabatan;
		this.gender = gender;
		this.gaji = gaji;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGaji() {
		return gaji;
	}

	public void setGaji(double d) {
		this.gaji = d;
	}
	
}

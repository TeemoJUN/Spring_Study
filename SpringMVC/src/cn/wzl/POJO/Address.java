package cn.wzl.POJO;

public class Address {
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	private String province;
	@Override
	public String toString() {
		return "Address [city=" + city + ", province=" + province + "]";
	}
}

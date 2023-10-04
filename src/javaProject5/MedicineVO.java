package javaProject5;

public class MedicineVO {
	private String name;
	private String element;
	private String company;
	private String effect;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	@Override
	public String toString() {
		return "MedicineVO [name=" + name + ", element=" + element + ", company=" + company + ", effect=" + effect + "]";
	}
	
}

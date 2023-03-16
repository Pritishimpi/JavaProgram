package SortCustomclassusing_Comparable;

public class Customer implements Comparable<Customer> {
	
	private int cno;
	private String cname;
	private String address;
	private long mono; 
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		//return this.cno-o.cno;
		//return this.cname.compareTo(o.cname);
		return this.address.compareTo(o.address);
	}
	
}

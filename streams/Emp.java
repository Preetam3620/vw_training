package streams;

class Emp
{
	int id;
	String ename;
	double sal;
	
	Emp()
	{
		
	}
	
	Emp(int id,String name,double sal)
	{
		this.id=id;
		this.ename=name;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
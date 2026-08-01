
public class Student 
{
	private int id;
	private String name;
	private String course;
	private double mark;
	public Student(int id, String name, String course,double mark) 
	{
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mark = mark;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public double getMark() 
	{
		return mark;
	}
	public void setMark(double mark) 
	{
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", mark=" + mark + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCourse()=" + getCourse() + ", getMark()=" + getMark()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

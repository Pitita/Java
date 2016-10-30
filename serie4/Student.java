package serie4;

public class Student {
	
	enum Major {Math, Info, Wi}

	// Studentenname
	private String name;
	
	// Hauptfach
	private Major major;
	
	// Matrikelnummer
	private int matrNr;
	
	// Konstruktor
	public Student(String name, Major major, int matrNr)
	{
		this.name = name; // Diese Variable oben = name;
		this.major = major;
		this.matrNr = matrNr;
	}
	
	public String toString()
	{
		return name+major+matrNr;
	}
	
	// Getter
	public String getNames()
	{
		return name;
	}
	
	public Major getMajor()
	{
		return major;
	}
	
	public int getMatrNr()
	{
		return matrNr;
	}
	
	// Setter
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setMajor(Major major)
	{
		this.major = major;
	}
	
	public void setMatrNr(int matrNr)
	{
		this.matrNr = matrNr;
	}

}

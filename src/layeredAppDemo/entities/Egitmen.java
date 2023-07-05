package layeredAppDemo.entities;

public class Egitmen {
	private int egitmenId;
	private String egitmenName;

	
	public Egitmen() {
		
	}

	public Egitmen(int egitmenId, String egitmenName) {
		super();
		this.egitmenId = egitmenId;
		this.egitmenName = egitmenName;
	}

	public int getEgitmenId() {
		return egitmenId;
	}

	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}

	public String getEgitmenName() {
		return egitmenName;
	}

	public void setEgitmenName(String egitmenName) {
		this.egitmenName = egitmenName;
	}

	
	
}

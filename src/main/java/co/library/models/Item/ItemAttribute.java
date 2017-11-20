package co.library.models.Item;

public class ItemAttribute {

	private String author;

	private String tittle;

	private String edition;

	private String publisher;

	private String info;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ItemAttribute [author=" + author + ", tittle=" + tittle + ", edition=" + edition + ", publisher="
				+ publisher + ", info=" + info + "]";
	}

}

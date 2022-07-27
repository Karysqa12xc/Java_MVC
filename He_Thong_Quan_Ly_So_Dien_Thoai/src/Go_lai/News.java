package Go_lai;

public class News implements INews {
	int ID;
	String Title, PublishDate, Author, Content;
	float AveragetRate;
	int RateList[] = new int[3];

	
	@Override
	public String toString() {
		return "News [Title=" + Title + ", PublishDate=" + PublishDate + ", Author=" + Author + ", Content=" + Content
				+ "]";
	}


	public News() {
	}
	
	
	public News( String title, String publishDate, String author, String content) {
		Title = title;
		PublishDate = publishDate;
		Author = author;
		Content = content;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public float getAveragetRate() {
		return AveragetRate;
	}

	@Override
	public void Display() {
		System.out.println("Title = " + Title);
		System.out.println("PublishDate = " + PublishDate);
		System.out.println("Author =  " + Author);
		System.out.println("Content =  " + Content);
		System.out.println("AverageRate = " + AveragetRate);
		
	}
	
	int sum = 0;
	public float Calculate() {
		for(int i = 0; i < RateList.length; i++) {
			sum = sum + RateList[i];
			
		}
		AveragetRate = (float)(sum / RateList.length);
		return AveragetRate;
	}
	
	
}

package demo8_2;

public class NewsInfo {
   private int newsId;
   private String newsTitle;
   private String newsContent;
   private String newsDate;
public NewsInfo() {
	super();
}

public NewsInfo(int newsId, String newsTitle, String newsContent, String newsDate) {
	super();
	this.newsId = newsId;
	this.newsTitle = newsTitle;
	this.newsContent = newsContent;
	this.newsDate = newsDate;
}

public int getNewsId() {
	return newsId;
}
public void setNewsId(int newsId) {
	this.newsId = newsId;
}
public String getNewsTitle() {
	return newsTitle;
}
public void setNewsTitle(String newsTitle) {
	this.newsTitle = newsTitle;
}
public String getNewsContent() {
	return newsContent;
}
public void setNewsContent(String newsContent) {
	this.newsContent = newsContent;
}
public String getNewsDate() {
	return newsDate;
}
public void setNewsDate(String newsDate) {
	this.newsDate = newsDate;
}
}

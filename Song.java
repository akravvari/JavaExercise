
public class Song {
	private String title;
	private Singer singer;
	private String url;
	
	public Song(String title, Singer singer, String url) {
		this.title=title;
		this.singer=singer;
		this.url=url;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	public String getTitle() {
		return title;
	}
	public void setSinger(Singer singer) {
		this.singer= singer;
	}
	public Singer getSinger() {
		return singer;
	}
	public void setUrl(String url) {
		this.url= url;
	}
	public String getUrl() {
		return url;
	}
	
	public String toString() {
		return "Song [title= "+this.title+", singer="+this.singer+", url= "+this.url+"]";
	}
}

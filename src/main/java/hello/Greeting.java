package hello;

/**
 * Created by Stelio on 6.4.2015 г..
 */
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public long getId() {

		return id;
	}
}

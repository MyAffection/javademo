package bean.Monitor;

//发布通知
public class Notification {
    private int id;
    private String title;
    private String content;

    public Notification() {
    }

    public Notification(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Notification(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
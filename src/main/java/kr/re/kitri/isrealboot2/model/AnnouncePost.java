package kr.re.kitri.isrealboot2.model;

public class AnnouncePost {
    private int post_seq;
    private String title;
    private String writer;
    private int hps;
    private int recommend_num;
    private String date_formatted;
    private String contents;

    public AnnouncePost() {
    }

    public AnnouncePost(int post_seq, String title, String writer, int hps, int recommend_num, String date_formatted, String contents) {
        this.post_seq = post_seq;
        this.title = title;
        this.writer = writer;
        this.hps = hps;
        this.recommend_num = recommend_num;
        this.date_formatted = date_formatted;
        this.contents = contents;
    }

    public int getPost_seq() {
        return post_seq;
    }

    public void setPost_seq(int post_seq) {
        this.post_seq = post_seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getHps() {
        return hps;
    }

    public void setHps(int hps) {
        this.hps = hps;
    }

    public int getRecommend_num() {
        return recommend_num;
    }

    public void setRecommend_num(int recommend_num) {
        this.recommend_num = recommend_num;
    }

    public String getDate_formatted() {
        return date_formatted;
    }

    public void setDate_formatted(String date_formatted) {
        this.date_formatted = date_formatted;
    }

    public String getContents() { return contents; }

    public void setContents(String contents) { this.contents = contents; }

    @Override
    public String toString() {
        return "AnnouncePost{" +
                "post_seq=" + post_seq +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", hps=" + hps +
                ", recommend_num=" + recommend_num +
                ", date_formatted='" + date_formatted + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}

package xp.us.pojo;

public class IndexAdv {
    private Integer id;

    private String image;

    private String advname;

    private String advarticle;

    private String advurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getAdvname() {
        return advname;
    }

    public void setAdvname(String advname) {
        this.advname = advname == null ? null : advname.trim();
    }

    public String getAdvarticle() {
        return advarticle;
    }

    public void setAdvarticle(String advarticle) {
        this.advarticle = advarticle == null ? null : advarticle.trim();
    }

    public String getAdvurl() {
        return advurl;
    }

    public void setAdvurl(String advurl) {
        this.advurl = advurl == null ? null : advurl.trim();
    }
}
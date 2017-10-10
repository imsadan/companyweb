package xp.us.pojo;

public class ComeStatistic {
    private Integer comesum;

    private String comedata;

    public Integer getComesum() {
        return comesum;
    }

    public void setComesum(Integer comesum) {
        this.comesum = comesum;
    }

    public String getComedata() {
        return comedata;
    }

    public void setComedata(String comedata) {
        this.comedata = comedata == null ? null : comedata.trim();
    }
}
package kr.re.kitri.isrealboot2.model;

public class MountainDetail {
    private int mt_index;
    private float lat;
    private float lng;
    private String mount_name;

    public MountainDetail() {
    }

    public MountainDetail(int mt_index, float lat, float lng, String mount_name) {
        this.mt_index = mt_index;
        this.lat = lat;
        this.lng = lng;
        this.mount_name = mount_name;
    }

    public int getMt_index() {
        return mt_index;
    }

    public void setMt_index(int mt_index) {
        this.mt_index = mt_index;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getMount_name() {
        return mount_name;
    }

    public void setMount_name(String mount_name) {
        this.mount_name = mount_name;
    }

    @Override
    public String toString() {
        return "MountainDetail{" +
                "mt_index=" + mt_index +
                ", lat=" + lat +
                ", lng=" + lng +
                ", mount_name='" + mount_name + '\'' +
                '}';
    }
}

package kr.re.kitri.isrealboot2.model;

public class MountainDetail {

    private float lat_zoom;
    private float lng_zoom;
    private String mount_name;
    private double altitude;
    private String top100_fm_sel_reason;
    private String mnt_infor;
    private String transport;

    public MountainDetail() {
    }

    public MountainDetail(float lat_zoom, float lng_zoom, String mount_name, double altitude, String top100_fm_sel_reason, String mnt_infor, String transport) {
        this.lat_zoom = lat_zoom;
        this.lng_zoom = lng_zoom;
        this.mount_name = mount_name;
        this.altitude = altitude;
        this.top100_fm_sel_reason = top100_fm_sel_reason;
        this.mnt_infor = mnt_infor;
        this.transport = transport;
    }

    public float getLat_zoom() {
        return lat_zoom;
    }

    public void setLat_zoom(float lat_zoom) {
        this.lat_zoom = lat_zoom;
    }

    public float getLng_zoom() {
        return lng_zoom;
    }

    public void setLng_zoom(float lng_zoom) {
        this.lng_zoom = lng_zoom;
    }

    public String getMount_name() {
        return mount_name;
    }

    public void setMount_name(String mount_name) {
        this.mount_name = mount_name;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getTop100_fm_sel_reason() {
        return top100_fm_sel_reason;
    }

    public void setTop100_fm_sel_reason(String top100_fm_sel_reason) {
        this.top100_fm_sel_reason = top100_fm_sel_reason;
    }

    public String getMnt_infor() {
        return mnt_infor;
    }

    public void setMnt_infor(String mnt_infor) {
        this.mnt_infor = mnt_infor;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "MountainDetail{" +
                "lat_zoom=" + lat_zoom +
                ", lng_zoom=" + lng_zoom +
                ", mount_name='" + mount_name + '\'' +
                ", altitude=" + altitude +
                ", top100_fm_sel_reason='" + top100_fm_sel_reason + '\'' +
                ", mnt_infor='" + mnt_infor + '\'' +
                ", transport='" + transport + '\'' +
                '}';
    }
}

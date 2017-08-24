package kr.re.kitri.isrealboot2.model;

public class WeatherDetail {
    private String mount_name;
    private double temp_avg;
    private double rainfall;
    private double humidity_avg;
    private double ws_avg;

    public WeatherDetail() {
    }

    public WeatherDetail(String mount_name, double temp_avg, double rainfall, double humidity_avg, double ws_avg) {
        this.mount_name = mount_name;
        this.temp_avg = temp_avg;
        this.rainfall = rainfall;
        this.humidity_avg = humidity_avg;
        this.ws_avg = ws_avg;
    }

    public String getMount_name() {
        return mount_name;
    }

    public void setMount_name(String mount_name) {
        this.mount_name = mount_name;
    }

    public double getTemp_avg() {
        return temp_avg;
    }

    public void setTemp_avg(double temp_avg) {
        this.temp_avg = temp_avg;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public double getHumidity_avg() {
        return humidity_avg;
    }

    public void setHumidity_avg(double humidity_avg) {
        this.humidity_avg = humidity_avg;
    }

    public double getWs_avg() {
        return ws_avg;
    }

    public void setWs_avg(double ws_avg) {
        this.ws_avg = ws_avg;
    }

    @Override
    public String toString() {
        return "WeatherDetail{" +
                "mount_name='" + mount_name + '\'' +
                ", temp_avg=" + temp_avg +
                ", rainfall=" + rainfall +
                ", humidity_avg=" + humidity_avg +
                ", ws_avg=" + ws_avg +
                '}';
    }
}

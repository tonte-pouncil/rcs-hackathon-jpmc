package software.bytepushsers.acshackathon.domain;

public class AmbulanceLocation {
    private Integer ambulanceId;
    private Double longitude;
    private Double latitude;

    public AmbulanceLocation() {
        super();
    }

    public AmbulanceLocation(Integer ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public AmbulanceLocation(Integer ambulanceId, Double longitude, Double latitude) {
        this.ambulanceId = ambulanceId;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(Integer ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}

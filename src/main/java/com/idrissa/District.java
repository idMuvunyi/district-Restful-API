package com.idrissa;

import java.util.Objects;

public class District {
   private Integer id;
   private String districtName;

    public District(Integer id, String districtName) {
        this.id = id;
        this.districtName = districtName;
    }

    public District(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id) && Objects.equals(districtName, district.districtName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, districtName);
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", districtName='" + districtName + '\'' +
                '}';
    }
}

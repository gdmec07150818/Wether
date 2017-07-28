package cn.s07150818edu.wether.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/28.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int coumtyCode;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return countyName;
    }

    public void setProvinceName(String provinceName) {
        this.countyName = provinceName;
    }

    public int getProvinceCode() {
        return coumtyCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.coumtyCode = provinceCode;
    }
}

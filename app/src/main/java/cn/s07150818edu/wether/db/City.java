package cn.s07150818edu.wether.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/28.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return cityName;
    }

    public void setProvinceName(String provinceName) {
        this.cityName = provinceName;
    }

    public int getProvinceCode() {
        return cityCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.cityCode = provinceCode;
    }
}

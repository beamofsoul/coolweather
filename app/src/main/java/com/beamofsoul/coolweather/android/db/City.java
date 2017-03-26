package com.beamofsoul.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City extends DataSupport {

    private int id;
    private String name;
    private int code;
    private int provinceId;
}

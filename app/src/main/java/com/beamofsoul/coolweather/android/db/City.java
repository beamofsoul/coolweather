package com.beamofsoul.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City extends DataSupport {

    private int id;
    private String name;
    private int code;
    private int provinceId;
}

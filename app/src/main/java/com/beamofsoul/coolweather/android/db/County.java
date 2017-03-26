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
public class County extends DataSupport {

    private int id;
    private String name;
    private String weatherId;
    private int cityId;
}

package com.demo.mapper;

import com.demo.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActiveDataMapper {

    public ActiveTotalData queryDayCount(String thisEntryDate);
    public List<ActiveData> queryDay(String thisEntryDate);


    public ActiveTotalData queryWkCount(String thisEntryDate);
    public List<ActiveData> queryWk(String thisEntryDate);

    public ActiveTotalData queryMonCount(String thisEntryDate);
    public List<ActiveData> queryMon(String thisEntryDate);

    public List<RetainData> queryRetainData();

    public List<GMVOrder> queryGMVOrder();

    public List<MapData> queryMapData();

    public ConvertData queryConvertData(String tag);
}

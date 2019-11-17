package com.demo.service.impl;

import com.demo.mapper.ActiveDataMapper;
import com.demo.model.*;
import com.demo.service.ActiveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActiveDataServiceImpl implements ActiveDataService {

    @Autowired
    private ActiveDataMapper activeDataMapper;

    @Override
    public List<ActiveTotalData> queryActiveTotal(String thisEntryDate) {
        ActiveTotalData dayCount = activeDataMapper.queryDayCount(thisEntryDate);
        dayCount.setId("dayCount");
        ActiveTotalData wkCount = activeDataMapper.queryWkCount(thisEntryDate);
        wkCount.setId("wkCount");
        ActiveTotalData monCount = activeDataMapper.queryMonCount(thisEntryDate);
        monCount.setId("monCount");
        ArrayList<ActiveTotalData> list = new ArrayList<>();
        list.add(dayCount);
        list.add(wkCount);
        list.add(monCount);

        return list;
    }

    @Override
    public List<ActiveData> queryActiveData(String tag,String thisEntryDate) {

        if("dayCount".equals(tag)){
            return activeDataMapper.queryDay(thisEntryDate);
        }else if("wkCount".equals(tag)){
            return activeDataMapper.queryWk(thisEntryDate);
        }else if("monCount".equals(tag)){
            return activeDataMapper.queryMon(thisEntryDate);
        }
        return null;
    }

    @Override
    public List<RetainData> queryRetainData() {
        return activeDataMapper.queryRetainData();
    }

    @Override
    public List<GMVOrder> queryGMVOrder() {
        return activeDataMapper.queryGMVOrder();
    }

    @Override
    public List<MapData> queryMapData() {
        return activeDataMapper.queryMapData();
    }

    @Override
    public ConvertData queryConvertData(String tag) {
        return activeDataMapper.queryConvertData(tag);
    }

}

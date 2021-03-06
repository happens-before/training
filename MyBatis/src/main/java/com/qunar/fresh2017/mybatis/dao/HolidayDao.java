package com.qunar.fresh2017.mybatis.dao;

import com.qunar.fresh2017.mybatis.model.HolidayModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shuai.lv on 2017/3/22.
 */
@Repository
public interface HolidayDao {

    HolidayModel selectHolidayByStaffId(Integer staffId);

    List<HolidayModel> selectHolidayMoreThanAnnualNum(Integer annualNum);

    int insertHoliday(HolidayModel holidayModel);

    int deleteHolidayByStaffId(Integer staffId);

    int updateHolidayByStaffId(HolidayModel holidayModel);
}

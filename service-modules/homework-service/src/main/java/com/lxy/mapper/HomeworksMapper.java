package com.lxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxy.userEntity.Homeworks;

import java.util.List;

import com.lxy.userEntity.VO.HomeworkInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeworksMapper extends BaseMapper<Homeworks> {
    int deleteByPrimaryKey(Long id);

    int insert(Homeworks record);

    int insertSelective(Homeworks record);

    Homeworks selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Homeworks record);

    int updateByPrimaryKey(Homeworks record);

    int batchInsert(@Param("list") List<Homeworks> list);

    List<Homeworks> getTeacherPublicHomework(String teacherId);

    List<HomeworkInfoVO> getHomeworkInfoVOList(String teacherId);
}
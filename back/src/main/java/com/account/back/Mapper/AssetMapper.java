package com.account.back.Mapper;

import com.account.back.Proj.Asset;
import com.account.back.Proj.AssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetMapper {
    long countByExample(AssetExample example);

    int deleteByExample(AssetExample example);

    int deleteByPrimaryKey(Integer assetId);

    int insert(Asset record);

    int insertSelective(Asset record);

    List<Asset> selectByExample(AssetExample example);

    Asset selectByPrimaryKey(Integer assetId);

    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}
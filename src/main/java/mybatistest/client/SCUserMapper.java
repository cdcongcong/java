package mybatistest.client;

import java.util.List;
import mybatistest.entity.SCUser;
import mybatistest.entity.SCUserExample;
import org.apache.ibatis.annotations.Param;

public interface SCUserMapper {
    int countByExample(SCUserExample example);

    int deleteByExample(SCUserExample example);

    int deleteByPrimaryKey(String userID);

    int insert(SCUser record);

    int insertSelective(SCUser record);

    List<SCUser> selectByExample(SCUserExample example);

    SCUser selectByPrimaryKey(String userID);

    int updateByExampleSelective(@Param("record") SCUser record, @Param("example") SCUserExample example);

    int updateByExample(@Param("record") SCUser record, @Param("example") SCUserExample example);

    int updateByPrimaryKeySelective(SCUser record);

    int updateByPrimaryKey(SCUser record);
}
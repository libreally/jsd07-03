package cn.tedu.boot07.mapper;

import cn.tedu.boot07.entity.Weibo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiboMapper {

    @Insert("insert into weibo values (null,#{content},#{url},#{created})")
    void insert(Weibo weibo);
}

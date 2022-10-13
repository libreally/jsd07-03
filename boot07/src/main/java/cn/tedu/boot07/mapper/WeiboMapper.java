package cn.tedu.boot07.mapper;

import cn.tedu.boot07.entity.Weibo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WeiboMapper {

    @Insert("insert into weibo values (null,#{content},#{url},#{created})")
    void insert(Weibo weibo);

    @Select("select id,content,url,created from weibo")
    List<Weibo> select();

    @Delete("delete from weibo where id=#{id}")
    void deleteById(int id);

    @Select("select url from weibo where id=#{id}")
    String deleteUrlById(int id);

}

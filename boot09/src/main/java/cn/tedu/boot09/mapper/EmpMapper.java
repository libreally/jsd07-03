package cn.tedu.boot09.mapper;

import cn.tedu.boot09.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    void insert(Emp emp);

    int insertEmps(List<Emp> list);

    void deleteById(int id);

    int deleteByIds(List<Integer> list);

    void dynamicUpdate(Emp emp);

    List<Emp> select();

    Emp selectById(int id);

    int count();
}

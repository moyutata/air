package jmu.lsk.mapper;

import jmu.lsk.po.Link;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LinkMapper {
    //1.insert new link info
    public int insertLink(Link link);
    //2.delete link
    public int deleteLink(Link link);
}

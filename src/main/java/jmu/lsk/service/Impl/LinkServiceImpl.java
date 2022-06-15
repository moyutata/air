package jmu.lsk.service.Impl;


import jmu.lsk.mapper.LinkMapper;
import jmu.lsk.po.Link;
import jmu.lsk.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;

public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkMapper linkMapper;

    @Override
    public int insertLink(Link link) {
        int effectNum=linkMapper.insertLink(link);
        return effectNum;
    }

    @Override
    public int deleteLink(Link link) {
        int effectNum=linkMapper.deleteLink(link);
        return effectNum;
    }
}

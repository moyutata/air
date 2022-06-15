package jmu.lsk.service;


import jmu.lsk.po.Link;

public interface LinkService {
    //1.insert new link info
    public int insertLink(Link link);
    //2.delete link
    public  int deleteLink(Link link);
}

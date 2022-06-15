package jmu.lsk.mapper;

import jmu.lsk.po.Terminal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerminalMapper{
    public List<Terminal> selectTerminal(int Id);
    public List<Terminal> allTerminal();
    public int addTerminal(Terminal terminal);

}

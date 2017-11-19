package cn.jpp.service;

import cn.jpp.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IAccountServicelmpl implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;

    public String transfer(String out, String in, Integer money) {
        try {
            accountMapper.outMoney(out, money);
            Integer num = 1 / 0;
            accountMapper.inMoney(in, money);
            return "transfer OK，Committed";
        } catch (Exception e) {
            return "transfer Error，Rolled back";
        }
    }
}

package cn.jpp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    /**
     * @param out   :转出账号
     * @param money ：转出金额
     */
    public void outMoney(@Param("out") String out, @Param("money") Integer money);

    /**
     * @param in    :转入账号
     * @param money :转入金额
     */
    public void inMoney(@Param("in") String in, @Param("money") Integer money);
}

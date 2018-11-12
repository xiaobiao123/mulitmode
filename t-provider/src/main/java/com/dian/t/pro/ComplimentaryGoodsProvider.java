package com.dian.t.pro;

import com.dian.t.api.ComplimentaryGoodsAPI;
import org.mengyun.tcctransaction.api.Compensable;
import org.mengyun.tcctransaction.dubbo.context.DubboTransactionContextEditor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: mulitmodel
 * @description: 服务提供者
 * @author: Mr.Guo
 * @create: 2018-11-10 16:38
 **/
@Service("complimentaryGoodsProvider")
public class ComplimentaryGoodsProvider implements ComplimentaryGoodsAPI {
    /**
     * 删除
     *
     * @param id@return
     */
    @Override
    @Compensable(confirmMethod = "confirmRecord", cancelMethod = "cancelRecord", transactionContextEditor = DubboTransactionContextEditor.class)
    @Transactional
    public void remove(String id) {
        System.out.println("this is my test");
    }

    @Transactional
    public void confirmRecord(String id) {

    }

    @Transactional
    public void cancelRecord(String id) {

    }
}

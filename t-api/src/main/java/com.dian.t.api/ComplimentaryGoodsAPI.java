package com.dian.t.api;

import org.mengyun.tcctransaction.api.Compensable;

/**
 * ComplimentaryGoodsApi
 */
public interface ComplimentaryGoodsAPI {
    /**
     * 删除
     *
     * @param params
     * @return
     */
    @Compensable
    public void remove(String id);

}


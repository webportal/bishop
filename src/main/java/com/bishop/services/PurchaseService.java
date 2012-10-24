package com.bishop.services;

import com.bishop.domain.Purchase;

public interface PurchaseService {

    /**
     * add purchase
     * @param purchase
     */
    void addPurchase(Purchase purchase);

    /**
     * delete purchase
     * @param purchase
     */
    void deletePurchase(Purchase purchase);

}

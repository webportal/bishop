package com.bishop.services;

import com.bishop.domain.Purchase;
import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:31 PM
 */
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

    /**
     * get all purchases for given user
     * @return list of purchases
     */
    List<Purchase> getAllPurchasesForUser();
}

package com.bishop.repository;

import com.bishop.domain.Purchase;
import com.bishop.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:10 AM
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {

    /**
     * get all purchases for given user
     * @return list of purchases
     */
    List<Purchase> getAllPurchasesForUser();
}

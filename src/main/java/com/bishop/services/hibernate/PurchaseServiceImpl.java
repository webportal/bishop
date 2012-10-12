package com.bishop.services.hibernate;

import com.bishop.domain.Purchase;
import com.bishop.domain.User;
import com.bishop.repository.PurchaseRepository;
import com.bishop.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:09 AM
 */

@Service("purchaseService")
@Repository
@Transactional
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void addPurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @Override
    public void deletePurchase(Purchase purchase) {
        purchaseRepository.delete(purchase);
    }

}

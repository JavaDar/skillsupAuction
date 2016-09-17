package com.su.auction.daoimpl;

import com.su.LotDao;
import com.su.domain.Lot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bogdan on 17.09.16.
 */
public class LotDaoImpl implements LotDao {

    private List<Lot> lots = new ArrayList<>();

    @Override
    public List<Lot> getAll() {
        return lots;
    }

    @Override
    public void add(Lot obj) {
        lots.add(obj);
    }

    @Override
    public void remove(Lot obj) {
        lots.remove(obj);
    }
}

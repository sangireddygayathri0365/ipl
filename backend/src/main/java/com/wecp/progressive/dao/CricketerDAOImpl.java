package com.wecp.progressive.dao;

import java.util.List;

import com.wecp.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO {

    @Override
    public int addCricketer(Cricketer cricketer) {
    return -1;   
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
    return null;    
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateCricketer'");
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteCricketer'");
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllCricketers'");
   return List.of();
    }

}

package model.dao;

import data.DataBaseControl;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DataBaseControl.getConnection());
    }
}

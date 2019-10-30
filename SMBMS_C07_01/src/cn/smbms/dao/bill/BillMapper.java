package cn.smbms.dao.bill;

import java.util.List;

import cn.smbms.pojo.Bill;

public interface BillMapper {
	public List<Bill> selectBill(Bill bill); 

}

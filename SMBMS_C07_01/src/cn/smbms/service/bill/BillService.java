package cn.smbms.service.bill;

import java.util.List;

import cn.smbms.pojo.Bill;

public interface BillService {
	public List<Bill> selectBill(Bill bill);

}

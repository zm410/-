package cn.smbms.test.user;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Bill;
import cn.smbms.service.bill.BillService;

public class Billtese {
	private Logger logger = Logger.getLogger(Billtese.class);
	@Before
	public void setUp() throws Exception{
		
	}
	@Test
	public void testGetBillList() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/resources/applicationContext.xml");
		BillService billService=(BillService) ctx.getBean("billService");
		Bill bill = new Bill();
		bill.setId(2);
		List<Bill> billList=billService.selectBill(bill);
		for(Bill bi:billList) {
			 logger.debug(bi.getProductName());
		}
	}
}

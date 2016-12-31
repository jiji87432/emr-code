package ei.ass.or.zy.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pkuhit.iih.or.OrderModel;
import xap.sv.model.ArrayResult;
import xap.sv.model.SingleResult;
import xap.sv.servlet.mvc.annotation.RequestParam;


public interface ZySplitOrderService {
	/**
	 *  【医嘱】查询服务（单记录）
	 * @param String id
	 * @return Order
	 * @
	 */
	@RequestMapping(value = "/order/zy/split/{orPk}", method = RequestMethod.GET)
	SingleResult<OrderModel> search(@PathVariable ("orPk") String orPk) ;
	
	/**
	 *  【医嘱】查询服务（多记录）
	 * @param  OrderModel condition
	 * @return List<Order>
	 * @
	 */
	@RequestMapping(value = "/orders/zy/split", method = RequestMethod.GET)
	ArrayResult<OrderModel> search(@RequestParam("patientId") String patient_id,@RequestParam("times") String times,@RequestParam("longOrF") String longOrF,@RequestParam("enTypeCode") String enTypeCode,@RequestParam("orTpNm") String orTpNm,@RequestParam("svNm") String svNm,@RequestParam("currentPageIndex") String currentPageIndex ,@RequestParam("pageSize") String pageSize) ;
}

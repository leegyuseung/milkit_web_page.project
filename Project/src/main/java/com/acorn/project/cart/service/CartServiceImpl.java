package com.acorn.project.cart.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.project.cart.dao.CartDao;
import com.acorn.project.cart.dto.CartDto;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDao dao;
	
	@Override
	public void insert(CartDto dto) {
		dao.insert(dto);
	}
	
	@Override
	public void cartList(CartDto dto, ModelAndView mView, HttpSession session){
		
	    String id=(String)session.getAttribute("id");
	    if(id==null) {
	    	dto.setId("guest");
	    }else {
	    	dto.setId(id);
	    }
	    String id2=dto.getId();
		List<CartDto> list=dao.cartList(id2);
		mView.addObject("list", list);

	}
	
	@Override
	public void delete(int cart_id) {
		dao.delete(cart_id);
	}
	
	@Override
	public void deleteAll(String id) {
		dao.deleteAll(id);
	}
	
	@Override
	public void update(int cart_id) {
		
	}
	
	@Override
	public int sumPrice(String id) {
		return dao.sumPrice(id);
	}
	
	@Override
	public int countCart(String id, String productid) {
		return 0;
	}
	
	@Override
	public void updateCart(CartDto dto) {
		
	}
	
	@Override
	public void modifyCart(CartDto dto) {
		dao.modifyCart(dto);
	}
	
}












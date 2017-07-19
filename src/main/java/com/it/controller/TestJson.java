package com.it.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause.ReturnRowsClause;
import com.alibaba.fastjson.JSONObject;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.it.entities.Book;
import com.it.entities.User;



@Controller
@RequestMapping("/json")
public class TestJson {
	@RequestMapping("/testRequestBody")
	public @ResponseBody Book setJson(@RequestBody Book book,HttpServletResponse response) throws IOException{
//		ObjectMapper mapper = new ObjectMapper();
		System.out.println("111111111111111111111111");
		
		book.setAuthor("Dylan");
//		response.setContentType("text/html;charset=UTF-8");
		System.out.println(book);
//		response.getWriter().println(mapper.writeValueAsString(book));
//		response.getWriter().println(JSONObject.toJSONString(book));
		
		return book;
	}
	
	@RequestMapping("/testJson")
	public @ResponseBody User testJson(@RequestBody User user){
		return user;
		
	}
}

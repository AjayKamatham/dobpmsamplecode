package com.dummy.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProcessTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private Environment env;
	
	
	@Test
	public void test1() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test1");
		MvcResult res=mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
		String content = res.getResponse().getContentAsString();
		System.out.println(content);
	}

	@Test
	public void test2() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/test2");
		MvcResult res=mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
		String content = res.getResponse().getContentAsString();
		System.out.println(content);
	}
}

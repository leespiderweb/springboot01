package com.xxx;


import com.xxx.service.NoteService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
@AutoConfigureMockMvc
public class ControllerTest {

    private Logger log = LoggerFactory.getLogger(ControllerTest.class);



    @Autowired
    private MockMvc mockMvc;


    @Before
    public void before(){

        log.info("mockMvc测试开始了");

    }



    @Test
    public  void  testnoteControlle() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/m")).
                andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

      log.info("响应状态，{}",mvcResult.getResponse().getStatus() );
      log.info("响应状态，{}",mvcResult.getResponse().getContentAsString() );




    }


    @After
    public void after(){

        log.info("测试mockMvc结束了");

    }
}

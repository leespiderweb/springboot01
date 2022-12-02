package com.xxx;


import com.xxx.dao.NoteDao;
import com.xxx.po.Note;
import com.xxx.service.NoteService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class ServiceTest {

    private Logger log = LoggerFactory.getLogger(ServiceTest.class);



    @Resource
    private NoteService noteService2;

    @Before
    public void before(){

        log.info("测试开始了");

    }



    @Test
    public  void  testnoteService(){

        log.info("测试记录，{}",noteService2.queryNotebyName(2));





    }


    @After
    public void after(){

        log.info("测试结束了");

    }
}

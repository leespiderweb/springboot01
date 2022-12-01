package com.xxx.controller.dual;

import com.xxx.po.Note;
import com.xxx.service.NoteService;
import com.xxx.service.SecondNoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 *
 *@author EUE
 *@date 2022/12/1 14:45
 */
@RestController
public class DualController {

    @Resource
    private NoteService noteService2;


    @Resource
    private SecondNoteService  secondNoteService2;

    @RequestMapping("/m")
    @ResponseBody
    public Note Getnote(){

         Note  note =  noteService2.queryNotebyName(2);
        System.out.println("note ...  "+note);
        return   note;
    }

    @RequestMapping("/s")
    @ResponseBody
    public Note secondGetnote(){

        Note  secondnote =  secondNoteService2.queryNotebyName(1);
        System.out.println("note ...  "+secondnote);
        return   secondnote;
    }
}

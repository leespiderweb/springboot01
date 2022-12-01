package com.xxx.controller;

import com.xxx.po.Note;
import com.xxx.service.NoteService;
import com.xxx.service.SecondNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NoteController {

    @Resource
    private  NoteService    noteService1;

    @Resource
    private SecondNoteService secondNoteService1;

    @RequestMapping("/note")
    @ResponseBody
    public String queryNotebyName(){

        System.out.println("heooooooooooooonoteService1");

        Note note = noteService1.queryNotebyName(1);

        System.out.println(note);
        return  note.toString();

    }



    @RequestMapping("/master")
    @ResponseBody
    public Note Getnote(){

        Note  note =  noteService1.queryNotebyName(16);
        System.out.println("note ...  "+note);
        return   note;
    }

    @RequestMapping("/second")
    @ResponseBody
    public Note secondGetnote(){

        Note  secondnote =  secondNoteService1.queryNotebyName(18);
        System.out.println("note ...  "+secondnote);
        return   secondnote;
    }

}

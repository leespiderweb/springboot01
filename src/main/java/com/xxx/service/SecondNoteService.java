package com.xxx.service;

import com.xxx.dao.NoteDao;
import com.xxx.po.Note;
import com.xxx.seconddao.SecondNoteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *
 *@author EUE
 *@date 2022/11/30 15:12
 */
@Service
public class SecondNoteService {

    @Autowired
    private SecondNoteDao secondNoteDao;

    public Note queryNotebyName(Integer noteId){

        Note note = secondNoteDao.secondQueryNotebyName(noteId);

        return note;
    }

}

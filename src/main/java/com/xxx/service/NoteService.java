package com.xxx.service;

import com.xxx.dao.NoteDao;
import com.xxx.po.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *
 *@author EUE
 *@date 2022/11/30 15:12
 */
@Service
public class NoteService {

    @Autowired
    private NoteDao noteDao;

    public Note queryNotebyName(Integer noteId){

        Note note = noteDao.queryNotebyName(noteId);

        return note;
    }

}

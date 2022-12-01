package com.xxx.dao;

import com.xxx.po.Note;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*
 *
 *@author EUE
 *@date 2022/11/30 14:44
 */

public interface   NoteDao {

    public Note queryNotebyName(Integer noteId);
}

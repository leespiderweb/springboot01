package com.xxx.seconddao;

import com.xxx.po.Note;

/*
 *
 *@author EUE
 *@date 2022/11/30 14:44
 */

public interface SecondNoteDao {

    public Note secondQueryNotebyName(Integer noteId);
}

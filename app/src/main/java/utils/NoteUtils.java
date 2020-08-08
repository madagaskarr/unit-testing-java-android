package utils;

import io.tigranes.unittesttingandroidjava.model.Note;

public class NoteUtils {

    public static boolean compareNotesById(Note noteOne, Note noteTwo) {
        return noteOne.getId() == noteTwo.getId();
    }

}

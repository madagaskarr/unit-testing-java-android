package io.tigranes.unittesttingandroidjava.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import utils.NoteUtils;

public class NoteUtilsTest {

    @Test
    public void twoNotesSameId() {
        Note firstNote = new Note(1,"","","");
        Note secondNote = new Note(1,"","","");
        boolean areEqual = NoteUtils.compareNotesById(firstNote, secondNote);
        Assertions.assertTrue(areEqual);
    }

    @Test
    public void twoNotesDifferentIdSameFields() {
        Note firstNote = new Note(1,"title","content","12:30 PM");
        Note secondNote = new Note(2,"title","content","12:30 PM");
        boolean areEqual = NoteUtils.compareNotesById(firstNote, secondNote);
        Assertions.assertFalse(areEqual);
    }

}

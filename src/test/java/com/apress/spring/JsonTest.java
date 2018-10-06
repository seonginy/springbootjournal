package com.apress.spring;

import com.apress.spring.domain.JournalEntry;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

public class JsonTest {

    public static void main(String[] arsgs) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JournalEntry journalEntry = new JournalEntry();

        journalEntry.setId(1234l);
        journalEntry.setTitle("제목");
        journalEntry.setSummary("요약");
        journalEntry.setCreated(new Date());

        mapper.writeValue(System.out, journalEntry);
    }
}

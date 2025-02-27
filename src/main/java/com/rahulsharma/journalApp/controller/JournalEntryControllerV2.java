package com.rahulsharma.journalApp.controller;

import com.rahulsharma.journalApp.entity.JournalEntry;
import com.rahulsharma.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    //Here we write/made endpoints as method

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping("/getAll")
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public Boolean deleteEntryById(@PathVariable ObjectId myId){
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry){
        JournalEntry entry = journalEntryService.findById(id).orElse(null);
        if(entry != null){
            entry.setTitle(newEntry.getTitle() != null && newEntry.getDate().equals("") ? newEntry.getTitle() : entry.getTitle());
            entry.setContent(newEntry.getContent() != null && newEntry.getContent().equals("") ? newEntry.getContent() : entry.getContent());
        }
        journalEntryService.saveEntry(entry);
        return entry;
    }
}

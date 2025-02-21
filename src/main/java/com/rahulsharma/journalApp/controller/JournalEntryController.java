package com.rahulsharma.journalApp.controller;

import com.rahulsharma.journalApp.JournalApplication;
import com.rahulsharma.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    //Here we write/made endpoints as method

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping("/getAll")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return journalEntries.put(id,myEntry);
    }
}

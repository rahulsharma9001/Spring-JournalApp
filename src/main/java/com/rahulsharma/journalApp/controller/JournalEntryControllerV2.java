//package com.rahulsharma.journalApp.controller;
//
//import com.rahulsharma.journalApp.entity.JournalEntry;
//import com.rahulsharma.journalApp.service.JournalEntryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryControllerV2 {
//    //Here we write/made endpoints as method
//
//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping("/getAll")
//    public List<JournalEntry> getAll(){
//        return null;
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntryService.saveEntry(myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return null;
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntryById(@PathVariable Long myId){
//        return null;
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
//        return null;
//    }
//}

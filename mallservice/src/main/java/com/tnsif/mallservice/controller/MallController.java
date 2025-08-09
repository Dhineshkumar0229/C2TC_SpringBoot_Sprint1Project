package com.tnsif.mallservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.mallservice.entity.Mall;
import com.tnsif.mallservice.service.MallService;

@RestController
@RequestMapping("/malls")
public class MallController {

    @Autowired
    private MallService mallService;

    // Get all malls
    @GetMapping
    public ResponseEntity<List<Mall>> getAllMalls() {
        return ResponseEntity.ok(mallService.listAll());
    }

    // Get mall by General Manager (ID)
    @GetMapping("/{generalManagerId}")
    public ResponseEntity<Mall> getMallById(@PathVariable String generalManagerId) {
        Mall mall = mallService.get(generalManagerId);
        if (mall != null) {
            return ResponseEntity.ok(mall);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Save a new mall
    @PostMapping
    public ResponseEntity<String> addMall(@RequestBody Mall mall) {
        mallService.save(mall);
        return ResponseEntity.ok("Mall saved successfully");
    }

    // Update existing mall
    @PutMapping("/{generalManagerId}")
    public ResponseEntity<String> updateMall(@PathVariable String generalManagerId, @RequestBody Mall mall) {
        mall.setGeneralmanager(generalManagerId);
        mallService.save(mall);
        return ResponseEntity.ok("Mall updated successfully");
    }

    // Delete mall by ID
    @DeleteMapping("/{generalManagerId}")
    public ResponseEntity<String> deleteMall(@PathVariable String generalManagerId) {
        mallService.delete(generalManagerId);
        return ResponseEntity.ok("Mall deleted successfully");
    }
}
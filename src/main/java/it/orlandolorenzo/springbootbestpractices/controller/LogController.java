package it.orlandolorenzo.springbootbestpractices.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.orlandolorenzo.springbootbestpractices.dto.LogDTO;
import it.orlandolorenzo.springbootbestpractices.dto.response.APIResponse;
import it.orlandolorenzo.springbootbestpractices.service.LogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<LogDTO>> findLogById(@PathVariable Long id) {
        APIResponse<LogDTO> response = logService.findById(id);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getHttpStatus()))
                .body(response);
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<LogDTO>>> findAllLogs() {
        APIResponse<List<LogDTO>> response = logService.findAll();
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getHttpStatus()))
                .body(response);
    }

    @PostMapping
    public ResponseEntity<APIResponse<LogDTO>> addLog(@RequestBody LogDTO logDTO) {
        APIResponse<LogDTO> response = logService.add(logDTO);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getHttpStatus()))
                .body(response);
    }

    @PutMapping
    public ResponseEntity<APIResponse<LogDTO>> updateLog(@RequestBody LogDTO logDTO) {
        APIResponse<LogDTO> response = logService.update(logDTO);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getHttpStatus()))
                .body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<LogDTO>> deleteLog(@PathVariable Long id) {
        APIResponse<LogDTO> response = logService.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.valueOf(response.getHttpStatus()))
                .body(response);
    }
}

package smartmed.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smartmed.dto.BackendHealthDto;

/**
 * Контроллер для мониторинга состояния приложения
 */
@Api
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("")
    @ApiOperation("Информация о состоянии приложения")
    public ResponseEntity<BackendHealthDto> healthCheck() {
        BackendHealthDto result = new BackendHealthDto();
        return ResponseEntity.ok(result);
    }
}
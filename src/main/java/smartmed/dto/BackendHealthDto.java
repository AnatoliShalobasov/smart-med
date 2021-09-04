package smartmed.dto;

import lombok.Data;

/**
 * DTO для передачи информации о состоянии бэкенда
 */
@Data
public class BackendHealthDto {

    /**
     * Состояние бэкенда
     */
    private String backend = "UP";
}
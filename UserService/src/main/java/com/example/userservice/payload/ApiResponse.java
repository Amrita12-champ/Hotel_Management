package com.example.userservice.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
    String message;
    HttpStatus status;
}

package org.roon.club.web.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "샘플 컨트롤러",description = "샘플 반환")
@RequestMapping("/api/sample")
@RestController
public class SampleRestController {

    @Operation(summary = "샘플 헬로 반환",description = "샘플 헬로 문자열 반환")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

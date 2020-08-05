package com.fireshow.sponsor.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Vincent
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitKeywordRequest {

    private List<UnitKeyword> unitKeywords;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitKeyword {

        private Long unitId;
        private String keyword;
    }
}

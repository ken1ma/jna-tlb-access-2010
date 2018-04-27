
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C5BC1285-0A45-3C8C-8514-84979CFD0139})</p>
 */
public enum CollatingOrderEnum implements IComEnum {
    
    /**
     * (1024)
     */
    dbSortNeutral(1024),
    
    /**
     * (1025)
     */
    dbSortArabic(1025),
    
    /**
     * (1049)
     */
    dbSortCyrillic(1049),
    
    /**
     * (1029)
     */
    dbSortCzech(1029),
    
    /**
     * (1043)
     */
    dbSortDutch(1043),
    
    /**
     * (1033)
     */
    dbSortGeneral(1033),
    
    /**
     * (1032)
     */
    dbSortGreek(1032),
    
    /**
     * (1037)
     */
    dbSortHebrew(1037),
    
    /**
     * (1038)
     */
    dbSortHungarian(1038),
    
    /**
     * (1039)
     */
    dbSortIcelandic(1039),
    
    /**
     * (1030)
     */
    dbSortNorwdan(1030),
    
    /**
     * (1033)
     */
    dbSortPDXIntl(1033),
    
    /**
     * (1030)
     */
    dbSortPDXNor(1030),
    
    /**
     * (1053)
     */
    dbSortPDXSwe(1053),
    
    /**
     * (1045)
     */
    dbSortPolish(1045),
    
    /**
     * (1034)
     */
    dbSortSpanish(1034),
    
    /**
     * (1053)
     */
    dbSortSwedFin(1053),
    
    /**
     * (1055)
     */
    dbSortTurkish(1055),
    
    /**
     * (1041)
     */
    dbSortJapanese(1041),
    
    /**
     * (2052)
     */
    dbSortChineseSimplified(2052),
    
    /**
     * (1028)
     */
    dbSortChineseTraditional(1028),
    
    /**
     * (1042)
     */
    dbSortKorean(1042),
    
    /**
     * (1054)
     */
    dbSortThai(1054),
    
    /**
     * (1060)
     */
    dbSortSlovenian(1060),
    
    /**
     * (263185)
     */
    dbSortJapaneseRadicalStrokeCount(263185),
    
    /**
     * (1081)
     */
    dbSortHindi(1081),
    
    /**
     * (-1)
     */
    dbSortUndefined(-1),
    ;

    private CollatingOrderEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
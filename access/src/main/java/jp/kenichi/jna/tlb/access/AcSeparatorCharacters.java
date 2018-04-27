
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0CCCE10D-80F0-3B11-BDDF-D10BE459535A})</p>
 */
public enum AcSeparatorCharacters implements IComEnum {
    
    /**
     * (0)
     */
    acSeparatorCharactersSystemSeparator(0),
    
    /**
     * (1)
     */
    acSeparatorCharactersNewLine(1),
    
    /**
     * (2)
     */
    acSeparatorCharactersSemiColon(2),
    
    /**
     * (3)
     */
    acSeparatorCharactersComma(3),
    ;

    private AcSeparatorCharacters(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
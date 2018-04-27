
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0699599D-A8A7-32EC-9B88-690482209BA5})</p>
 */
public enum FieldAttributeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbFixedField(1),
    
    /**
     * (2)
     */
    dbVariableField(2),
    
    /**
     * (16)
     */
    dbAutoIncrField(16),
    
    /**
     * (32)
     */
    dbUpdatableField(32),
    
    /**
     * (8192)
     */
    dbSystemField(8192),
    
    /**
     * (32768)
     */
    dbHyperlinkField(32768),
    
    /**
     * (1)
     */
    dbDescending(1),
    ;

    private FieldAttributeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
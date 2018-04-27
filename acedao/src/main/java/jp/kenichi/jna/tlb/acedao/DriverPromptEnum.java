
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B8526372-3E87-3232-B6B5-3E5B10E11239})</p>
 */
public enum DriverPromptEnum implements IComEnum {
    
    /**
     * (2)
     */
    dbDriverPrompt(2),
    
    /**
     * (1)
     */
    dbDriverNoPrompt(1),
    
    /**
     * (0)
     */
    dbDriverComplete(0),
    
    /**
     * (3)
     */
    dbDriverCompleteRequired(3),
    ;

    private DriverPromptEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
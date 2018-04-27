
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({949D00C2-04C5-34FB-A9AA-F966483B143C})</p>
 */
public enum AcTransformXMLScriptOption implements IComEnum {
    
    /**
     * (0)
     */
    acEnableScript(0),
    
    /**
     * (1)
     */
    acPromptScript(1),
    
    /**
     * (2)
     */
    acDisableScript(2),
    ;

    private AcTransformXMLScriptOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
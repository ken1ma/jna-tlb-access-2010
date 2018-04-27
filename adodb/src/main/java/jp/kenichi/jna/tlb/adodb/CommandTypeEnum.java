
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000052E-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CommandTypeEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adCmdUnspecified(-1),
    
    /**
     * (8)
     */
    adCmdUnknown(8),
    
    /**
     * (1)
     */
    adCmdText(1),
    
    /**
     * (2)
     */
    adCmdTable(2),
    
    /**
     * (4)
     */
    adCmdStoredProc(4),
    
    /**
     * (256)
     */
    adCmdFile(256),
    
    /**
     * (512)
     */
    adCmdTableDirect(512),
    ;

    private CommandTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
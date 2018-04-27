
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EE1E20A4-DA60-3F43-8745-A624801D61C1})</p>
 */
public enum AcSysCmdAction implements IComEnum {
    
    /**
     * (1)
     */
    acSysCmdInitMeter(1),
    
    /**
     * (2)
     */
    acSysCmdUpdateMeter(2),
    
    /**
     * (3)
     */
    acSysCmdRemoveMeter(3),
    
    /**
     * (4)
     */
    acSysCmdSetStatus(4),
    
    /**
     * (5)
     */
    acSysCmdClearStatus(5),
    
    /**
     * (6)
     */
    acSysCmdRuntime(6),
    
    /**
     * (7)
     */
    acSysCmdAccessVer(7),
    
    /**
     * (8)
     */
    acSysCmdIniFile(8),
    
    /**
     * (9)
     */
    acSysCmdAccessDir(9),
    
    /**
     * (10)
     */
    acSysCmdGetObjectState(10),
    
    /**
     * (11)
     */
    acSysCmdClearHelpTopic(11),
    
    /**
     * (12)
     */
    acSysCmdProfile(12),
    
    /**
     * (13)
     */
    acSysCmdGetWorkgroupFile(13),
    ;

    private AcSysCmdAction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
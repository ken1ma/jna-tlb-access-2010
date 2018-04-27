
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5607577D-8945-37A1-AE78-EDDF2A02FE1F})</p>
 */
public enum AcPrintPaperBin implements IComEnum {
    
    /**
     * (1)
     */
    acPRBNUpper(1),
    
    /**
     * (2)
     */
    acPRBNLower(2),
    
    /**
     * (3)
     */
    acPRBNMiddle(3),
    
    /**
     * (4)
     */
    acPRBNManual(4),
    
    /**
     * (5)
     */
    acPRBNEnvelope(5),
    
    /**
     * (6)
     */
    acPRBNEnvManual(6),
    
    /**
     * (7)
     */
    acPRBNAuto(7),
    
    /**
     * (8)
     */
    acPRBNTractor(8),
    
    /**
     * (9)
     */
    acPRBNSmallFmt(9),
    
    /**
     * (10)
     */
    acPRBNLargeFmt(10),
    
    /**
     * (11)
     */
    acPRBNLargeCapacity(11),
    
    /**
     * (14)
     */
    acPRBNCassette(14),
    
    /**
     * (15)
     */
    acPRBNFormSource(15),
    ;

    private AcPrintPaperBin(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
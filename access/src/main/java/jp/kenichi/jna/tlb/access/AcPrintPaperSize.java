
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7D3911B4-3046-3417-98B5-D7E710F7243E})</p>
 */
public enum AcPrintPaperSize implements IComEnum {
    
    /**
     * (1)
     */
    acPRPSLetter(1),
    
    /**
     * (2)
     */
    acPRPSLetterSmall(2),
    
    /**
     * (3)
     */
    acPRPSTabloid(3),
    
    /**
     * (4)
     */
    acPRPSLedger(4),
    
    /**
     * (5)
     */
    acPRPSLegal(5),
    
    /**
     * (6)
     */
    acPRPSStatement(6),
    
    /**
     * (7)
     */
    acPRPSExecutive(7),
    
    /**
     * (8)
     */
    acPRPSA3(8),
    
    /**
     * (9)
     */
    acPRPSA4(9),
    
    /**
     * (10)
     */
    acPRPSA4Small(10),
    
    /**
     * (11)
     */
    acPRPSA5(11),
    
    /**
     * (12)
     */
    acPRPSB4(12),
    
    /**
     * (13)
     */
    acPRPSB5(13),
    
    /**
     * (14)
     */
    acPRPSFolio(14),
    
    /**
     * (15)
     */
    acPRPSQuarto(15),
    
    /**
     * (16)
     */
    acPRPS10x14(16),
    
    /**
     * (17)
     */
    acPRPS11x17(17),
    
    /**
     * (18)
     */
    acPRPSNote(18),
    
    /**
     * (19)
     */
    acPRPSEnv9(19),
    
    /**
     * (20)
     */
    acPRPSEnv10(20),
    
    /**
     * (21)
     */
    acPRPSEnv11(21),
    
    /**
     * (22)
     */
    acPRPSEnv12(22),
    
    /**
     * (23)
     */
    acPRPSEnv14(23),
    
    /**
     * (24)
     */
    acPRPSCSheet(24),
    
    /**
     * (25)
     */
    acPRPSDSheet(25),
    
    /**
     * (26)
     */
    acPRPSESheet(26),
    
    /**
     * (27)
     */
    acPRPSEnvDL(27),
    
    /**
     * (29)
     */
    acPRPSEnvC3(29),
    
    /**
     * (30)
     */
    acPRPSEnvC4(30),
    
    /**
     * (28)
     */
    acPRPSEnvC5(28),
    
    /**
     * (31)
     */
    acPRPSEnvC6(31),
    
    /**
     * (32)
     */
    acPRPSEnvC65(32),
    
    /**
     * (33)
     */
    acPRPSEnvB4(33),
    
    /**
     * (34)
     */
    acPRPSEnvB5(34),
    
    /**
     * (35)
     */
    acPRPSEnvB6(35),
    
    /**
     * (36)
     */
    acPRPSEnvItaly(36),
    
    /**
     * (37)
     */
    acPRPSEnvMonarch(37),
    
    /**
     * (38)
     */
    acPRPSEnvPersonal(38),
    
    /**
     * (39)
     */
    acPRPSFanfoldUS(39),
    
    /**
     * (40)
     */
    acPRPSFanfoldStdGerman(40),
    
    /**
     * (41)
     */
    acPRPSFanfoldLglGerman(41),
    
    /**
     * (256)
     */
    acPRPSUser(256),
    ;

    private AcPrintPaperSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
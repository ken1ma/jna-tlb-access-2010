
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({56561967-6F47-3E3B-9A9B-D7750296A544})</p>
 */
public enum AcControlType implements IComEnum {
    
    /**
     * (100)
     */
    acLabel(100),
    
    /**
     * (101)
     */
    acRectangle(101),
    
    /**
     * (102)
     */
    acLine(102),
    
    /**
     * (103)
     */
    acImage(103),
    
    /**
     * (104)
     */
    acCommandButton(104),
    
    /**
     * (105)
     */
    acOptionButton(105),
    
    /**
     * (106)
     */
    acCheckBox(106),
    
    /**
     * (107)
     */
    acOptionGroup(107),
    
    /**
     * (108)
     */
    acBoundObjectFrame(108),
    
    /**
     * (109)
     */
    acTextBox(109),
    
    /**
     * (110)
     */
    acListBox(110),
    
    /**
     * (111)
     */
    acComboBox(111),
    
    /**
     * (112)
     */
    acSubform(112),
    
    /**
     * (114)
     */
    acObjectFrame(114),
    
    /**
     * (118)
     */
    acPageBreak(118),
    
    /**
     * (119)
     */
    acCustomControl(119),
    
    /**
     * (122)
     */
    acToggleButton(122),
    
    /**
     * (123)
     */
    acTabCtl(123),
    
    /**
     * (124)
     */
    acPage(124),
    
    /**
     * (126)
     */
    acAttachment(126),
    
    /**
     * (127)
     */
    acEmptyCell(127),
    
    /**
     * (128)
     */
    acWebBrowser(128),
    
    /**
     * (129)
     */
    acNavigationControl(129),
    
    /**
     * (130)
     */
    acNavigationButton(130),
    ;

    private AcControlType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}
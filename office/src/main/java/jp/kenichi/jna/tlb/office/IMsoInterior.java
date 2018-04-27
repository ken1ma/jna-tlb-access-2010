
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C171B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C171B-0000-0000-C000-000000000046}")
public interface IMsoInterior extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x60020000)
    void setColor(Object param0);
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020000)
    Object getColor();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020002)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020002)
    Object getColorIndex();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x60020004)
    void setInvertIfNegative(Object param0);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x60020004)
    Object getInvertIfNegative();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Pattern", dispId = 0x60020006)
    void setPattern(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x60020006)
    Object getPattern();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternColor", dispId = 0x60020008)
    void setPatternColor(Object param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PatternColor", dispId = 0x60020008)
    Object getPatternColor();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x6002000a)
    void setPatternColorIndex(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x6002000a)
    Object getPatternColorIndex();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}

package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E27A992C-A330-11D0-81DD-00C04FC2F51B})</p>
 */
@ComInterface(iid="{E27A992C-A330-11D0-81DD-00C04FC2F51B}")
public interface _FormatCondition extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0x84f)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x84f)
    Boolean getFontBold();
            
    /**
     * <p>id(0x84f)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontBold", dispId = 0x84f)
    void setFontBold(Boolean param0);
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x850)
    Boolean getFontItalic();
            
    /**
     * <p>id(0x850)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontItalic", dispId = 0x850)
    void setFontItalic(Boolean param0);
            
    /**
     * <p>id(0x853)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FontUnderline", dispId = 0x853)
    Boolean getFontUnderline();
            
    /**
     * <p>id(0x853)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FontUnderline", dispId = 0x853)
    void setFontUnderline(Boolean param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x82f)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Type", dispId = 0x82f)
    AcFormatConditionType getType();
            
    /**
     * <p>id(0x897)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x897)
    AcFormatConditionOperator getOperator();
            
    /**
     * <p>id(0x898)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Expression1", dispId = 0x898)
    String getExpression1();
            
    /**
     * <p>id(0x899)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Expression2", dispId = 0x899)
    String getExpression2();
            
    /**
     * <p>id(0x89a)</p>
     * <p>vtableId(23)</p>
     * @param Type [in] {@code AcFormatConditionType}
     * @param Operator [in, optional] {@code AcFormatConditionOperator}
     * @param Expression1 [in, optional] {@code Object}
     * @param Expression2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Modify", dispId = 0x89a)
    void Modify(AcFormatConditionType Type,
            AcFormatConditionOperator Operator,
            Object Expression1,
            Object Expression2);
            
    /**
     * <p>id(0x80f)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x80f)
    void Delete();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(25)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ShortestBarLimit", dispId = 0xa0e)
    AcFormatBarLimits getShortestBarLimit();
            
    /**
     * <p>id(0xa0e)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code AcFormatBarLimits}
     */
    @ComProperty(name = "ShortestBarLimit", dispId = 0xa0e)
    void setShortestBarLimit(AcFormatBarLimits param0);
            
    /**
     * <p>id(0xa0f)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "ShortestBarValue", dispId = 0xa0f)
    String getShortestBarValue();
            
    /**
     * <p>id(0xa0f)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ShortestBarValue", dispId = 0xa0f)
    void setShortestBarValue(Object param0);
            
    /**
     * <p>id(0xa10)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "LongestBarLimit", dispId = 0xa10)
    AcFormatBarLimits getLongestBarLimit();
            
    /**
     * <p>id(0xa10)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code AcFormatBarLimits}
     */
    @ComProperty(name = "LongestBarLimit", dispId = 0xa10)
    void setLongestBarLimit(AcFormatBarLimits param0);
            
    /**
     * <p>id(0xa11)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "LongestBarValue", dispId = 0xa11)
    String getLongestBarValue();
            
    /**
     * <p>id(0xa11)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "LongestBarValue", dispId = 0xa11)
    void setLongestBarValue(Object param0);
            
    /**
     * <p>id(0xa12)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ShowBarOnly", dispId = 0xa12)
    Boolean getShowBarOnly();
            
    /**
     * <p>id(0xa12)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowBarOnly", dispId = 0xa12)
    void setShowBarOnly(Boolean param0);
            
    
}
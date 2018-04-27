
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0000050C-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{0000050C-0000-0010-8000-00AA006D2EA4}")
public interface _Parameter_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x1f4)
    Properties getProperties();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x1)
    void setName(String param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2)
    DataTypeEnum getType();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code DataTypeEnum}
     */
    @ComProperty(name = "Type", dispId = 0x2)
    void setType(DataTypeEnum param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code ParameterDirectionEnum}
     */
    @ComProperty(name = "Direction", dispId = 0x3)
    void setDirection(ParameterDirectionEnum param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Direction", dispId = 0x3)
    ParameterDirectionEnum getDirection();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Precision", dispId = 0x4)
    void setPrecision(Byte param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Precision", dispId = 0x4)
    Byte getPrecision();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "NumericScale", dispId = 0x5)
    void setNumericScale(Byte param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "NumericScale", dispId = 0x5)
    Byte getNumericScale();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Size", dispId = 0x6)
    void setSize(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Size", dispId = 0x6)
    Integer getSize();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param Val [in] {@code Object}
     */
    @ComMethod(name = "AppendChunk", dispId = 0x7)
    void AppendChunk(Object Val);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x8)
    Integer getAttributes();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0x8)
    void setAttributes(Integer param0);
            
    
}

package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0000054C-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{0000054C-0000-0010-8000-00AA006D2EA4}")
public interface Field20_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x1f4)
    Properties getProperties();
            
    /**
     * <p>id(0x455)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ActualSize", dispId = 0x455)
    Integer getActualSize();
            
    /**
     * <p>id(0x45a)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x45a)
    Integer getAttributes();
            
    /**
     * <p>id(0x44f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DefinedSize", dispId = 0x44f)
    Integer getDefinedSize();
            
    /**
     * <p>id(0x44c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x44c)
    String getName();
            
    /**
     * <p>id(0x44e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x44e)
    DataTypeEnum getType();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x458)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Precision", dispId = 0x458)
    Byte getPrecision();
            
    /**
     * <p>id(0x459)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "NumericScale", dispId = 0x459)
    Byte getNumericScale();
            
    /**
     * <p>id(0x453)</p>
     * <p>vtableId(17)</p>
     * @param Data [in] {@code Object}
     */
    @ComMethod(name = "AppendChunk", dispId = 0x453)
    void AppendChunk(Object Data);
            
    /**
     * <p>id(0x454)</p>
     * <p>vtableId(18)</p>
     * @param Length [in] {@code Integer}
     */
    @ComMethod(name = "GetChunk", dispId = 0x454)
    Object GetChunk(Integer Length);
            
    /**
     * <p>id(0x450)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "OriginalValue", dispId = 0x450)
    Object getOriginalValue();
            
    /**
     * <p>id(0x451)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "UnderlyingValue", dispId = 0x451)
    Object getUnderlyingValue();
            
    /**
     * <p>id(0x45b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "DataFormat", dispId = 0x45b)
    com.sun.jna.platform.win32.COM.util.IUnknown getDataFormat();
            
    /**
     * <p>id(0x458)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "Precision", dispId = 0x458)
    void setPrecision(Byte param0);
            
    /**
     * <p>id(0x459)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "NumericScale", dispId = 0x459)
    void setNumericScale(Byte param0);
            
    /**
     * <p>id(0x44e)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code DataTypeEnum}
     */
    @ComProperty(name = "Type", dispId = 0x44e)
    void setType(DataTypeEnum param0);
            
    /**
     * <p>id(0x44f)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DefinedSize", dispId = 0x44f)
    void setDefinedSize(Integer param0);
            
    /**
     * <p>id(0x45a)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0x45a)
    void setAttributes(Integer param0);
            
    
}
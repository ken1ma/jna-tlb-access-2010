
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000051-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000051-0000-0010-8000-00AA006D2EA4}")
public interface _Field extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "CollatingOrder", dispId = 0x60030000)
    Integer getCollatingOrder();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60030001)
    Short getType();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Type", dispId = 0x60030001)
    void setType(Short param0);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030003)
    String getName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030003)
    void setName(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Size", dispId = 0x60030005)
    Integer getSize();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Size", dispId = 0x60030005)
    void setSize(Integer param0);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SourceField", dispId = 0x60030007)
    String getSourceField();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "SourceTable", dispId = 0x60030008)
    String getSourceTable();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x6003000b)
    Integer getAttributes();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0x6003000b)
    void setAttributes(Integer param0);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "OrdinalPosition", dispId = 0x6003000d)
    Short getOrdinalPosition();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "OrdinalPosition", dispId = 0x6003000d)
    void setOrdinalPosition(Short param0);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ValidationText", dispId = 0x6003000f)
    String getValidationText();
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationText", dispId = 0x6003000f)
    void setValidationText(String param0);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ValidateOnSet", dispId = 0x60030011)
    Boolean getValidateOnSet();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ValidateOnSet", dispId = 0x60030011)
    void setValidateOnSet(Boolean param0);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ValidationRule", dispId = 0x60030013)
    String getValidationRule();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ValidationRule", dispId = 0x60030013)
    void setValidationRule(String param0);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DefaultValue", dispId = 0x60030015)
    Object getDefaultValue();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultValue", dispId = 0x60030015)
    void setDefaultValue(Object param0);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Required", dispId = 0x60030017)
    Boolean getRequired();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Required", dispId = 0x60030017)
    void setRequired(Boolean param0);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "AllowZeroLength", dispId = 0x60030019)
    Boolean getAllowZeroLength();
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowZeroLength", dispId = 0x60030019)
    void setAllowZeroLength(Boolean param0);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "DataUpdatable", dispId = 0x6003001b)
    Boolean getDataUpdatable();
            
    /**
     * <p>id(0x6003001c)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "ForeignName", dispId = 0x6003001c)
    String getForeignName();
            
    /**
     * <p>id(0x6003001c)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ForeignName", dispId = 0x6003001c)
    void setForeignName(String param0);
            
    /**
     * <p>id(0x6003001e)</p>
     * <p>vtableId(38)</p>
     * @param Val [in] {@code Object}
     */
    @ComMethod(name = "AppendChunk", dispId = 0x6003001e)
    void AppendChunk(Object Val);
            
    /**
     * <p>id(0x6003001f)</p>
     * <p>vtableId(39)</p>
     * @param Offset [in] {@code Integer}
     * @param Bytes [in] {@code Integer}
     */
    @ComMethod(name = "GetChunk", dispId = 0x6003001f)
    Object GetChunk(Integer Offset,
            Integer Bytes);
            
    /**
     * <p>id(0x60030020)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "_30_FieldSize", dispId = 0x60030020)
    Integer _30_FieldSize();
            
    /**
     * <p>id(0x60030021)</p>
     * <p>vtableId(41)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x60030021)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    /**
     * <p>id(0x60030022)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "CollectionIndex", dispId = 0x60030022)
    Short getCollectionIndex();
            
    /**
     * <p>id(0x60030023)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "OriginalValue", dispId = 0x60030023)
    Object getOriginalValue();
            
    /**
     * <p>id(0x60030024)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "VisibleValue", dispId = 0x60030024)
    Object getVisibleValue();
            
    /**
     * <p>id(0x60030025)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "FieldSize", dispId = 0x60030025)
    Integer getFieldSize();
            
    
}
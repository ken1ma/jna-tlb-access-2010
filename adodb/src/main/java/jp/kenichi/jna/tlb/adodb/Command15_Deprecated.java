
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000508-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000508-0000-0010-8000-00AA006D2EA4}")
public interface Command15_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "ActiveConnection", dispId = 0x1)
    _Connection_Deprecated getActiveConnection();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ActiveConnection", dispId = 0x1)
    void setActiveConnection(Object param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x2)
    String getCommandText();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "CommandText", dispId = 0x2)
    void setCommandText(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CommandTimeout", dispId = 0x3)
    Integer getCommandTimeout();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CommandTimeout", dispId = 0x3)
    void setCommandTimeout(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Prepared", dispId = 0x4)
    Boolean getPrepared();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Prepared", dispId = 0x4)
    void setPrepared(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param RecordsAffected [out, optional] {@code Object}
     * @param Parameters [in, optional] {@code Object}
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "Execute", dispId = 0x5)
    _Recordset_Deprecated Execute(VARIANT RecordsAffected,
            Object Parameters,
            Integer Options);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     * @param Name [in, optional] {@code String}
     * @param Type [in, optional] {@code DataTypeEnum}
     * @param Direction [in, optional] {@code ParameterDirectionEnum}
     * @param Size [in, optional] {@code Integer}
     * @param Value [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateParameter", dispId = 0x6)
    _Parameter_Deprecated CreateParameter(String Name,
            DataTypeEnum Type,
            ParameterDirectionEnum Direction,
            Integer Size,
            Object Value);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Parameters", dispId = 0x0)
    Parameters_Deprecated getParameters();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code CommandTypeEnum}
     */
    @ComProperty(name = "CommandType", dispId = 0x7)
    void setCommandType(CommandTypeEnum param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x7)
    CommandTypeEnum getCommandType();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Name", dispId = 0x8)
    String getName();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x8)
    void setName(String param0);
            
    
}
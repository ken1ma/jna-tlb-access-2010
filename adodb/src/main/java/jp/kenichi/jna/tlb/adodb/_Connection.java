
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00001550-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00001550-0000-0010-8000-00AA006D2EA4}")
public interface _Connection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1f4)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x1f4)
    Properties getProperties();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "ConnectionString", dispId = 0x0)
    String getConnectionString();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ConnectionString", dispId = 0x0)
    void setConnectionString(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CommandTimeout", dispId = 0x2)
    Integer getCommandTimeout();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CommandTimeout", dispId = 0x2)
    void setCommandTimeout(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ConnectionTimeout", dispId = 0x3)
    Integer getConnectionTimeout();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ConnectionTimeout", dispId = 0x3)
    void setConnectionTimeout(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Version", dispId = 0x4)
    String getVersion();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Close", dispId = 0x5)
    void Close();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param CommandText [in] {@code String}
     * @param RecordsAffected [out, optional] {@code Object}
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "Execute", dispId = 0x6)
    _Recordset Execute(String CommandText,
            VARIANT RecordsAffected,
            Integer Options);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "BeginTrans", dispId = 0x7)
    Integer BeginTrans();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "CommitTrans", dispId = 0x8)
    void CommitTrans();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "RollbackTrans", dispId = 0x9)
    void RollbackTrans();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     * @param ConnectionString [in, optional] {@code String}
     * @param UserID [in, optional] {@code String}
     * @param Password [in, optional] {@code String}
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "Open", dispId = 0xa)
    void Open(String ConnectionString,
            String UserID,
            String Password,
            Integer Options);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Errors", dispId = 0xb)
    Errors getErrors();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "DefaultDatabase", dispId = 0xc)
    String getDefaultDatabase();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultDatabase", dispId = 0xc)
    void setDefaultDatabase(String param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "IsolationLevel", dispId = 0xd)
    IsolationLevelEnum getIsolationLevel();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code IsolationLevelEnum}
     */
    @ComProperty(name = "IsolationLevel", dispId = 0xd)
    void setIsolationLevel(IsolationLevelEnum param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0xe)
    Integer getAttributes();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0xe)
    void setAttributes(Integer param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "CursorLocation", dispId = 0xf)
    CursorLocationEnum getCursorLocation();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code CursorLocationEnum}
     */
    @ComProperty(name = "CursorLocation", dispId = 0xf)
    void setCursorLocation(CursorLocationEnum param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x10)
    ConnectModeEnum getMode();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code ConnectModeEnum}
     */
    @ComProperty(name = "Mode", dispId = 0x10)
    void setMode(ConnectModeEnum param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Provider", dispId = 0x11)
    String getProvider();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Provider", dispId = 0x11)
    void setProvider(String param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "State", dispId = 0x12)
    Integer getState();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(35)</p>
     * @param Schema [in] {@code SchemaEnum}
     * @param Restrictions [in, optional] {@code Object}
     * @param SchemaID [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenSchema", dispId = 0x13)
    _Recordset OpenSchema(SchemaEnum Schema,
            Object Restrictions,
            Object SchemaID);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x15)
    void Cancel();
            
    
}
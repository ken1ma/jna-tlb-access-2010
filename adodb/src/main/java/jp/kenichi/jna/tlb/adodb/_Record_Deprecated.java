
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000562-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000562-0000-0010-8000-00AA006D2EA4}")
public interface _Record_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
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
    Object getActiveConnection();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ActiveConnection", dispId = 0x1)
    void setActiveConnection(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "State", dispId = 0x2)
    ObjectStateEnum getState();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Source", dispId = 0x3)
    Object getSource();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Source", dispId = 0x3)
    void setSource(String param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x4)
    ConnectModeEnum getMode();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code ConnectModeEnum}
     */
    @ComProperty(name = "Mode", dispId = 0x4)
    void setMode(ConnectModeEnum param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ParentURL", dispId = 0x5)
    String getParentURL();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     * @param Source [in, optional] {@code String}
     * @param Destination [in, optional] {@code String}
     * @param UserName [in, optional] {@code String}
     * @param Password [in, optional] {@code String}
     * @param Options [in, optional] {@code MoveRecordOptionsEnum}
     * @param Async [in, optional] {@code Boolean}
     */
    @ComMethod(name = "MoveRecord", dispId = 0x6)
    String MoveRecord(String Source,
            String Destination,
            String UserName,
            String Password,
            MoveRecordOptionsEnum Options,
            Boolean Async);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     * @param Source [in, optional] {@code String}
     * @param Destination [in, optional] {@code String}
     * @param UserName [in, optional] {@code String}
     * @param Password [in, optional] {@code String}
     * @param Options [in, optional] {@code CopyRecordOptionsEnum}
     * @param Async [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CopyRecord", dispId = 0x7)
    String CopyRecord(String Source,
            String Destination,
            String UserName,
            String Password,
            CopyRecordOptionsEnum Options,
            Boolean Async);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param Source [in, optional] {@code String}
     * @param Async [in, optional] {@code Boolean}
     */
    @ComMethod(name = "DeleteRecord", dispId = 0x8)
    void DeleteRecord(String Source,
            Boolean Async);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     * @param Source [in, optional] {@code Object}
     * @param ActiveConnection [in, optional] {@code Object}
     * @param Mode [in, optional] {@code ConnectModeEnum}
     * @param CreateOptions [in, optional] {@code RecordCreateOptionsEnum}
     * @param Options [in, optional] {@code RecordOpenOptionsEnum}
     * @param UserName [in, optional] {@code String}
     * @param Password [in, optional] {@code String}
     */
    @ComMethod(name = "Open", dispId = 0x9)
    void Open(Object Source,
            Object ActiveConnection,
            ConnectModeEnum Mode,
            RecordCreateOptionsEnum CreateOptions,
            RecordOpenOptionsEnum Options,
            String UserName,
            String Password);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Close", dispId = 0xa)
    void Close();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x0)
    Fields_Deprecated getFields();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "RecordType", dispId = 0xb)
    RecordTypeEnum getRecordType();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "GetChildren", dispId = 0xc)
    _Recordset_Deprecated GetChildren();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0xd)
    void Cancel();
            
    
}